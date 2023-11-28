package io.quarkiverse.kubevirt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import io.quarkiverse.kubevirt.v1.VirtualMachineInstance;
import picocli.CommandLine.Command;

@Command(name = "podman", sortOptions = false, mixinStandardHelpOptions = false, header = "Create a VM for Podman")
public class VmCreatePodman extends AbstractVmCreate {

    @Override
    public InputStream getInputStream() {
        return getClass().getClassLoader().getResourceAsStream("podman-vm.yaml");
    }

    @Override
    public void onReady(List<VirtualMachine> virtualMachines) {
        //Ensure there is a single VM, get its IP address and create an .env file in the project root that contains an enty `DOCKER_HOST=tcp://$ip:2376`
        if (virtualMachines.size() == 1) {
            VirtualMachine virtualMachine = virtualMachines.get(0);
            VirtualMachineInstance virtualMachineInstance = Clients.kubevirt().v1().virtualmachineinstances()
                    .inNamespace(virtualMachine.getMetadata().getNamespace()).withName(virtualMachine.getMetadata().getName())
                    .get();
            String ipAddress = virtualMachineInstance.getStatus().getInterfaces().get(0).getIpAddresses().get(0);
            String dockerHostValue = "tcp://" + ipAddress + ":2376";
            Path userHome = Paths.get(System.getProperty("user.home"));
            Path testContainerProperties = userHome.resolve(".testcontainers.properties");
            updatePropertyFile(testContainerProperties.toFile(), "docker.host", dockerHostValue);
        }
    }

    public static Optional<Path> findProjectRoot() {
        for (File currentDir = new File(System.getProperty("user.dir")); currentDir != null; currentDir = currentDir
                .getParentFile()) {
            if (containsGitOrQuarkus(currentDir)) {
                return Optional.of(currentDir).map(File::toPath);
            }
        }
        return Optional.empty();
    }

    private static boolean containsGitOrQuarkus(File directory) {
        File gitDirectory = new File(directory, ".git");
        File quarkusDirectory = new File(directory, ".quarkus");
        return gitDirectory.exists() || quarkusDirectory.exists();
    }

    public static void updatePropertyFile(File file, String key, String value) {
        Properties properties = new Properties();
        if (file.exists()) {
            try (InputStream fis = new FileInputStream(file)) {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        properties.setProperty(key, value);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            properties.store(fos, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
