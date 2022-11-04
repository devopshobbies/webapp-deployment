package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.913Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressClassV1Spec")
@software.amazon.jsii.Jsii.Proxy(IngressClassV1Spec.Jsii$Proxy.class)
public interface IngressClassV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Controller refers to the name of the controller that should handle this class.
     * <p>
     * This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class_v1#controller IngressClassV1#controller}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getController() {
        return null;
    }

    /**
     * parameters block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class_v1#parameters IngressClassV1#parameters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressClassV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressClassV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressClassV1Spec> {
        java.lang.String controller;
        java.lang.Object parameters;

        /**
         * Sets the value of {@link IngressClassV1Spec#getController}
         * @param controller Controller refers to the name of the controller that should handle this class.
         *                   This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class_v1#controller IngressClassV1#controller}
         * @return {@code this}
         */
        public Builder controller(java.lang.String controller) {
            this.controller = controller;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassV1Spec#getParameters}
         * @param parameters parameters block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class_v1#parameters IngressClassV1#parameters}
         * @return {@code this}
         */
        public Builder parameters(com.hashicorp.cdktf.IResolvable parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassV1Spec#getParameters}
         * @param parameters parameters block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class_v1#parameters IngressClassV1#parameters}
         * @return {@code this}
         */
        public Builder parameters(java.util.List<? extends imports.kubernetes.IngressClassV1SpecParameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressClassV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressClassV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressClassV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressClassV1Spec {
        private final java.lang.String controller;
        private final java.lang.Object parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.controller = software.amazon.jsii.Kernel.get(this, "controller", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.controller = builder.controller;
            this.parameters = builder.parameters;
        }

        @Override
        public final java.lang.String getController() {
            return this.controller;
        }

        @Override
        public final java.lang.Object getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getController() != null) {
                data.set("controller", om.valueToTree(this.getController()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressClassV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressClassV1Spec.Jsii$Proxy that = (IngressClassV1Spec.Jsii$Proxy) o;

            if (this.controller != null ? !this.controller.equals(that.controller) : that.controller != null) return false;
            return this.parameters != null ? this.parameters.equals(that.parameters) : that.parameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.controller != null ? this.controller.hashCode() : 0;
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            return result;
        }
    }
}
