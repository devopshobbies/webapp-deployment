package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.052Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1SpecTemplateSpecAffinityOutputReference")
public class JobV1SpecTemplateSpecAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobV1SpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobV1SpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobV1SpecTemplateSpecAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNodeAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityNodeAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putNodeAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAntiAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAntiAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetNodeAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetNodeAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPodAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetPodAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPodAntiAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetPodAntiAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityNodeAffinityOutputReference getNodeAffinity() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityNodeAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAffinityOutputReference getPodAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference getPodAntiAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinityNodeAffinity getNodeAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityNodeAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAffinity getPodAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinityPodAntiAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
