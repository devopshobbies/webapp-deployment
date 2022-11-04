package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.861Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV1SpecOutputReference")
public class HorizontalPodAutoscalerV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HorizontalPodAutoscalerV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public HorizontalPodAutoscalerV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putScaleTargetRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef value) {
        software.amazon.jsii.Kernel.call(this, "putScaleTargetRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMinReplicas() {
        software.amazon.jsii.Kernel.call(this, "resetMinReplicas", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetCpuUtilizationPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetTargetCpuUtilizationPercentage", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRefOutputReference getScaleTargetRef() {
        return software.amazon.jsii.Kernel.get(this, "scaleTargetRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "maxReplicasInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "minReplicasInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef getScaleTargetRefInput() {
        return software.amazon.jsii.Kernel.get(this, "scaleTargetRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV1SpecScaleTargetRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTargetCpuUtilizationPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "targetCpuUtilizationPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxReplicas() {
        return software.amazon.jsii.Kernel.get(this, "maxReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxReplicas(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxReplicas", java.util.Objects.requireNonNull(value, "maxReplicas is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinReplicas() {
        return software.amazon.jsii.Kernel.get(this, "minReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinReplicas(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minReplicas", java.util.Objects.requireNonNull(value, "minReplicas is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTargetCpuUtilizationPercentage() {
        return software.amazon.jsii.Kernel.get(this, "targetCpuUtilizationPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTargetCpuUtilizationPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "targetCpuUtilizationPercentage", java.util.Objects.requireNonNull(value, "targetCpuUtilizationPercentage is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
