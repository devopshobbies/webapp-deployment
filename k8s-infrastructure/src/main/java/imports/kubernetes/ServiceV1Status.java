package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceV1Status")
@software.amazon.jsii.Jsii.Proxy(ServiceV1Status.Jsii$Proxy.class)
public interface ServiceV1Status extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link ServiceV1Status}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceV1Status}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceV1Status> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceV1Status}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceV1Status build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceV1Status}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceV1Status {

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();


            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ServiceV1Status"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
