package io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredDuringSchedulingIgnoredDuringExecution",
    "requiredDuringSchedulingIgnoredDuringExecution" })
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
public class PodAntiAffinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field,
   * but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with
   * the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
   * requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field
   * and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the
   * highest sum are the most preferred.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;

  public java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.PreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }

  public void setPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }

  /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled
   * onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod
   * execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When
   * there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms
   * must be satisfied.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

  public java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.RequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }

  public void setRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.podantiaffinity.RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }
}
