package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.272Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecPersistentVolumeSourceFc.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecPersistentVolumeSourceFc extends software.amazon.jsii.JsiiSerializable {

    /**
     * FC target lun number.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#lun PersistentVolumeV1#lun}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getLun();

    /**
     * FC target worldwide names (WWNs).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#target_ww_ns PersistentVolumeV1#target_ww_ns}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTargetWwNs();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#fs_type PersistentVolumeV1#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecPersistentVolumeSourceFc}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecPersistentVolumeSourceFc> {
        java.lang.Number lun;
        java.util.List<java.lang.String> targetWwNs;
        java.lang.String fsType;
        java.lang.Object readOnly;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc#getLun}
         * @param lun FC target lun number. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#lun PersistentVolumeV1#lun}
         * @return {@code this}
         */
        public Builder lun(java.lang.Number lun) {
            this.lun = lun;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc#getTargetWwNs}
         * @param targetWwNs FC target worldwide names (WWNs). This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#target_ww_ns PersistentVolumeV1#target_ww_ns}
         * @return {@code this}
         */
        public Builder targetWwNs(java.util.List<java.lang.String> targetWwNs) {
            this.targetWwNs = targetWwNs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#fs_type PersistentVolumeV1#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecPersistentVolumeSourceFc}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecPersistentVolumeSourceFc build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecPersistentVolumeSourceFc}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecPersistentVolumeSourceFc {
        private final java.lang.Number lun;
        private final java.util.List<java.lang.String> targetWwNs;
        private final java.lang.String fsType;
        private final java.lang.Object readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.lun = software.amazon.jsii.Kernel.get(this, "lun", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.targetWwNs = software.amazon.jsii.Kernel.get(this, "targetWwNs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.lun = java.util.Objects.requireNonNull(builder.lun, "lun is required");
            this.targetWwNs = java.util.Objects.requireNonNull(builder.targetWwNs, "targetWwNs is required");
            this.fsType = builder.fsType;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.Number getLun() {
            return this.lun;
        }

        @Override
        public final java.util.List<java.lang.String> getTargetWwNs() {
            return this.targetWwNs;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
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

            data.set("lun", om.valueToTree(this.getLun()));
            data.set("targetWwNs", om.valueToTree(this.getTargetWwNs()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceFc"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecPersistentVolumeSourceFc.Jsii$Proxy that = (PersistentVolumeV1SpecPersistentVolumeSourceFc.Jsii$Proxy) o;

            if (!lun.equals(that.lun)) return false;
            if (!targetWwNs.equals(that.targetWwNs)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.lun.hashCode();
            result = 31 * result + (this.targetWwNs.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
