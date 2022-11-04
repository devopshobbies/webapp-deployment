package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.976Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore")
@software.amazon.jsii.Jsii.Proxy(CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore.Jsii$Proxy.class)
public interface CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore extends software.amazon.jsii.JsiiSerializable {

    /**
     * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#volume_id CronJob#volume_id}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeId();

    /**
     * Filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#fs_type CronJob#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * The partition in the volume that you want to mount.
     * <p>
     * If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#partition CronJob#partition}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPartition() {
        return null;
    }

    /**
     * Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#read_only CronJob#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore> {
        java.lang.String volumeId;
        java.lang.String fsType;
        java.lang.Number partition;
        java.lang.Object readOnly;

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore#getVolumeId}
         * @param volumeId Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#volume_id CronJob#volume_id}
         * @return {@code this}
         */
        public Builder volumeId(java.lang.String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore#getFsType}
         * @param fsType Filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#fs_type CronJob#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore#getPartition}
         * @param partition The partition in the volume that you want to mount.
         *                  If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#partition CronJob#partition}
         * @return {@code this}
         */
        public Builder partition(java.lang.Number partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#read_only CronJob#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#read_only CronJob#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore {
        private final java.lang.String volumeId;
        private final java.lang.String fsType;
        private final java.lang.Number partition;
        private final java.lang.Object readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumeId = software.amazon.jsii.Kernel.get(this, "volumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.partition = software.amazon.jsii.Kernel.get(this, "partition", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumeId = java.util.Objects.requireNonNull(builder.volumeId, "volumeId is required");
            this.fsType = builder.fsType;
            this.partition = builder.partition;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getVolumeId() {
            return this.volumeId;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.Number getPartition() {
            return this.partition;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumeId", om.valueToTree(this.getVolumeId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getPartition() != null) {
                data.set("partition", om.valueToTree(this.getPartition()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore.Jsii$Proxy that = (CronJobSpecJobTemplateSpecTemplateSpecVolumeAwsElasticBlockStore.Jsii$Proxy) o;

            if (!volumeId.equals(that.volumeId)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.partition != null ? !this.partition.equals(that.partition) : that.partition != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.volumeId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.partition != null ? this.partition.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
