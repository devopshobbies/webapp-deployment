package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.805Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1SpecTemplateSpecContainerResources")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1SpecTemplateSpecContainerResources.Jsii$Proxy.class)
public interface ReplicationControllerV1SpecTemplateSpecContainerResources extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes the maximum amount of compute resources allowed. More info: http://kubernetes.io/docs/user-guide/compute-resources/.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#limits ReplicationControllerV1#limits}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLimits() {
        return null;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * <p>
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#requests ReplicationControllerV1#requests}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1SpecTemplateSpecContainerResources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1SpecTemplateSpecContainerResources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1SpecTemplateSpecContainerResources> {
        java.util.Map<java.lang.String, java.lang.String> limits;
        java.util.Map<java.lang.String, java.lang.String> requests;

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecContainerResources#getLimits}
         * @param limits Describes the maximum amount of compute resources allowed. More info: http://kubernetes.io/docs/user-guide/compute-resources/.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#limits ReplicationControllerV1#limits}
         * @return {@code this}
         */
        public Builder limits(java.util.Map<java.lang.String, java.lang.String> limits) {
            this.limits = limits;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1SpecTemplateSpecContainerResources#getRequests}
         * @param requests Requests describes the minimum amount of compute resources required.
         *                 If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#requests ReplicationControllerV1#requests}
         * @return {@code this}
         */
        public Builder requests(java.util.Map<java.lang.String, java.lang.String> requests) {
            this.requests = requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1SpecTemplateSpecContainerResources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1SpecTemplateSpecContainerResources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1SpecTemplateSpecContainerResources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1SpecTemplateSpecContainerResources {
        private final java.util.Map<java.lang.String, java.lang.String> limits;
        private final java.util.Map<java.lang.String, java.lang.String> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limits = software.amazon.jsii.Kernel.get(this, "limits", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limits = builder.limits;
            this.requests = builder.requests;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLimits() {
            return this.limits;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLimits() != null) {
                data.set("limits", om.valueToTree(this.getLimits()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1SpecTemplateSpecContainerResources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1SpecTemplateSpecContainerResources.Jsii$Proxy that = (ReplicationControllerV1SpecTemplateSpecContainerResources.Jsii$Proxy) o;

            if (this.limits != null ? !this.limits.equals(that.limits) : that.limits != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limits != null ? this.limits.hashCode() : 0;
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
