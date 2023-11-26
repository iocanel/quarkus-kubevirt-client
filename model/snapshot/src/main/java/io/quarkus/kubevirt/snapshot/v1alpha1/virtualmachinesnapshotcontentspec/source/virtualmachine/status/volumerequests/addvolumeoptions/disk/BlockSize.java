package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "custom", "matchVolume" })
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
public class BlockSize implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CustomBlockSize represents the desired logical and physical block size for a VM disk.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CustomBlockSize represents the desired logical and physical block size for a VM disk.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.Custom custom;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.Custom getCustom() {
        return custom;
    }

    public void setCustom(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.Custom custom) {
        this.custom = custom;
    }

    /**
     * Represents if a feature is enabled or disabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents if a feature is enabled or disabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.MatchVolume matchVolume;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.MatchVolume getMatchVolume() {
        return matchVolume;
    }

    public void setMatchVolume(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.addvolumeoptions.disk.blocksize.MatchVolume matchVolume) {
        this.matchVolume = matchVolume;
    }
}
