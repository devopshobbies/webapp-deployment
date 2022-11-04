package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.239Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeClaimV1SpecOutputReference")
public class PersistentVolumeClaimV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeClaimV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeClaimV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeClaimV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putResources(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeClaimV1SpecResources value) {
        software.amazon.jsii.Kernel.call(this, "putResources", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSelector(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeClaimV1SpecSelector value) {
        software.amazon.jsii.Kernel.call(this, "putSelector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSelector() {
        software.amazon.jsii.Kernel.call(this, "resetSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageClassName() {
        software.amazon.jsii.Kernel.call(this, "resetStorageClassName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeName() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeClaimV1SpecResourcesOutputReference getResources() {
        return software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecResourcesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeClaimV1SpecSelectorOutputReference getSelector() {
        return software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecSelectorOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "accessModesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeClaimV1SpecResources getResourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "resourcesInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecResources.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeClaimV1SpecSelector getSelectorInput() {
        return software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecSelector.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageClassNameInput() {
        return software.amazon.jsii.Kernel.get(this, "storageClassNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeNameInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccessModes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAccessModes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "accessModes", java.util.Objects.requireNonNull(value, "accessModes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageClassName() {
        return software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageClassName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageClassName", java.util.Objects.requireNonNull(value, "storageClassName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeName() {
        return software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeName", java.util.Objects.requireNonNull(value, "volumeName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeClaimV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeClaimV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
