package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.429Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector")
@software.amazon.jsii.Jsii.Proxy(DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector.Jsii$Proxy.class)
public interface DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector {

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
            struct.set("fqn", om.valueToTree("kubernetes.DataKubernetesMutatingWebhookConfigurationV1WebhookNamespaceSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
