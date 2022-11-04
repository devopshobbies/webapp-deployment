package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.128Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecTemplateSpecVolume")
@software.amazon.jsii.Jsii.Proxy(StatefulSetV1SpecTemplateSpecVolume.Jsii$Proxy.class)
public interface StatefulSetV1SpecTemplateSpecVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_elastic_block_store block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#aws_elastic_block_store StatefulSetV1#aws_elastic_block_store}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azure_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#azure_disk StatefulSetV1#azure_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * azure_file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#azure_file StatefulSetV1#azure_file}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile getAzureFile() {
        return null;
    }

    /**
     * ceph_fs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#ceph_fs StatefulSetV1#ceph_fs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs getCephFs() {
        return null;
    }

    /**
     * cinder block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#cinder StatefulSetV1#cinder}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder getCinder() {
        return null;
    }

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#config_map StatefulSetV1#config_map}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap getConfigMap() {
        return null;
    }

    /**
     * csi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#csi StatefulSetV1#csi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi getCsi() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#downward_api StatefulSetV1#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * empty_dir block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#empty_dir StatefulSetV1#empty_dir}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir getEmptyDir() {
        return null;
    }

    /**
     * fc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#fc StatefulSetV1#fc}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc getFc() {
        return null;
    }

    /**
     * flex_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#flex_volume StatefulSetV1#flex_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * flocker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#flocker StatefulSetV1#flocker}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker getFlocker() {
        return null;
    }

    /**
     * gce_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#gce_persistent_disk StatefulSetV1#gce_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * git_repo block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#git_repo StatefulSetV1#git_repo}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo getGitRepo() {
        return null;
    }

    /**
     * glusterfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#glusterfs StatefulSetV1#glusterfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * host_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#host_path StatefulSetV1#host_path}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath getHostPath() {
        return null;
    }

    /**
     * iscsi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#iscsi StatefulSetV1#iscsi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi getIscsi() {
        return null;
    }

    /**
     * local block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#local StatefulSetV1#local}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal getLocal() {
        return null;
    }

    /**
     * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#name StatefulSetV1#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * nfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#nfs StatefulSetV1#nfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs getNfs() {
        return null;
    }

    /**
     * persistent_volume_claim block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#persistent_volume_claim StatefulSetV1#persistent_volume_claim}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
        return null;
    }

    /**
     * photon_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#photon_persistent_disk StatefulSetV1#photon_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * projected block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#projected StatefulSetV1#projected}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getProjected() {
        return null;
    }

    /**
     * quobyte block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#quobyte StatefulSetV1#quobyte}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte getQuobyte() {
        return null;
    }

    /**
     * rbd block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#rbd StatefulSetV1#rbd}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd getRbd() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#secret StatefulSetV1#secret}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret getSecret() {
        return null;
    }

    /**
     * vsphere_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#vsphere_volume StatefulSetV1#vsphere_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetV1SpecTemplateSpecVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetV1SpecTemplateSpecVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetV1SpecTemplateSpecVolume> {
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk azureDisk;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile azureFile;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs cephFs;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder cinder;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap configMap;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi csi;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi downwardApi;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir emptyDir;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc fc;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume flexVolume;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker flocker;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo gitRepo;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs glusterfs;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath hostPath;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi iscsi;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal local;
        java.lang.String name;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs nfs;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        java.lang.Object projected;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte quobyte;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd rbd;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret secret;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getAwsElasticBlockStore}
         * @param awsElasticBlockStore aws_elastic_block_store block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#aws_elastic_block_store StatefulSetV1#aws_elastic_block_store}
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getAzureDisk}
         * @param azureDisk azure_disk block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#azure_disk StatefulSetV1#azure_disk}
         * @return {@code this}
         */
        public Builder azureDisk(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getAzureFile}
         * @param azureFile azure_file block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#azure_file StatefulSetV1#azure_file}
         * @return {@code this}
         */
        public Builder azureFile(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getCephFs}
         * @param cephFs ceph_fs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#ceph_fs StatefulSetV1#ceph_fs}
         * @return {@code this}
         */
        public Builder cephFs(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs cephFs) {
            this.cephFs = cephFs;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getCinder}
         * @param cinder cinder block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#cinder StatefulSetV1#cinder}
         * @return {@code this}
         */
        public Builder cinder(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#config_map StatefulSetV1#config_map}
         * @return {@code this}
         */
        public Builder configMap(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getCsi}
         * @param csi csi block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#csi StatefulSetV1#csi}
         * @return {@code this}
         */
        public Builder csi(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#downward_api StatefulSetV1#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getEmptyDir}
         * @param emptyDir empty_dir block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#empty_dir StatefulSetV1#empty_dir}
         * @return {@code this}
         */
        public Builder emptyDir(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getFc}
         * @param fc fc block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#fc StatefulSetV1#fc}
         * @return {@code this}
         */
        public Builder fc(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getFlexVolume}
         * @param flexVolume flex_volume block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#flex_volume StatefulSetV1#flex_volume}
         * @return {@code this}
         */
        public Builder flexVolume(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getFlocker}
         * @param flocker flocker block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#flocker StatefulSetV1#flocker}
         * @return {@code this}
         */
        public Builder flocker(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getGcePersistentDisk}
         * @param gcePersistentDisk gce_persistent_disk block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#gce_persistent_disk StatefulSetV1#gce_persistent_disk}
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getGitRepo}
         * @param gitRepo git_repo block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#git_repo StatefulSetV1#git_repo}
         * @return {@code this}
         */
        public Builder gitRepo(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getGlusterfs}
         * @param glusterfs glusterfs block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#glusterfs StatefulSetV1#glusterfs}
         * @return {@code this}
         */
        public Builder glusterfs(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getHostPath}
         * @param hostPath host_path block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#host_path StatefulSetV1#host_path}
         * @return {@code this}
         */
        public Builder hostPath(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getIscsi}
         * @param iscsi iscsi block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#iscsi StatefulSetV1#iscsi}
         * @return {@code this}
         */
        public Builder iscsi(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getLocal}
         * @param local local block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#local StatefulSetV1#local}
         * @return {@code this}
         */
        public Builder local(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getName}
         * @param name Volume's name. Must be a DNS_LABEL and unique within the pod. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#name StatefulSetV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getNfs}
         * @param nfs nfs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#nfs StatefulSetV1#nfs}
         * @return {@code this}
         */
        public Builder nfs(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getPersistentVolumeClaim}
         * @param persistentVolumeClaim persistent_volume_claim block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#persistent_volume_claim StatefulSetV1#persistent_volume_claim}
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getPhotonPersistentDisk}
         * @param photonPersistentDisk photon_persistent_disk block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#photon_persistent_disk StatefulSetV1#photon_persistent_disk}
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#projected StatefulSetV1#projected}
         * @return {@code this}
         */
        public Builder projected(com.hashicorp.cdktf.IResolvable projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getProjected}
         * @param projected projected block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#projected StatefulSetV1#projected}
         * @return {@code this}
         */
        public Builder projected(java.util.List<? extends imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjected> projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getQuobyte}
         * @param quobyte quobyte block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#quobyte StatefulSetV1#quobyte}
         * @return {@code this}
         */
        public Builder quobyte(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getRbd}
         * @param rbd rbd block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#rbd StatefulSetV1#rbd}
         * @return {@code this}
         */
        public Builder rbd(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#secret StatefulSetV1#secret}
         * @return {@code this}
         */
        public Builder secret(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecVolume#getVsphereVolume}
         * @param vsphereVolume vsphere_volume block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#vsphere_volume StatefulSetV1#vsphere_volume}
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetV1SpecTemplateSpecVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetV1SpecTemplateSpecVolume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetV1SpecTemplateSpecVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetV1SpecTemplateSpecVolume {
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore awsElasticBlockStore;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk azureDisk;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile azureFile;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs cephFs;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder cinder;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap configMap;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi csi;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi downwardApi;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir emptyDir;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc fc;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume flexVolume;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker flocker;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk gcePersistentDisk;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo gitRepo;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs glusterfs;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath hostPath;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi iscsi;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal local;
        private final java.lang.String name;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs nfs;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim persistentVolumeClaim;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk photonPersistentDisk;
        private final java.lang.Object projected;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte quobyte;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd rbd;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret secret;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile.class));
            this.cephFs = software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder.class));
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi.class));
            this.emptyDir = software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk.class));
            this.gitRepo = software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs.class));
            this.persistentVolumeClaim = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk.class));
            this.projected = software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume.class));
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
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCephFs getCephFs() {
            return this.cephFs;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCinder getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeConfigMap getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeCsi getCsi() {
            return this.csi;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeEmptyDir getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFc getFc() {
            return this.fc;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGitRepo getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeLocal getLocal() {
            return this.local;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeNfs getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePersistentVolumeClaim getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumePhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final java.lang.Object getProjected() {
            return this.projected;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeRbd getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeSecret getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeVsphereVolume getVsphereVolume() {
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
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetV1SpecTemplateSpecVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetV1SpecTemplateSpecVolume.Jsii$Proxy that = (StatefulSetV1SpecTemplateSpecVolume.Jsii$Proxy) o;

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
