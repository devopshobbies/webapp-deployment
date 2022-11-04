package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.253Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecPersistentVolumeSourceOutputReference")
public class PersistentVolumeSpecPersistentVolumeSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeSpecPersistentVolumeSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeSpecPersistentVolumeSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeSpecPersistentVolumeSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAwsElasticBlockStore(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore value) {
        software.amazon.jsii.Kernel.call(this, "putAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk value) {
        software.amazon.jsii.Kernel.call(this, "putAzureDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureFile(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile value) {
        software.amazon.jsii.Kernel.call(this, "putAzureFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCephFs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs value) {
        software.amazon.jsii.Kernel.call(this, "putCephFs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCinder(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder value) {
        software.amazon.jsii.Kernel.call(this, "putCinder", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi value) {
        software.amazon.jsii.Kernel.call(this, "putCsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFc(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc value) {
        software.amazon.jsii.Kernel.call(this, "putFc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlexVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume value) {
        software.amazon.jsii.Kernel.call(this, "putFlexVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlocker(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker value) {
        software.amazon.jsii.Kernel.call(this, "putFlocker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGcePersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putGcePersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlusterfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs value) {
        software.amazon.jsii.Kernel.call(this, "putGlusterfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPath(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath value) {
        software.amazon.jsii.Kernel.call(this, "putHostPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIscsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi value) {
        software.amazon.jsii.Kernel.call(this, "putIscsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocal(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal value) {
        software.amazon.jsii.Kernel.call(this, "putLocal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPhotonPersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQuobyte(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte value) {
        software.amazon.jsii.Kernel.call(this, "putQuobyte", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRbd(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd value) {
        software.amazon.jsii.Kernel.call(this, "putRbd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVsphereVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume value) {
        software.amazon.jsii.Kernel.call(this, "putVsphereVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAwsElasticBlockStore() {
        software.amazon.jsii.Kernel.call(this, "resetAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAzureDisk() {
        software.amazon.jsii.Kernel.call(this, "resetAzureDisk", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAzureFile() {
        software.amazon.jsii.Kernel.call(this, "resetAzureFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCephFs() {
        software.amazon.jsii.Kernel.call(this, "resetCephFs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCinder() {
        software.amazon.jsii.Kernel.call(this, "resetCinder", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCsi() {
        software.amazon.jsii.Kernel.call(this, "resetCsi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFc() {
        software.amazon.jsii.Kernel.call(this, "resetFc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFlexVolume() {
        software.amazon.jsii.Kernel.call(this, "resetFlexVolume", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFlocker() {
        software.amazon.jsii.Kernel.call(this, "resetFlocker", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGcePersistentDisk() {
        software.amazon.jsii.Kernel.call(this, "resetGcePersistentDisk", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGlusterfs() {
        software.amazon.jsii.Kernel.call(this, "resetGlusterfs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostPath() {
        software.amazon.jsii.Kernel.call(this, "resetHostPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIscsi() {
        software.amazon.jsii.Kernel.call(this, "resetIscsi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocal() {
        software.amazon.jsii.Kernel.call(this, "resetLocal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNfs() {
        software.amazon.jsii.Kernel.call(this, "resetNfs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPhotonPersistentDisk() {
        software.amazon.jsii.Kernel.call(this, "resetPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQuobyte() {
        software.amazon.jsii.Kernel.call(this, "resetQuobyte", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRbd() {
        software.amazon.jsii.Kernel.call(this, "resetRbd", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVsphereVolume() {
        software.amazon.jsii.Kernel.call(this, "resetVsphereVolume", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStoreOutputReference getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStoreOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDiskOutputReference getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFileOutputReference getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFsOutputReference getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinderOutputReference getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFcOutputReference getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolumeOutputReference getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlockerOutputReference getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlockerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDiskOutputReference getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfsOutputReference getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPathOutputReference getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsiOutputReference getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocalOutputReference getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDiskOutputReference getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyteOutputReference getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbdOutputReference getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolumeOutputReference getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStoreInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk getAzureDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "azureDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile getAzureFileInput() {
        return software.amazon.jsii.Kernel.get(this, "azureFileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs getCephFsInput() {
        return software.amazon.jsii.Kernel.get(this, "cephFsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder getCinderInput() {
        return software.amazon.jsii.Kernel.get(this, "cinderInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi getCsiInput() {
        return software.amazon.jsii.Kernel.get(this, "csiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc getFcInput() {
        return software.amazon.jsii.Kernel.get(this, "fcInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume getFlexVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "flexVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker getFlockerInput() {
        return software.amazon.jsii.Kernel.get(this, "flockerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs getGlusterfsInput() {
        return software.amazon.jsii.Kernel.get(this, "glusterfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi getIscsiInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal getLocalInput() {
        return software.amazon.jsii.Kernel.get(this, "localInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte getQuobyteInput() {
        return software.amazon.jsii.Kernel.get(this, "quobyteInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd getRbdInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume getVsphereVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
