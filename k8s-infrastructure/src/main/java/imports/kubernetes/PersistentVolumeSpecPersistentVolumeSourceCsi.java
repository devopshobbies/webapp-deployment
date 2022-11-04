package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.248Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpecPersistentVolumeSourceCsi.Jsii$Proxy.class)
public interface PersistentVolumeSpecPersistentVolumeSourceCsi extends software.amazon.jsii.JsiiSerializable {

    /**
     * the name of the volume driver to use. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#driver PersistentVolume#driver}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * A string value that uniquely identifies the volume. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#volume_handle PersistentVolume#volume_handle}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeHandle();

    /**
     * controller_expand_secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#controller_expand_secret_ref PersistentVolume#controller_expand_secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef getControllerExpandSecretRef() {
        return null;
    }

    /**
     * controller_publish_secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#controller_publish_secret_ref PersistentVolume#controller_publish_secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef getControllerPublishSecretRef() {
        return null;
    }

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#fs_type PersistentVolume#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * node_publish_secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#node_publish_secret_ref PersistentVolume#node_publish_secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef getNodePublishSecretRef() {
        return null;
    }

    /**
     * node_stage_secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#node_stage_secret_ref PersistentVolume#node_stage_secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef getNodeStageSecretRef() {
        return null;
    }

    /**
     * Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#read_only PersistentVolume#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * Attributes of the volume to publish.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#volume_attributes PersistentVolume#volume_attributes}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpecPersistentVolumeSourceCsi}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpecPersistentVolumeSourceCsi}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeSpecPersistentVolumeSourceCsi> {
        java.lang.String driver;
        java.lang.String volumeHandle;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef controllerExpandSecretRef;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef controllerPublishSecretRef;
        java.lang.String fsType;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef nodePublishSecretRef;
        imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef nodeStageSecretRef;
        java.lang.Object readOnly;
        java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getDriver}
         * @param driver the name of the volume driver to use. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#driver PersistentVolume#driver}
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getVolumeHandle}
         * @param volumeHandle A string value that uniquely identifies the volume. More info: https://kubernetes.io/docs/concepts/storage/volumes/#csi. This parameter is required.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#volume_handle PersistentVolume#volume_handle}
         * @return {@code this}
         */
        public Builder volumeHandle(java.lang.String volumeHandle) {
            this.volumeHandle = volumeHandle;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getControllerExpandSecretRef}
         * @param controllerExpandSecretRef controller_expand_secret_ref block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#controller_expand_secret_ref PersistentVolume#controller_expand_secret_ref}
         * @return {@code this}
         */
        public Builder controllerExpandSecretRef(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef controllerExpandSecretRef) {
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getControllerPublishSecretRef}
         * @param controllerPublishSecretRef controller_publish_secret_ref block.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#controller_publish_secret_ref PersistentVolume#controller_publish_secret_ref}
         * @return {@code this}
         */
        public Builder controllerPublishSecretRef(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef controllerPublishSecretRef) {
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#fs_type PersistentVolume#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getNodePublishSecretRef}
         * @param nodePublishSecretRef node_publish_secret_ref block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#node_publish_secret_ref PersistentVolume#node_publish_secret_ref}
         * @return {@code this}
         */
        public Builder nodePublishSecretRef(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getNodeStageSecretRef}
         * @param nodeStageSecretRef node_stage_secret_ref block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#node_stage_secret_ref PersistentVolume#node_stage_secret_ref}
         * @return {@code this}
         */
        public Builder nodeStageSecretRef(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef nodeStageSecretRef) {
            this.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#read_only PersistentVolume#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getReadOnly}
         * @param readOnly Whether to set the read-only property in VolumeMounts to "true". If omitted, the default is "false". More info: http://kubernetes.io/docs/user-guide/volumes#csi.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#read_only PersistentVolume#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsi#getVolumeAttributes}
         * @param volumeAttributes Attributes of the volume to publish.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#volume_attributes PersistentVolume#volume_attributes}
         * @return {@code this}
         */
        public Builder volumeAttributes(java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpecPersistentVolumeSourceCsi}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeSpecPersistentVolumeSourceCsi build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpecPersistentVolumeSourceCsi}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpecPersistentVolumeSourceCsi {
        private final java.lang.String driver;
        private final java.lang.String volumeHandle;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef controllerExpandSecretRef;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef controllerPublishSecretRef;
        private final java.lang.String fsType;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef nodePublishSecretRef;
        private final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef nodeStageSecretRef;
        private final java.lang.Object readOnly;
        private final java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeHandle = software.amazon.jsii.Kernel.get(this, "volumeHandle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.controllerExpandSecretRef = software.amazon.jsii.Kernel.get(this, "controllerExpandSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef.class));
            this.controllerPublishSecretRef = software.amazon.jsii.Kernel.get(this, "controllerPublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodePublishSecretRef = software.amazon.jsii.Kernel.get(this, "nodePublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef.class));
            this.nodeStageSecretRef = software.amazon.jsii.Kernel.get(this, "nodeStageSecretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeAttributes = software.amazon.jsii.Kernel.get(this, "volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.volumeHandle = java.util.Objects.requireNonNull(builder.volumeHandle, "volumeHandle is required");
            this.controllerExpandSecretRef = builder.controllerExpandSecretRef;
            this.controllerPublishSecretRef = builder.controllerPublishSecretRef;
            this.fsType = builder.fsType;
            this.nodePublishSecretRef = builder.nodePublishSecretRef;
            this.nodeStageSecretRef = builder.nodeStageSecretRef;
            this.readOnly = builder.readOnly;
            this.volumeAttributes = builder.volumeAttributes;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.lang.String getVolumeHandle() {
            return this.volumeHandle;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerExpandSecretRef getControllerExpandSecretRef() {
            return this.controllerExpandSecretRef;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiControllerPublishSecretRef getControllerPublishSecretRef() {
            return this.controllerPublishSecretRef;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef getNodePublishSecretRef() {
            return this.nodePublishSecretRef;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodeStageSecretRef getNodeStageSecretRef() {
            return this.nodeStageSecretRef;
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
            data.set("volumeHandle", om.valueToTree(this.getVolumeHandle()));
            if (this.getControllerExpandSecretRef() != null) {
                data.set("controllerExpandSecretRef", om.valueToTree(this.getControllerExpandSecretRef()));
            }
            if (this.getControllerPublishSecretRef() != null) {
                data.set("controllerPublishSecretRef", om.valueToTree(this.getControllerPublishSecretRef()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getNodePublishSecretRef() != null) {
                data.set("nodePublishSecretRef", om.valueToTree(this.getNodePublishSecretRef()));
            }
            if (this.getNodeStageSecretRef() != null) {
                data.set("nodeStageSecretRef", om.valueToTree(this.getNodeStageSecretRef()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getVolumeAttributes() != null) {
                data.set("volumeAttributes", om.valueToTree(this.getVolumeAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsi"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpecPersistentVolumeSourceCsi.Jsii$Proxy that = (PersistentVolumeSpecPersistentVolumeSourceCsi.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (!volumeHandle.equals(that.volumeHandle)) return false;
            if (this.controllerExpandSecretRef != null ? !this.controllerExpandSecretRef.equals(that.controllerExpandSecretRef) : that.controllerExpandSecretRef != null) return false;
            if (this.controllerPublishSecretRef != null ? !this.controllerPublishSecretRef.equals(that.controllerPublishSecretRef) : that.controllerPublishSecretRef != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.nodePublishSecretRef != null ? !this.nodePublishSecretRef.equals(that.nodePublishSecretRef) : that.nodePublishSecretRef != null) return false;
            if (this.nodeStageSecretRef != null ? !this.nodeStageSecretRef.equals(that.nodeStageSecretRef) : that.nodeStageSecretRef != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.volumeAttributes != null ? this.volumeAttributes.equals(that.volumeAttributes) : that.volumeAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.volumeHandle.hashCode());
            result = 31 * result + (this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.hashCode() : 0);
            result = 31 * result + (this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.nodePublishSecretRef != null ? this.nodePublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.nodeStageSecretRef != null ? this.nodeStageSecretRef.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.volumeAttributes != null ? this.volumeAttributes.hashCode() : 0);
            return result;
        }
    }
}
