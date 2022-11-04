package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.379Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecVolume")
@software.amazon.jsii.Jsii.Proxy(DaemonsetSpecTemplateSpecVolume.Jsii$Proxy.class)
public interface DaemonsetSpecTemplateSpecVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_elastic_block_store block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#aws_elastic_block_store Daemonset#aws_elastic_block_store}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azure_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#azure_disk Daemonset#azure_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * azure_file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#azure_file Daemonset#azure_file}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile getAzureFile() {
        return null;
    }

    /**
     * ceph_fs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#ceph_fs Daemonset#ceph_fs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs getCephFs() {
        return null;
    }

    /**
     * cinder block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#cinder Daemonset#cinder}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder getCinder() {
        return null;
    }

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#config_map Daemonset#config_map}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap getConfigMap() {
        return null;
    }

    /**
     * csi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#csi Daemonset#csi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi getCsi() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#downward_api Daemonset#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * empty_dir block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#empty_dir Daemonset#empty_dir}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir getEmptyDir() {
        return null;
    }

    /**
     * fc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#fc Daemonset#fc}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc getFc() {
        return null;
    }

    /**
     * flex_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#flex_volume Daemonset#flex_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * flocker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#flocker Daemonset#flocker}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker getFlocker() {
        return null;
    }

    /**
     * gce_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#gce_persistent_disk Daemonset#gce_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * git_repo block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#git_repo Daemonset#git_repo}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo getGitRepo() {
        return null;
    }

    /**
     * glusterfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#glusterfs Daemonset#glusterfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * host_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#host_path Daemonset#host_path}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath getHostPath() {
        return null;
    }

    /**
     * iscsi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#iscsi Daemonset#iscsi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi getIscsi() {
        return null;
    }

    /**
     * local block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#local Daemonset#local}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal getLocal() {
        return null;
    }

    /**
     * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#name Daemonset#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * nfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#nfs Daemonset#nfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs getNfs() {
        return null;
    }

    /**
     * persistent_volume_claim block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#persistent_volume_claim Daemonset#persistent_volume_claim}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
        return null;
    }

    /**
     * photon_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#photon_persistent_disk Daemonset#photon_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * projected block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#projected Daemonset#projected}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getProjected() {
        return null;
    }

    /**
     * quobyte block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#quobyte Daemonset#quobyte}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte getQuobyte() {
        return null;
    }

    /**
     * rbd block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#rbd Daemonset#rbd}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd getRbd() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#secret Daemonset#secret}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret getSecret() {
        return null;
    }

    /**
     * vsphere_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#vsphere_volume Daemonset#vsphere_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonsetSpecTemplateSpecVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonsetSpecTemplateSpecVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonsetSpecTemplateSpecVolume> {
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk azureDisk;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile azureFile;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs cephFs;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder cinder;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap configMap;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi csi;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi downwardApi;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir emptyDir;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc fc;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume flexVolume;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker flocker;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo gitRepo;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs glusterfs;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath hostPath;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi iscsi;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal local;
        java.lang.String name;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs nfs;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        java.lang.Object projected;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte quobyte;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd rbd;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret secret;
        imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getAwsElasticBlockStore}
         * @param awsElasticBlockStore aws_elastic_block_store block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#aws_elastic_block_store Daemonset#aws_elastic_block_store}
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getAzureDisk}
         * @param azureDisk azure_disk block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#azure_disk Daemonset#azure_disk}
         * @return {@code this}
         */
        public Builder azureDisk(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getAzureFile}
         * @param azureFile azure_file block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#azure_file Daemonset#azure_file}
         * @return {@code this}
         */
        public Builder azureFile(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getCephFs}
         * @param cephFs ceph_fs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#ceph_fs Daemonset#ceph_fs}
         * @return {@code this}
         */
        public Builder cephFs(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs cephFs) {
            this.cephFs = cephFs;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getCinder}
         * @param cinder cinder block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#cinder Daemonset#cinder}
         * @return {@code this}
         */
        public Builder cinder(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#config_map Daemonset#config_map}
         * @return {@code this}
         */
        public Builder configMap(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getCsi}
         * @param csi csi block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#csi Daemonset#csi}
         * @return {@code this}
         */
        public Builder csi(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#downward_api Daemonset#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getEmptyDir}
         * @param emptyDir empty_dir block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#empty_dir Daemonset#empty_dir}
         * @return {@code this}
         */
        public Builder emptyDir(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getFc}
         * @param fc fc block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#fc Daemonset#fc}
         * @return {@code this}
         */
        public Builder fc(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getFlexVolume}
         * @param flexVolume flex_volume block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#flex_volume Daemonset#flex_volume}
         * @return {@code this}
         */
        public Builder flexVolume(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getFlocker}
         * @param flocker flocker block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#flocker Daemonset#flocker}
         * @return {@code this}
         */
        public Builder flocker(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getGcePersistentDisk}
         * @param gcePersistentDisk gce_persistent_disk block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#gce_persistent_disk Daemonset#gce_persistent_disk}
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getGitRepo}
         * @param gitRepo git_repo block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#git_repo Daemonset#git_repo}
         * @return {@code this}
         */
        public Builder gitRepo(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getGlusterfs}
         * @param glusterfs glusterfs block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#glusterfs Daemonset#glusterfs}
         * @return {@code this}
         */
        public Builder glusterfs(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getHostPath}
         * @param hostPath host_path block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#host_path Daemonset#host_path}
         * @return {@code this}
         */
        public Builder hostPath(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getIscsi}
         * @param iscsi iscsi block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#iscsi Daemonset#iscsi}
         * @return {@code this}
         */
        public Builder iscsi(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getLocal}
         * @param local local block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#local Daemonset#local}
         * @return {@code this}
         */
        public Builder local(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getName}
         * @param name Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#name Daemonset#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getNfs}
         * @param nfs nfs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#nfs Daemonset#nfs}
         * @return {@code this}
         */
        public Builder nfs(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getPersistentVolumeClaim}
         * @param persistentVolumeClaim persistent_volume_claim block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#persistent_volume_claim Daemonset#persistent_volume_claim}
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getPhotonPersistentDisk}
         * @param photonPersistentDisk photon_persistent_disk block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#photon_persistent_disk Daemonset#photon_persistent_disk}
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#projected Daemonset#projected}
         * @return {@code this}
         */
        public Builder projected(com.hashicorp.cdktf.IResolvable projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#projected Daemonset#projected}
         * @return {@code this}
         */
        public Builder projected(java.util.List<? extends imports.kubernetes.DaemonsetSpecTemplateSpecVolumeProjected> projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getQuobyte}
         * @param quobyte quobyte block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#quobyte Daemonset#quobyte}
         * @return {@code this}
         */
        public Builder quobyte(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getRbd}
         * @param rbd rbd block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#rbd Daemonset#rbd}
         * @return {@code this}
         */
        public Builder rbd(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#secret Daemonset#secret}
         * @return {@code this}
         */
        public Builder secret(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolume#getVsphereVolume}
         * @param vsphereVolume vsphere_volume block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#vsphere_volume Daemonset#vsphere_volume}
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonsetSpecTemplateSpecVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonsetSpecTemplateSpecVolume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonsetSpecTemplateSpecVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonsetSpecTemplateSpecVolume {
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk azureDisk;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile azureFile;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs cephFs;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder cinder;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap configMap;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi csi;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi downwardApi;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir emptyDir;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc fc;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume flexVolume;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker flocker;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo gitRepo;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs glusterfs;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath hostPath;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi iscsi;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal local;
        private final java.lang.String name;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs nfs;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        private final java.lang.Object projected;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte quobyte;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd rbd;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret secret;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile.class));
            this.cephFs = software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder.class));
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi.class));
            this.emptyDir = software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk.class));
            this.gitRepo = software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs.class));
            this.persistentVolumeClaim = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk.class));
            this.projected = software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume.class));
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
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCephFs getCephFs() {
            return this.cephFs;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCinder getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeConfigMap getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeCsi getCsi() {
            return this.csi;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFc getFc() {
            return this.fc;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGitRepo getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeLocal getLocal() {
            return this.local;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeNfs getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final java.lang.Object getProjected() {
            return this.projected;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeRbd getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeSecret getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
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
            struct.set("fqn", om.valueToTree("kubernetes.DaemonsetSpecTemplateSpecVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonsetSpecTemplateSpecVolume.Jsii$Proxy that = (DaemonsetSpecTemplateSpecVolume.Jsii$Proxy) o;

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
