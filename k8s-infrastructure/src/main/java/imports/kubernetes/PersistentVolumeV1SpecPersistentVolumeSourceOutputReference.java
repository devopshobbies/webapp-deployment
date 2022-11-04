package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.280Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceOutputReference")
public class PersistentVolumeV1SpecPersistentVolumeSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeV1SpecPersistentVolumeSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeV1SpecPersistentVolumeSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeV1SpecPersistentVolumeSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAwsElasticBlockStore(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore value) {
        software.amazon.jsii.Kernel.call(this, "putAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk value) {
        software.amazon.jsii.Kernel.call(this, "putAzureDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureFile(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile value) {
        software.amazon.jsii.Kernel.call(this, "putAzureFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCephFs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs value) {
        software.amazon.jsii.Kernel.call(this, "putCephFs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCinder(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder value) {
        software.amazon.jsii.Kernel.call(this, "putCinder", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi value) {
        software.amazon.jsii.Kernel.call(this, "putCsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFc(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc value) {
        software.amazon.jsii.Kernel.call(this, "putFc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlexVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume value) {
        software.amazon.jsii.Kernel.call(this, "putFlexVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlocker(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker value) {
        software.amazon.jsii.Kernel.call(this, "putFlocker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGcePersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putGcePersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlusterfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs value) {
        software.amazon.jsii.Kernel.call(this, "putGlusterfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPath(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath value) {
        software.amazon.jsii.Kernel.call(this, "putHostPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIscsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi value) {
        software.amazon.jsii.Kernel.call(this, "putIscsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocal(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal value) {
        software.amazon.jsii.Kernel.call(this, "putLocal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPhotonPersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQuobyte(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte value) {
        software.amazon.jsii.Kernel.call(this, "putQuobyte", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRbd(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd value) {
        software.amazon.jsii.Kernel.call(this, "putRbd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVsphereVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStoreOutputReference getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStoreOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDiskOutputReference getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFileOutputReference getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsOutputReference getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinderOutputReference getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsiOutputReference getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFcOutputReference getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolumeOutputReference getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlockerOutputReference getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlockerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDiskOutputReference getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfsOutputReference getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPathOutputReference getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocalOutputReference getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDiskOutputReference getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyteOutputReference getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbdOutputReference getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolumeOutputReference getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStoreInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk getAzureDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "azureDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile getAzureFileInput() {
        return software.amazon.jsii.Kernel.get(this, "azureFileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs getCephFsInput() {
        return software.amazon.jsii.Kernel.get(this, "cephFsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder getCinderInput() {
        return software.amazon.jsii.Kernel.get(this, "cinderInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi getCsiInput() {
        return software.amazon.jsii.Kernel.get(this, "csiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc getFcInput() {
        return software.amazon.jsii.Kernel.get(this, "fcInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume getFlexVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "flexVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker getFlockerInput() {
        return software.amazon.jsii.Kernel.get(this, "flockerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs getGlusterfsInput() {
        return software.amazon.jsii.Kernel.get(this, "glusterfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi getIscsiInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal getLocalInput() {
        return software.amazon.jsii.Kernel.get(this, "localInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte getQuobyteInput() {
        return software.amazon.jsii.Kernel.get(this, "quobyteInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd getRbdInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume getVsphereVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
