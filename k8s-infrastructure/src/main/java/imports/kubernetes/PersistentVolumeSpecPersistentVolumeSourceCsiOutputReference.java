package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.250Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference")
public class PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putControllerExpandSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putControllerExpandSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putControllerPublishSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putControllerPublishSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNodePublishSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putNodePublishSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNodeStageSecretRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef value) {
        software.amazon.jsii.Kernel.call(this, "putNodeStageSecretRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetControllerExpandSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetControllerExpandSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetControllerPublishSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetControllerPublishSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFsType() {
        software.amazon.jsii.Kernel.call(this, "resetFsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodePublishSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetNodePublishSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeStageSecretRef() {
        software.amazon.jsii.Kernel.call(this, "resetNodeStageSecretRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRefOutputReference getControllerExpandSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "controllerExpandSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRefOutputReference getControllerPublishSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "controllerPublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRefOutputReference getNodePublishSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "nodePublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRefOutputReference getNodeStageSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "nodeStageSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef getControllerExpandSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "controllerExpandSecretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef getControllerPublishSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "controllerPublishSecretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDriverInput() {
        return software.amazon.jsii.Kernel.get(this, "driverInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef getNodePublishSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "nodePublishSecretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef getNodeStageSecretRefInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeStageSecretRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "volumeAttributesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeHandleInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeHandleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDriver() {
        return software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDriver(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "driver", java.util.Objects.requireNonNull(value, "driver is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFsType() {
        return software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fsType", java.util.Objects.requireNonNull(value, "fsType is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVolumeAttributes(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "volumeAttributes", java.util.Objects.requireNonNull(value, "volumeAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeHandle() {
        return software.amazon.jsii.Kernel.get(this, "volumeHandle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeHandle(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeHandle", java.util.Objects.requireNonNull(value, "volumeHandle is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
