package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.858Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerSpecOutputReference")
public class HorizontalPodAutoscalerSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HorizontalPodAutoscalerSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public HorizontalPodAutoscalerSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBehavior(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecBehavior value) {
        software.amazon.jsii.Kernel.call(this, "putBehavior", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetric(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMetric", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putScaleTargetRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecScaleTargetRef value) {
        software.amazon.jsii.Kernel.call(this, "putScaleTargetRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetric() {
        software.amazon.jsii.Kernel.call(this, "resetMetric", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinReplicas() {
        software.amazon.jsii.Kernel.call(this, "resetMinReplicas", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetCpuUtilizationPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetTargetCpuUtilizationPercentage", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecBehaviorOutputReference getBehavior() {
        return software.amazon.jsii.Kernel.get(this, "behavior", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecBehaviorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecMetricList getMetric() {
        return software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecMetricList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerSpecScaleTargetRefOutputReference getScaleTargetRef() {
        return software.amazon.jsii.Kernel.get(this, "scaleTargetRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecScaleTargetRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecBehavior getBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "behaviorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecBehavior.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "maxReplicasInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMetricInput() {
        return software.amazon.jsii.Kernel.get(this, "metricInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "minReplicasInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpecScaleTargetRef getScaleTargetRefInput() {
        return software.amazon.jsii.Kernel.get(this, "scaleTargetRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpecScaleTargetRef.class));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
