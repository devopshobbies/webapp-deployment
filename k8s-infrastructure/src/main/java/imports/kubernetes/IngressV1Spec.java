package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.924Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1Spec")
@software.amazon.jsii.Jsii.Proxy(IngressV1Spec.Jsii$Proxy.class)
public interface IngressV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * default_backend block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#default_backend IngressV1#default_backend}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackend getDefaultBackend() {
        return null;
    }

    /**
     * IngressClassName is the name of the IngressClass cluster resource.
     * <p>
     * The associated IngressClass defines which controller will implement the resource. This replaces the deprecated <code>kubernetes.io/ingress.class</code> annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#ingress_class_name IngressV1#ingress_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIngressClassName() {
        return null;
    }

    /**
     * rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#rule IngressV1#rule}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRule() {
        return null;
    }

    /**
     * tls block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#tls IngressV1#tls}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1Spec> {
        imports.kubernetes.IngressV1SpecDefaultBackend defaultBackend;
        java.lang.String ingressClassName;
        java.lang.Object rule;
        java.lang.Object tls;

        /**
         * Sets the value of {@link IngressV1Spec#getDefaultBackend}
         * @param defaultBackend default_backend block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#default_backend IngressV1#default_backend}
         * @return {@code this}
         */
        public Builder defaultBackend(imports.kubernetes.IngressV1SpecDefaultBackend defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1Spec#getIngressClassName}
         * @param ingressClassName IngressClassName is the name of the IngressClass cluster resource.
         *                         The associated IngressClass defines which controller will implement the resource. This replaces the deprecated <code>kubernetes.io/ingress.class</code> annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
         *                         <p>
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#ingress_class_name IngressV1#ingress_class_name}
         * @return {@code this}
         */
        public Builder ingressClassName(java.lang.String ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1Spec#getRule}
         * @param rule rule block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#rule IngressV1#rule}
         * @return {@code this}
         */
        public Builder rule(com.hashicorp.cdktf.IResolvable rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1Spec#getRule}
         * @param rule rule block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#rule IngressV1#rule}
         * @return {@code this}
         */
        public Builder rule(java.util.List<? extends imports.kubernetes.IngressV1SpecRule> rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1Spec#getTls}
         * @param tls tls block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#tls IngressV1#tls}
         * @return {@code this}
         */
        public Builder tls(com.hashicorp.cdktf.IResolvable tls) {
            this.tls = tls;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1Spec#getTls}
         * @param tls tls block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#tls IngressV1#tls}
         * @return {@code this}
         */
        public Builder tls(java.util.List<? extends imports.kubernetes.IngressV1SpecTls> tls) {
            this.tls = tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1Spec {
        private final imports.kubernetes.IngressV1SpecDefaultBackend defaultBackend;
        private final java.lang.String ingressClassName;
        private final java.lang.Object rule;
        private final java.lang.Object tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultBackend = software.amazon.jsii.Kernel.get(this, "defaultBackend", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackend.class));
            this.ingressClassName = software.amazon.jsii.Kernel.get(this, "ingressClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tls = software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultBackend = builder.defaultBackend;
            this.ingressClassName = builder.ingressClassName;
            this.rule = builder.rule;
            this.tls = builder.tls;
        }

        @Override
        public final imports.kubernetes.IngressV1SpecDefaultBackend getDefaultBackend() {
            return this.defaultBackend;
        }

        @Override
        public final java.lang.String getIngressClassName() {
            return this.ingressClassName;
        }

        @Override
        public final java.lang.Object getRule() {
            return this.rule;
        }

        @Override
        public final java.lang.Object getTls() {
            return this.tls;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultBackend() != null) {
                data.set("defaultBackend", om.valueToTree(this.getDefaultBackend()));
            }
            if (this.getIngressClassName() != null) {
                data.set("ingressClassName", om.valueToTree(this.getIngressClassName()));
            }
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
            }
            if (this.getTls() != null) {
                data.set("tls", om.valueToTree(this.getTls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1Spec.Jsii$Proxy that = (IngressV1Spec.Jsii$Proxy) o;

            if (this.defaultBackend != null ? !this.defaultBackend.equals(that.defaultBackend) : that.defaultBackend != null) return false;
            if (this.ingressClassName != null ? !this.ingressClassName.equals(that.ingressClassName) : that.ingressClassName != null) return false;
            if (this.rule != null ? !this.rule.equals(that.rule) : that.rule != null) return false;
            return this.tls != null ? this.tls.equals(that.tls) : that.tls == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultBackend != null ? this.defaultBackend.hashCode() : 0;
            result = 31 * result + (this.ingressClassName != null ? this.ingressClassName.hashCode() : 0);
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            result = 31 * result + (this.tls != null ? this.tls.hashCode() : 0);
            return result;
        }
    }
}
