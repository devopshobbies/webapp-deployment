package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.630Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFrom")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecContainerEnvValueFrom.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecContainerEnvValueFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map_key_ref Deployment#config_map_key_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return null;
    }

    /**
     * field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#field_ref Deployment#field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef getFieldRef() {
        return null;
    }

    /**
     * resource_field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#resource_field_ref Deployment#resource_field_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * secret_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret_key_ref Deployment#secret_key_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecContainerEnvValueFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecContainerEnvValueFrom> {
        imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef configMapKeyRef;
        imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef fieldRef;
        imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef resourceFieldRef;
        imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom#getConfigMapKeyRef}
         * @param configMapKeyRef config_map_key_ref block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map_key_ref Deployment#config_map_key_ref}
         * @return {@code this}
         */
        public Builder configMapKeyRef(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom#getFieldRef}
         * @param fieldRef field_ref block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#field_ref Deployment#field_ref}
         * @return {@code this}
         */
        public Builder fieldRef(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom#getResourceFieldRef}
         * @param resourceFieldRef resource_field_ref block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#resource_field_ref Deployment#resource_field_ref}
         * @return {@code this}
         */
        public Builder resourceFieldRef(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom#getSecretKeyRef}
         * @param secretKeyRef secret_key_ref block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret_key_ref Deployment#secret_key_ref}
         * @return {@code this}
         */
        public Builder secretKeyRef(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecContainerEnvValueFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecContainerEnvValueFrom build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecContainerEnvValueFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecContainerEnvValueFrom {
        private final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef configMapKeyRef;
        private final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef fieldRef;
        private final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef resourceFieldRef;
        private final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef.class));
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef.class));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef.class));
            this.secretKeyRef = software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef.class));
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
        public final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFromSecretKeyRef getSecretKeyRef() {
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
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecContainerEnvValueFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecContainerEnvValueFrom.Jsii$Proxy that = (DeploymentSpecTemplateSpecContainerEnvValueFrom.Jsii$Proxy) o;

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
