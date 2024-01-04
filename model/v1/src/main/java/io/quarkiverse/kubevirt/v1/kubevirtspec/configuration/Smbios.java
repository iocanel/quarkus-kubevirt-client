package io.quarkiverse.kubevirt.v1.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "family", "manufacturer", "product", "sku", "version" })
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
public class Smbios implements io.fabric8.kubernetes.api.model.KubernetesResource {

  @com.fasterxml.jackson.annotation.JsonProperty("family")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String family;

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String manufacturer;

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("product")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String product;

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("sku")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String sku;

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String version;

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
