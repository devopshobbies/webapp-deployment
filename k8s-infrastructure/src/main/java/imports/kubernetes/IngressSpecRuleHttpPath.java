package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.918Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressSpecRuleHttpPath")
@software.amazon.jsii.Jsii.Proxy(IngressSpecRuleHttpPath.Jsii$Proxy.class)
public interface IngressSpecRuleHttpPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * backend block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#backend Ingress#backend}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpecRuleHttpPathBackend getBackend() {
        return null;
    }

    /**
     * Path is matched against the path of an incoming request.
     * <p>
     * Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#path Ingress#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressSpecRuleHttpPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressSpecRuleHttpPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressSpecRuleHttpPath> {
        imports.kubernetes.IngressSpecRuleHttpPathBackend backend;
        java.lang.String path;

        /**
         * Sets the value of {@link IngressSpecRuleHttpPath#getBackend}
         * @param backend backend block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#backend Ingress#backend}
         * @return {@code this}
         */
        public Builder backend(imports.kubernetes.IngressSpecRuleHttpPathBackend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpecRuleHttpPath#getPath}
         * @param path Path is matched against the path of an incoming request.
         *             Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#path Ingress#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressSpecRuleHttpPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressSpecRuleHttpPath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressSpecRuleHttpPath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressSpecRuleHttpPath {
        private final imports.kubernetes.IngressSpecRuleHttpPathBackend backend;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecRuleHttpPathBackend.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = builder.backend;
            this.path = builder.path;
        }

        @Override
        public final imports.kubernetes.IngressSpecRuleHttpPathBackend getBackend() {
            return this.backend;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBackend() != null) {
                data.set("backend", om.valueToTree(this.getBackend()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressSpecRuleHttpPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressSpecRuleHttpPath.Jsii$Proxy that = (IngressSpecRuleHttpPath.Jsii$Proxy) o;

            if (this.backend != null ? !this.backend.equals(that.backend) : that.backend != null) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public final int hashCode() {
            int result = this.backend != null ? this.backend.hashCode() : 0;
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
