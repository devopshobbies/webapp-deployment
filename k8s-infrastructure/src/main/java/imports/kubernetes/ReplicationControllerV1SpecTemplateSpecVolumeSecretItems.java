package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.867Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1SpecTemplateSpecVolumeSecretItems")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1SpecTemplateSpecVolumeSecretItems.Jsii$Proxy.class)
public interface ReplicationControllerV1SpecTemplateSpecVolumeSecretItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * The key to project.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#key ReplicationControllerV1#key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * Optional: mode bits to use on this file, must be a value between 0 and 0777.
     * <p>
     * If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#mode ReplicationControllerV1#mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMode() {
        return null;
    }

    /**
     * The relative path of the file to map the key to.
     * <p>
     * May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#path ReplicationControllerV1#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1SpecTemplateSpecVolumeSecretItems> {
        java.lang.String key;
        java.lang.String mode;
        java.lang.String path;

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems#getKey}
         * @param key The key to project.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#key ReplicationControllerV1#key}
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems#getMode}
         * @param mode Optional: mode bits to use on this file, must be a value between 0 and 0777.
         *             If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#mode ReplicationControllerV1#mode}
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems#getPath}
         * @param path The relative path of the file to map the key to.
         *             May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#path ReplicationControllerV1#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1SpecTemplateSpecVolumeSecretItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1SpecTemplateSpecVolumeSecretItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1SpecTemplateSpecVolumeSecretItems {
        private final java.lang.String key;
        private final java.lang.String mode;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
            this.mode = builder.mode;
            this.path = builder.path;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1SpecTemplateSpecVolumeSecretItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1SpecTemplateSpecVolumeSecretItems.Jsii$Proxy that = (ReplicationControllerV1SpecTemplateSpecVolumeSecretItems.Jsii$Proxy) o;

            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
