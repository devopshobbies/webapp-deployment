package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.148Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1SpecTemplateSpecVolumeCinderOutputReference")
public class JobV1SpecTemplateSpecVolumeCinderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobV1SpecTemplateSpecVolumeCinderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobV1SpecTemplateSpecVolumeCinderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobV1SpecTemplateSpecVolumeCinderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFsType() {
        software.amazon.jsii.Kernel.call(this, "resetFsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnly() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnly", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "fsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeIdInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeId() {
        return software.amazon.jsii.Kernel.get(this, "volumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeId", java.util.Objects.requireNonNull(value, "volumeId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecVolumeCinder getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecVolumeCinder.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecVolumeCinder value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
