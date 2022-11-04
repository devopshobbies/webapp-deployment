package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.681Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Resource to select.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource ReplicationController#resource}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#container_name ReplicationController#container_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContainerName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#divisor ReplicationController#divisor}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDivisor() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef> {
        java.lang.String resource;
        java.lang.String containerName;
        java.lang.String divisor;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef#getResource}
         * @param resource Resource to select. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#resource ReplicationController#resource}
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef#getContainerName}
         * @param containerName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#container_name ReplicationController#container_name}.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef#getDivisor}
         * @param divisor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#divisor ReplicationController#divisor}.
         * @return {@code this}
         */
        public Builder divisor(java.lang.String divisor) {
            this.divisor = divisor;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef {
        private final java.lang.String resource;
        private final java.lang.String containerName;
        private final java.lang.String divisor;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.divisor = software.amazon.jsii.Kernel.get(this, "divisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = java.util.Objects.requireNonNull(builder.resource, "resource is required");
            this.containerName = builder.containerName;
            this.divisor = builder.divisor;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public final java.lang.String getDivisor() {
            return this.divisor;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getContainerName() != null) {
                data.set("containerName", om.valueToTree(this.getContainerName()));
            }
            if (this.getDivisor() != null) {
                data.set("divisor", om.valueToTree(this.getDivisor()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecContainerEnvValueFromResourceFieldRef.Jsii$Proxy) o;

            if (!resource.equals(that.resource)) return false;
            if (this.containerName != null ? !this.containerName.equals(that.containerName) : that.containerName != null) return false;
            return this.divisor != null ? this.divisor.equals(that.divisor) : that.divisor == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resource.hashCode();
            result = 31 * result + (this.containerName != null ? this.containerName.hashCode() : 0);
            result = 31 * result + (this.divisor != null ? this.divisor.hashCode() : 0);
            return result;
        }
    }
}
