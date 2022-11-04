package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.175Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.KubernetesProviderExperiments")
@software.amazon.jsii.Jsii.Proxy(KubernetesProviderExperiments.Jsii$Proxy.class)
public interface KubernetesProviderExperiments extends software.amazon.jsii.JsiiSerializable {

    /**
     * Enable the `kubernetes_manifest` resource.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#manifest_resource KubernetesProvider#manifest_resource}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getManifestResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubernetesProviderExperiments}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubernetesProviderExperiments}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubernetesProviderExperiments> {
        java.lang.Object manifestResource;

        /**
         * Sets the value of {@link KubernetesProviderExperiments#getManifestResource}
         * @param manifestResource Enable the `kubernetes_manifest` resource.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#manifest_resource KubernetesProvider#manifest_resource}
         * @return {@code this}
         */
        public Builder manifestResource(java.lang.Boolean manifestResource) {
            this.manifestResource = manifestResource;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderExperiments#getManifestResource}
         * @param manifestResource Enable the `kubernetes_manifest` resource.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#manifest_resource KubernetesProvider#manifest_resource}
         * @return {@code this}
         */
        public Builder manifestResource(com.hashicorp.cdktf.IResolvable manifestResource) {
            this.manifestResource = manifestResource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubernetesProviderExperiments}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubernetesProviderExperiments build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubernetesProviderExperiments}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubernetesProviderExperiments {
        private final java.lang.Object manifestResource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.manifestResource = software.amazon.jsii.Kernel.get(this, "manifestResource", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.manifestResource = builder.manifestResource;
        }

        @Override
        public final java.lang.Object getManifestResource() {
            return this.manifestResource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getManifestResource() != null) {
                data.set("manifestResource", om.valueToTree(this.getManifestResource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.KubernetesProviderExperiments"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubernetesProviderExperiments.Jsii$Proxy that = (KubernetesProviderExperiments.Jsii$Proxy) o;

            return this.manifestResource != null ? this.manifestResource.equals(that.manifestResource) : that.manifestResource == null;
        }

        @Override
        public final int hashCode() {
            int result = this.manifestResource != null ? this.manifestResource.hashCode() : 0;
            return result;
        }
    }
}
