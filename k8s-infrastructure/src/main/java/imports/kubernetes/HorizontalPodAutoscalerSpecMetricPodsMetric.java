package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.854Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerSpecMetricPodsMetric")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerSpecMetricPodsMetric.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerSpecMetricPodsMetric extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the name of the given metric.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#name HorizontalPodAutoscaler#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#selector HorizontalPodAutoscaler#selector}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerSpecMetricPodsMetric}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerSpecMetricPodsMetric}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerSpecMetricPodsMetric> {
        java.lang.String name;
        java.lang.Object selector;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricPodsMetric#getName}
         * @param name name is the name of the given metric. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#name HorizontalPodAutoscaler#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricPodsMetric#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#selector HorizontalPodAutoscaler#selector}
         * @return {@code this}
         */
        public Builder selector(com.hashicorp.cdktf.IResolvable selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricPodsMetric#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#selector HorizontalPodAutoscaler#selector}
         * @return {@code this}
         */
        public Builder selector(java.util.List<? extends imports.kubernetes.HorizontalPodAutoscalerSpecMetricPodsMetricSelector> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerSpecMetricPodsMetric}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerSpecMetricPodsMetric build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerSpecMetricPodsMetric}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerSpecMetricPodsMetric {
        private final java.lang.String name;
        private final java.lang.Object selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.selector = builder.selector;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getSelector() {
            return this.selector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerSpecMetricPodsMetric"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerSpecMetricPodsMetric.Jsii$Proxy that = (HorizontalPodAutoscalerSpecMetricPodsMetric.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
