package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.267Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecPersistentVolumeSource.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_elastic_block_store block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#aws_elastic_block_store PersistentVolumeV1#aws_elastic_block_store}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azure_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#azure_disk PersistentVolumeV1#azure_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * azure_file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#azure_file PersistentVolumeV1#azure_file}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile getAzureFile() {
        return null;
    }

    /**
     * ceph_fs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#ceph_fs PersistentVolumeV1#ceph_fs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs getCephFs() {
        return null;
    }

    /**
     * cinder block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#cinder PersistentVolumeV1#cinder}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder getCinder() {
        return null;
    }

    /**
     * csi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#csi PersistentVolumeV1#csi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi getCsi() {
        return null;
    }

    /**
     * fc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#fc PersistentVolumeV1#fc}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc getFc() {
        return null;
    }

    /**
     * flex_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#flex_volume PersistentVolumeV1#flex_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * flocker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#flocker PersistentVolumeV1#flocker}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker getFlocker() {
        return null;
    }

    /**
     * gce_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#gce_persistent_disk PersistentVolumeV1#gce_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * glusterfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#glusterfs PersistentVolumeV1#glusterfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * host_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#host_path PersistentVolumeV1#host_path}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath getHostPath() {
        return null;
    }

    /**
     * iscsi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#iscsi PersistentVolumeV1#iscsi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi getIscsi() {
        return null;
    }

    /**
     * local block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#local PersistentVolumeV1#local}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal getLocal() {
        return null;
    }

    /**
     * nfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#nfs PersistentVolumeV1#nfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs getNfs() {
        return null;
    }

    /**
     * photon_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#photon_persistent_disk PersistentVolumeV1#photon_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * quobyte block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#quobyte PersistentVolumeV1#quobyte}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte getQuobyte() {
        return null;
    }

    /**
     * rbd block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#rbd PersistentVolumeV1#rbd}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd getRbd() {
        return null;
    }

    /**
     * vsphere_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#vsphere_volume PersistentVolumeV1#vsphere_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecPersistentVolumeSource> {
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk azureDisk;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile azureFile;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs cephFs;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder cinder;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi csi;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc fc;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume flexVolume;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker flocker;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs glusterfs;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath hostPath;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi iscsi;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal local;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs nfs;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte quobyte;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd rbd;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getAwsElasticBlockStore}
         * @param awsElasticBlockStore aws_elastic_block_store block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#aws_elastic_block_store PersistentVolumeV1#aws_elastic_block_store}
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getAzureDisk}
         * @param azureDisk azure_disk block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#azure_disk PersistentVolumeV1#azure_disk}
         * @return {@code this}
         */
        public Builder azureDisk(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getAzureFile}
         * @param azureFile azure_file block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#azure_file PersistentVolumeV1#azure_file}
         * @return {@code this}
         */
        public Builder azureFile(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getCephFs}
         * @param cephFs ceph_fs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#ceph_fs PersistentVolumeV1#ceph_fs}
         * @return {@code this}
         */
        public Builder cephFs(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs cephFs) {
            this.cephFs = cephFs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getCinder}
         * @param cinder cinder block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#cinder PersistentVolumeV1#cinder}
         * @return {@code this}
         */
        public Builder cinder(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getCsi}
         * @param csi csi block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#csi PersistentVolumeV1#csi}
         * @return {@code this}
         */
        public Builder csi(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getFc}
         * @param fc fc block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#fc PersistentVolumeV1#fc}
         * @return {@code this}
         */
        public Builder fc(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getFlexVolume}
         * @param flexVolume flex_volume block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#flex_volume PersistentVolumeV1#flex_volume}
         * @return {@code this}
         */
        public Builder flexVolume(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getFlocker}
         * @param flocker flocker block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#flocker PersistentVolumeV1#flocker}
         * @return {@code this}
         */
        public Builder flocker(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getGcePersistentDisk}
         * @param gcePersistentDisk gce_persistent_disk block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#gce_persistent_disk PersistentVolumeV1#gce_persistent_disk}
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getGlusterfs}
         * @param glusterfs glusterfs block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#glusterfs PersistentVolumeV1#glusterfs}
         * @return {@code this}
         */
        public Builder glusterfs(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getHostPath}
         * @param hostPath host_path block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#host_path PersistentVolumeV1#host_path}
         * @return {@code this}
         */
        public Builder hostPath(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getIscsi}
         * @param iscsi iscsi block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#iscsi PersistentVolumeV1#iscsi}
         * @return {@code this}
         */
        public Builder iscsi(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getLocal}
         * @param local local block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#local PersistentVolumeV1#local}
         * @return {@code this}
         */
        public Builder local(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getNfs}
         * @param nfs nfs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#nfs PersistentVolumeV1#nfs}
         * @return {@code this}
         */
        public Builder nfs(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getPhotonPersistentDisk}
         * @param photonPersistentDisk photon_persistent_disk block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#photon_persistent_disk PersistentVolumeV1#photon_persistent_disk}
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getQuobyte}
         * @param quobyte quobyte block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#quobyte PersistentVolumeV1#quobyte}
         * @return {@code this}
         */
        public Builder quobyte(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getRbd}
         * @param rbd rbd block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#rbd PersistentVolumeV1#rbd}
         * @return {@code this}
         */
        public Builder rbd(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSource#getVsphereVolume}
         * @param vsphereVolume vsphere_volume block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#vsphere_volume PersistentVolumeV1#vsphere_volume}
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecPersistentVolumeSource {
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk azureDisk;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile azureFile;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs cephFs;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder cinder;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi csi;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc fc;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume flexVolume;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker flocker;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs glusterfs;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath hostPath;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi iscsi;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal local;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs nfs;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte quobyte;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd rbd;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile.class));
            this.cephFs = software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume.class));
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
            this.csi = builder.csi;
            this.fc = builder.fc;
            this.flexVolume = builder.flexVolume;
            this.flocker = builder.flocker;
            this.gcePersistentDisk = builder.gcePersistentDisk;
            this.glusterfs = builder.glusterfs;
            this.hostPath = builder.hostPath;
            this.iscsi = builder.iscsi;
            this.local = builder.local;
            this.nfs = builder.nfs;
            this.photonPersistentDisk = builder.photonPersistentDisk;
            this.quobyte = builder.quobyte;
            this.rbd = builder.rbd;
            this.vsphereVolume = builder.vsphereVolume;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs getCephFs() {
            return this.cephFs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCinder getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCsi getCsi() {
            return this.csi;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc getFc() {
            return this.fc;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceLocal getLocal() {
            return this.local;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceNfs getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceRbd getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceVsphereVolume getVsphereVolume() {
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
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
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
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getQuobyte() != null) {
                data.set("quobyte", om.valueToTree(this.getQuobyte()));
            }
            if (this.getRbd() != null) {
                data.set("rbd", om.valueToTree(this.getRbd()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecPersistentVolumeSource.Jsii$Proxy that = (PersistentVolumeV1SpecPersistentVolumeSource.Jsii$Proxy) o;

            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.cephFs != null ? !this.cephFs.equals(that.cephFs) : that.cephFs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.local != null ? !this.local.equals(that.local) : that.local != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0;
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.cephFs != null ? this.cephFs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.local != null ? this.local.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
