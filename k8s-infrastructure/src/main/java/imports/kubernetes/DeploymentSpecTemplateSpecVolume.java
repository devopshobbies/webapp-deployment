package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.697Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecVolume")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecVolume.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_elastic_block_store block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#aws_elastic_block_store Deployment#aws_elastic_block_store}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azure_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#azure_disk Deployment#azure_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * azure_file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#azure_file Deployment#azure_file}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile getAzureFile() {
        return null;
    }

    /**
     * ceph_fs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#ceph_fs Deployment#ceph_fs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs getCephFs() {
        return null;
    }

    /**
     * cinder block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#cinder Deployment#cinder}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder getCinder() {
        return null;
    }

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map Deployment#config_map}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap getConfigMap() {
        return null;
    }

    /**
     * csi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#csi Deployment#csi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi getCsi() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#downward_api Deployment#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * empty_dir block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#empty_dir Deployment#empty_dir}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir getEmptyDir() {
        return null;
    }

    /**
     * fc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#fc Deployment#fc}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc getFc() {
        return null;
    }

    /**
     * flex_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#flex_volume Deployment#flex_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * flocker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#flocker Deployment#flocker}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker getFlocker() {
        return null;
    }

    /**
     * gce_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#gce_persistent_disk Deployment#gce_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * git_repo block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#git_repo Deployment#git_repo}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo getGitRepo() {
        return null;
    }

    /**
     * glusterfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#glusterfs Deployment#glusterfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * host_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#host_path Deployment#host_path}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath getHostPath() {
        return null;
    }

    /**
     * iscsi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#iscsi Deployment#iscsi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi getIscsi() {
        return null;
    }

    /**
     * local block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#local Deployment#local}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal getLocal() {
        return null;
    }

    /**
     * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#name Deployment#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * nfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#nfs Deployment#nfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs getNfs() {
        return null;
    }

    /**
     * persistent_volume_claim block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#persistent_volume_claim Deployment#persistent_volume_claim}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
        return null;
    }

    /**
     * photon_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#photon_persistent_disk Deployment#photon_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * projected block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#projected Deployment#projected}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getProjected() {
        return null;
    }

    /**
     * quobyte block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#quobyte Deployment#quobyte}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte getQuobyte() {
        return null;
    }

    /**
     * rbd block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#rbd Deployment#rbd}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd getRbd() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret Deployment#secret}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret getSecret() {
        return null;
    }

    /**
     * vsphere_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#vsphere_volume Deployment#vsphere_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecVolume> {
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk azureDisk;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile azureFile;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs cephFs;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder cinder;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap configMap;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi csi;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi downwardApi;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir emptyDir;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc fc;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume flexVolume;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker flocker;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo gitRepo;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs glusterfs;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath hostPath;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi iscsi;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal local;
        java.lang.String name;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs nfs;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        java.lang.Object projected;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte quobyte;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd rbd;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret secret;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getAwsElasticBlockStore}
         * @param awsElasticBlockStore aws_elastic_block_store block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#aws_elastic_block_store Deployment#aws_elastic_block_store}
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getAzureDisk}
         * @param azureDisk azure_disk block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#azure_disk Deployment#azure_disk}
         * @return {@code this}
         */
        public Builder azureDisk(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getAzureFile}
         * @param azureFile azure_file block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#azure_file Deployment#azure_file}
         * @return {@code this}
         */
        public Builder azureFile(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getCephFs}
         * @param cephFs ceph_fs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#ceph_fs Deployment#ceph_fs}
         * @return {@code this}
         */
        public Builder cephFs(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs cephFs) {
            this.cephFs = cephFs;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getCinder}
         * @param cinder cinder block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#cinder Deployment#cinder}
         * @return {@code this}
         */
        public Builder cinder(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map Deployment#config_map}
         * @return {@code this}
         */
        public Builder configMap(imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getCsi}
         * @param csi csi block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#csi Deployment#csi}
         * @return {@code this}
         */
        public Builder csi(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#downward_api Deployment#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getEmptyDir}
         * @param emptyDir empty_dir block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#empty_dir Deployment#empty_dir}
         * @return {@code this}
         */
        public Builder emptyDir(imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getFc}
         * @param fc fc block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#fc Deployment#fc}
         * @return {@code this}
         */
        public Builder fc(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getFlexVolume}
         * @param flexVolume flex_volume block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#flex_volume Deployment#flex_volume}
         * @return {@code this}
         */
        public Builder flexVolume(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getFlocker}
         * @param flocker flocker block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#flocker Deployment#flocker}
         * @return {@code this}
         */
        public Builder flocker(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getGcePersistentDisk}
         * @param gcePersistentDisk gce_persistent_disk block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#gce_persistent_disk Deployment#gce_persistent_disk}
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getGitRepo}
         * @param gitRepo git_repo block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#git_repo Deployment#git_repo}
         * @return {@code this}
         */
        public Builder gitRepo(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getGlusterfs}
         * @param glusterfs glusterfs block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#glusterfs Deployment#glusterfs}
         * @return {@code this}
         */
        public Builder glusterfs(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getHostPath}
         * @param hostPath host_path block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#host_path Deployment#host_path}
         * @return {@code this}
         */
        public Builder hostPath(imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getIscsi}
         * @param iscsi iscsi block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#iscsi Deployment#iscsi}
         * @return {@code this}
         */
        public Builder iscsi(imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getLocal}
         * @param local local block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#local Deployment#local}
         * @return {@code this}
         */
        public Builder local(imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getName}
         * @param name Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#name Deployment#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getNfs}
         * @param nfs nfs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#nfs Deployment#nfs}
         * @return {@code this}
         */
        public Builder nfs(imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getPersistentVolumeClaim}
         * @param persistentVolumeClaim persistent_volume_claim block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#persistent_volume_claim Deployment#persistent_volume_claim}
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getPhotonPersistentDisk}
         * @param photonPersistentDisk photon_persistent_disk block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#photon_persistent_disk Deployment#photon_persistent_disk}
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#projected Deployment#projected}
         * @return {@code this}
         */
        public Builder projected(com.hashicorp.cdktf.IResolvable projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#projected Deployment#projected}
         * @return {@code this}
         */
        public Builder projected(java.util.List<? extends imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjected> projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getQuobyte}
         * @param quobyte quobyte block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#quobyte Deployment#quobyte}
         * @return {@code this}
         */
        public Builder quobyte(imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getRbd}
         * @param rbd rbd block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#rbd Deployment#rbd}
         * @return {@code this}
         */
        public Builder rbd(imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret Deployment#secret}
         * @return {@code this}
         */
        public Builder secret(imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolume#getVsphereVolume}
         * @param vsphereVolume vsphere_volume block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#vsphere_volume Deployment#vsphere_volume}
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecVolume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecVolume {
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk azureDisk;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile azureFile;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs cephFs;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder cinder;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap configMap;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi csi;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi downwardApi;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir emptyDir;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc fc;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume flexVolume;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker flocker;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo gitRepo;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs glusterfs;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath hostPath;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi iscsi;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal local;
        private final java.lang.String name;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs nfs;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        private final java.lang.Object projected;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte quobyte;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd rbd;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret secret;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile.class));
            this.cephFs = software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder.class));
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi.class));
            this.emptyDir = software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk.class));
            this.gitRepo = software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs.class));
            this.persistentVolumeClaim = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk.class));
            this.projected = software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsElasticBlockStore = builder.awsElasticBlockStore;
            this.azureDisk = builder.azureDisk;
            this.azureFile = builder.azureFile;
            this.cephFs = builder.cephFs;
            this.cinder = builder.cinder;
            this.configMap = builder.configMap;
            this.csi = builder.csi;
            this.downwardApi = builder.downwardApi;
            this.emptyDir = builder.emptyDir;
            this.fc = builder.fc;
            this.flexVolume = builder.flexVolume;
            this.flocker = builder.flocker;
            this.gcePersistentDisk = builder.gcePersistentDisk;
            this.gitRepo = builder.gitRepo;
            this.glusterfs = builder.glusterfs;
            this.hostPath = builder.hostPath;
            this.iscsi = builder.iscsi;
            this.local = builder.local;
            this.name = builder.name;
            this.nfs = builder.nfs;
            this.persistentVolumeClaim = builder.persistentVolumeClaim;
            this.photonPersistentDisk = builder.photonPersistentDisk;
            this.projected = builder.projected;
            this.quobyte = builder.quobyte;
            this.rbd = builder.rbd;
            this.secret = builder.secret;
            this.vsphereVolume = builder.vsphereVolume;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCephFs getCephFs() {
            return this.cephFs;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCinder getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeConfigMap getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeCsi getCsi() {
            return this.csi;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeEmptyDir getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFc getFc() {
            return this.fc;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGitRepo getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeLocal getLocal() {
            return this.local;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeNfs getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final java.lang.Object getProjected() {
            return this.projected;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeRbd getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeSecret getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
            return this.vsphereVolume;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCephFs() != null) {
                data.set("cephFs", om.valueToTree(this.getCephFs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardApi", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getEmptyDir() != null) {
                data.set("emptyDir", om.valueToTree(this.getEmptyDir()));
            }
            if (this.getFc() != null) {
                data.set("fc", om.valueToTree(this.getFc()));
            }
            if (this.getFlexVolume() != null) {
                data.set("flexVolume", om.valueToTree(this.getFlexVolume()));
            }
            if (this.getFlocker() != null) {
                data.set("flocker", om.valueToTree(this.getFlocker()));
            }
            if (this.getGcePersistentDisk() != null) {
                data.set("gcePersistentDisk", om.valueToTree(this.getGcePersistentDisk()));
            }
            if (this.getGitRepo() != null) {
                data.set("gitRepo", om.valueToTree(this.getGitRepo()));
            }
            if (this.getGlusterfs() != null) {
                data.set("glusterfs", om.valueToTree(this.getGlusterfs()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }
            if (this.getIscsi() != null) {
                data.set("iscsi", om.valueToTree(this.getIscsi()));
            }
            if (this.getLocal() != null) {
                data.set("local", om.valueToTree(this.getLocal()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getPersistentVolumeClaim() != null) {
                data.set("persistentVolumeClaim", om.valueToTree(this.getPersistentVolumeClaim()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getProjected() != null) {
                data.set("projected", om.valueToTree(this.getProjected()));
            }
            if (this.getQuobyte() != null) {
                data.set("quobyte", om.valueToTree(this.getQuobyte()));
            }
            if (this.getRbd() != null) {
                data.set("rbd", om.valueToTree(this.getRbd()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecVolume.Jsii$Proxy that = (DeploymentSpecTemplateSpecVolume.Jsii$Proxy) o;

            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.cephFs != null ? !this.cephFs.equals(that.cephFs) : that.cephFs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.emptyDir != null ? !this.emptyDir.equals(that.emptyDir) : that.emptyDir != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.gitRepo != null ? !this.gitRepo.equals(that.gitRepo) : that.gitRepo != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.local != null ? !this.local.equals(that.local) : that.local != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.persistentVolumeClaim != null ? !this.persistentVolumeClaim.equals(that.persistentVolumeClaim) : that.persistentVolumeClaim != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.projected != null ? !this.projected.equals(that.projected) : that.projected != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0;
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.cephFs != null ? this.cephFs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.configMap != null ? this.configMap.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.emptyDir != null ? this.emptyDir.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.gitRepo != null ? this.gitRepo.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.local != null ? this.local.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeClaim != null ? this.persistentVolumeClaim.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.projected != null ? this.projected.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
