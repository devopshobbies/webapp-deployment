package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.047Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecOutputReference")
public class StatefulSetV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUpdateStrategy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putUpdateStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVolumeClaimTemplate(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putVolumeClaimTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPodManagementPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPodManagementPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicas() {
        software.amazon.jsii.Kernel.call(this, "resetReplicas", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRevisionHistoryLimit() {
        software.amazon.jsii.Kernel.call(this, "resetRevisionHistoryLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUpdateStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetUpdateStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeClaimTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeClaimTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateOutputReference getTemplate() {
        return software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecUpdateStrategyList getUpdateStrategy() {
        return software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecUpdateStrategyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateList getVolumeClaimTemplate() {
        return software.amazon.jsii.Kernel.get(this, "volumeClaimTemplate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPodManagementPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "podManagementPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplicasInput() {
        return software.amazon.jsii.Kernel.get(this, "replicasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "revisionHistoryLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplate getTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "templateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUpdateStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "updateStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVolumeClaimTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeClaimTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPodManagementPolicy() {
        return software.amazon.jsii.Kernel.get(this, "podManagementPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPodManagementPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "podManagementPolicy", java.util.Objects.requireNonNull(value, "podManagementPolicy is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceName", java.util.Objects.requireNonNull(value, "serviceName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
