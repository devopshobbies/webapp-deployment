package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.760Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path is the relative path name of the file to be created.
     * <p>
     * Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#path ReplicationController#path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#field_ref ReplicationController#field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef getFieldRef() {
        return null;
    }

    /**
     * Mode bits to use on this file, must be a value between 0 and 0777.
     * <p>
     * If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#mode ReplicationController#mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMode() {
        return null;
    }

    /**
     * resource_field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource_field_ref ReplicationController#resource_field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems> {
        java.lang.String path;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef fieldRef;
        java.lang.String mode;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef resourceFieldRef;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems#getPath}
         * @param path Path is the relative path name of the file to be created. This parameter is required.
         *             Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#path ReplicationController#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems#getFieldRef}
         * @param fieldRef field_ref block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#field_ref ReplicationController#field_ref}
         * @return {@code this}
         */
        public Builder fieldRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems#getMode}
         * @param mode Mode bits to use on this file, must be a value between 0 and 0777.
         *             If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#mode ReplicationController#mode}
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems#getResourceFieldRef}
         * @param resourceFieldRef resource_field_ref block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource_field_ref ReplicationController#resource_field_ref}
         * @return {@code this}
         */
        public Builder resourceFieldRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems {
        private final java.lang.String path;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef fieldRef;
        private final java.lang.String mode;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef resourceFieldRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.fieldRef = builder.fieldRef;
            this.mode = builder.mode;
            this.resourceFieldRef = builder.resourceFieldRef;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.resourceFieldRef != null ? this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            return result;
        }
    }
}
