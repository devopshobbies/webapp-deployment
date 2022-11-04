package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.208Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicySpecEgressPorts")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicySpecEgressPorts.Jsii$Proxy.class)
public interface NetworkPolicySpecEgressPorts extends software.amazon.jsii.JsiiSerializable {

    /**
     * The port on the given protocol.
     * <p>
     * This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#port NetworkPolicy#port}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPort() {
        return null;
    }

    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#protocol NetworkPolicy#protocol}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicySpecEgressPorts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicySpecEgressPorts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicySpecEgressPorts> {
        java.lang.String port;
        java.lang.String protocol;

        /**
         * Sets the value of {@link NetworkPolicySpecEgressPorts#getPort}
         * @param port The port on the given protocol.
         *             This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#port NetworkPolicy#port}
         * @return {@code this}
         */
        public Builder port(java.lang.String port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpecEgressPorts#getProtocol}
         * @param protocol The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#protocol NetworkPolicy#protocol}
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicySpecEgressPorts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicySpecEgressPorts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicySpecEgressPorts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicySpecEgressPorts {
        private final java.lang.String port;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        @Override
        public final java.lang.String getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicySpecEgressPorts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicySpecEgressPorts.Jsii$Proxy that = (NetworkPolicySpecEgressPorts.Jsii$Proxy) o;

            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.port != null ? this.port.hashCode() : 0;
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
