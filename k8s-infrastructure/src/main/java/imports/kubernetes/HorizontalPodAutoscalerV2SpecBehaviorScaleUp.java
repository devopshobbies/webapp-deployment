package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.889Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2SpecBehaviorScaleUp")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2SpecBehaviorScaleUp.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2SpecBehaviorScaleUp extends software.amazon.jsii.JsiiSerializable {

    /**
     * policy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#policy HorizontalPodAutoscalerV2#policy}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getPolicy();

    /**
     * Used to specify which policy should be used. If not set, the default value Max is used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#select_policy HorizontalPodAutoscalerV2#select_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelectPolicy() {
        return null;
    }

    /**
     * Number of seconds for which past recommendations should be considered while scaling up or scaling down.
     * <p>
     * This value must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#stabilization_window_seconds HorizontalPodAutoscalerV2#stabilization_window_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getStabilizationWindowSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2SpecBehaviorScaleUp> {
        java.lang.Object policy;
        java.lang.String selectPolicy;
        java.lang.Number stabilizationWindowSeconds;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp#getPolicy}
         * @param policy policy block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#policy HorizontalPodAutoscalerV2#policy}
         * @return {@code this}
         */
        public Builder policy(com.hashicorp.cdktf.IResolvable policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp#getPolicy}
         * @param policy policy block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#policy HorizontalPodAutoscalerV2#policy}
         * @return {@code this}
         */
        public Builder policy(java.util.List<? extends imports.kubernetes.HorizontalPodAutoscalerV2SpecBehaviorScaleUpPolicy> policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp#getSelectPolicy}
         * @param selectPolicy Used to specify which policy should be used. If not set, the default value Max is used.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#select_policy HorizontalPodAutoscalerV2#select_policy}
         * @return {@code this}
         */
        public Builder selectPolicy(java.lang.String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp#getStabilizationWindowSeconds}
         * @param stabilizationWindowSeconds Number of seconds for which past recommendations should be considered while scaling up or scaling down.
         *                                   This value must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
         *                                   <p>
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#stabilization_window_seconds HorizontalPodAutoscalerV2#stabilization_window_seconds}
         * @return {@code this}
         */
        public Builder stabilizationWindowSeconds(java.lang.Number stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2SpecBehaviorScaleUp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2SpecBehaviorScaleUp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2SpecBehaviorScaleUp {
        private final java.lang.Object policy;
        private final java.lang.String selectPolicy;
        private final java.lang.Number stabilizationWindowSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.selectPolicy = software.amazon.jsii.Kernel.get(this, "selectPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stabilizationWindowSeconds = software.amazon.jsii.Kernel.get(this, "stabilizationWindowSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.policy = java.util.Objects.requireNonNull(builder.policy, "policy is required");
            this.selectPolicy = builder.selectPolicy;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        @Override
        public final java.lang.Object getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getSelectPolicy() {
            return this.selectPolicy;
        }

        @Override
        public final java.lang.Number getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("policy", om.valueToTree(this.getPolicy()));
            if (this.getSelectPolicy() != null) {
                data.set("selectPolicy", om.valueToTree(this.getSelectPolicy()));
            }
            if (this.getStabilizationWindowSeconds() != null) {
                data.set("stabilizationWindowSeconds", om.valueToTree(this.getStabilizationWindowSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2SpecBehaviorScaleUp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2SpecBehaviorScaleUp.Jsii$Proxy that = (HorizontalPodAutoscalerV2SpecBehaviorScaleUp.Jsii$Proxy) o;

            if (!policy.equals(that.policy)) return false;
            if (this.selectPolicy != null ? !this.selectPolicy.equals(that.selectPolicy) : that.selectPolicy != null) return false;
            return this.stabilizationWindowSeconds != null ? this.stabilizationWindowSeconds.equals(that.stabilizationWindowSeconds) : that.stabilizationWindowSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.policy.hashCode();
            result = 31 * result + (this.selectPolicy != null ? this.selectPolicy.hashCode() : 0);
            result = 31 * result + (this.stabilizationWindowSeconds != null ? this.stabilizationWindowSeconds.hashCode() : 0);
            return result;
        }
    }
}
