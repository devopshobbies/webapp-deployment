package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressSpecOutputReference")
public class IngressSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IngressSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IngressSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IngressSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBackend(final @org.jetbrains.annotations.NotNull imports.kubernetes.IngressSpecBackend value) {
        software.amazon.jsii.Kernel.call(this, "putBackend", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTls(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTls", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBackend() {
        software.amazon.jsii.Kernel.call(this, "resetBackend", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIngressClassName() {
        software.amazon.jsii.Kernel.call(this, "resetIngressClassName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRule() {
        software.amazon.jsii.Kernel.call(this, "resetRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTls() {
        software.amazon.jsii.Kernel.call(this, "resetTls", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressSpecBackendOutputReference getBackend() {
        return software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecBackendOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressSpecRuleList getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressSpecTlsList getTls() {
        return software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecTlsList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpecBackend getBackendInput() {
        return software.amazon.jsii.Kernel.get(this, "backendInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecBackend.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIngressClassNameInput() {
        return software.amazon.jsii.Kernel.get(this, "ingressClassNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTlsInput() {
        return software.amazon.jsii.Kernel.get(this, "tlsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIngressClassName() {
        return software.amazon.jsii.Kernel.get(this, "ingressClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIngressClassName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ingressClassName", java.util.Objects.requireNonNull(value, "ingressClassName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
