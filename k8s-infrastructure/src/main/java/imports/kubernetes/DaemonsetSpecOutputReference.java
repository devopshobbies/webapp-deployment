package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.279Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecOutputReference")
public class DaemonsetSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonsetSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonsetSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DaemonsetSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStrategy(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecStrategy value) {
        software.amazon.jsii.Kernel.call(this, "putStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMinReadySeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMinReadySeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRevisionHistoryLimit() {
        software.amazon.jsii.Kernel.call(this, "resetRevisionHistoryLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelector() {
        software.amazon.jsii.Kernel.call(this, "resetSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecStrategyOutputReference getStrategy() {
        return software.amazon.jsii.Kernel.get(this, "strategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecStrategyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateOutputReference getTemplate() {
        return software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "minReadySecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "revisionHistoryLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecStrategy getStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "strategyInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecStrategy.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplate getTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "templateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplate.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinReadySeconds() {
        return software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinReadySeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minReadySeconds", java.util.Objects.requireNonNull(value, "minReadySeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRevisionHistoryLimit() {
        return software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRevisionHistoryLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "revisionHistoryLimit", java.util.Objects.requireNonNull(value, "revisionHistoryLimit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
