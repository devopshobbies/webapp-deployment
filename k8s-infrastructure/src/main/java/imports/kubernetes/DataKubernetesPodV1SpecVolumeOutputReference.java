package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.561Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodV1SpecVolumeOutputReference")
public class DataKubernetesPodV1SpecVolumeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodV1SpecVolumeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodV1SpecVolumeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodV1SpecVolumeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeAwsElasticBlockStoreList getAwsElasticBlockStore() {
        return software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeAwsElasticBlockStoreList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeAzureDiskList getAzureDisk() {
        return software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeAzureDiskList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeAzureFileList getAzureFile() {
        return software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeAzureFileList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeCephFsList getCephFs() {
        return software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeCephFsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeCinderList getCinder() {
        return software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeCinderList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeConfigMapList getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeConfigMapList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeCsiList getCsi() {
        return software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeCsiList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeDownwardApiList getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeDownwardApiList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeEmptyDirList getEmptyDir() {
        return software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeEmptyDirList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeFcList getFc() {
        return software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeFcList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeFlexVolumeList getFlexVolume() {
        return software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeFlexVolumeList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeFlockerList getFlocker() {
        return software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeFlockerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeGcePersistentDiskList getGcePersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeGcePersistentDiskList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeGitRepoList getGitRepo() {
        return software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeGitRepoList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeGlusterfsList getGlusterfs() {
        return software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeGlusterfsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeHostPathList getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeHostPathList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeIscsiList getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeIscsiList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeLocalList getLocal() {
        return software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeLocalList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeNfsList getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeNfsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumePersistentVolumeClaimList getPersistentVolumeClaim() {
        return software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumePersistentVolumeClaimList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumePhotonPersistentDiskList getPhotonPersistentDisk() {
        return software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumePhotonPersistentDiskList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeProjectedList getProjected() {
        return software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeProjectedList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeQuobyteList getQuobyte() {
        return software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeQuobyteList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeRbdList getRbd() {
        return software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeRbdList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeSecretList getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeSecretList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeVsphereVolumeList getVsphereVolume() {
        return software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeVsphereVolumeList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecVolume getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolume.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecVolume value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
