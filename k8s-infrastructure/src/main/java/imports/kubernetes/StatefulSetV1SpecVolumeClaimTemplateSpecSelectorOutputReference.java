package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.157Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelectorOutputReference")
public class StatefulSetV1SpecVolumeClaimTemplateSpecSelectorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetV1SpecVolumeClaimTemplateSpecSelectorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetV1SpecVolumeClaimTemplateSpecSelectorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetV1SpecVolumeClaimTemplateSpecSelectorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMatchExpressions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMatchExpressions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMatchExpressions() {
        software.amazon.jsii.Kernel.call(this, "resetMatchExpressions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMatchLabels() {
        software.amazon.jsii.Kernel.call(this, "resetMatchLabels", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelectorMatchExpressionsList getMatchExpressions() {
        return software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelectorMatchExpressionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressionsInput() {
        return software.amazon.jsii.Kernel.get(this, "matchExpressionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMatchLabelsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "matchLabelsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getMatchLabels() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "matchLabels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMatchLabels(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "matchLabels", java.util.Objects.requireNonNull(value, "matchLabels is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}