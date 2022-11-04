package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.176Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ValidatingWebhookConfigurationWebhookClientConfig")
@software.amazon.jsii.Jsii.Proxy(ValidatingWebhookConfigurationWebhookClientConfig.Jsii$Proxy.class)
public interface ValidatingWebhookConfigurationWebhookClientConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * <p>
     * If unspecified, system trust roots on the apiserver are used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#ca_bundle ValidatingWebhookConfiguration#ca_bundle}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaBundle() {
        return null;
    }

    /**
     * service block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#service ValidatingWebhookConfiguration#service}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService getService() {
        return null;
    }

    /**
     * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
     * <p>
     * Exactly one of <code>url</code> or <code>service</code> must be specified.
     * <p>
     * The <code>host</code> should not refer to a service running in the cluster; use the <code>service</code> field instead. The host might be resolved via external DNS in some apiservers (e.g., <code>kube-apiserver</code> cannot resolve in-cluster DNS as that would be a layering violation). <code>host</code> may also be an IP address.
     * <p>
     * Please note that using <code>localhost</code> or <code>127.0.0.1</code> as a <code>host</code> is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * <p>
     * The scheme must be "https"; the URL must begin with "https://".
     * <p>
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * <p>
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#url ValidatingWebhookConfiguration#url}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUrl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingWebhookConfigurationWebhookClientConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingWebhookConfigurationWebhookClientConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingWebhookConfigurationWebhookClientConfig> {
        java.lang.String caBundle;
        imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService service;
        java.lang.String url;

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationWebhookClientConfig#getCaBundle}
         * @param caBundle `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
         *                 If unspecified, system trust roots on the apiserver are used.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#ca_bundle ValidatingWebhookConfiguration#ca_bundle}
         * @return {@code this}
         */
        public Builder caBundle(java.lang.String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationWebhookClientConfig#getService}
         * @param service service block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#service ValidatingWebhookConfiguration#service}
         * @return {@code this}
         */
        public Builder service(imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationWebhookClientConfig#getUrl}
         * @param url `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
         *            Exactly one of <code>url</code> or <code>service</code> must be specified.
         *            <p>
         *            The <code>host</code> should not refer to a service running in the cluster; use the <code>service</code> field instead. The host might be resolved via external DNS in some apiservers (e.g., <code>kube-apiserver</code> cannot resolve in-cluster DNS as that would be a layering violation). <code>host</code> may also be an IP address.
         *            <p>
         *            Please note that using <code>localhost</code> or <code>127.0.0.1</code> as a <code>host</code> is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
         *            <p>
         *            The scheme must be "https"; the URL must begin with "https://".
         *            <p>
         *            A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
         *            <p>
         *            Attempting to use a user or basic auth e.g. "user:password&#64;" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
         *            <p>
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration#url ValidatingWebhookConfiguration#url}
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingWebhookConfigurationWebhookClientConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingWebhookConfigurationWebhookClientConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidatingWebhookConfigurationWebhookClientConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingWebhookConfigurationWebhookClientConfig {
        private final java.lang.String caBundle;
        private final imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService service;
        private final java.lang.String url;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.caBundle = software.amazon.jsii.Kernel.get(this, "caBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService.class));
            this.url = software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.caBundle = builder.caBundle;
            this.service = builder.service;
            this.url = builder.url;
        }

        @Override
        public final java.lang.String getCaBundle() {
            return this.caBundle;
        }

        @Override
        public final imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService getService() {
            return this.service;
        }

        @Override
        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCaBundle() != null) {
                data.set("caBundle", om.valueToTree(this.getCaBundle()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }
            if (this.getUrl() != null) {
                data.set("url", om.valueToTree(this.getUrl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ValidatingWebhookConfigurationWebhookClientConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingWebhookConfigurationWebhookClientConfig.Jsii$Proxy that = (ValidatingWebhookConfigurationWebhookClientConfig.Jsii$Proxy) o;

            if (this.caBundle != null ? !this.caBundle.equals(that.caBundle) : that.caBundle != null) return false;
            if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
            return this.url != null ? this.url.equals(that.url) : that.url == null;
        }

        @Override
        public final int hashCode() {
            int result = this.caBundle != null ? this.caBundle.hashCode() : 0;
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            result = 31 * result + (this.url != null ? this.url.hashCode() : 0);
            return result;
        }
    }
}
