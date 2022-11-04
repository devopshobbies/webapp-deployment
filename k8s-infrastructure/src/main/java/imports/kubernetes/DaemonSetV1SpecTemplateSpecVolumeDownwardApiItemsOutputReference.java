package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.256Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsOutputReference")
public class DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResourceFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putResourceFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMode() {
        software.amazon.jsii.Kernel.call(this, "resetMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceFieldRef() {
        software.amazon.jsii.Kernel.call(this, "resetResourceFieldRef", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsFieldRefOutputReference getFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsResourceFieldRefOutputReference getResourceFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsResourceFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsFieldRef getFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModeInput() {
        return software.amazon.jsii.Kernel.get(this, "modeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef getResourceFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMode() {
        return software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mode", java.util.Objects.requireNonNull(value, "mode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "path", java.util.Objects.requireNonNull(value, "path is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeDownwardApiItems value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
