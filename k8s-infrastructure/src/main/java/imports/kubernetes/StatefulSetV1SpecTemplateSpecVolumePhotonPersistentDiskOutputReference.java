package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.145Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDiskOutputReference")
public class StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDiskOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDiskOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDiskOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDiskOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFsType() {
        software.amazon.jsii.Kernel.call(this, "resetFsType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPdIdInput() {
        return software.amazon.jsii.Kernel.get(this, "pdIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFsType() {
        return software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fsType", java.util.Objects.requireNonNull(value, "fsType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPdId() {
        return software.amazon.jsii.Kernel.get(this, "pdId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPdId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pdId", java.util.Objects.requireNonNull(value, "pdId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
