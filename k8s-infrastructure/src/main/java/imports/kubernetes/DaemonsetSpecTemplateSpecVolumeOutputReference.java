package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.398Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecVolumeOutputReference")
public class DaemonsetSpecTemplateSpecVolumeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonsetSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonsetSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DaemonsetSpecTemplateSpecVolumeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAwsElasticBlockStore(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore value) {
        software.amazon.jsii.Kernel.call(this, "putAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk value) {
        software.amazon.jsii.Kernel.call(this, "putAzureDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureFile(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile value) {
        software.amazon.jsii.Kernel.call(this, "putAzureFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCephFs(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs value) {
        software.amazon.jsii.Kernel.call(this, "putCephFs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCinder(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder value) {
        software.amazon.jsii.Kernel.call(this, "putCinder", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConfigMap(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi value) {
        software.amazon.jsii.Kernel.call(this, "putCsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDownwardApi(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi value) {
        software.amazon.jsii.Kernel.call(this, "putDownwardApi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEmptyDir(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir value) {
        software.amazon.jsii.Kernel.call(this, "putEmptyDir", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFc(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc value) {
        software.amazon.jsii.Kernel.call(this, "putFc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlexVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume value) {
        software.amazon.jsii.Kernel.call(this, "putFlexVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlocker(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker value) {
        software.amazon.jsii.Kernel.call(this, "putFlocker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGcePersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putGcePersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGitRepo(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo value) {
        software.amazon.jsii.Kernel.call(this, "putGitRepo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlusterfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs value) {
        software.amazon.jsii.Kernel.call(this, "putGlusterfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPath(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath value) {
        software.amazon.jsii.Kernel.call(this, "putHostPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIscsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi value) {
        software.amazon.jsii.Kernel.call(this, "putIscsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocal(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal value) {
        software.amazon.jsii.Kernel.call(this, "putLocal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPersistentVolumeClaim(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim value) {
        software.amazon.jsii.Kernel.call(this, "putPersistentVolumeClaim", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPhotonPersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProjected(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putProjected", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQuobyte(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte value) {
        software.amazon.jsii.Kernel.call(this, "putQuobyte", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRbd(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd value) {
        software.amazon.jsii.Kernel.call(this, "putRbd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVsphereVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume value) {
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

    public void resetConfigMap() {
        software.amazon.jsii.Kernel.call(this, "resetConfigMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCsi() {
        software.amazon.jsii.Kernel.call(this, "resetCsi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDownwardApi() {
        software.amazon.jsii.Kernel.call(this, "resetDownwardApi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmptyDir() {
        software.amazon.jsii.Kernel.call(this, "resetEmptyDir", software.amazon.jsii.NativeType.VOID);
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

    public void resetGitRepo() {
        software.amazon.jsii.Kernel.call(this, "resetGitRepo", software.amazon.jsii.NativeType.VOID);
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

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNfs() {
        software.amazon.jsii.Kernel.call(this, "resetNfs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPersistentVolumeClaim() {
        software.amazon.jsii.Kernel.call(this, "resetPersistentVolumeClaim", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPhotonPersistentDisk() {
        software.amazon.jsii.Kernel.call(this, "resetPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProjected() {
        software.amazon.jsii.Kernel.call(this, "resetProjected", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQuobyte() {
        software.amazon.jsii.Kernel.call(this, "resetQuobyte", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRbd() {
        software.amazon.jsii.Kernel.call(this, "resetRbd", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecret() {
        software.amazon.jsii.Kernel.call(this, "resetSecret", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVsphereVolume() {
        software.amazon.jsii.Kernel.call(this, "resetVsphereVolume", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDiskOutputReference getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFileOutputReference getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFsOutputReference getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinderOutputReference getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMapOutputReference getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsiOutputReference getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApiOutputReference getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference getEmptyDir() {
        return software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDirOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFcOutputReference getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolumeOutputReference getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlockerOutputReference getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlockerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDiskOutputReference getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepoOutputReference getGitRepo() {
        return software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfsOutputReference getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPathOutputReference getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsiOutputReference getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocalOutputReference getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaimOutputReference getPersistentVolumeClaim() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaimOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDiskOutputReference getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeProjectedList getProjected() {
        return software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeProjectedList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyteOutputReference getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbdOutputReference getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecretOutputReference getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecretOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolumeOutputReference getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStoreInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk getAzureDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "azureDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile getAzureFileInput() {
        return software.amazon.jsii.Kernel.get(this, "azureFileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs getCephFsInput() {
        return software.amazon.jsii.Kernel.get(this, "cephFsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder getCinderInput() {
        return software.amazon.jsii.Kernel.get(this, "cinderInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap getConfigMapInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi getCsiInput() {
        return software.amazon.jsii.Kernel.get(this, "csiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi getDownwardApiInput() {
        return software.amazon.jsii.Kernel.get(this, "downwardApiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir getEmptyDirInput() {
        return software.amazon.jsii.Kernel.get(this, "emptyDirInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc getFcInput() {
        return software.amazon.jsii.Kernel.get(this, "fcInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume getFlexVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "flexVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker getFlockerInput() {
        return software.amazon.jsii.Kernel.get(this, "flockerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo getGitRepoInput() {
        return software.amazon.jsii.Kernel.get(this, "gitRepoInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs getGlusterfsInput() {
        return software.amazon.jsii.Kernel.get(this, "glusterfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi getIscsiInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal getLocalInput() {
        return software.amazon.jsii.Kernel.get(this, "localInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaimInput() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaimInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getProjectedInput() {
        return software.amazon.jsii.Kernel.get(this, "projectedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte getQuobyteInput() {
        return software.amazon.jsii.Kernel.get(this, "quobyteInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd getRbdInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume getVsphereVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolume value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
