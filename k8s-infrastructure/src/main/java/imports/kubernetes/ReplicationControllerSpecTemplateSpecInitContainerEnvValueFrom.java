package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.706Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#config_map_key_ref ReplicationController#config_map_key_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return null;
    }

    /**
     * field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#field_ref ReplicationController#field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef getFieldRef() {
        return null;
    }

    /**
     * resource_field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource_field_ref ReplicationController#resource_field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * secret_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#secret_key_ref ReplicationController#secret_key_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom> {
        imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef configMapKeyRef;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef fieldRef;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef resourceFieldRef;
        imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom#getConfigMapKeyRef}
         * @param configMapKeyRef config_map_key_ref block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#config_map_key_ref ReplicationController#config_map_key_ref}
         * @return {@code this}
         */
        public Builder configMapKeyRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom#getFieldRef}
         * @param fieldRef field_ref block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#field_ref ReplicationController#field_ref}
         * @return {@code this}
         */
        public Builder fieldRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom#getResourceFieldRef}
         * @param resourceFieldRef resource_field_ref block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource_field_ref ReplicationController#resource_field_ref}
         * @return {@code this}
         */
        public Builder resourceFieldRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom#getSecretKeyRef}
         * @param secretKeyRef secret_key_ref block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#secret_key_ref ReplicationController#secret_key_ref}
         * @return {@code this}
         */
        public Builder secretKeyRef(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom {
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef configMapKeyRef;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef fieldRef;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef resourceFieldRef;
        private final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef.class));
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef.class));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef.class));
            this.secretKeyRef = software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapKeyRef = builder.configMapKeyRef;
            this.fieldRef = builder.fieldRef;
            this.resourceFieldRef = builder.resourceFieldRef;
            this.secretKeyRef = builder.secretKeyRef;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef getSecretKeyRef() {
            return this.secretKeyRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMapKeyRef() != null) {
                data.set("configMapKeyRef", om.valueToTree(this.getConfigMapKeyRef()));
            }
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }
            if (this.getSecretKeyRef() != null) {
                data.set("secretKeyRef", om.valueToTree(this.getSecretKeyRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy) o;

            if (this.configMapKeyRef != null ? !this.configMapKeyRef.equals(that.configMapKeyRef) : that.configMapKeyRef != null) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.resourceFieldRef != null ? !this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef != null) return false;
            return this.secretKeyRef != null ? this.secretKeyRef.equals(that.secretKeyRef) : that.secretKeyRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMapKeyRef != null ? this.configMapKeyRef.hashCode() : 0;
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            result = 31 * result + (this.secretKeyRef != null ? this.secretKeyRef.hashCode() : 0);
            return result;
        }
    }
}
