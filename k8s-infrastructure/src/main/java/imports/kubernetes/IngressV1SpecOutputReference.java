package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.926Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecOutputReference")
public class IngressV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IngressV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IngressV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IngressV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDefaultBackend(final @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackend value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultBackend", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTls(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTls", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefaultBackend() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultBackend", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackendOutputReference getDefaultBackend() {
        return software.amazon.jsii.Kernel.get(this, "defaultBackend", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecRuleList getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecTlsList getTls() {
        return software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecTlsList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackend getDefaultBackendInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultBackendInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackend.class));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
