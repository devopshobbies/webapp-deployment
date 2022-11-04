package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.875Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ResourceQuotaSpecScopeSelectorOutputReference")
public class ResourceQuotaSpecScopeSelectorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ResourceQuotaSpecScopeSelectorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ResourceQuotaSpecScopeSelectorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ResourceQuotaSpecScopeSelectorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMatchExpression(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMatchExpression", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMatchExpression() {
        software.amazon.jsii.Kernel.call(this, "resetMatchExpression", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ResourceQuotaSpecScopeSelectorMatchExpressionList getMatchExpression() {
        return software.amazon.jsii.Kernel.get(this, "matchExpression", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaSpecScopeSelectorMatchExpressionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "matchExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaSpecScopeSelector getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaSpecScopeSelector.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaSpecScopeSelector value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
