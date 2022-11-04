package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.877Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ResourceQuotaV1SpecScopeSelectorOutputReference")
public class ResourceQuotaV1SpecScopeSelectorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ResourceQuotaV1SpecScopeSelectorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ResourceQuotaV1SpecScopeSelectorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ResourceQuotaV1SpecScopeSelectorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMatchExpression(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMatchExpression", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMatchExpression() {
        software.amazon.jsii.Kernel.call(this, "resetMatchExpression", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ResourceQuotaV1SpecScopeSelectorMatchExpressionList getMatchExpression() {
        return software.amazon.jsii.Kernel.get(this, "matchExpression", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaV1SpecScopeSelectorMatchExpressionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "matchExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaV1SpecScopeSelector getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaV1SpecScopeSelector.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaV1SpecScopeSelector value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
