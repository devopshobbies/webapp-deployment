package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.026Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.HelmProviderExperiments")
@software.amazon.jsii.Jsii.Proxy(HelmProviderExperiments.Jsii$Proxy.class)
public interface HelmProviderExperiments extends software.amazon.jsii.JsiiSerializable {

    /**
     * Enable full diff by storing the rendered manifest in the state.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#manifest HelmProvider#manifest}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getManifest() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HelmProviderExperiments}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HelmProviderExperiments}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HelmProviderExperiments> {
        java.lang.Object manifest;

        /**
         * Sets the value of {@link HelmProviderExperiments#getManifest}
         * @param manifest Enable full diff by storing the rendered manifest in the state.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#manifest HelmProvider#manifest}
         * @return {@code this}
         */
        public Builder manifest(java.lang.Boolean manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderExperiments#getManifest}
         * @param manifest Enable full diff by storing the rendered manifest in the state.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#manifest HelmProvider#manifest}
         * @return {@code this}
         */
        public Builder manifest(com.hashicorp.cdktf.IResolvable manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HelmProviderExperiments}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HelmProviderExperiments build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HelmProviderExperiments}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HelmProviderExperiments {
        private final java.lang.Object manifest;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.manifest = software.amazon.jsii.Kernel.get(this, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.manifest = builder.manifest;
        }

        @Override
        public final java.lang.Object getManifest() {
            return this.manifest;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getManifest() != null) {
                data.set("manifest", om.valueToTree(this.getManifest()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.HelmProviderExperiments"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HelmProviderExperiments.Jsii$Proxy that = (HelmProviderExperiments.Jsii$Proxy) o;

            return this.manifest != null ? this.manifest.equals(that.manifest) : that.manifest == null;
        }

        @Override
        public final int hashCode() {
            int result = this.manifest != null ? this.manifest.hashCode() : 0;
            return result;
        }
    }
}
