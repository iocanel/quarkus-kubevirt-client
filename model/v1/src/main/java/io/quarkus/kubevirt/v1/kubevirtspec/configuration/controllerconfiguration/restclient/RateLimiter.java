package io.quarkus.kubevirt.v1.kubevirtspec.configuration.controllerconfiguration.restclient;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "tokenBucketRateLimiter" })
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
public class RateLimiter implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("tokenBucketRateLimiter")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.kubevirtspec.configuration.controllerconfiguration.restclient.ratelimiter.TokenBucketRateLimiter tokenBucketRateLimiter;

    public io.quarkus.kubevirt.v1.kubevirtspec.configuration.controllerconfiguration.restclient.ratelimiter.TokenBucketRateLimiter getTokenBucketRateLimiter() {
        return tokenBucketRateLimiter;
    }

    public void setTokenBucketRateLimiter(
            io.quarkus.kubevirt.v1.kubevirtspec.configuration.controllerconfiguration.restclient.ratelimiter.TokenBucketRateLimiter tokenBucketRateLimiter) {
        this.tokenBucketRateLimiter = tokenBucketRateLimiter;
    }
}
