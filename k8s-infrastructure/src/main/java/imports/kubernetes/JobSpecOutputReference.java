package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.937Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecOutputReference")
public class JobSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetActiveDeadlineSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetActiveDeadlineSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBackoffLimit() {
        software.amazon.jsii.Kernel.call(this, "resetBackoffLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompletionMode() {
        software.amazon.jsii.Kernel.call(this, "resetCompletionMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompletions() {
        software.amazon.jsii.Kernel.call(this, "resetCompletions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManualSelector() {
        software.amazon.jsii.Kernel.call(this, "resetManualSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParallelism() {
        software.amazon.jsii.Kernel.call(this, "resetParallelism", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelector() {
        software.amazon.jsii.Kernel.call(this, "resetSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTtlSecondsAfterFinished() {
        software.amazon.jsii.Kernel.call(this, "resetTtlSecondsAfterFinished", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateOutputReference getTemplate() {
        return software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBackoffLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "backoffLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCompletionModeInput() {
        return software.amazon.jsii.Kernel.get(this, "completionModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCompletionsInput() {
        return software.amazon.jsii.Kernel.get(this, "completionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getManualSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "manualSelectorInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getParallelismInput() {
        return software.amazon.jsii.Kernel.get(this, "parallelismInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplate getTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "templateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTtlSecondsAfterFinishedInput() {
        return software.amazon.jsii.Kernel.get(this, "ttlSecondsAfterFinishedInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getActiveDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setActiveDeadlineSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "activeDeadlineSeconds", java.util.Objects.requireNonNull(value, "activeDeadlineSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBackoffLimit() {
        return software.amazon.jsii.Kernel.get(this, "backoffLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBackoffLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "backoffLimit", java.util.Objects.requireNonNull(value, "backoffLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCompletionMode() {
        return software.amazon.jsii.Kernel.get(this, "completionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCompletionMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "completionMode", java.util.Objects.requireNonNull(value, "completionMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCompletions() {
        return software.amazon.jsii.Kernel.get(this, "completions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCompletions(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "completions", java.util.Objects.requireNonNull(value, "completions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getManualSelector() {
        return software.amazon.jsii.Kernel.get(this, "manualSelector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setManualSelector(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "manualSelector", java.util.Objects.requireNonNull(value, "manualSelector is required"));
    }

    public void setManualSelector(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "manualSelector", java.util.Objects.requireNonNull(value, "manualSelector is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getParallelism() {
        return software.amazon.jsii.Kernel.get(this, "parallelism", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setParallelism(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "parallelism", java.util.Objects.requireNonNull(value, "parallelism is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTtlSecondsAfterFinished() {
        return software.amazon.jsii.Kernel.get(this, "ttlSecondsAfterFinished", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTtlSecondsAfterFinished(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ttlSecondsAfterFinished", java.util.Objects.requireNonNull(value, "ttlSecondsAfterFinished is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
