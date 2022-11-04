package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.262Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk extends software.amazon.jsii.JsiiSerializable {

    /**
     * ID that identifies Photon Controller persistent disk.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#pd_id DaemonSetV1#pd_id}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPdId();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#fs_type DaemonSetV1#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk> {
        java.lang.String pdId;
        java.lang.String fsType;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk#getPdId}
         * @param pdId ID that identifies Photon Controller persistent disk. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#pd_id DaemonSetV1#pd_id}
         * @return {@code this}
         */
        public Builder pdId(java.lang.String pdId) {
            this.pdId = pdId;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#fs_type DaemonSetV1#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk {
        private final java.lang.String pdId;
        private final java.lang.String fsType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pdId = software.amazon.jsii.Kernel.get(this, "pdId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pdId = java.util.Objects.requireNonNull(builder.pdId, "pdId is required");
            this.fsType = builder.fsType;
        }

        @Override
        public final java.lang.String getPdId() {
            return this.pdId;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pdId", om.valueToTree(this.getPdId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecVolumePhotonPersistentDisk.Jsii$Proxy) o;

            if (!pdId.equals(that.pdId)) return false;
            return this.fsType != null ? this.fsType.equals(that.fsType) : that.fsType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pdId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            return result;
        }
    }
}
