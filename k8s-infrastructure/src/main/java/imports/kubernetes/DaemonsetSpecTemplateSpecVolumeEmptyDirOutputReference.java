package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.394Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference")
public class DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMedium() {
        software.amazon.jsii.Kernel.call(this, "resetMedium", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSizeLimit() {
        software.amazon.jsii.Kernel.call(this, "resetSizeLimit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMediumInput() {
        return software.amazon.jsii.Kernel.get(this, "mediumInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSizeLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "sizeLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMedium() {
        return software.amazon.jsii.Kernel.get(this, "medium", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMedium(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "medium", java.util.Objects.requireNonNull(value, "medium is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSizeLimit() {
        return software.amazon.jsii.Kernel.get(this, "sizeLimit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSizeLimit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sizeLimit", java.util.Objects.requireNonNull(value, "sizeLimit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
