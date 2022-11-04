package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.851Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerSpecMetricObject")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerSpecMetricObject.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerSpecMetricObject extends software.amazon.jsii.JsiiSerializable {

    /**
     * described_object block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#described_object HorizontalPodAutoscaler#described_object}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject getDescribedObject();

    /**
     * metric block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#metric HorizontalPodAutoscaler#metric}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric getMetric();

    /**
     * target block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#target HorizontalPodAutoscaler#target}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget getTarget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerSpecMetricObject}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerSpecMetricObject}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerSpecMetricObject> {
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject describedObject;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric metric;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget target;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricObject#getDescribedObject}
         * @param describedObject described_object block. This parameter is required.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#described_object HorizontalPodAutoscaler#described_object}
         * @return {@code this}
         */
        public Builder describedObject(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject describedObject) {
            this.describedObject = describedObject;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricObject#getMetric}
         * @param metric metric block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#metric HorizontalPodAutoscaler#metric}
         * @return {@code this}
         */
        public Builder metric(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetricObject#getTarget}
         * @param target target block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#target HorizontalPodAutoscaler#target}
         * @return {@code this}
         */
        public Builder target(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerSpecMetricObject}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerSpecMetricObject build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerSpecMetricObject}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerSpecMetricObject {
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject describedObject;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric metric;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.describedObject = software.amazon.jsii.Kernel.get(this, "describedObject", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject.class));
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.describedObject = java.util.Objects.requireNonNull(builder.describedObject, "describedObject is required");
            this.metric = java.util.Objects.requireNonNull(builder.metric, "metric is required");
            this.target = builder.target;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectDescribedObject getDescribedObject() {
            return this.describedObject;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectMetric getMetric() {
            return this.metric;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObjectTarget getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("describedObject", om.valueToTree(this.getDescribedObject()));
            data.set("metric", om.valueToTree(this.getMetric()));
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerSpecMetricObject"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerSpecMetricObject.Jsii$Proxy that = (HorizontalPodAutoscalerSpecMetricObject.Jsii$Proxy) o;

            if (!describedObject.equals(that.describedObject)) return false;
            if (!metric.equals(that.metric)) return false;
            return this.target != null ? this.target.equals(that.target) : that.target == null;
        }

        @Override
        public final int hashCode() {
            int result = this.describedObject.hashCode();
            result = 31 * result + (this.metric.hashCode());
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            return result;
        }
    }
}
