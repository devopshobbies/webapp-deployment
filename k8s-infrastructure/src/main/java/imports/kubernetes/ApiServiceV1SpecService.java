package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.723Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ApiServiceV1SpecService")
@software.amazon.jsii.Jsii.Proxy(ApiServiceV1SpecService.Jsii$Proxy.class)
public interface ApiServiceV1SpecService extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the name of the service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#name ApiServiceV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Namespace is the namespace of the service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#namespace ApiServiceV1#namespace}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    /**
     * If specified, the port on the service that is hosting the service.
     * <p>
     * Defaults to 443 for backward compatibility. Should be a valid port number (1-65535, inclusive).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#port ApiServiceV1#port}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiServiceV1SpecService}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiServiceV1SpecService}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiServiceV1SpecService> {
        java.lang.String name;
        java.lang.String namespace;
        java.lang.Number port;

        /**
         * Sets the value of {@link ApiServiceV1SpecService#getName}
         * @param name Name is the name of the service. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#name ApiServiceV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1SpecService#getNamespace}
         * @param namespace Namespace is the namespace of the service. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#namespace ApiServiceV1#namespace}
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1SpecService#getPort}
         * @param port If specified, the port on the service that is hosting the service.
         *             Defaults to 443 for backward compatibility. Should be a valid port number (1-65535, inclusive).
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#port ApiServiceV1#port}
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiServiceV1SpecService}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiServiceV1SpecService build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiServiceV1SpecService}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiServiceV1SpecService {
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.Number port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.namespace = java.util.Objects.requireNonNull(builder.namespace, "namespace is required");
            this.port = builder.port;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ApiServiceV1SpecService"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiServiceV1SpecService.Jsii$Proxy that = (ApiServiceV1SpecService.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!namespace.equals(that.namespace)) return false;
            return this.port != null ? this.port.equals(that.port) : that.port == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.namespace.hashCode());
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            return result;
        }
    }
}
