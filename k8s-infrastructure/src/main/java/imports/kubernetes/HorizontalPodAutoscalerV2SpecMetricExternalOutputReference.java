package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.899Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalOutputReference")
public class HorizontalPodAutoscalerV2SpecMetricExternalOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HorizontalPodAutoscalerV2SpecMetricExternalOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerV2SpecMetricExternalOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public HorizontalPodAutoscalerV2SpecMetricExternalOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMetric(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalMetric value) {
        software.amazon.jsii.Kernel.call(this, "putMetric", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTarget(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalTarget value) {
        software.amazon.jsii.Kernel.call(this, "putTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTarget() {
        software.amazon.jsii.Kernel.call(this, "resetTarget", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalMetricOutputReference getMetric() {
        return software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalMetricOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalTargetOutputReference getTarget() {
        return software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalMetric getMetricInput() {
        return software.amazon.jsii.Kernel.get(this, "metricInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalMetric.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalTarget getTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "targetInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
