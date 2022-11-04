package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.291Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicySpecFsGroup")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicySpecFsGroup.Jsii$Proxy.class)
public interface PodSecurityPolicySpecFsGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#rule PodSecurityPolicy#rule}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * range block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#range PodSecurityPolicy#range}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRange() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicySpecFsGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicySpecFsGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicySpecFsGroup> {
        java.lang.String rule;
        java.lang.Object range;

        /**
         * Sets the value of {@link PodSecurityPolicySpecFsGroup#getRule}
         * @param rule rule is the strategy that will dictate what FSGroup is used in the SecurityContext. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#rule PodSecurityPolicy#rule}
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpecFsGroup#getRange}
         * @param range range block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#range PodSecurityPolicy#range}
         * @return {@code this}
         */
        public Builder range(com.hashicorp.cdktf.IResolvable range) {
            this.range = range;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpecFsGroup#getRange}
         * @param range range block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#range PodSecurityPolicy#range}
         * @return {@code this}
         */
        public Builder range(java.util.List<? extends imports.kubernetes.PodSecurityPolicySpecFsGroupRange> range) {
            this.range = range;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicySpecFsGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicySpecFsGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicySpecFsGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicySpecFsGroup {
        private final java.lang.String rule;
        private final java.lang.Object range;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.range = software.amazon.jsii.Kernel.get(this, "range", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(builder.rule, "rule is required");
            this.range = builder.range;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public final java.lang.Object getRange() {
            return this.range;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getRange() != null) {
                data.set("range", om.valueToTree(this.getRange()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicySpecFsGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicySpecFsGroup.Jsii$Proxy that = (PodSecurityPolicySpecFsGroup.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.range != null ? this.range.equals(that.range) : that.range == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.range != null ? this.range.hashCode() : 0);
            return result;
        }
    }
}
