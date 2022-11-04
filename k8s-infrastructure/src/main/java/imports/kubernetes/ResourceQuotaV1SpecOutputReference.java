package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.877Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ResourceQuotaV1SpecOutputReference")
public class ResourceQuotaV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ResourceQuotaV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ResourceQuotaV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ResourceQuotaV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putScopeSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.ResourceQuotaV1SpecScopeSelector value) {
        software.amazon.jsii.Kernel.call(this, "putScopeSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHard() {
        software.amazon.jsii.Kernel.call(this, "resetHard", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScopes() {
        software.amazon.jsii.Kernel.call(this, "resetScopes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScopeSelector() {
        software.amazon.jsii.Kernel.call(this, "resetScopeSelector", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ResourceQuotaV1SpecScopeSelectorOutputReference getScopeSelector() {
        return software.amazon.jsii.Kernel.get(this, "scopeSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaV1SpecScopeSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getHardInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "hardInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaV1SpecScopeSelector getScopeSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "scopeSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaV1SpecScopeSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getScopesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "scopesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getHard() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "hard", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setHard(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "hard", java.util.Objects.requireNonNull(value, "hard is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getScopes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "scopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setScopes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "scopes", java.util.Objects.requireNonNull(value, "scopes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
