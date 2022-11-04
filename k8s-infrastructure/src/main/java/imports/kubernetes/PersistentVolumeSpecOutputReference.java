package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.244Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecOutputReference")
public class PersistentVolumeSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public PersistentVolumeSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putClaimRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecClaimRef value) {
        software.amazon.jsii.Kernel.call(this, "putClaimRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNodeAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecNodeAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putNodeAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPersistentVolumeSource(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource value) {
        software.amazon.jsii.Kernel.call(this, "putPersistentVolumeSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClaimRef() {
        software.amazon.jsii.Kernel.call(this, "resetClaimRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMountOptions() {
        software.amazon.jsii.Kernel.call(this, "resetMountOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetNodeAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPersistentVolumeReclaimPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPersistentVolumeReclaimPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageClassName() {
        software.amazon.jsii.Kernel.call(this, "resetStorageClassName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeMode() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeMode", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecClaimRefOutputReference getClaimRef() {
        return software.amazon.jsii.Kernel.get(this, "claimRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecClaimRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecNodeAffinityOutputReference getNodeAffinity() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecNodeAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceOutputReference getPersistentVolumeSource() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeSource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "accessModesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCapacityInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "capacityInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecClaimRef getClaimRefInput() {
        return software.amazon.jsii.Kernel.get(this, "claimRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecClaimRef.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "mountOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecNodeAffinity getNodeAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecNodeAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeReclaimPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeReclaimPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource getPersistentVolumeSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeSourceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageClassNameInput() {
        return software.amazon.jsii.Kernel.get(this, "storageClassNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeModeInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccessModes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAccessModes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "accessModes", java.util.Objects.requireNonNull(value, "accessModes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getCapacity() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCapacity(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "capacity", java.util.Objects.requireNonNull(value, "capacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMountOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMountOptions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "mountOptions", java.util.Objects.requireNonNull(value, "mountOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPersistentVolumeReclaimPolicy() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeReclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPersistentVolumeReclaimPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "persistentVolumeReclaimPolicy", java.util.Objects.requireNonNull(value, "persistentVolumeReclaimPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageClassName() {
        return software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageClassName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageClassName", java.util.Objects.requireNonNull(value, "storageClassName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeMode() {
        return software.amazon.jsii.Kernel.get(this, "volumeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeMode", java.util.Objects.requireNonNull(value, "volumeMode is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
