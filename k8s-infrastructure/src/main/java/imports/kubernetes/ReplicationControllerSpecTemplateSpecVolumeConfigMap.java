package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.742Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMap")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecVolumeConfigMap.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecVolumeConfigMap extends software.amazon.jsii.JsiiSerializable {

    /**
     * Optional: mode bits to use on created files by default.
     * <p>
     * Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#default_mode ReplicationController#default_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultMode() {
        return null;
    }

    /**
     * items block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#items ReplicationController#items}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getItems() {
        return null;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#name ReplicationController#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Optional: Specify whether the ConfigMap or its keys must be defined.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#optional ReplicationController#optional}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecVolumeConfigMap> {
        java.lang.String defaultMode;
        java.lang.Object items;
        java.lang.String name;
        java.lang.Object optional;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getDefaultMode}
         * @param defaultMode Optional: mode bits to use on created files by default.
         *                    Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#default_mode ReplicationController#default_mode}
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.String defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#items ReplicationController#items}
         * @return {@code this}
         */
        public Builder items(com.hashicorp.cdktf.IResolvable items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#items ReplicationController#items}
         * @return {@code this}
         */
        public Builder items(java.util.List<? extends imports.kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMapItems> items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getName}
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#name ReplicationController#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getOptional}
         * @param optional Optional: Specify whether the ConfigMap or its keys must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#optional ReplicationController#optional}
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap#getOptional}
         * @param optional Optional: Specify whether the ConfigMap or its keys must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#optional ReplicationController#optional}
         * @return {@code this}
         */
        public Builder optional(com.hashicorp.cdktf.IResolvable optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecVolumeConfigMap build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecVolumeConfigMap}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecVolumeConfigMap {
        private final java.lang.String defaultMode;
        private final java.lang.Object items;
        private final java.lang.String name;
        private final java.lang.Object optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultMode = software.amazon.jsii.Kernel.get(this, "defaultMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultMode = builder.defaultMode;
            this.items = builder.items;
            this.name = builder.name;
            this.optional = builder.optional;
        }

        @Override
        public final java.lang.String getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        public final java.lang.Object getItems() {
            return this.items;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getOptional() {
            return this.optional;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultMode() != null) {
                data.set("defaultMode", om.valueToTree(this.getDefaultMode()));
            }
            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecVolumeConfigMap"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecVolumeConfigMap.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecVolumeConfigMap.Jsii$Proxy) o;

            if (this.defaultMode != null ? !this.defaultMode.equals(that.defaultMode) : that.defaultMode != null) return false;
            if (this.items != null ? !this.items.equals(that.items) : that.items != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultMode != null ? this.defaultMode.hashCode() : 0;
            result = 31 * result + (this.items != null ? this.items.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
