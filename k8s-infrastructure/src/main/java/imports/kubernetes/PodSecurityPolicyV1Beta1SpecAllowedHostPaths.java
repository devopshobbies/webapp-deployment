package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.306Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPaths")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicyV1Beta1SpecAllowedHostPaths.Jsii$Proxy.class)
public interface PodSecurityPolicyV1Beta1SpecAllowedHostPaths extends software.amazon.jsii.JsiiSerializable {

    /**
     * pathPrefix is the path prefix that the host volume must match.
     * <p>
     * It does not support <code>*</code>. Trailing slashes are trimmed when validating the path prefix with a host path.
     * <p>
     * Examples: <code>/foo</code> would allow <code>/foo</code>, <code>/foo/</code> and <code>/foo/bar</code> <code>/foo</code> would not allow <code>/food</code> or <code>/etc/foo</code>
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#path_prefix PodSecurityPolicyV1Beta1#path_prefix}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPathPrefix();

    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#read_only PodSecurityPolicyV1Beta1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicyV1Beta1SpecAllowedHostPaths> {
        java.lang.String pathPrefix;
        java.lang.Object readOnly;

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths#getPathPrefix}
         * @param pathPrefix pathPrefix is the path prefix that the host volume must match. This parameter is required.
         *                   It does not support <code>*</code>. Trailing slashes are trimmed when validating the path prefix with a host path.
         *                   <p>
         *                   Examples: <code>/foo</code> would allow <code>/foo</code>, <code>/foo/</code> and <code>/foo/bar</code> <code>/foo</code> would not allow <code>/food</code> or <code>/etc/foo</code>
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#path_prefix PodSecurityPolicyV1Beta1#path_prefix}
         * @return {@code this}
         */
        public Builder pathPrefix(java.lang.String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths#getReadOnly}
         * @param readOnly when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#read_only PodSecurityPolicyV1Beta1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths#getReadOnly}
         * @param readOnly when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#read_only PodSecurityPolicyV1Beta1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicyV1Beta1SpecAllowedHostPaths build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicyV1Beta1SpecAllowedHostPaths}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicyV1Beta1SpecAllowedHostPaths {
        private final java.lang.String pathPrefix;
        private final java.lang.Object readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pathPrefix = software.amazon.jsii.Kernel.get(this, "pathPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pathPrefix = java.util.Objects.requireNonNull(builder.pathPrefix, "pathPrefix is required");
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getPathPrefix() {
            return this.pathPrefix;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pathPrefix", om.valueToTree(this.getPathPrefix()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPaths"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicyV1Beta1SpecAllowedHostPaths.Jsii$Proxy that = (PodSecurityPolicyV1Beta1SpecAllowedHostPaths.Jsii$Proxy) o;

            if (!pathPrefix.equals(that.pathPrefix)) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pathPrefix.hashCode();
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
