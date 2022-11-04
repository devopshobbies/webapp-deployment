package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.932Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecRuleHttpPath")
@software.amazon.jsii.Jsii.Proxy(IngressV1SpecRuleHttpPath.Jsii$Proxy.class)
public interface IngressV1SpecRuleHttpPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * backend block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#backend IngressV1#backend}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecRuleHttpPathBackend getBackend() {
        return null;
    }

    /**
     * Path is matched against the path of an incoming request.
     * <p>
     * Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path IngressV1#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * PathType determines the interpretation of the Path matching.
     * <p>
     * PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     * done on a path element by element basis. A path element refers is the
     * list of labels in the path split by the '/' separator. A request is a
     * match for path p if every p is an element-wise prefix of p of the
     * request path. Note that if the last element of the path is a substring
     * of the last element in request path, it is not a match (e.g. /foo/bar
     * matches /foo/bar/baz, but does not match /foo/barbaz).
     * ImplementationSpecific: Interpretation of the Path matching is up to
     * the IngressClass. Implementations can treat this as a separate PathType
     * or treat it identically to Prefix or Exact path types.
     * Implementations are required to support all path types.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path_type IngressV1#path_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPathType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressV1SpecRuleHttpPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1SpecRuleHttpPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1SpecRuleHttpPath> {
        imports.kubernetes.IngressV1SpecRuleHttpPathBackend backend;
        java.lang.String path;
        java.lang.String pathType;

        /**
         * Sets the value of {@link IngressV1SpecRuleHttpPath#getBackend}
         * @param backend backend block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#backend IngressV1#backend}
         * @return {@code this}
         */
        public Builder backend(imports.kubernetes.IngressV1SpecRuleHttpPathBackend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecRuleHttpPath#getPath}
         * @param path Path is matched against the path of an incoming request.
         *             Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path IngressV1#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecRuleHttpPath#getPathType}
         * @param pathType PathType determines the interpretation of the Path matching.
         *                 PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
         *                 done on a path element by element basis. A path element refers is the
         *                 list of labels in the path split by the '/' separator. A request is a
         *                 match for path p if every p is an element-wise prefix of p of the
         *                 request path. Note that if the last element of the path is a substring
         *                 of the last element in request path, it is not a match (e.g. /foo/bar
         *                 matches /foo/bar/baz, but does not match /foo/barbaz).
         *                 ImplementationSpecific: Interpretation of the Path matching is up to
         *                 the IngressClass. Implementations can treat this as a separate PathType
         *                 or treat it identically to Prefix or Exact path types.
         *                 Implementations are required to support all path types.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#path_type IngressV1#path_type}
         * @return {@code this}
         */
        public Builder pathType(java.lang.String pathType) {
            this.pathType = pathType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1SpecRuleHttpPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1SpecRuleHttpPath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1SpecRuleHttpPath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1SpecRuleHttpPath {
        private final imports.kubernetes.IngressV1SpecRuleHttpPathBackend backend;
        private final java.lang.String path;
        private final java.lang.String pathType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleHttpPathBackend.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pathType = software.amazon.jsii.Kernel.get(this, "pathType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = builder.backend;
            this.path = builder.path;
            this.pathType = builder.pathType;
        }

        @Override
        public final imports.kubernetes.IngressV1SpecRuleHttpPathBackend getBackend() {
            return this.backend;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getPathType() {
            return this.pathType;
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
            if (this.getPathType() != null) {
                data.set("pathType", om.valueToTree(this.getPathType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1SpecRuleHttpPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1SpecRuleHttpPath.Jsii$Proxy that = (IngressV1SpecRuleHttpPath.Jsii$Proxy) o;

            if (this.backend != null ? !this.backend.equals(that.backend) : that.backend != null) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.pathType != null ? this.pathType.equals(that.pathType) : that.pathType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.backend != null ? this.backend.hashCode() : 0;
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.pathType != null ? this.pathType.hashCode() : 0);
            return result;
        }
    }
}
