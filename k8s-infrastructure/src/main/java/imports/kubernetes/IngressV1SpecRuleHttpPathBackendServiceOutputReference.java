package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.934Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecRuleHttpPathBackendServiceOutputReference")
public class IngressV1SpecRuleHttpPathBackendServiceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IngressV1SpecRuleHttpPathBackendServiceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IngressV1SpecRuleHttpPathBackendServiceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IngressV1SpecRuleHttpPathBackendServiceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPort(final @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecRuleHttpPathBackendServicePort value) {
        software.amazon.jsii.Kernel.call(this, "putPort", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecRuleHttpPathBackendServicePortOutputReference getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleHttpPathBackendServicePortOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecRuleHttpPathBackendServicePort getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleHttpPathBackendServicePort.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecRuleHttpPathBackendService getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleHttpPathBackendService.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecRuleHttpPathBackendService value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
