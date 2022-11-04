package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.176Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ValidatingWebhookConfigurationWebhookClientConfigOutputReference")
public class ValidatingWebhookConfigurationWebhookClientConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ValidatingWebhookConfigurationWebhookClientConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ValidatingWebhookConfigurationWebhookClientConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ValidatingWebhookConfigurationWebhookClientConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putService(final @org.jetbrains.annotations.NotNull imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService value) {
        software.amazon.jsii.Kernel.call(this, "putService", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCaBundle() {
        software.amazon.jsii.Kernel.call(this, "resetCaBundle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetService() {
        software.amazon.jsii.Kernel.call(this, "resetService", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUrl() {
        software.amazon.jsii.Kernel.call(this, "resetUrl", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigServiceOutputReference getService() {
        return software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigServiceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaBundleInput() {
        return software.amazon.jsii.Kernel.get(this, "caBundleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService getServiceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfigService.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "urlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCaBundle() {
        return software.amazon.jsii.Kernel.get(this, "caBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaBundle(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caBundle", java.util.Objects.requireNonNull(value, "caBundle is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "url", java.util.Objects.requireNonNull(value, "url is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ValidatingWebhookConfigurationWebhookClientConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
