package io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineinstancetypespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "deviceName", "name", "tag", "virtualGPUOptions" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Gpus implements io.fabric8.kubernetes.api.model.KubernetesResource {

  @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String deviceName;

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  /**
   * Name of the GPU device as exposed by a device plugin
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the GPU device as exposed by a device plugin")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * If specified, the virtual network interface address and its tag will be provided to the guest via config drive
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tag")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the virtual network interface address and its tag will be provided to the guest via config drive")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String tag;

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtualGPUOptions")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineinstancetypespec.gpus.VirtualGPUOptions virtualGPUOptions;

  public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineinstancetypespec.gpus.VirtualGPUOptions getVirtualGPUOptions() {
    return virtualGPUOptions;
  }

  public void setVirtualGPUOptions(
      io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineinstancetypespec.gpus.VirtualGPUOptions virtualGPUOptions) {
    this.virtualGPUOptions = virtualGPUOptions;
  }
}
