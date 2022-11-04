package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.309Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecSeLinux")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicyV1Beta1SpecSeLinux.Jsii$Proxy.class)
public interface PodSecurityPolicyV1Beta1SpecSeLinux extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule is the strategy that will dictate the allowable labels that may be set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#rule PodSecurityPolicyV1Beta1#rule}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * se_linux_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#se_linux_options PodSecurityPolicyV1Beta1#se_linux_options}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSeLinuxOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicyV1Beta1SpecSeLinux}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicyV1Beta1SpecSeLinux}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicyV1Beta1SpecSeLinux> {
        java.lang.String rule;
        java.lang.Object seLinuxOptions;

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinux#getRule}
         * @param rule rule is the strategy that will dictate the allowable labels that may be set. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#rule PodSecurityPolicyV1Beta1#rule}
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinux#getSeLinuxOptions}
         * @param seLinuxOptions se_linux_options block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#se_linux_options PodSecurityPolicyV1Beta1#se_linux_options}
         * @return {@code this}
         */
        public Builder seLinuxOptions(com.hashicorp.cdktf.IResolvable seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinux#getSeLinuxOptions}
         * @param seLinuxOptions se_linux_options block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#se_linux_options PodSecurityPolicyV1Beta1#se_linux_options}
         * @return {@code this}
         */
        public Builder seLinuxOptions(java.util.List<? extends imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions> seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicyV1Beta1SpecSeLinux}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicyV1Beta1SpecSeLinux build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicyV1Beta1SpecSeLinux}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicyV1Beta1SpecSeLinux {
        private final java.lang.String rule;
        private final java.lang.Object seLinuxOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(builder.rule, "rule is required");
            this.seLinuxOptions = builder.seLinuxOptions;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public final java.lang.Object getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicyV1Beta1SpecSeLinux"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicyV1Beta1SpecSeLinux.Jsii$Proxy that = (PodSecurityPolicyV1Beta1SpecSeLinux.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.seLinuxOptions != null ? this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            return result;
        }
    }
}
