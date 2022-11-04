package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.903Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2SpecMetricOutputReference")
public class HorizontalPodAutoscalerV2SpecMetricOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HorizontalPodAutoscalerV2SpecMetricOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerV2SpecMetricOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public HorizontalPodAutoscalerV2SpecMetricOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putContainerResource(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricContainerResource value) {
        software.amazon.jsii.Kernel.call(this, "putContainerResource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putExternal(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal value) {
        software.amazon.jsii.Kernel.call(this, "putExternal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putObject(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject value) {
        software.amazon.jsii.Kernel.call(this, "putObject", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPods(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricPods value) {
        software.amazon.jsii.Kernel.call(this, "putPods", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResource(final @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricResource value) {
        software.amazon.jsii.Kernel.call(this, "putResource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetContainerResource() {
        software.amazon.jsii.Kernel.call(this, "resetContainerResource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExternal() {
        software.amazon.jsii.Kernel.call(this, "resetExternal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObject() {
        software.amazon.jsii.Kernel.call(this, "resetObject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPods() {
        software.amazon.jsii.Kernel.call(this, "resetPods", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResource() {
        software.amazon.jsii.Kernel.call(this, "resetResource", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricContainerResourceOutputReference getContainerResource() {
        return software.amazon.jsii.Kernel.get(this, "containerResource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricContainerResourceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalOutputReference getExternal() {
        return software.amazon.jsii.Kernel.get(this, "external", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectOutputReference getObject() {
        return software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObjectOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricPodsOutputReference getPods() {
        return software.amazon.jsii.Kernel.get(this, "pods", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricPodsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricResourceOutputReference getResource() {
        return software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricResourceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricContainerResource getContainerResourceInput() {
        return software.amazon.jsii.Kernel.get(this, "containerResourceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricContainerResource.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal getExternalInput() {
        return software.amazon.jsii.Kernel.get(this, "externalInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricExternal.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject getObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "objectInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricObject.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricPods getPodsInput() {
        return software.amazon.jsii.Kernel.get(this, "podsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricPods.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricResource getResourceInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.HorizontalPodAutoscalerV2SpecMetricResource.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.HorizontalPodAutoscalerV2SpecMetric value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
