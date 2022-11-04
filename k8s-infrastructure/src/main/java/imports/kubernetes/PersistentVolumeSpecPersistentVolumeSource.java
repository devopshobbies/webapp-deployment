package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.244Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpecPersistentVolumeSource.Jsii$Proxy.class)
public interface PersistentVolumeSpecPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_elastic_block_store block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#aws_elastic_block_store PersistentVolume#aws_elastic_block_store}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azure_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#azure_disk PersistentVolume#azure_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * azure_file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#azure_file PersistentVolume#azure_file}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile getAzureFile() {
        return null;
    }

    /**
     * ceph_fs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#ceph_fs PersistentVolume#ceph_fs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs getCephFs() {
        return null;
    }

    /**
     * cinder block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#cinder PersistentVolume#cinder}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder getCinder() {
        return null;
    }

    /**
     * csi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#csi PersistentVolume#csi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi getCsi() {
        return null;
    }

    /**
     * fc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#fc PersistentVolume#fc}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc getFc() {
        return null;
    }

    /**
     * flex_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#flex_volume PersistentVolume#flex_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * flocker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#flocker PersistentVolume#flocker}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker getFlocker() {
        return null;
    }

    /**
     * gce_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#gce_persistent_disk PersistentVolume#gce_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * glusterfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#glusterfs PersistentVolume#glusterfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * host_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#host_path PersistentVolume#host_path}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath getHostPath() {
        return null;
    }

    /**
     * iscsi block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#iscsi PersistentVolume#iscsi}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi getIscsi() {
        return null;
    }

    /**
     * local block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#local PersistentVolume#local}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal getLocal() {
        return null;
    }

    /**
     * nfs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#nfs PersistentVolume#nfs}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs getNfs() {
        return null;
    }

    /**
     * photon_persistent_disk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#photon_persistent_disk PersistentVolume#photon_persistent_disk}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * quobyte block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#quobyte PersistentVolume#quobyte}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte getQuobyte() {
        return null;
    }

    /**
     * rbd block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#rbd PersistentVolume#rbd}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd getRbd() {
        return null;
    }

    /**
     * vsphere_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#vsphere_volume PersistentVolume#vsphere_volume}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpecPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpecPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeSpecPersistentVolumeSource> {
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk azureDisk;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile azureFile;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs cephFs;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder cinder;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi csi;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc fc;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume flexVolume;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker flocker;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs glusterfs;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath hostPath;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi iscsi;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal local;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs nfs;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte quobyte;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd rbd;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getAwsElasticBlockStore}
         * @param awsElasticBlockStore aws_elastic_block_store block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#aws_elastic_block_store PersistentVolume#aws_elastic_block_store}
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getAzureDisk}
         * @param azureDisk azure_disk block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#azure_disk PersistentVolume#azure_disk}
         * @return {@code this}
         */
        public Builder azureDisk(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getAzureFile}
         * @param azureFile azure_file block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#azure_file PersistentVolume#azure_file}
         * @return {@code this}
         */
        public Builder azureFile(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getCephFs}
         * @param cephFs ceph_fs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#ceph_fs PersistentVolume#ceph_fs}
         * @return {@code this}
         */
        public Builder cephFs(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs cephFs) {
            this.cephFs = cephFs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getCinder}
         * @param cinder cinder block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#cinder PersistentVolume#cinder}
         * @return {@code this}
         */
        public Builder cinder(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getCsi}
         * @param csi csi block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#csi PersistentVolume#csi}
         * @return {@code this}
         */
        public Builder csi(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getFc}
         * @param fc fc block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#fc PersistentVolume#fc}
         * @return {@code this}
         */
        public Builder fc(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getFlexVolume}
         * @param flexVolume flex_volume block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#flex_volume PersistentVolume#flex_volume}
         * @return {@code this}
         */
        public Builder flexVolume(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getFlocker}
         * @param flocker flocker block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#flocker PersistentVolume#flocker}
         * @return {@code this}
         */
        public Builder flocker(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getGcePersistentDisk}
         * @param gcePersistentDisk gce_persistent_disk block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#gce_persistent_disk PersistentVolume#gce_persistent_disk}
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getGlusterfs}
         * @param glusterfs glusterfs block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#glusterfs PersistentVolume#glusterfs}
         * @return {@code this}
         */
        public Builder glusterfs(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getHostPath}
         * @param hostPath host_path block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#host_path PersistentVolume#host_path}
         * @return {@code this}
         */
        public Builder hostPath(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getIscsi}
         * @param iscsi iscsi block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#iscsi PersistentVolume#iscsi}
         * @return {@code this}
         */
        public Builder iscsi(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getLocal}
         * @param local local block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#local PersistentVolume#local}
         * @return {@code this}
         */
        public Builder local(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getNfs}
         * @param nfs nfs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#nfs PersistentVolume#nfs}
         * @return {@code this}
         */
        public Builder nfs(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getPhotonPersistentDisk}
         * @param photonPersistentDisk photon_persistent_disk block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#photon_persistent_disk PersistentVolume#photon_persistent_disk}
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getQuobyte}
         * @param quobyte quobyte block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#quobyte PersistentVolume#quobyte}
         * @return {@code this}
         */
        public Builder quobyte(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getRbd}
         * @param rbd rbd block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#rbd PersistentVolume#rbd}
         * @return {@code this}
         */
        public Builder rbd(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSource#getVsphereVolume}
         * @param vsphereVolume vsphere_volume block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#vsphere_volume PersistentVolume#vsphere_volume}
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpecPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeSpecPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpecPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpecPersistentVolumeSource {
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore awsElasticBlockStore;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk azureDisk;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile azureFile;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs cephFs;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder cinder;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi csi;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc fc;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume flexVolume;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker flocker;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk gcePersistentDisk;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs glusterfs;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath hostPath;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi iscsi;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal local;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs nfs;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk photonPersistentDisk;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte quobyte;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd rbd;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile.class));
            this.cephFs = software.amazon.jsii.Kernel.get(this, "cephFs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume.class));
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
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCephFs getCephFs() {
            return this.cephFs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCinder getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi getCsi() {
            return this.csi;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFc getFc() {
            return this.fc;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceLocal getLocal() {
            return this.local;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceNfs getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourcePhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceRbd getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceVsphereVolume getVsphereVolume() {
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
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeSpecPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpecPersistentVolumeSource.Jsii$Proxy that = (PersistentVolumeSpecPersistentVolumeSource.Jsii$Proxy) o;

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
