package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.286Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodDisruptionBudgetV1SpecOutputReference")
public class PodDisruptionBudgetV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodDisruptionBudgetV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodDisruptionBudgetV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodDisruptionBudgetV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodDisruptionBudgetV1SpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMaxUnavailable() {
        software.amazon.jsii.Kernel.call(this, "resetMaxUnavailable", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinAvailable() {
        software.amazon.jsii.Kernel.call(this, "resetMinAvailable", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodDisruptionBudgetV1SpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodDisruptionBudgetV1SpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxUnavailableInput() {
        return software.amazon.jsii.Kernel.get(this, "maxUnavailableInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMinAvailableInput() {
        return software.amazon.jsii.Kernel.get(this, "minAvailableInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodDisruptionBudgetV1SpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodDisruptionBudgetV1SpecSelector.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxUnavailable() {
        return software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxUnavailable(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxUnavailable", java.util.Objects.requireNonNull(value, "maxUnavailable is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMinAvailable() {
        return software.amazon.jsii.Kernel.get(this, "minAvailable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMinAvailable(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "minAvailable", java.util.Objects.requireNonNull(value, "minAvailable is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodDisruptionBudgetV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodDisruptionBudgetV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodDisruptionBudgetV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
