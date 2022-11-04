package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.734Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CertificateSigningRequestSpecOutputReference")
public class CertificateSigningRequestSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CertificateSigningRequestSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CertificateSigningRequestSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CertificateSigningRequestSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSignerName() {
        software.amazon.jsii.Kernel.call(this, "resetSignerName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsages() {
        software.amazon.jsii.Kernel.call(this, "resetUsages", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "requestInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSignerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "signerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "usagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequest() {
        return software.amazon.jsii.Kernel.get(this, "request", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequest(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "request", java.util.Objects.requireNonNull(value, "request is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSignerName() {
        return software.amazon.jsii.Kernel.get(this, "signerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSignerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "signerName", java.util.Objects.requireNonNull(value, "signerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getUsages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "usages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setUsages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "usages", java.util.Objects.requireNonNull(value, "usages is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CertificateSigningRequestSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CertificateSigningRequestSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
