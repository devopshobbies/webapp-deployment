package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.722Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ApiServiceV1SpecOutputReference")
public class ApiServiceV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApiServiceV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiServiceV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApiServiceV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putService(final @org.jetbrains.annotations.NotNull imports.kubernetes.ApiServiceV1SpecService value) {
        software.amazon.jsii.Kernel.call(this, "putService", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCaBundle() {
        software.amazon.jsii.Kernel.call(this, "resetCaBundle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsecureSkipTlsVerify() {
        software.amazon.jsii.Kernel.call(this, "resetInsecureSkipTlsVerify", software.amazon.jsii.NativeType.VOID);
    }

    public void resetService() {
        software.amazon.jsii.Kernel.call(this, "resetService", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ApiServiceV1SpecServiceOutputReference getService() {
        return software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ApiServiceV1SpecServiceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaBundleInput() {
        return software.amazon.jsii.Kernel.get(this, "caBundleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "groupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getGroupPriorityMinimumInput() {
        return software.amazon.jsii.Kernel.get(this, "groupPriorityMinimumInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecureSkipTlsVerifyInput() {
        return software.amazon.jsii.Kernel.get(this, "insecureSkipTlsVerifyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ApiServiceV1SpecService getServiceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ApiServiceV1SpecService.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getVersionPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "versionPriorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCaBundle() {
        return software.amazon.jsii.Kernel.get(this, "caBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaBundle(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caBundle", java.util.Objects.requireNonNull(value, "caBundle is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGroup() {
        return software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "group", java.util.Objects.requireNonNull(value, "group is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getGroupPriorityMinimum() {
        return software.amazon.jsii.Kernel.get(this, "groupPriorityMinimum", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setGroupPriorityMinimum(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "groupPriorityMinimum", java.util.Objects.requireNonNull(value, "groupPriorityMinimum is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInsecureSkipTlsVerify() {
        return software.amazon.jsii.Kernel.get(this, "insecureSkipTlsVerify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInsecureSkipTlsVerify(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "insecureSkipTlsVerify", java.util.Objects.requireNonNull(value, "insecureSkipTlsVerify is required"));
    }

    public void setInsecureSkipTlsVerify(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "insecureSkipTlsVerify", java.util.Objects.requireNonNull(value, "insecureSkipTlsVerify is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVersionPriority() {
        return software.amazon.jsii.Kernel.get(this, "versionPriority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVersionPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "versionPriority", java.util.Objects.requireNonNull(value, "versionPriority is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ApiServiceV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ApiServiceV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ApiServiceV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
