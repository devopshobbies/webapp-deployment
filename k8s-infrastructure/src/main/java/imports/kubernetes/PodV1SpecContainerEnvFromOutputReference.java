package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.492Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecContainerEnvFromOutputReference")
public class PodV1SpecContainerEnvFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodV1SpecContainerEnvFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodV1SpecContainerEnvFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public PodV1SpecContainerEnvFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putConfigMapRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecContainerEnvFromConfigMapRef value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMapRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecContainerEnvFromSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConfigMapRef() {
        software.amazon.jsii.Kernel.call(this, "resetConfigMapRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecContainerEnvFromConfigMapRefOutputReference getConfigMapRef() {
        return software.amazon.jsii.Kernel.get(this, "configMapRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecContainerEnvFromConfigMapRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecContainerEnvFromSecretRefOutputReference getSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecContainerEnvFromSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecContainerEnvFromConfigMapRef getConfigMapRefInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecContainerEnvFromConfigMapRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecContainerEnvFromSecretRef getSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "secretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecContainerEnvFromSecretRef.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecContainerEnvFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
