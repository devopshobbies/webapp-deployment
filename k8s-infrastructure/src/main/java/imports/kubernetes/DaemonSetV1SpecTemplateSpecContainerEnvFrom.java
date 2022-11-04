package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.184Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFrom")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecContainerEnvFrom.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecContainerEnvFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#config_map_ref DaemonSetV1#config_map_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef getConfigMapRef() {
        return null;
    }

    /**
     * An optional identifer to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#prefix DaemonSetV1#prefix}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#secret_ref DaemonSetV1#secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecContainerEnvFrom> {
        imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef configMapRef;
        java.lang.String prefix;
        imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef secretRef;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom#getConfigMapRef}
         * @param configMapRef config_map_ref block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#config_map_ref DaemonSetV1#config_map_ref}
         * @return {@code this}
         */
        public Builder configMapRef(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom#getPrefix}
         * @param prefix An optional identifer to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#prefix DaemonSetV1#prefix}
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom#getSecretRef}
         * @param secretRef secret_ref block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#secret_ref DaemonSetV1#secret_ref}
         * @return {@code this}
         */
        public Builder secretRef(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecContainerEnvFrom build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecContainerEnvFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecContainerEnvFrom {
        private final imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef configMapRef;
        private final java.lang.String prefix;
        private final imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapRef = software.amazon.jsii.Kernel.get(this, "configMapRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapRef = builder.configMapRef;
            this.prefix = builder.prefix;
            this.secretRef = builder.secretRef;
        }

        @Override
        public final imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromConfigMapRef getConfigMapRef() {
            return this.configMapRef;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFromSecretRef getSecretRef() {
            return this.secretRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMapRef() != null) {
                data.set("configMapRef", om.valueToTree(this.getConfigMapRef()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecContainerEnvFrom.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecContainerEnvFrom.Jsii$Proxy) o;

            if (this.configMapRef != null ? !this.configMapRef.equals(that.configMapRef) : that.configMapRef != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMapRef != null ? this.configMapRef.hashCode() : 0;
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
