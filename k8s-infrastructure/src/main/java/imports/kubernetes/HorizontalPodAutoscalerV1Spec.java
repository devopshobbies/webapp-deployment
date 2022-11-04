package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.861Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV1Spec")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV1Spec.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Upper limit for the number of pods that can be set by the autoscaler.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#max_replicas HorizontalPodAutoscalerV1#max_replicas}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxReplicas();

    /**
     * scale_target_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#scale_target_ref HorizontalPodAutoscalerV1#scale_target_ref}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef getScaleTargetRef();

    /**
     * Lower limit for the number of pods that can be set by the autoscaler, defaults to `1`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#min_replicas HorizontalPodAutoscalerV1#min_replicas}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReplicas() {
        return null;
    }

    /**
     * Target average CPU utilization (represented as a percentage of requested CPU) over all the pods.
     * <p>
     * If not specified the default autoscaling policy will be used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#target_cpu_utilization_percentage HorizontalPodAutoscalerV1#target_cpu_utilization_percentage}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTargetCpuUtilizationPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV1Spec> {
        java.lang.Number maxReplicas;
        imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef scaleTargetRef;
        java.lang.Number minReplicas;
        java.lang.Number targetCpuUtilizationPercentage;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV1Spec#getMaxReplicas}
         * @param maxReplicas Upper limit for the number of pods that can be set by the autoscaler. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#max_replicas HorizontalPodAutoscalerV1#max_replicas}
         * @return {@code this}
         */
        public Builder maxReplicas(java.lang.Number maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV1Spec#getScaleTargetRef}
         * @param scaleTargetRef scale_target_ref block. This parameter is required.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#scale_target_ref HorizontalPodAutoscalerV1#scale_target_ref}
         * @return {@code this}
         */
        public Builder scaleTargetRef(imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef scaleTargetRef) {
            this.scaleTargetRef = scaleTargetRef;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV1Spec#getMinReplicas}
         * @param minReplicas Lower limit for the number of pods that can be set by the autoscaler, defaults to `1`.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#min_replicas HorizontalPodAutoscalerV1#min_replicas}
         * @return {@code this}
         */
        public Builder minReplicas(java.lang.Number minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV1Spec#getTargetCpuUtilizationPercentage}
         * @param targetCpuUtilizationPercentage Target average CPU utilization (represented as a percentage of requested CPU) over all the pods.
         *                                       If not specified the default autoscaling policy will be used.
         *                                       <p>
         *                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v1#target_cpu_utilization_percentage HorizontalPodAutoscalerV1#target_cpu_utilization_percentage}
         * @return {@code this}
         */
        public Builder targetCpuUtilizationPercentage(java.lang.Number targetCpuUtilizationPercentage) {
            this.targetCpuUtilizationPercentage = targetCpuUtilizationPercentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV1Spec {
        private final java.lang.Number maxReplicas;
        private final imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef scaleTargetRef;
        private final java.lang.Number minReplicas;
        private final java.lang.Number targetCpuUtilizationPercentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxReplicas = software.amazon.jsii.Kernel.get(this, "maxReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.scaleTargetRef = software.amazon.jsii.Kernel.get(this, "scaleTargetRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef.class));
            this.minReplicas = software.amazon.jsii.Kernel.get(this, "minReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.targetCpuUtilizationPercentage = software.amazon.jsii.Kernel.get(this, "targetCpuUtilizationPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxReplicas = java.util.Objects.requireNonNull(builder.maxReplicas, "maxReplicas is required");
            this.scaleTargetRef = java.util.Objects.requireNonNull(builder.scaleTargetRef, "scaleTargetRef is required");
            this.minReplicas = builder.minReplicas;
            this.targetCpuUtilizationPercentage = builder.targetCpuUtilizationPercentage;
        }

        @Override
        public final java.lang.Number getMaxReplicas() {
            return this.maxReplicas;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef getScaleTargetRef() {
            return this.scaleTargetRef;
        }

        @Override
        public final java.lang.Number getMinReplicas() {
            return this.minReplicas;
        }

        @Override
        public final java.lang.Number getTargetCpuUtilizationPercentage() {
            return this.targetCpuUtilizationPercentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxReplicas", om.valueToTree(this.getMaxReplicas()));
            data.set("scaleTargetRef", om.valueToTree(this.getScaleTargetRef()));
            if (this.getMinReplicas() != null) {
                data.set("minReplicas", om.valueToTree(this.getMinReplicas()));
            }
            if (this.getTargetCpuUtilizationPercentage() != null) {
                data.set("targetCpuUtilizationPercentage", om.valueToTree(this.getTargetCpuUtilizationPercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV1Spec.Jsii$Proxy that = (HorizontalPodAutoscalerV1Spec.Jsii$Proxy) o;

            if (!maxReplicas.equals(that.maxReplicas)) return false;
            if (!scaleTargetRef.equals(that.scaleTargetRef)) return false;
            if (this.minReplicas != null ? !this.minReplicas.equals(that.minReplicas) : that.minReplicas != null) return false;
            return this.targetCpuUtilizationPercentage != null ? this.targetCpuUtilizationPercentage.equals(that.targetCpuUtilizationPercentage) : that.targetCpuUtilizationPercentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxReplicas.hashCode();
            result = 31 * result + (this.scaleTargetRef.hashCode());
            result = 31 * result + (this.minReplicas != null ? this.minReplicas.hashCode() : 0);
            result = 31 * result + (this.targetCpuUtilizationPercentage != null ? this.targetCpuUtilizationPercentage.hashCode() : 0);
            return result;
        }
    }
}
