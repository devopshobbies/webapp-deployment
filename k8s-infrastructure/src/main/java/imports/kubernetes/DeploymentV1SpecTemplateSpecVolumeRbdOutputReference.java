package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.827Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdOutputReference")
public class DeploymentV1SpecTemplateSpecVolumeRbdOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentV1SpecTemplateSpecVolumeRbdOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentV1SpecTemplateSpecVolumeRbdOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentV1SpecTemplateSpecVolumeRbdOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFsType() {
        software.amazon.jsii.Kernel.call(this, "resetFsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeyring() {
        software.amazon.jsii.Kernel.call(this, "resetKeyring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRadosUser() {
        software.amazon.jsii.Kernel.call(this, "resetRadosUser", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRbdPool() {
        software.amazon.jsii.Kernel.call(this, "resetRbdPool", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdSecretRefOutputReference getSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCephMonitorsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cephMonitorsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyringInput() {
        return software.amazon.jsii.Kernel.get(this, "keyringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRadosUserInput() {
        return software.amazon.jsii.Kernel.get(this, "radosUserInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRbdImageInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdImageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRbdPoolInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdPoolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdSecretRef getSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "secretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbdSecretRef.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCephMonitors() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cephMonitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCephMonitors(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cephMonitors", java.util.Objects.requireNonNull(value, "cephMonitors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFsType() {
        return software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fsType", java.util.Objects.requireNonNull(value, "fsType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyring() {
        return software.amazon.jsii.Kernel.get(this, "keyring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyring(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyring", java.util.Objects.requireNonNull(value, "keyring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRadosUser() {
        return software.amazon.jsii.Kernel.get(this, "radosUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRadosUser(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "radosUser", java.util.Objects.requireNonNull(value, "radosUser is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRbdImage() {
        return software.amazon.jsii.Kernel.get(this, "rbdImage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRbdImage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rbdImage", java.util.Objects.requireNonNull(value, "rbdImage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRbdPool() {
        return software.amazon.jsii.Kernel.get(this, "rbdPool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRbdPool(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rbdPool", java.util.Objects.requireNonNull(value, "rbdPool is required"));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbd getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbd.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecVolumeRbd value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
