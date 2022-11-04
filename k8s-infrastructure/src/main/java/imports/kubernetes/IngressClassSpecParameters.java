package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.911Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressClassSpecParameters")
@software.amazon.jsii.Jsii.Proxy(IngressClassSpecParameters.Jsii$Proxy.class)
public interface IngressClassSpecParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * Kind is the type of resource being referenced.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#kind IngressClass#kind}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name is the name of resource being referenced.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#name IngressClass#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * APIGroup is the group for the resource being referenced.
     * <p>
     * If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#api_group IngressClass#api_group}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiGroup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#namespace IngressClass#namespace}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#scope IngressClass#scope}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScope() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressClassSpecParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressClassSpecParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressClassSpecParameters> {
        java.lang.String kind;
        java.lang.String name;
        java.lang.String apiGroup;
        java.lang.String namespace;
        java.lang.String scope;

        /**
         * Sets the value of {@link IngressClassSpecParameters#getKind}
         * @param kind Kind is the type of resource being referenced. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#kind IngressClass#kind}
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassSpecParameters#getName}
         * @param name Name is the name of resource being referenced. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#name IngressClass#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassSpecParameters#getApiGroup}
         * @param apiGroup APIGroup is the group for the resource being referenced.
         *                 If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#api_group IngressClass#api_group}
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassSpecParameters#getNamespace}
         * @param namespace Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#namespace IngressClass#namespace}.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassSpecParameters#getScope}
         * @param scope Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/ingress_class#scope IngressClass#scope}.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressClassSpecParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressClassSpecParameters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressClassSpecParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressClassSpecParameters {
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String apiGroup;
        private final java.lang.String namespace;
        private final java.lang.String scope;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiGroup = software.amazon.jsii.Kernel.get(this, "apiGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.apiGroup = builder.apiGroup;
            this.namespace = builder.namespace;
            this.scope = builder.scope;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getApiGroup() {
            return this.apiGroup;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getApiGroup() != null) {
                data.set("apiGroup", om.valueToTree(this.getApiGroup()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getScope() != null) {
                data.set("scope", om.valueToTree(this.getScope()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressClassSpecParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressClassSpecParameters.Jsii$Proxy that = (IngressClassSpecParameters.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (!name.equals(that.name)) return false;
            if (this.apiGroup != null ? !this.apiGroup.equals(that.apiGroup) : that.apiGroup != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            return this.scope != null ? this.scope.equals(that.scope) : that.scope == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.apiGroup != null ? this.apiGroup.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            return result;
        }
    }
}
