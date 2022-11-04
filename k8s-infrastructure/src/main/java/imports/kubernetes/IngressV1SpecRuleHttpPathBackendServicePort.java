package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.934Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecRuleHttpPathBackendServicePort")
@software.amazon.jsii.Jsii.Proxy(IngressV1SpecRuleHttpPathBackendServicePort.Jsii$Proxy.class)
public interface IngressV1SpecRuleHttpPathBackendServicePort extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the name of the port of the referenced service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#name IngressV1#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Specifies the numerical port of the referenced service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#number IngressV1#number}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumber() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressV1SpecRuleHttpPathBackendServicePort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1SpecRuleHttpPathBackendServicePort}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1SpecRuleHttpPathBackendServicePort> {
        java.lang.String name;
        java.lang.Number number;

        /**
         * Sets the value of {@link IngressV1SpecRuleHttpPathBackendServicePort#getName}
         * @param name Specifies the name of the port of the referenced service.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#name IngressV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecRuleHttpPathBackendServicePort#getNumber}
         * @param number Specifies the numerical port of the referenced service.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#number IngressV1#number}
         * @return {@code this}
         */
        public Builder number(java.lang.Number number) {
            this.number = number;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1SpecRuleHttpPathBackendServicePort}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1SpecRuleHttpPathBackendServicePort build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1SpecRuleHttpPathBackendServicePort}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1SpecRuleHttpPathBackendServicePort {
        private final java.lang.String name;
        private final java.lang.Number number;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.number = software.amazon.jsii.Kernel.get(this, "number", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.number = builder.number;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getNumber() {
            return this.number;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNumber() != null) {
                data.set("number", om.valueToTree(this.getNumber()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1SpecRuleHttpPathBackendServicePort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1SpecRuleHttpPathBackendServicePort.Jsii$Proxy that = (IngressV1SpecRuleHttpPathBackendServicePort.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.number != null ? this.number.equals(that.number) : that.number == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.number != null ? this.number.hashCode() : 0);
            return result;
        }
    }
}
