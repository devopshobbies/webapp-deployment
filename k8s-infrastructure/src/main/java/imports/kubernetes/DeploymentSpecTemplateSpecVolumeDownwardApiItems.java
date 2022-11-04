package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.713Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItems")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecVolumeDownwardApiItems.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecVolumeDownwardApiItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#field_ref Deployment#field_ref}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef getFieldRef();

    /**
     * Path is the relative path name of the file to be created.
     * <p>
     * Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#path Deployment#path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Optional: mode bits to use on this file, must be a value between 0 and 0777.
     * <p>
     * If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#mode Deployment#mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMode() {
        return null;
    }

    /**
     * resource_field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#resource_field_ref Deployment#resource_field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecVolumeDownwardApiItems> {
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef fieldRef;
        java.lang.String path;
        java.lang.String mode;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef resourceFieldRef;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems#getFieldRef}
         * @param fieldRef field_ref block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#field_ref Deployment#field_ref}
         * @return {@code this}
         */
        public Builder fieldRef(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems#getPath}
         * @param path Path is the relative path name of the file to be created. This parameter is required.
         *             Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#path Deployment#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems#getMode}
         * @param mode Optional: mode bits to use on this file, must be a value between 0 and 0777.
         *             If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#mode Deployment#mode}
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems#getResourceFieldRef}
         * @param resourceFieldRef resource_field_ref block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#resource_field_ref Deployment#resource_field_ref}
         * @return {@code this}
         */
        public Builder resourceFieldRef(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecVolumeDownwardApiItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecVolumeDownwardApiItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecVolumeDownwardApiItems {
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef fieldRef;
        private final java.lang.String path;
        private final java.lang.String mode;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef resourceFieldRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldRef = java.util.Objects.requireNonNull(builder.fieldRef, "fieldRef is required");
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.mode = builder.mode;
            this.resourceFieldRef = builder.resourceFieldRef;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItemsResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            data.set("path", om.valueToTree(this.getPath()));
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecVolumeDownwardApiItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecVolumeDownwardApiItems.Jsii$Proxy that = (DeploymentSpecTemplateSpecVolumeDownwardApiItems.Jsii$Proxy) o;

            if (!fieldRef.equals(that.fieldRef)) return false;
            if (!path.equals(that.path)) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.resourceFieldRef != null ? this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fieldRef.hashCode();
            result = 31 * result + (this.path.hashCode());
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            return result;
        }
    }
}
