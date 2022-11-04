package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.932Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecRuleHttp")
@software.amazon.jsii.Jsii.Proxy(IngressV1SpecRuleHttp.Jsii$Proxy.class)
public interface IngressV1SpecRuleHttp extends software.amazon.jsii.JsiiSerializable {

    /**
     * path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path IngressV1#path}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getPath();

    /**
     * @return a {@link Builder} of {@link IngressV1SpecRuleHttp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1SpecRuleHttp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1SpecRuleHttp> {
        java.lang.Object path;

        /**
         * Sets the value of {@link IngressV1SpecRuleHttp#getPath}
         * @param path path block. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path IngressV1#path}
         * @return {@code this}
         */
        public Builder path(com.hashicorp.cdktf.IResolvable path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecRuleHttp#getPath}
         * @param path path block. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path IngressV1#path}
         * @return {@code this}
         */
        public Builder path(java.util.List<? extends imports.kubernetes.IngressV1SpecRuleHttpPath> path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1SpecRuleHttp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1SpecRuleHttp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1SpecRuleHttp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1SpecRuleHttp {
        private final java.lang.Object path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
        }

        @Override
        public final java.lang.Object getPath() {
            return this.path;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1SpecRuleHttp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1SpecRuleHttp.Jsii$Proxy that = (IngressV1SpecRuleHttp.Jsii$Proxy) o;

            return this.path.equals(that.path);
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            return result;
        }
    }
}
