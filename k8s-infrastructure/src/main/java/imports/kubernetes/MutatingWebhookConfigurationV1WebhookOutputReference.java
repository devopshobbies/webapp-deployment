package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.196Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.MutatingWebhookConfigurationV1WebhookOutputReference")
public class MutatingWebhookConfigurationV1WebhookOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MutatingWebhookConfigurationV1WebhookOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MutatingWebhookConfigurationV1WebhookOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public MutatingWebhookConfigurationV1WebhookOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putClientConfig(final @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookClientConfig value) {
        software.amazon.jsii.Kernel.call(this, "putClientConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNamespaceSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookNamespaceSelector value) {
        software.amazon.jsii.Kernel.call(this, "putNamespaceSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putObjectSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookObjectSelector value) {
        software.amazon.jsii.Kernel.call(this, "putObjectSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAdmissionReviewVersions() {
        software.amazon.jsii.Kernel.call(this, "resetAdmissionReviewVersions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailurePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetFailurePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMatchPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetMatchPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamespaceSelector() {
        software.amazon.jsii.Kernel.call(this, "resetNamespaceSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectSelector() {
        software.amazon.jsii.Kernel.call(this, "resetObjectSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReinvocationPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetReinvocationPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRule() {
        software.amazon.jsii.Kernel.call(this, "resetRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSideEffects() {
        software.amazon.jsii.Kernel.call(this, "resetSideEffects", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookClientConfigOutputReference getClientConfig() {
        return software.amazon.jsii.Kernel.get(this, "clientConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookClientConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookNamespaceSelectorOutputReference getNamespaceSelector() {
        return software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookNamespaceSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookObjectSelectorOutputReference getObjectSelector() {
        return software.amazon.jsii.Kernel.get(this, "objectSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookObjectSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.MutatingWebhookConfigurationV1WebhookRuleList getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookRuleList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdmissionReviewVersionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "admissionReviewVersionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.MutatingWebhookConfigurationV1WebhookClientConfig getClientConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "clientConfigInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookClientConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "failurePolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMatchPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "matchPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.MutatingWebhookConfigurationV1WebhookNamespaceSelector getNamespaceSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookNamespaceSelector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.MutatingWebhookConfigurationV1WebhookObjectSelector getObjectSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "objectSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.MutatingWebhookConfigurationV1WebhookObjectSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReinvocationPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "reinvocationPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSideEffectsInput() {
        return software.amazon.jsii.Kernel.get(this, "sideEffectsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAdmissionReviewVersions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "admissionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAdmissionReviewVersions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "admissionReviewVersions", java.util.Objects.requireNonNull(value, "admissionReviewVersions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFailurePolicy() {
        return software.amazon.jsii.Kernel.get(this, "failurePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFailurePolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "failurePolicy", java.util.Objects.requireNonNull(value, "failurePolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMatchPolicy() {
        return software.amazon.jsii.Kernel.get(this, "matchPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMatchPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "matchPolicy", java.util.Objects.requireNonNull(value, "matchPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReinvocationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "reinvocationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReinvocationPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reinvocationPolicy", java.util.Objects.requireNonNull(value, "reinvocationPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSideEffects() {
        return software.amazon.jsii.Kernel.get(this, "sideEffects", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSideEffects(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sideEffects", java.util.Objects.requireNonNull(value, "sideEffects is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutSeconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeoutSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeoutSeconds", java.util.Objects.requireNonNull(value, "timeoutSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.MutatingWebhookConfigurationV1Webhook value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
