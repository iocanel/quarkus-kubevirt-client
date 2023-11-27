package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "matchExpressions", "matchFields" })
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
public class NodeSelectorTerms implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A list of node selector requirements by node's labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of node selector requirements by node's labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchExpressions> matchExpressions;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * A list of node selector requirements by node's fields.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchFields")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of node selector requirements by node's fields.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchFields> matchFields;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.nodeselectorterms.MatchFields> matchFields) {
        this.matchFields = matchFields;
    }
}