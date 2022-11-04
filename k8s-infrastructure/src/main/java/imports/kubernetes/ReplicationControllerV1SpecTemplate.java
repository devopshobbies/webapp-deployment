package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.772Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1SpecTemplate")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1SpecTemplate.Jsii$Proxy.class)
public interface ReplicationControllerV1SpecTemplate extends software.amazon.jsii.JsiiSerializable {

    /**
     * metadata block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#metadata ReplicationControllerV1#metadata}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata getMetadata();

    /**
     * spec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#spec ReplicationControllerV1#spec}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateSpec getSpec();

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1SpecTemplate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1SpecTemplate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1SpecTemplate> {
        imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata metadata;
        imports.kubernetes.ReplicationControllerV1SpecTemplateSpec spec;

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplate#getMetadata}
         * @param metadata metadata block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#metadata ReplicationControllerV1#metadata}
         * @return {@code this}
         */
        public Builder metadata(imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplate#getSpec}
         * @param spec spec block. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#spec ReplicationControllerV1#spec}
         * @return {@code this}
         */
        public Builder spec(imports.kubernetes.ReplicationControllerV1SpecTemplateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1SpecTemplate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1SpecTemplate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1SpecTemplate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1SpecTemplate {
        private final imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata metadata;
        private final imports.kubernetes.ReplicationControllerV1SpecTemplateSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = java.util.Objects.requireNonNull(builder.metadata, "metadata is required");
            this.spec = java.util.Objects.requireNonNull(builder.spec, "spec is required");
        }

        @Override
        public final imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerV1SpecTemplateSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metadata", om.valueToTree(this.getMetadata()));
            data.set("spec", om.valueToTree(this.getSpec()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1SpecTemplate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1SpecTemplate.Jsii$Proxy that = (ReplicationControllerV1SpecTemplate.Jsii$Proxy) o;

            if (!metadata.equals(that.metadata)) return false;
            return this.spec.equals(that.spec);
        }

        @Override
        public final int hashCode() {
            int result = this.metadata.hashCode();
            result = 31 * result + (this.spec.hashCode());
            return result;
        }
    }
}
