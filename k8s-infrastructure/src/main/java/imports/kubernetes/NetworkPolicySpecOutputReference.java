package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.219Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicySpecOutputReference")
public class NetworkPolicySpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkPolicySpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkPolicySpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkPolicySpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEgress(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEgress", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIngress(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putIngress", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicySpecPodSelector value) {
        software.amazon.jsii.Kernel.call(this, "putPodSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEgress() {
        software.amazon.jsii.Kernel.call(this, "resetEgress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIngress() {
        software.amazon.jsii.Kernel.call(this, "resetIngress", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicySpecEgressList getEgress() {
        return software.amazon.jsii.Kernel.get(this, "egress", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpecEgressList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicySpecIngressList getIngress() {
        return software.amazon.jsii.Kernel.get(this, "ingress", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpecIngressList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicySpecPodSelectorOutputReference getPodSelector() {
        return software.amazon.jsii.Kernel.get(this, "podSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpecPodSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEgressInput() {
        return software.amazon.jsii.Kernel.get(this, "egressInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIngressInput() {
        return software.amazon.jsii.Kernel.get(this, "ingressInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicySpecPodSelector getPodSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "podSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpecPodSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policyTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPolicyTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "policyTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPolicyTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policyTypes", java.util.Objects.requireNonNull(value, "policyTypes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicySpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicySpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
