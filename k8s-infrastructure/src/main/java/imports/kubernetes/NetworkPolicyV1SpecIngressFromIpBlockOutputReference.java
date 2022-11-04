package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.226Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicyV1SpecIngressFromIpBlockOutputReference")
public class NetworkPolicyV1SpecIngressFromIpBlockOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkPolicyV1SpecIngressFromIpBlockOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkPolicyV1SpecIngressFromIpBlockOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkPolicyV1SpecIngressFromIpBlockOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCidr() {
        software.amazon.jsii.Kernel.call(this, "resetCidr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcept() {
        software.amazon.jsii.Kernel.call(this, "resetExcept", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCidrInput() {
        return software.amazon.jsii.Kernel.get(this, "cidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExceptInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "exceptInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCidr() {
        return software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cidr", java.util.Objects.requireNonNull(value, "cidr is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExcept() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "except", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExcept(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "except", java.util.Objects.requireNonNull(value, "except is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
