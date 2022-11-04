package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.927Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecOutputReference")
public class StatefulSetSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTemplate(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplate value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateOutputReference getTemplate() {
        return software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecUpdateStrategyList getUpdateStrategy() {
        return software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecUpdateStrategyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecVolumeClaimTemplateList getVolumeClaimTemplate() {
        return software.amazon.jsii.Kernel.get(this, "volumeClaimTemplate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecVolumeClaimTemplateList.class));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplate getTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "templateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplate.class));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
