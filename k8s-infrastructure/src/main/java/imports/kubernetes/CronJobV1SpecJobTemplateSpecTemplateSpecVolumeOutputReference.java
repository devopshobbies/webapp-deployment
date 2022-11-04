package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.136Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeOutputReference")
public class CronJobV1SpecJobTemplateSpecTemplateSpecVolumeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobV1SpecJobTemplateSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobV1SpecJobTemplateSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CronJobV1SpecJobTemplateSpecTemplateSpecVolumeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAwsElasticBlockStore(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore value) {
        software.amazon.jsii.Kernel.call(this, "putAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureDisk value) {
        software.amazon.jsii.Kernel.call(this, "putAzureDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureFile(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureFile value) {
        software.amazon.jsii.Kernel.call(this, "putAzureFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCephFs(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCephFs value) {
        software.amazon.jsii.Kernel.call(this, "putCephFs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCinder(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCinder value) {
        software.amazon.jsii.Kernel.call(this, "putCinder", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConfigMap(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeConfigMap value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCsi value) {
        software.amazon.jsii.Kernel.call(this, "putCsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDownwardApi(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeDownwardApi value) {
        software.amazon.jsii.Kernel.call(this, "putDownwardApi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEmptyDir(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeEmptyDir value) {
        software.amazon.jsii.Kernel.call(this, "putEmptyDir", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFc(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFc value) {
        software.amazon.jsii.Kernel.call(this, "putFc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlexVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlexVolume value) {
        software.amazon.jsii.Kernel.call(this, "putFlexVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlocker(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlocker value) {
        software.amazon.jsii.Kernel.call(this, "putFlocker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGcePersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGcePersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putGcePersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGitRepo(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGitRepo value) {
        software.amazon.jsii.Kernel.call(this, "putGitRepo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlusterfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGlusterfs value) {
        software.amazon.jsii.Kernel.call(this, "putGlusterfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPath(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeHostPath value) {
        software.amazon.jsii.Kernel.call(this, "putHostPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIscsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeIscsi value) {
        software.amazon.jsii.Kernel.call(this, "putIscsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocal(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeLocal value) {
        software.amazon.jsii.Kernel.call(this, "putLocal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPersistentVolumeClaim(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePersistentVolumeClaim value) {
        software.amazon.jsii.Kernel.call(this, "putPersistentVolumeClaim", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPhotonPersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProjected(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putProjected", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQuobyte(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeQuobyte value) {
        software.amazon.jsii.Kernel.call(this, "putQuobyte", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRbd(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeRbd value) {
        software.amazon.jsii.Kernel.call(this, "putRbd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeSecret value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVsphereVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeVsphereVolume value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureDiskOutputReference getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureFileOutputReference getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCephFsOutputReference getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCephFsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCinderOutputReference getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCinderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeConfigMapOutputReference getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeConfigMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCsiOutputReference getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeDownwardApiOutputReference getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeDownwardApiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeEmptyDirOutputReference getEmptyDir() {
        return software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeEmptyDirOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFcOutputReference getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlexVolumeOutputReference getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlexVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGcePersistentDiskOutputReference getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGcePersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGitRepoOutputReference getGitRepo() {
        return software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGitRepoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGlusterfsOutputReference getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGlusterfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeHostPathOutputReference getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeHostPathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeIscsiOutputReference getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeIscsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeLocalOutputReference getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeLocalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePersistentVolumeClaimOutputReference getPersistentVolumeClaim() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePersistentVolumeClaimOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePhotonPersistentDiskOutputReference getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePhotonPersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedList getProjected() {
        return software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeQuobyteOutputReference getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeQuobyteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeRbdOutputReference getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeRbdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeSecretOutputReference getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeSecretOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeVsphereVolumeOutputReference getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeVsphereVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStoreInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureDisk getAzureDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "azureDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureFile getAzureFileInput() {
        return software.amazon.jsii.Kernel.get(this, "azureFileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeAzureFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCephFs getCephFsInput() {
        return software.amazon.jsii.Kernel.get(this, "cephFsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCephFs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCinder getCinderInput() {
        return software.amazon.jsii.Kernel.get(this, "cinderInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCinder.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeConfigMap getConfigMapInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeConfigMap.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCsi getCsiInput() {
        return software.amazon.jsii.Kernel.get(this, "csiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeCsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeDownwardApi getDownwardApiInput() {
        return software.amazon.jsii.Kernel.get(this, "downwardApiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeDownwardApi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeEmptyDir getEmptyDirInput() {
        return software.amazon.jsii.Kernel.get(this, "emptyDirInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeEmptyDir.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFc getFcInput() {
        return software.amazon.jsii.Kernel.get(this, "fcInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlexVolume getFlexVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "flexVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlexVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlocker getFlockerInput() {
        return software.amazon.jsii.Kernel.get(this, "flockerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeFlocker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGcePersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGitRepo getGitRepoInput() {
        return software.amazon.jsii.Kernel.get(this, "gitRepoInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGitRepo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGlusterfs getGlusterfsInput() {
        return software.amazon.jsii.Kernel.get(this, "glusterfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeGlusterfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeHostPath getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeHostPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeIscsi getIscsiInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeIscsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeLocal getLocalInput() {
        return software.amazon.jsii.Kernel.get(this, "localInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeLocal.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaimInput() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaimInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePersistentVolumeClaim.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumePhotonPersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getProjectedInput() {
        return software.amazon.jsii.Kernel.get(this, "projectedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeQuobyte getQuobyteInput() {
        return software.amazon.jsii.Kernel.get(this, "quobyteInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeQuobyte.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeRbd getRbdInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeRbd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeSecret getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeSecret.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeVsphereVolume getVsphereVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeVsphereVolume.class));
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

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolume value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
