package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.639Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecVolumeVsphereVolume")
@software.amazon.jsii.Jsii.Proxy(PodV1SpecVolumeVsphereVolume.Jsii$Proxy.class)
public interface PodV1SpecVolumeVsphereVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path that identifies vSphere volume vmdk.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#volume_path PodV1#volume_path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumePath();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#fs_type PodV1#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodV1SpecVolumeVsphereVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodV1SpecVolumeVsphereVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodV1SpecVolumeVsphereVolume> {
        java.lang.String volumePath;
        java.lang.String fsType;

        /**
         * Sets the value of {@link PodV1SpecVolumeVsphereVolume#getVolumePath}
         * @param volumePath Path that identifies vSphere volume vmdk. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#volume_path PodV1#volume_path}
         * @return {@code this}
         */
        public Builder volumePath(java.lang.String volumePath) {
            this.volumePath = volumePath;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecVolumeVsphereVolume#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#fs_type PodV1#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodV1SpecVolumeVsphereVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodV1SpecVolumeVsphereVolume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodV1SpecVolumeVsphereVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodV1SpecVolumeVsphereVolume {
        private final java.lang.String volumePath;
        private final java.lang.String fsType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumePath = software.amazon.jsii.Kernel.get(this, "volumePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumePath = java.util.Objects.requireNonNull(builder.volumePath, "volumePath is required");
            this.fsType = builder.fsType;
        }

        @Override
        public final java.lang.String getVolumePath() {
            return this.volumePath;
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

            data.set("volumePath", om.valueToTree(this.getVolumePath()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodV1SpecVolumeVsphereVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodV1SpecVolumeVsphereVolume.Jsii$Proxy that = (PodV1SpecVolumeVsphereVolume.Jsii$Proxy) o;

            if (!volumePath.equals(that.volumePath)) return false;
            return this.fsType != null ? this.fsType.equals(that.fsType) : that.fsType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.volumePath.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            return result;
        }
    }
}
