package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.219Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket extends software.amazon.jsii.JsiiSerializable {

    /**
     * Number or name of the port to access on the container.
     * <p>
     * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#port DaemonSetV1#port}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPort();

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket> {
        java.lang.String port;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket#getPort}
         * @param port Number or name of the port to access on the container. This parameter is required.
         *             Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#port DaemonSetV1#port}
         * @return {@code this}
         */
        public Builder port(java.lang.String port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket {
        private final java.lang.String port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(builder.port, "port is required");
        }

        @Override
        public final java.lang.String getPort() {
            return this.port;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecInitContainerLifecyclePostStartTcpSocket.Jsii$Proxy) o;

            return this.port.equals(that.port);
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            return result;
        }
    }
}
