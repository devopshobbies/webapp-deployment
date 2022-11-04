package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.545Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet")
@software.amazon.jsii.Jsii.Proxy(DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet.Jsii$Proxy.class)
public interface DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet {

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
            struct.set("fqn", om.valueToTree("kubernetes.DataKubernetesPodV1SpecInitContainerLifecyclePreStopHttpGet"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
