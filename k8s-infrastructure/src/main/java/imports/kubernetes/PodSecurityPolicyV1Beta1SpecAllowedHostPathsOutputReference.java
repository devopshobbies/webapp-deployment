package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.306Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPathsOutputReference")
public class PodSecurityPolicyV1Beta1SpecAllowedHostPathsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodSecurityPolicyV1Beta1SpecAllowedHostPathsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodSecurityPolicyV1Beta1SpecAllowedHostPathsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public PodSecurityPolicyV1Beta1SpecAllowedHostPathsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "pathPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPathPrefix() {
        return software.amazon.jsii.Kernel.get(this, "pathPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPathPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pathPrefix", java.util.Objects.requireNonNull(value, "pathPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReadOnly() {
        return software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReadOnly(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "readOnly", java.util.Objects.requireNonNull(value, "readOnly is required"));
    }

    public void setReadOnly(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "readOnly", java.util.Objects.requireNonNull(value, "readOnly is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPaths value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
