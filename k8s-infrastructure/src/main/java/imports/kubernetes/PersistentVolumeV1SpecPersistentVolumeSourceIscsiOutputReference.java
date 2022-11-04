package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.275Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference")
public class PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFsType() {
        software.amazon.jsii.Kernel.call(this, "resetFsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIscsiInterface() {
        software.amazon.jsii.Kernel.call(this, "resetIscsiInterface", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLun() {
        software.amazon.jsii.Kernel.call(this, "resetLun", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIqnInput() {
        return software.amazon.jsii.Kernel.get(this, "iqnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIscsiInterfaceInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInterfaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLunInput() {
        return software.amazon.jsii.Kernel.get(this, "lunInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetPortalInput() {
        return software.amazon.jsii.Kernel.get(this, "targetPortalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFsType() {
        return software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fsType", java.util.Objects.requireNonNull(value, "fsType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIqn() {
        return software.amazon.jsii.Kernel.get(this, "iqn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIqn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iqn", java.util.Objects.requireNonNull(value, "iqn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIscsiInterface() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInterface", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIscsiInterface(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iscsiInterface", java.util.Objects.requireNonNull(value, "iscsiInterface is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLun() {
        return software.amazon.jsii.Kernel.get(this, "lun", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLun(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "lun", java.util.Objects.requireNonNull(value, "lun is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetPortal() {
        return software.amazon.jsii.Kernel.get(this, "targetPortal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetPortal(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetPortal", java.util.Objects.requireNonNull(value, "targetPortal is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
