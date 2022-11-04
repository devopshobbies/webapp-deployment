package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.888Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.RoleBindingV1RoleRef")
@software.amazon.jsii.Jsii.Proxy(RoleBindingV1RoleRef.Jsii$Proxy.class)
public interface RoleBindingV1RoleRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * The API group of the user. The only value possible at the moment is `rbac.authorization.k8s.io`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#api_group RoleBindingV1#api_group}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiGroup();

    /**
     * The kind of resource.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#kind RoleBindingV1#kind}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * The name of the User to bind to.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#name RoleBindingV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link RoleBindingV1RoleRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RoleBindingV1RoleRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RoleBindingV1RoleRef> {
        java.lang.String apiGroup;
        java.lang.String kind;
        java.lang.String name;

        /**
         * Sets the value of {@link RoleBindingV1RoleRef#getApiGroup}
         * @param apiGroup The API group of the user. The only value possible at the moment is `rbac.authorization.k8s.io`. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#api_group RoleBindingV1#api_group}
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link RoleBindingV1RoleRef#getKind}
         * @param kind The kind of resource. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#kind RoleBindingV1#kind}
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link RoleBindingV1RoleRef#getName}
         * @param name The name of the User to bind to. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/role_binding_v1#name RoleBindingV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RoleBindingV1RoleRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RoleBindingV1RoleRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RoleBindingV1RoleRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RoleBindingV1RoleRef {
        private final java.lang.String apiGroup;
        private final java.lang.String kind;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroup = software.amazon.jsii.Kernel.get(this, "apiGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroup = java.util.Objects.requireNonNull(builder.apiGroup, "apiGroup is required");
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getApiGroup() {
            return this.apiGroup;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiGroup", om.valueToTree(this.getApiGroup()));
            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.RoleBindingV1RoleRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RoleBindingV1RoleRef.Jsii$Proxy that = (RoleBindingV1RoleRef.Jsii$Proxy) o;

            if (!apiGroup.equals(that.apiGroup)) return false;
            if (!kind.equals(that.kind)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.apiGroup.hashCode();
            result = 31 * result + (this.kind.hashCode());
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
