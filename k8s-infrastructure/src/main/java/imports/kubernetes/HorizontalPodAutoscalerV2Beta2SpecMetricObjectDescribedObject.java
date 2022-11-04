package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.878Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject extends software.amazon.jsii.JsiiSerializable {

    /**
     * API version of the referent.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#api_version HorizontalPodAutoscalerV2Beta2#api_version}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiVersion();

    /**
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#kind HorizontalPodAutoscalerV2Beta2#kind}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#name HorizontalPodAutoscalerV2Beta2#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject> {
        java.lang.String apiVersion;
        java.lang.String kind;
        java.lang.String name;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject#getApiVersion}
         * @param apiVersion API version of the referent. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#api_version HorizontalPodAutoscalerV2Beta2#api_version}
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject#getKind}
         * @param kind Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#kind HorizontalPodAutoscalerV2Beta2#kind}
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject#getName}
         * @param name Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2beta2#name HorizontalPodAutoscalerV2Beta2#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject {
        private final java.lang.String apiVersion;
        private final java.lang.String kind;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = java.util.Objects.requireNonNull(builder.apiVersion, "apiVersion is required");
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject.Jsii$Proxy that = (HorizontalPodAutoscalerV2Beta2SpecMetricObjectDescribedObject.Jsii$Proxy) o;

            if (!apiVersion.equals(that.apiVersion)) return false;
            if (!kind.equals(that.kind)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion.hashCode();
            result = 31 * result + (this.kind.hashCode());
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
