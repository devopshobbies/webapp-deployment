package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.116Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintOutputReference")
public class CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putLabelSelector(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLabelSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetLabelSelector() {
        software.amazon.jsii.Kernel.call(this, "resetLabelSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxSkew() {
        software.amazon.jsii.Kernel.call(this, "resetMaxSkew", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopologyKey() {
        software.amazon.jsii.Kernel.call(this, "resetTopologyKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWhenUnsatisfiable() {
        software.amazon.jsii.Kernel.call(this, "resetWhenUnsatisfiable", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintLabelSelectorList getLabelSelector() {
        return software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraintLabelSelectorList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLabelSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "labelSelectorInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxSkewInput() {
        return software.amazon.jsii.Kernel.get(this, "maxSkewInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTopologyKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "topologyKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWhenUnsatisfiableInput() {
        return software.amazon.jsii.Kernel.get(this, "whenUnsatisfiableInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxSkew() {
        return software.amazon.jsii.Kernel.get(this, "maxSkew", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxSkew(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxSkew", java.util.Objects.requireNonNull(value, "maxSkew is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey() {
        return software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTopologyKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "topologyKey", java.util.Objects.requireNonNull(value, "topologyKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWhenUnsatisfiable() {
        return software.amazon.jsii.Kernel.get(this, "whenUnsatisfiable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWhenUnsatisfiable(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "whenUnsatisfiable", java.util.Objects.requireNonNull(value, "whenUnsatisfiable is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecTopologySpreadConstraint value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
