package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.541Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecContainerVolumeMount")
@software.amazon.jsii.Jsii.Proxy(PodV1SpecContainerVolumeMount.Jsii$Proxy.class)
public interface PodV1SpecContainerVolumeMount extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#mount_path PodV1#mount_path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMountPath();

    /**
     * This must match the Name of a Volume.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#name PodV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Mount propagation mode.
     * <p>
     * mount_propagation determines how mounts are propagated from the host to container and the other way around. Valid values are None (default), HostToContainer and Bidirectional.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#mount_propagation PodV1#mount_propagation}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMountPropagation() {
        return null;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#read_only PodV1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#sub_path PodV1#sub_path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodV1SpecContainerVolumeMount}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodV1SpecContainerVolumeMount}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodV1SpecContainerVolumeMount> {
        java.lang.String mountPath;
        java.lang.String name;
        java.lang.String mountPropagation;
        java.lang.Object readOnly;
        java.lang.String subPath;

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getMountPath}
         * @param mountPath Path within the container at which the volume should be mounted. Must not contain ':'. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#mount_path PodV1#mount_path}
         * @return {@code this}
         */
        public Builder mountPath(java.lang.String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getName}
         * @param name This must match the Name of a Volume. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#name PodV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getMountPropagation}
         * @param mountPropagation Mount propagation mode.
         *                         mount_propagation determines how mounts are propagated from the host to container and the other way around. Valid values are None (default), HostToContainer and Bidirectional.
         *                         <p>
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#mount_propagation PodV1#mount_propagation}
         * @return {@code this}
         */
        public Builder mountPropagation(java.lang.String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getReadOnly}
         * @param readOnly Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#read_only PodV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getReadOnly}
         * @param readOnly Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#read_only PodV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerVolumeMount#getSubPath}
         * @param subPath Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#sub_path PodV1#sub_path}
         * @return {@code this}
         */
        public Builder subPath(java.lang.String subPath) {
            this.subPath = subPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodV1SpecContainerVolumeMount}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodV1SpecContainerVolumeMount build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodV1SpecContainerVolumeMount}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodV1SpecContainerVolumeMount {
        private final java.lang.String mountPath;
        private final java.lang.String name;
        private final java.lang.String mountPropagation;
        private final java.lang.Object readOnly;
        private final java.lang.String subPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mountPath = software.amazon.jsii.Kernel.get(this, "mountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mountPropagation = software.amazon.jsii.Kernel.get(this, "mountPropagation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.subPath = software.amazon.jsii.Kernel.get(this, "subPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mountPath = java.util.Objects.requireNonNull(builder.mountPath, "mountPath is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.mountPropagation = builder.mountPropagation;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        @Override
        public final java.lang.String getMountPath() {
            return this.mountPath;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getMountPropagation() {
            return this.mountPropagation;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getSubPath() {
            return this.subPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("mountPath", om.valueToTree(this.getMountPath()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getMountPropagation() != null) {
                data.set("mountPropagation", om.valueToTree(this.getMountPropagation()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSubPath() != null) {
                data.set("subPath", om.valueToTree(this.getSubPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodV1SpecContainerVolumeMount"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodV1SpecContainerVolumeMount.Jsii$Proxy that = (PodV1SpecContainerVolumeMount.Jsii$Proxy) o;

            if (!mountPath.equals(that.mountPath)) return false;
            if (!name.equals(that.name)) return false;
            if (this.mountPropagation != null ? !this.mountPropagation.equals(that.mountPropagation) : that.mountPropagation != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.subPath != null ? this.subPath.equals(that.subPath) : that.subPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mountPath.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.mountPropagation != null ? this.mountPropagation.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.subPath != null ? this.subPath.hashCode() : 0);
            return result;
        }
    }
}
