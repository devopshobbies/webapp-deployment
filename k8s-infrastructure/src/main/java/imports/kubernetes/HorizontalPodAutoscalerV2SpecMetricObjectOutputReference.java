package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.903Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectOutputReference")
public class HorizontalPodAutoscalerV2SpecMetricObjectOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HorizontalPodAutoscalerV2SpecMetricObjectOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerV2SpecMetricObjectOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public HorizontalPodAutoscalerV2SpecMetricObjectOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDescribedObject(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectDescribedObject value) {
        software.amazon.jsii.Kernel.call(this, "putDescribedObject", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetric(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectMetric value) {
        software.amazon.jsii.Kernel.call(this, "putMetric", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTarget(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectTarget value) {
        software.amazon.jsii.Kernel.call(this, "putTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTarget() {
        software.amazon.jsii.Kernel.call(this, "resetTarget", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectDescribedObjectOutputReference getDescribedObject() {
        return software.amazon.jsii.Kernel.get(this, "describedObject", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectDescribedObjectOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectMetricOutputReference getMetric() {
        return software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectMetricOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectTargetOutputReference getTarget() {
        return software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectDescribedObject getDescribedObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "describedObjectInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectDescribedObject.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectMetric getMetricInput() {
        return software.amazon.jsii.Kernel.get(this, "metricInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectMetric.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectTarget getTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "targetInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
