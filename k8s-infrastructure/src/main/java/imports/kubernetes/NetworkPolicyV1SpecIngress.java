package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.225Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicyV1SpecIngress")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyV1SpecIngress.Jsii$Proxy.class)
public interface NetworkPolicyV1SpecIngress extends software.amazon.jsii.JsiiSerializable {

    /**
     * from block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#from NetworkPolicyV1#from}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFrom() {
        return null;
    }

    /**
     * ports block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#ports NetworkPolicyV1#ports}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPorts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyV1SpecIngress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyV1SpecIngress}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyV1SpecIngress> {
        java.lang.Object from;
        java.lang.Object ports;

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngress#getFrom}
         * @param from from block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#from NetworkPolicyV1#from}
         * @return {@code this}
         */
        public Builder from(com.hashicorp.cdktf.IResolvable from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngress#getFrom}
         * @param from from block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#from NetworkPolicyV1#from}
         * @return {@code this}
         */
        public Builder from(java.util.List<? extends imports.kubernetes.NetworkPolicyV1SpecIngressFrom> from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngress#getPorts}
         * @param ports ports block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#ports NetworkPolicyV1#ports}
         * @return {@code this}
         */
        public Builder ports(com.hashicorp.cdktf.IResolvable ports) {
            this.ports = ports;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngress#getPorts}
         * @param ports ports block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#ports NetworkPolicyV1#ports}
         * @return {@code this}
         */
        public Builder ports(java.util.List<? extends imports.kubernetes.NetworkPolicyV1SpecIngressPorts> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyV1SpecIngress}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyV1SpecIngress build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyV1SpecIngress}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyV1SpecIngress {
        private final java.lang.Object from;
        private final java.lang.Object ports;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = builder.from;
            this.ports = builder.ports;
        }

        @Override
        public final java.lang.Object getFrom() {
            return this.from;
        }

        @Override
        public final java.lang.Object getPorts() {
            return this.ports;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFrom() != null) {
                data.set("from", om.valueToTree(this.getFrom()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicyV1SpecIngress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyV1SpecIngress.Jsii$Proxy that = (NetworkPolicyV1SpecIngress.Jsii$Proxy) o;

            if (this.from != null ? !this.from.equals(that.from) : that.from != null) return false;
            return this.ports != null ? this.ports.equals(that.ports) : that.ports == null;
        }

        @Override
        public final int hashCode() {
            int result = this.from != null ? this.from.hashCode() : 0;
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            return result;
        }
    }
}
