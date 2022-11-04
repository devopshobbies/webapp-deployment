package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.844Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerSpecMetric")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerSpecMetric.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerSpecMetric extends software.amazon.jsii.JsiiSerializable {

    /**
     * type is the type of metric source.
     * <p>
     * It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#type HorizontalPodAutoscaler#type}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * container_resource block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#container_resource HorizontalPodAutoscaler#container_resource}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource getContainerResource() {
        return null;
    }

    /**
     * external block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#external HorizontalPodAutoscaler#external}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal getExternal() {
        return null;
    }

    /**
     * object block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#object HorizontalPodAutoscaler#object}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject getObject() {
        return null;
    }

    /**
     * pods block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#pods HorizontalPodAutoscaler#pods}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods getPods() {
        return null;
    }

    /**
     * resource block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#resource HorizontalPodAutoscaler#resource}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource getResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerSpecMetric}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerSpecMetric}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerSpecMetric> {
        java.lang.String type;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource containerResource;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal external;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject object;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods pods;
        imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource resource;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getType}
         * @param type type is the type of metric source. This parameter is required.
         *             It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#type HorizontalPodAutoscaler#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getContainerResource}
         * @param containerResource container_resource block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#container_resource HorizontalPodAutoscaler#container_resource}
         * @return {@code this}
         */
        public Builder containerResource(imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getExternal}
         * @param external external block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#external HorizontalPodAutoscaler#external}
         * @return {@code this}
         */
        public Builder external(imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal external) {
            this.external = external;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getObject}
         * @param object object block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#object HorizontalPodAutoscaler#object}
         * @return {@code this}
         */
        public Builder object(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject object) {
            this.object = object;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getPods}
         * @param pods pods block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#pods HorizontalPodAutoscaler#pods}
         * @return {@code this}
         */
        public Builder pods(imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecMetric#getResource}
         * @param resource resource block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler#resource HorizontalPodAutoscaler#resource}
         * @return {@code this}
         */
        public Builder resource(imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerSpecMetric}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerSpecMetric build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerSpecMetric}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerSpecMetric {
        private final java.lang.String type;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource containerResource;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal external;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject object;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods pods;
        private final imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource resource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerResource = software.amazon.jsii.Kernel.get(this, "containerResource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource.class));
            this.external = software.amazon.jsii.Kernel.get(this, "external", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal.class));
            this.object = software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject.class));
            this.pods = software.amazon.jsii.Kernel.get(this, "pods", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource.class));
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
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricContainerResource getContainerResource() {
            return this.containerResource;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricExternal getExternal() {
            return this.external;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricObject getObject() {
            return this.object;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricPods getPods() {
            return this.pods;
        }

        @Override
        public final imports.kubernetes.HorizontalPodAutoscalerSpecMetricResource getResource() {
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
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerSpecMetric"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerSpecMetric.Jsii$Proxy that = (HorizontalPodAutoscalerSpecMetric.Jsii$Proxy) o;

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
