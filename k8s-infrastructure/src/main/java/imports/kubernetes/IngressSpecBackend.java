package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressSpecBackend")
@software.amazon.jsii.Jsii.Proxy(IngressSpecBackend.Jsii$Proxy.class)
public interface IngressSpecBackend extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the name of the referenced service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#service_name Ingress#service_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceName() {
        return null;
    }

    /**
     * Specifies the port of the referenced service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#service_port Ingress#service_port}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServicePort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressSpecBackend}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressSpecBackend}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressSpecBackend> {
        java.lang.String serviceName;
        java.lang.String servicePort;

        /**
         * Sets the value of {@link IngressSpecBackend#getServiceName}
         * @param serviceName Specifies the name of the referenced service.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#service_name Ingress#service_name}
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpecBackend#getServicePort}
         * @param servicePort Specifies the port of the referenced service.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#service_port Ingress#service_port}
         * @return {@code this}
         */
        public Builder servicePort(java.lang.String servicePort) {
            this.servicePort = servicePort;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressSpecBackend}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressSpecBackend build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressSpecBackend}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressSpecBackend {
        private final java.lang.String serviceName;
        private final java.lang.String servicePort;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.servicePort = software.amazon.jsii.Kernel.get(this, "servicePort", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public final java.lang.String getServicePort() {
            return this.servicePort;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getServiceName() != null) {
                data.set("serviceName", om.valueToTree(this.getServiceName()));
            }
            if (this.getServicePort() != null) {
                data.set("servicePort", om.valueToTree(this.getServicePort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressSpecBackend"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressSpecBackend.Jsii$Proxy that = (IngressSpecBackend.Jsii$Proxy) o;

            if (this.serviceName != null ? !this.serviceName.equals(that.serviceName) : that.serviceName != null) return false;
            return this.servicePort != null ? this.servicePort.equals(that.servicePort) : that.servicePort == null;
        }

        @Override
        public final int hashCode() {
            int result = this.serviceName != null ? this.serviceName.hashCode() : 0;
            result = 31 * result + (this.servicePort != null ? this.servicePort.hashCode() : 0);
            return result;
        }
    }
}
