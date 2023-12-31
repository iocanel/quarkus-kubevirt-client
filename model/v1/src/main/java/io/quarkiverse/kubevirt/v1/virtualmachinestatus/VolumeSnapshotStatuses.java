package io.quarkiverse.kubevirt.v1.virtualmachinestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "name", "reason" })
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
public class VolumeSnapshotStatuses implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * True if the volume supports snapshotting
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enabled")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("True if the volume supports snapshotting")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean enabled;

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Volume name
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volume name")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Empty if snapshotting is enabled, contains reason otherwise
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Empty if snapshotting is enabled, contains reason otherwise")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String reason;

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
