package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.224Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicyV1SpecEgressToOutputReference")
public class NetworkPolicyV1SpecEgressToOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkPolicyV1SpecEgressToOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkPolicyV1SpecEgressToOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public NetworkPolicyV1SpecEgressToOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putIpBlock(final @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToIpBlock value) {
        software.amazon.jsii.Kernel.call(this, "putIpBlock", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNamespaceSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToNamespaceSelector value) {
        software.amazon.jsii.Kernel.call(this, "putNamespaceSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToPodSelector value) {
        software.amazon.jsii.Kernel.call(this, "putPodSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetIpBlock() {
        software.amazon.jsii.Kernel.call(this, "resetIpBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamespaceSelector() {
        software.amazon.jsii.Kernel.call(this, "resetNamespaceSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPodSelector() {
        software.amazon.jsii.Kernel.call(this, "resetPodSelector", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToIpBlockOutputReference getIpBlock() {
        return software.amazon.jsii.Kernel.get(this, "ipBlock", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToIpBlockOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToNamespaceSelectorOutputReference getNamespaceSelector() {
        return software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToNamespaceSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicyV1SpecEgressToPodSelectorOutputReference getPodSelector() {
        return software.amazon.jsii.Kernel.get(this, "podSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToPodSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecEgressToIpBlock getIpBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "ipBlockInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToIpBlock.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecEgressToNamespaceSelector getNamespaceSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToNamespaceSelector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecEgressToPodSelector getPodSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "podSelectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecEgressToPodSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecEgressTo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
