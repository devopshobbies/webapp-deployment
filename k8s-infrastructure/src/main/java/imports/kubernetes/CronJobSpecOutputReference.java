package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.006Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecOutputReference")
public class CronJobSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CronJobSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putJobTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putJobTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConcurrencyPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetConcurrencyPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailedJobsHistoryLimit() {
        software.amazon.jsii.Kernel.call(this, "resetFailedJobsHistoryLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingDeadlineSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetStartingDeadlineSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuccessfulJobsHistoryLimit() {
        software.amazon.jsii.Kernel.call(this, "resetSuccessfulJobsHistoryLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuspend() {
        software.amazon.jsii.Kernel.call(this, "resetSuspend", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplateOutputReference getJobTemplate() {
        return software.amazon.jsii.Kernel.get(this, "jobTemplate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConcurrencyPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "concurrencyPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFailedJobsHistoryLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "failedJobsHistoryLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplate getJobTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "jobTemplateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getStartingDeadlineSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "startingDeadlineSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSuccessfulJobsHistoryLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "successfulJobsHistoryLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSuspendInput() {
        return software.amazon.jsii.Kernel.get(this, "suspendInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConcurrencyPolicy() {
        return software.amazon.jsii.Kernel.get(this, "concurrencyPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConcurrencyPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "concurrencyPolicy", java.util.Objects.requireNonNull(value, "concurrencyPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailedJobsHistoryLimit() {
        return software.amazon.jsii.Kernel.get(this, "failedJobsHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFailedJobsHistoryLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "failedJobsHistoryLimit", java.util.Objects.requireNonNull(value, "failedJobsHistoryLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedule() {
        return software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedule", java.util.Objects.requireNonNull(value, "schedule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getStartingDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "startingDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setStartingDeadlineSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "startingDeadlineSeconds", java.util.Objects.requireNonNull(value, "startingDeadlineSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSuccessfulJobsHistoryLimit() {
        return software.amazon.jsii.Kernel.get(this, "successfulJobsHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSuccessfulJobsHistoryLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "successfulJobsHistoryLimit", java.util.Objects.requireNonNull(value, "successfulJobsHistoryLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSuspend() {
        return software.amazon.jsii.Kernel.get(this, "suspend", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSuspend(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "suspend", java.util.Objects.requireNonNull(value, "suspend is required"));
    }

    public void setSuspend(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "suspend", java.util.Objects.requireNonNull(value, "suspend is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
