package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.924Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecDefaultBackend")
@software.amazon.jsii.Jsii.Proxy(IngressV1SpecDefaultBackend.Jsii$Proxy.class)
public interface IngressV1SpecDefaultBackend extends software.amazon.jsii.JsiiSerializable {

    /**
     * resource block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#resource IngressV1#resource}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackendResource getResource() {
        return null;
    }

    /**
     * service block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#service IngressV1#service}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackendService getService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressV1SpecDefaultBackend}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1SpecDefaultBackend}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1SpecDefaultBackend> {
        imports.kubernetes.IngressV1SpecDefaultBackendResource resource;
        imports.kubernetes.IngressV1SpecDefaultBackendService service;

        /**
         * Sets the value of {@link IngressV1SpecDefaultBackend#getResource}
         * @param resource resource block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#resource IngressV1#resource}
         * @return {@code this}
         */
        public Builder resource(imports.kubernetes.IngressV1SpecDefaultBackendResource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecDefaultBackend#getService}
         * @param service service block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#service IngressV1#service}
         * @return {@code this}
         */
        public Builder service(imports.kubernetes.IngressV1SpecDefaultBackendService service) {
            this.service = service;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1SpecDefaultBackend}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1SpecDefaultBackend build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1SpecDefaultBackend}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1SpecDefaultBackend {
        private final imports.kubernetes.IngressV1SpecDefaultBackendResource resource;
        private final imports.kubernetes.IngressV1SpecDefaultBackendService service;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendResource.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendService.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = builder.resource;
            this.service = builder.service;
        }

        @Override
        public final imports.kubernetes.IngressV1SpecDefaultBackendResource getResource() {
            return this.resource;
        }

        @Override
        public final imports.kubernetes.IngressV1SpecDefaultBackendService getService() {
            return this.service;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1SpecDefaultBackend"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1SpecDefaultBackend.Jsii$Proxy that = (IngressV1SpecDefaultBackend.Jsii$Proxy) o;

            if (this.resource != null ? !this.resource.equals(that.resource) : that.resource != null) return false;
            return this.service != null ? this.service.equals(that.service) : that.service == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resource != null ? this.resource.hashCode() : 0;
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            return result;
        }
    }
}
