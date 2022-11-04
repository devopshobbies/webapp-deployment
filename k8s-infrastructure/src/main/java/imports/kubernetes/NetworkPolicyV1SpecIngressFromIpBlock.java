package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.225Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicyV1SpecIngressFromIpBlock")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyV1SpecIngressFromIpBlock.Jsii$Proxy.class)
public interface NetworkPolicyV1SpecIngressFromIpBlock extends software.amazon.jsii.JsiiSerializable {

    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64".
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#cidr NetworkPolicyV1#cidr}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCidr() {
        return null;
    }

    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#except NetworkPolicyV1#except}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcept() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyV1SpecIngressFromIpBlock}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyV1SpecIngressFromIpBlock}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyV1SpecIngressFromIpBlock> {
        java.lang.String cidr;
        java.util.List<java.lang.String> except;

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngressFromIpBlock#getCidr}
         * @param cidr CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64".
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#cidr NetworkPolicyV1#cidr}
         * @return {@code this}
         */
        public Builder cidr(java.lang.String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngressFromIpBlock#getExcept}
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#except NetworkPolicyV1#except}
         * @return {@code this}
         */
        public Builder except(java.util.List<java.lang.String> except) {
            this.except = except;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyV1SpecIngressFromIpBlock}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyV1SpecIngressFromIpBlock build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyV1SpecIngressFromIpBlock}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyV1SpecIngressFromIpBlock {
        private final java.lang.String cidr;
        private final java.util.List<java.lang.String> except;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidr = software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.except = software.amazon.jsii.Kernel.get(this, "except", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidr = builder.cidr;
            this.except = builder.except;
        }

        @Override
        public final java.lang.String getCidr() {
            return this.cidr;
        }

        @Override
        public final java.util.List<java.lang.String> getExcept() {
            return this.except;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCidr() != null) {
                data.set("cidr", om.valueToTree(this.getCidr()));
            }
            if (this.getExcept() != null) {
                data.set("except", om.valueToTree(this.getExcept()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicyV1SpecIngressFromIpBlock"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyV1SpecIngressFromIpBlock.Jsii$Proxy that = (NetworkPolicyV1SpecIngressFromIpBlock.Jsii$Proxy) o;

            if (this.cidr != null ? !this.cidr.equals(that.cidr) : that.cidr != null) return false;
            return this.except != null ? this.except.equals(that.except) : that.except == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidr != null ? this.cidr.hashCode() : 0;
            result = 31 * result + (this.except != null ? this.except.hashCode() : 0);
            return result;
        }
    }
}
