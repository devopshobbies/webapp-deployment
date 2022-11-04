package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.756Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecVolumeOutputReference")
public class ReplicationControllerSpecTemplateSpecVolumeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ReplicationControllerSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ReplicationControllerSpecTemplateSpecVolumeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public ReplicationControllerSpecTemplateSpecVolumeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAwsElasticBlockStore(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAwsElasticBlockStore value) {
        software.amazon.jsii.Kernel.call(this, "putAwsElasticBlockStore", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureDisk value) {
        software.amazon.jsii.Kernel.call(this, "putAzureDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAzureFile(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureFile value) {
        software.amazon.jsii.Kernel.call(this, "putAzureFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCephFs(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCephFs value) {
        software.amazon.jsii.Kernel.call(this, "putCephFs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCinder(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCinder value) {
        software.amazon.jsii.Kernel.call(this, "putCinder", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConfigMap(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMap value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsi value) {
        software.amazon.jsii.Kernel.call(this, "putCsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDownwardApi(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeDownwardApi value) {
        software.amazon.jsii.Kernel.call(this, "putDownwardApi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEmptyDir(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeEmptyDir value) {
        software.amazon.jsii.Kernel.call(this, "putEmptyDir", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFc(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFc value) {
        software.amazon.jsii.Kernel.call(this, "putFc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlexVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlexVolume value) {
        software.amazon.jsii.Kernel.call(this, "putFlexVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFlocker(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlocker value) {
        software.amazon.jsii.Kernel.call(this, "putFlocker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGcePersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGcePersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putGcePersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGitRepo(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGitRepo value) {
        software.amazon.jsii.Kernel.call(this, "putGitRepo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlusterfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGlusterfs value) {
        software.amazon.jsii.Kernel.call(this, "putGlusterfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPath(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeHostPath value) {
        software.amazon.jsii.Kernel.call(this, "putHostPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIscsi(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeIscsi value) {
        software.amazon.jsii.Kernel.call(this, "putIscsi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocal(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeLocal value) {
        software.amazon.jsii.Kernel.call(this, "putLocal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPersistentVolumeClaim(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePersistentVolumeClaim value) {
        software.amazon.jsii.Kernel.call(this, "putPersistentVolumeClaim", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPhotonPersistentDisk(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePhotonPersistentDisk value) {
        software.amazon.jsii.Kernel.call(this, "putPhotonPersistentDisk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProjected(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putProjected", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQuobyte(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeQuobyte value) {
        software.amazon.jsii.Kernel.call(this, "putQuobyte", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRbd(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeRbd value) {
        software.amazon.jsii.Kernel.call(this, "putRbd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeSecret value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVsphereVolume(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeVsphereVolume value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAwsElasticBlockStoreOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureDiskOutputReference getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureFileOutputReference getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCephFsOutputReference getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCephFsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCinderOutputReference getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCinderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMapOutputReference getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiOutputReference getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeDownwardApiOutputReference getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeDownwardApiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeEmptyDirOutputReference getEmptyDir() {
        return software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeEmptyDirOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFcOutputReference getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlexVolumeOutputReference getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlexVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlockerOutputReference getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlockerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGcePersistentDiskOutputReference getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGcePersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGitRepoOutputReference getGitRepo() {
        return software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGitRepoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGlusterfsOutputReference getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGlusterfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeHostPathOutputReference getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeHostPathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeIscsiOutputReference getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeIscsiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeLocalOutputReference getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeLocalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePersistentVolumeClaimOutputReference getPersistentVolumeClaim() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePersistentVolumeClaimOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePhotonPersistentDiskOutputReference getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePhotonPersistentDiskOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedList getProjected() {
        return software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeQuobyteOutputReference getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeQuobyteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeRbdOutputReference getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeRbdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeSecretOutputReference getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeSecretOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeVsphereVolumeOutputReference getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeVsphereVolumeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStoreInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAwsElasticBlockStore.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureDisk getAzureDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "azureDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureFile getAzureFileInput() {
        return software.amazon.jsii.Kernel.get(this, "azureFileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeAzureFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCephFs getCephFsInput() {
        return software.amazon.jsii.Kernel.get(this, "cephFsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCephFs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCinder getCinderInput() {
        return software.amazon.jsii.Kernel.get(this, "cinderInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCinder.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMap getConfigMapInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMap.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsi getCsiInput() {
        return software.amazon.jsii.Kernel.get(this, "csiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeDownwardApi getDownwardApiInput() {
        return software.amazon.jsii.Kernel.get(this, "downwardApiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeDownwardApi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeEmptyDir getEmptyDirInput() {
        return software.amazon.jsii.Kernel.get(this, "emptyDirInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeEmptyDir.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFc getFcInput() {
        return software.amazon.jsii.Kernel.get(this, "fcInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlexVolume getFlexVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "flexVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlexVolume.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlocker getFlockerInput() {
        return software.amazon.jsii.Kernel.get(this, "flockerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeFlocker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGcePersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGitRepo getGitRepoInput() {
        return software.amazon.jsii.Kernel.get(this, "gitRepoInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGitRepo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGlusterfs getGlusterfsInput() {
        return software.amazon.jsii.Kernel.get(this, "glusterfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeGlusterfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeHostPath getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeHostPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeIscsi getIscsiInput() {
        return software.amazon.jsii.Kernel.get(this, "iscsiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeIscsi.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeLocal getLocalInput() {
        return software.amazon.jsii.Kernel.get(this, "localInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeLocal.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaimInput() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaimInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePersistentVolumeClaim.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDiskInput() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDiskInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumePhotonPersistentDisk.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getProjectedInput() {
        return software.amazon.jsii.Kernel.get(this, "projectedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeQuobyte getQuobyteInput() {
        return software.amazon.jsii.Kernel.get(this, "quobyteInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeQuobyte.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeRbd getRbdInput() {
        return software.amazon.jsii.Kernel.get(this, "rbdInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeRbd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeSecret getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeSecret.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeVsphereVolume getVsphereVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolumeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeVsphereVolume.class));
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

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolume value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
