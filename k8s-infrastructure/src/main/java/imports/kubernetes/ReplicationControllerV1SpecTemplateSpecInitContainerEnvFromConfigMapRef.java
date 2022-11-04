package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.820Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef.Jsii$Proxy.class)
public interface ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#name ReplicationControllerV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Specify whether the ConfigMap must be defined.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#optional ReplicationControllerV1#optional}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef> {
        java.lang.String name;
        java.lang.Object optional;

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef#getName}
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#name ReplicationControllerV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef#getOptional}
         * @param optional Specify whether the ConfigMap must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#optional ReplicationControllerV1#optional}
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef#getOptional}
         * @param optional Specify whether the ConfigMap must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#optional ReplicationControllerV1#optional}
         * @return {@code this}
         */
        public Builder optional(com.hashicorp.cdktf.IResolvable optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef {
        private final java.lang.String name;
        private final java.lang.Object optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.optional = builder.optional;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef.Jsii$Proxy that = (ReplicationControllerV1SpecTemplateSpecInitContainerEnvFromConfigMapRef.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
