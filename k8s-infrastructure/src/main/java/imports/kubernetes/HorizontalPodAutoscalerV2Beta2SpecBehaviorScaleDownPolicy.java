package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.871Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Period specifies the window of time for which the policy should hold true.
     * <p>
     * PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#period_seconds HorizontalPodAutoscalerV2Beta2#period_seconds}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPeriodSeconds();

    /**
     * Type is used to specify the scaling policy: Percent or Pods.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#type HorizontalPodAutoscalerV2Beta2#type}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#value HorizontalPodAutoscalerV2Beta2#value}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getValue();

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy> {
        java.lang.Number periodSeconds;
        java.lang.String type;
        java.lang.Number value;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy#getPeriodSeconds}
         * @param periodSeconds Period specifies the window of time for which the policy should hold true. This parameter is required.
         *                      PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
         *                      <p>
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#period_seconds HorizontalPodAutoscalerV2Beta2#period_seconds}
         * @return {@code this}
         */
        public Builder periodSeconds(java.lang.Number periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy#getType}
         * @param type Type is used to specify the scaling policy: Percent or Pods. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#type HorizontalPodAutoscalerV2Beta2#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy#getValue}
         * @param value Value contains the amount of change which is permitted by the policy. It must be greater than zero. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#value HorizontalPodAutoscalerV2Beta2#value}
         * @return {@code this}
         */
        public Builder value(java.lang.Number value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy {
        private final java.lang.Number periodSeconds;
        private final java.lang.String type;
        private final java.lang.Number value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.periodSeconds = software.amazon.jsii.Kernel.get(this, "periodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.periodSeconds = java.util.Objects.requireNonNull(builder.periodSeconds, "periodSeconds is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
        }

        @Override
        public final java.lang.Number getPeriodSeconds() {
            return this.periodSeconds;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("periodSeconds", om.valueToTree(this.getPeriodSeconds()));
            data.set("type", om.valueToTree(this.getType()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy.Jsii$Proxy that = (HorizontalPodAutoscalerV2Beta2SpecBehaviorScaleDownPolicy.Jsii$Proxy) o;

            if (!periodSeconds.equals(that.periodSeconds)) return false;
            if (!type.equals(that.type)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            int result = this.periodSeconds.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
