package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.604Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecOutputReference")
public class DeploymentSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStrategy(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecStrategy value) {
        software.amazon.jsii.Kernel.call(this, "putStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMinReadySeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMinReadySeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPaused() {
        software.amazon.jsii.Kernel.call(this, "resetPaused", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProgressDeadlineSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetProgressDeadlineSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicas() {
        software.amazon.jsii.Kernel.call(this, "resetReplicas", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecStrategyOutputReference getStrategy() {
        return software.amazon.jsii.Kernel.get(this, "strategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecStrategyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateOutputReference getTemplate() {
        return software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "minReadySecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPausedInput() {
        return software.amazon.jsii.Kernel.get(this, "pausedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getProgressDeadlineSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "progressDeadlineSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "replicasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "revisionHistoryLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecStrategy getStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "strategyInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecStrategy.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplate getTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "templateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplate.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinReadySeconds() {
        return software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinReadySeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minReadySeconds", java.util.Objects.requireNonNull(value, "minReadySeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPaused() {
        return software.amazon.jsii.Kernel.get(this, "paused", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPaused(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "paused", java.util.Objects.requireNonNull(value, "paused is required"));
    }

    public void setPaused(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "paused", java.util.Objects.requireNonNull(value, "paused is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getProgressDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "progressDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setProgressDeadlineSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "progressDeadlineSeconds", java.util.Objects.requireNonNull(value, "progressDeadlineSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicas() {
        return software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicas(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicas", java.util.Objects.requireNonNull(value, "replicas is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRevisionHistoryLimit() {
        return software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRevisionHistoryLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "revisionHistoryLimit", java.util.Objects.requireNonNull(value, "revisionHistoryLimit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
