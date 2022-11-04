package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.058Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference")
public class JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPreferredDuringSchedulingIgnoredDuringExecution(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPreferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRequiredDuringSchedulingIgnoredDuringExecution(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRequiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPreferredDuringSchedulingIgnoredDuringExecution() {
        software.amazon.jsii.Kernel.call(this, "resetPreferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequiredDuringSchedulingIgnoredDuringExecution() {
        software.amazon.jsii.Kernel.call(this, "resetRequiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionList getPreferredDuringSchedulingIgnoredDuringExecution() {
        return software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionList getRequiredDuringSchedulingIgnoredDuringExecution() {
        return software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPreferredDuringSchedulingIgnoredDuringExecutionInput() {
        return software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecutionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRequiredDuringSchedulingIgnoredDuringExecutionInput() {
        return software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecutionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
