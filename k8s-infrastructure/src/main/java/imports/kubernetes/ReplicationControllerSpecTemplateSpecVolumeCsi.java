package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.750Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsi")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecVolumeCsi.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecVolumeCsi extends software.amazon.jsii.JsiiSerializable {

    /**
     * the name of the volume driver to use. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#driver ReplicationController#driver}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#fs_type ReplicationController#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * node_publish_secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#node_publish_secret_ref ReplicationController#node_publish_secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef getNodePublishSecretRef() {
        return null;
    }

    /**
     * Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#read_only ReplicationController#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * Attributes of the volume to publish.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#volume_attributes ReplicationController#volume_attributes}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecVolumeCsi}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecVolumeCsi}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecVolumeCsi> {
        java.lang.String driver;
        java.lang.String fsType;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef nodePublishSecretRef;
        java.lang.Object readOnly;
        java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getDriver}
         * @param driver the name of the volume driver to use. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#driver ReplicationController#driver}
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#fs_type ReplicationController#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getNodePublishSecretRef}
         * @param nodePublishSecretRef node_publish_secret_ref block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#node_publish_secret_ref ReplicationController#node_publish_secret_ref}
         * @return {@code this}
         */
        public Builder nodePublishSecretRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#read_only ReplicationController#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#read_only ReplicationController#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeCsi#getVolumeAttributes}
         * @param volumeAttributes Attributes of the volume to publish.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#volume_attributes ReplicationController#volume_attributes}
         * @return {@code this}
         */
        public Builder volumeAttributes(java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecVolumeCsi}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecVolumeCsi build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecVolumeCsi}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecVolumeCsi {
        private final java.lang.String driver;
        private final java.lang.String fsType;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef nodePublishSecretRef;
        private final java.lang.Object readOnly;
        private final java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodePublishSecretRef = software.amazon.jsii.Kernel.get(this, "nodePublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeAttributes = software.amazon.jsii.Kernel.get(this, "volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.fsType = builder.fsType;
            this.nodePublishSecretRef = builder.nodePublishSecretRef;
            this.readOnly = builder.readOnly;
            this.volumeAttributes = builder.volumeAttributes;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsiNodePublishSecretRef getNodePublishSecretRef() {
            return this.nodePublishSecretRef;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
            return this.volumeAttributes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getNodePublishSecretRef() != null) {
                data.set("nodePublishSecretRef", om.valueToTree(this.getNodePublishSecretRef()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getVolumeAttributes() != null) {
                data.set("volumeAttributes", om.valueToTree(this.getVolumeAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecVolumeCsi"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecVolumeCsi.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecVolumeCsi.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.nodePublishSecretRef != null ? !this.nodePublishSecretRef.equals(that.nodePublishSecretRef) : that.nodePublishSecretRef != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.volumeAttributes != null ? this.volumeAttributes.equals(that.volumeAttributes) : that.volumeAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.nodePublishSecretRef != null ? this.nodePublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.volumeAttributes != null ? this.volumeAttributes.hashCode() : 0);
            return result;
        }
    }
}
