package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.881Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2Beta2SpecMetricPods.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2Beta2SpecMetricPods extends software.amazon.jsii.JsiiSerializable {

    /**
     * metric block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#metric HorizontalPodAutoscalerV2Beta2#metric}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric getMetric();

    /**
     * target block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#target HorizontalPodAutoscalerV2Beta2#target}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget getTarget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2Beta2SpecMetricPods> {
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric metric;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget target;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods#getMetric}
         * @param metric metric block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#metric HorizontalPodAutoscalerV2Beta2#metric}
         * @return {@code this}
         */
        public Builder metric(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods#getTarget}
         * @param target target block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#target HorizontalPodAutoscalerV2Beta2#target}
         * @return {@code this}
         */
        public Builder target(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2Beta2SpecMetricPods build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2Beta2SpecMetricPods}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2Beta2SpecMetricPods {
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric metric;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metric = java.util.Objects.requireNonNull(builder.metric, "metric is required");
            this.target = builder.target;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsMetric getMetric() {
            return this.metric;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPodsTarget getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metric", om.valueToTree(this.getMetric()));
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2Beta2SpecMetricPods.Jsii$Proxy that = (HorizontalPodAutoscalerV2Beta2SpecMetricPods.Jsii$Proxy) o;

            if (!metric.equals(that.metric)) return false;
            return this.target != null ? this.target.equals(that.target) : that.target == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metric.hashCode();
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            return result;
        }
    }
}
