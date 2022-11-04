package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.820Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecVolumeIscsi")
@software.amazon.jsii.Jsii.Proxy(DeploymentV1SpecTemplateSpecVolumeIscsi.Jsii$Proxy.class)
public interface DeploymentV1SpecTemplateSpecVolumeIscsi extends software.amazon.jsii.JsiiSerializable {

    /**
     * Target iSCSI Qualified Name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#iqn DeploymentV1#iqn}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIqn();

    /**
     * iSCSI target portal.
     * <p>
     * The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#target_portal DeploymentV1#target_portal}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTargetPortal();

    /**
     * Filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#iscsi
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#fs_type DeploymentV1#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * iSCSI interface name that uses an iSCSI transport. Defaults to 'default' (tcp).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#iscsi_interface DeploymentV1#iscsi_interface}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIscsiInterface() {
        return null;
    }

    /**
     * iSCSI target lun number.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#lun DeploymentV1#lun}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLun() {
        return null;
    }

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentV1SpecTemplateSpecVolumeIscsi}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentV1SpecTemplateSpecVolumeIscsi}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentV1SpecTemplateSpecVolumeIscsi> {
        java.lang.String iqn;
        java.lang.String targetPortal;
        java.lang.String fsType;
        java.lang.String iscsiInterface;
        java.lang.Number lun;
        java.lang.Object readOnly;

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getIqn}
         * @param iqn Target iSCSI Qualified Name. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#iqn DeploymentV1#iqn}
         * @return {@code this}
         */
        public Builder iqn(java.lang.String iqn) {
            this.iqn = iqn;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getTargetPortal}
         * @param targetPortal iSCSI target portal. This parameter is required.
         *                     The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#target_portal DeploymentV1#target_portal}
         * @return {@code this}
         */
        public Builder targetPortal(java.lang.String targetPortal) {
            this.targetPortal = targetPortal;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getFsType}
         * @param fsType Filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#iscsi
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#fs_type DeploymentV1#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getIscsiInterface}
         * @param iscsiInterface iSCSI interface name that uses an iSCSI transport. Defaults to 'default' (tcp).
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#iscsi_interface DeploymentV1#iscsi_interface}
         * @return {@code this}
         */
        public Builder iscsiInterface(java.lang.String iscsiInterface) {
            this.iscsiInterface = iscsiInterface;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getLun}
         * @param lun iSCSI target lun number.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#lun DeploymentV1#lun}
         * @return {@code this}
         */
        public Builder lun(java.lang.Number lun) {
            this.lun = lun;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumeIscsi#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentV1SpecTemplateSpecVolumeIscsi}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentV1SpecTemplateSpecVolumeIscsi build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentV1SpecTemplateSpecVolumeIscsi}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentV1SpecTemplateSpecVolumeIscsi {
        private final java.lang.String iqn;
        private final java.lang.String targetPortal;
        private final java.lang.String fsType;
        private final java.lang.String iscsiInterface;
        private final java.lang.Number lun;
        private final java.lang.Object readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.iqn = software.amazon.jsii.Kernel.get(this, "iqn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetPortal = software.amazon.jsii.Kernel.get(this, "targetPortal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iscsiInterface = software.amazon.jsii.Kernel.get(this, "iscsiInterface", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lun = software.amazon.jsii.Kernel.get(this, "lun", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iqn = java.util.Objects.requireNonNull(builder.iqn, "iqn is required");
            this.targetPortal = java.util.Objects.requireNonNull(builder.targetPortal, "targetPortal is required");
            this.fsType = builder.fsType;
            this.iscsiInterface = builder.iscsiInterface;
            this.lun = builder.lun;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getIqn() {
            return this.iqn;
        }

        @Override
        public final java.lang.String getTargetPortal() {
            return this.targetPortal;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getIscsiInterface() {
            return this.iscsiInterface;
        }

        @Override
        public final java.lang.Number getLun() {
            return this.lun;
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

            data.set("iqn", om.valueToTree(this.getIqn()));
            data.set("targetPortal", om.valueToTree(this.getTargetPortal()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getIscsiInterface() != null) {
                data.set("iscsiInterface", om.valueToTree(this.getIscsiInterface()));
            }
            if (this.getLun() != null) {
                data.set("lun", om.valueToTree(this.getLun()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentV1SpecTemplateSpecVolumeIscsi"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentV1SpecTemplateSpecVolumeIscsi.Jsii$Proxy that = (DeploymentV1SpecTemplateSpecVolumeIscsi.Jsii$Proxy) o;

            if (!iqn.equals(that.iqn)) return false;
            if (!targetPortal.equals(that.targetPortal)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.iscsiInterface != null ? !this.iscsiInterface.equals(that.iscsiInterface) : that.iscsiInterface != null) return false;
            if (this.lun != null ? !this.lun.equals(that.lun) : that.lun != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.iqn.hashCode();
            result = 31 * result + (this.targetPortal.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.iscsiInterface != null ? this.iscsiInterface.hashCode() : 0);
            result = 31 * result + (this.lun != null ? this.lun.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
