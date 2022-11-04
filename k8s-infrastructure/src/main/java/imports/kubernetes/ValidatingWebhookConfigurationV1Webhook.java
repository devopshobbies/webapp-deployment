package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.171Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ValidatingWebhookConfigurationV1Webhook")
@software.amazon.jsii.Jsii.Proxy(ValidatingWebhookConfigurationV1Webhook.Jsii$Proxy.class)
public interface ValidatingWebhookConfigurationV1Webhook extends software.amazon.jsii.JsiiSerializable {

    /**
     * client_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#client_config ValidatingWebhookConfigurationV1#client_config}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig getClientConfig();

    /**
     * The name of the admission webhook.
     * <p>
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#name ValidatingWebhookConfigurationV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects.
     * <p>
     * API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#admission_review_versions ValidatingWebhookConfigurationV1#admission_review_versions}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdmissionReviewVersions() {
        return null;
    }

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
     * <p>
     * Defaults to Fail.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#failure_policy ValidatingWebhookConfigurationV1#failure_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicy() {
        return null;
    }

    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * <p>
     * <ul>
     * <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
     * <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
     * </ul>
     * <p>
     * Defaults to "Equivalent"
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#match_policy ValidatingWebhookConfigurationV1#match_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMatchPolicy() {
        return null;
    }

    /**
     * namespace_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#namespace_selector ValidatingWebhookConfigurationV1#namespace_selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector getNamespaceSelector() {
        return null;
    }

    /**
     * object_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#object_selector ValidatingWebhookConfigurationV1#object_selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector getObjectSelector() {
        return null;
    }

    /**
     * rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#rule ValidatingWebhookConfigurationV1#rule}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRule() {
        return null;
    }

    /**
     * SideEffects states whether this webhook has side effects.
     * <p>
     * Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#side_effects ValidatingWebhookConfigurationV1#side_effects}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSideEffects() {
        return null;
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook.
     * <p>
     * After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#timeout_seconds ValidatingWebhookConfigurationV1#timeout_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingWebhookConfigurationV1Webhook}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingWebhookConfigurationV1Webhook}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingWebhookConfigurationV1Webhook> {
        imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig clientConfig;
        java.lang.String name;
        java.util.List<java.lang.String> admissionReviewVersions;
        java.lang.String failurePolicy;
        java.lang.String matchPolicy;
        imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector namespaceSelector;
        imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector objectSelector;
        java.lang.Object rule;
        java.lang.String sideEffects;
        java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getClientConfig}
         * @param clientConfig client_config block. This parameter is required.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#client_config ValidatingWebhookConfigurationV1#client_config}
         * @return {@code this}
         */
        public Builder clientConfig(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getName}
         * @param name The name of the admission webhook. This parameter is required.
         *             Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#name ValidatingWebhookConfigurationV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getAdmissionReviewVersions}
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects.
         *                                API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
         *                                <p>
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#admission_review_versions ValidatingWebhookConfigurationV1#admission_review_versions}
         * @return {@code this}
         */
        public Builder admissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions) {
            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getFailurePolicy}
         * @param failurePolicy FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
         *                      Defaults to Fail.
         *                      <p>
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#failure_policy ValidatingWebhookConfigurationV1#failure_policy}
         * @return {@code this}
         */
        public Builder failurePolicy(java.lang.String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getMatchPolicy}
         * @param matchPolicy matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
         *                    <ul>
         *                    <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
         *                    <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
         *                    </ul>
         *                    <p>
         *                    Defaults to "Equivalent"
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#match_policy ValidatingWebhookConfigurationV1#match_policy}
         * @return {@code this}
         */
        public Builder matchPolicy(java.lang.String matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getNamespaceSelector}
         * @param namespaceSelector namespace_selector block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#namespace_selector ValidatingWebhookConfigurationV1#namespace_selector}
         * @return {@code this}
         */
        public Builder namespaceSelector(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getObjectSelector}
         * @param objectSelector object_selector block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#object_selector ValidatingWebhookConfigurationV1#object_selector}
         * @return {@code this}
         */
        public Builder objectSelector(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getRule}
         * @param rule rule block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#rule ValidatingWebhookConfigurationV1#rule}
         * @return {@code this}
         */
        public Builder rule(com.hashicorp.cdktf.IResolvable rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getRule}
         * @param rule rule block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#rule ValidatingWebhookConfigurationV1#rule}
         * @return {@code this}
         */
        public Builder rule(java.util.List<? extends imports.kubernetes.ValidatingWebhookConfigurationV1WebhookRule> rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getSideEffects}
         * @param sideEffects SideEffects states whether this webhook has side effects.
         *                    Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#side_effects ValidatingWebhookConfigurationV1#side_effects}
         * @return {@code this}
         */
        public Builder sideEffects(java.lang.String sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationV1Webhook#getTimeoutSeconds}
         * @param timeoutSeconds TimeoutSeconds specifies the timeout for this webhook.
         *                       After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/validating_webhook_configuration_v1#timeout_seconds ValidatingWebhookConfigurationV1#timeout_seconds}
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingWebhookConfigurationV1Webhook}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingWebhookConfigurationV1Webhook build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidatingWebhookConfigurationV1Webhook}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingWebhookConfigurationV1Webhook {
        private final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig clientConfig;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> admissionReviewVersions;
        private final java.lang.String failurePolicy;
        private final java.lang.String matchPolicy;
        private final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector namespaceSelector;
        private final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector objectSelector;
        private final java.lang.Object rule;
        private final java.lang.String sideEffects;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientConfig = software.amazon.jsii.Kernel.get(this, "clientConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.admissionReviewVersions = software.amazon.jsii.Kernel.get(this, "admissionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.failurePolicy = software.amazon.jsii.Kernel.get(this, "failurePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchPolicy = software.amazon.jsii.Kernel.get(this, "matchPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespaceSelector = software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector.class));
            this.objectSelector = software.amazon.jsii.Kernel.get(this, "objectSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector.class));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.sideEffects = software.amazon.jsii.Kernel.get(this, "sideEffects", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientConfig = java.util.Objects.requireNonNull(builder.clientConfig, "clientConfig is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.admissionReviewVersions = builder.admissionReviewVersions;
            this.failurePolicy = builder.failurePolicy;
            this.matchPolicy = builder.matchPolicy;
            this.namespaceSelector = builder.namespaceSelector;
            this.objectSelector = builder.objectSelector;
            this.rule = builder.rule;
            this.sideEffects = builder.sideEffects;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        @Override
        public final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookClientConfig getClientConfig() {
            return this.clientConfig;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getAdmissionReviewVersions() {
            return this.admissionReviewVersions;
        }

        @Override
        public final java.lang.String getFailurePolicy() {
            return this.failurePolicy;
        }

        @Override
        public final java.lang.String getMatchPolicy() {
            return this.matchPolicy;
        }

        @Override
        public final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookNamespaceSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public final imports.kubernetes.ValidatingWebhookConfigurationV1WebhookObjectSelector getObjectSelector() {
            return this.objectSelector;
        }

        @Override
        public final java.lang.Object getRule() {
            return this.rule;
        }

        @Override
        public final java.lang.String getSideEffects() {
            return this.sideEffects;
        }

        @Override
        public final java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("clientConfig", om.valueToTree(this.getClientConfig()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdmissionReviewVersions() != null) {
                data.set("admissionReviewVersions", om.valueToTree(this.getAdmissionReviewVersions()));
            }
            if (this.getFailurePolicy() != null) {
                data.set("failurePolicy", om.valueToTree(this.getFailurePolicy()));
            }
            if (this.getMatchPolicy() != null) {
                data.set("matchPolicy", om.valueToTree(this.getMatchPolicy()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getObjectSelector() != null) {
                data.set("objectSelector", om.valueToTree(this.getObjectSelector()));
            }
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
            }
            if (this.getSideEffects() != null) {
                data.set("sideEffects", om.valueToTree(this.getSideEffects()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ValidatingWebhookConfigurationV1Webhook"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingWebhookConfigurationV1Webhook.Jsii$Proxy that = (ValidatingWebhookConfigurationV1Webhook.Jsii$Proxy) o;

            if (!clientConfig.equals(that.clientConfig)) return false;
            if (!name.equals(that.name)) return false;
            if (this.admissionReviewVersions != null ? !this.admissionReviewVersions.equals(that.admissionReviewVersions) : that.admissionReviewVersions != null) return false;
            if (this.failurePolicy != null ? !this.failurePolicy.equals(that.failurePolicy) : that.failurePolicy != null) return false;
            if (this.matchPolicy != null ? !this.matchPolicy.equals(that.matchPolicy) : that.matchPolicy != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            if (this.objectSelector != null ? !this.objectSelector.equals(that.objectSelector) : that.objectSelector != null) return false;
            if (this.rule != null ? !this.rule.equals(that.rule) : that.rule != null) return false;
            if (this.sideEffects != null ? !this.sideEffects.equals(that.sideEffects) : that.sideEffects != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientConfig.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.admissionReviewVersions != null ? this.admissionReviewVersions.hashCode() : 0);
            result = 31 * result + (this.failurePolicy != null ? this.failurePolicy.hashCode() : 0);
            result = 31 * result + (this.matchPolicy != null ? this.matchPolicy.hashCode() : 0);
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.objectSelector != null ? this.objectSelector.hashCode() : 0);
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            result = 31 * result + (this.sideEffects != null ? this.sideEffects.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
