package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.873Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetric")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2Beta2SpecMetric.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2Beta2SpecMetric extends software.amazon.jsii.JsiiSerializable {

    /**
     * type is the type of metric source.
     * <p>
     * It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#type HorizontalPodAutoscalerV2Beta2#type}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * container_resource block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#container_resource HorizontalPodAutoscalerV2Beta2#container_resource}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource getContainerResource() {
        return null;
    }

    /**
     * external block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#external HorizontalPodAutoscalerV2Beta2#external}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal getExternal() {
        return null;
    }

    /**
     * object block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#object HorizontalPodAutoscalerV2Beta2#object}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject getObject() {
        return null;
    }

    /**
     * pods block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#pods HorizontalPodAutoscalerV2Beta2#pods}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods getPods() {
        return null;
    }

    /**
     * resource block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#resource HorizontalPodAutoscalerV2Beta2#resource}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource getResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2Beta2SpecMetric}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2Beta2SpecMetric}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2Beta2SpecMetric> {
        java.lang.String type;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource containerResource;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal external;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject object;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods pods;
        imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource resource;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getType}
         * @param type type is the type of metric source. This parameter is required.
         *             It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#type HorizontalPodAutoscalerV2Beta2#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getContainerResource}
         * @param containerResource container_resource block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#container_resource HorizontalPodAutoscalerV2Beta2#container_resource}
         * @return {@code this}
         */
        public Builder containerResource(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getExternal}
         * @param external external block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#external HorizontalPodAutoscalerV2Beta2#external}
         * @return {@code this}
         */
        public Builder external(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal external) {
            this.external = external;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getObject}
         * @param object object block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#object HorizontalPodAutoscalerV2Beta2#object}
         * @return {@code this}
         */
        public Builder object(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject object) {
            this.object = object;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getPods}
         * @param pods pods block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#pods HorizontalPodAutoscalerV2Beta2#pods}
         * @return {@code this}
         */
        public Builder pods(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetric#getResource}
         * @param resource resource block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#resource HorizontalPodAutoscalerV2Beta2#resource}
         * @return {@code this}
         */
        public Builder resource(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2Beta2SpecMetric}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2Beta2SpecMetric build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2Beta2SpecMetric}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2Beta2SpecMetric {
        private final java.lang.String type;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource containerResource;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal external;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject object;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods pods;
        private final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource resource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerResource = software.amazon.jsii.Kernel.get(this, "containerResource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource.class));
            this.external = software.amazon.jsii.Kernel.get(this, "external", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal.class));
            this.object = software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject.class));
            this.pods = software.amazon.jsii.Kernel.get(this, "pods", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.containerResource = builder.containerResource;
            this.external = builder.external;
            this.object = builder.object;
            this.pods = builder.pods;
            this.resource = builder.resource;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricContainerResource getContainerResource() {
            return this.containerResource;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricExternal getExternal() {
            return this.external;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObject getObject() {
            return this.object;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricPods getPods() {
            return this.pods;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricResource getResource() {
            return this.resource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getContainerResource() != null) {
                data.set("containerResource", om.valueToTree(this.getContainerResource()));
            }
            if (this.getExternal() != null) {
                data.set("external", om.valueToTree(this.getExternal()));
            }
            if (this.getObject() != null) {
                data.set("object", om.valueToTree(this.getObject()));
            }
            if (this.getPods() != null) {
                data.set("pods", om.valueToTree(this.getPods()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetric"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2Beta2SpecMetric.Jsii$Proxy that = (HorizontalPodAutoscalerV2Beta2SpecMetric.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.containerResource != null ? !this.containerResource.equals(that.containerResource) : that.containerResource != null) return false;
            if (this.external != null ? !this.external.equals(that.external) : that.external != null) return false;
            if (this.object != null ? !this.object.equals(that.object) : that.object != null) return false;
            if (this.pods != null ? !this.pods.equals(that.pods) : that.pods != null) return false;
            return this.resource != null ? this.resource.equals(that.resource) : that.resource == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.containerResource != null ? this.containerResource.hashCode() : 0);
            result = 31 * result + (this.external != null ? this.external.hashCode() : 0);
            result = 31 * result + (this.object != null ? this.object.hashCode() : 0);
            result = 31 * result + (this.pods != null ? this.pods.hashCode() : 0);
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            return result;
        }
    }
}
