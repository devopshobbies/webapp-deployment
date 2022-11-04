package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.274Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecPersistentVolumeSourceHostPath.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecPersistentVolumeSourceHostPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path of the directory on the host. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#path PersistentVolumeV1#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Type for HostPath volume. Allowed values are "" (default), DirectoryOrCreate, Directory, FileOrCreate, File, Socket, CharDevice and BlockDevice.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#type PersistentVolumeV1#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecPersistentVolumeSourceHostPath> {
        java.lang.String path;
        java.lang.String type;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath#getPath}
         * @param path Path of the directory on the host. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#path PersistentVolumeV1#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath#getType}
         * @param type Type for HostPath volume. Allowed values are "" (default), DirectoryOrCreate, Directory, FileOrCreate, File, Socket, CharDevice and BlockDevice.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#type PersistentVolumeV1#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecPersistentVolumeSourceHostPath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecPersistentVolumeSourceHostPath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecPersistentVolumeSourceHostPath {
        private final java.lang.String path;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = builder.path;
            this.type = builder.type;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceHostPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecPersistentVolumeSourceHostPath.Jsii$Proxy that = (PersistentVolumeV1SpecPersistentVolumeSourceHostPath.Jsii$Proxy) o;

            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path != null ? this.path.hashCode() : 0;
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
