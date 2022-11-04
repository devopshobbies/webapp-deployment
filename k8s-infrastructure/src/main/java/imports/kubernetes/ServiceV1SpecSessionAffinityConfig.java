package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceV1SpecSessionAffinityConfig")
@software.amazon.jsii.Jsii.Proxy(ServiceV1SpecSessionAffinityConfig.Jsii$Proxy.class)
public interface ServiceV1SpecSessionAffinityConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * client_ip block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service_v1#client_ip ServiceV1#client_ip}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp getClientIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceV1SpecSessionAffinityConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceV1SpecSessionAffinityConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceV1SpecSessionAffinityConfig> {
        imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp clientIp;

        /**
         * Sets the value of {@link ServiceV1SpecSessionAffinityConfig#getClientIp}
         * @param clientIp client_ip block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service_v1#client_ip ServiceV1#client_ip}
         * @return {@code this}
         */
        public Builder clientIp(imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceV1SpecSessionAffinityConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceV1SpecSessionAffinityConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceV1SpecSessionAffinityConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceV1SpecSessionAffinityConfig {
        private final imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp clientIp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientIp = software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIp = builder.clientIp;
        }

        @Override
        public final imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp getClientIp() {
            return this.clientIp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientIp() != null) {
                data.set("clientIp", om.valueToTree(this.getClientIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ServiceV1SpecSessionAffinityConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceV1SpecSessionAffinityConfig.Jsii$Proxy that = (ServiceV1SpecSessionAffinityConfig.Jsii$Proxy) o;

            return this.clientIp != null ? this.clientIp.equals(that.clientIp) : that.clientIp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIp != null ? this.clientIp.hashCode() : 0;
            return result;
        }
    }
}
