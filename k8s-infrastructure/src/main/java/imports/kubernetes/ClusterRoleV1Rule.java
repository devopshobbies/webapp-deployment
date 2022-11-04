package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.781Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ClusterRoleV1Rule")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleV1Rule.Jsii$Proxy.class)
public interface ClusterRoleV1Rule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.
     * <p>
     * VerbAll represents all kinds.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#verbs ClusterRoleV1#verbs}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * APIGroups is the name of the APIGroup that contains the resources.
     * <p>
     * If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#api_groups ClusterRoleV1#api_groups}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApiGroups() {
        return null;
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.
     * <p>
     * *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"), but not both.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#non_resource_urls ClusterRoleV1#non_resource_urls}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNonResourceUrls() {
        return null;
    }

    /**
     * ResourceNames is an optional white list of names that the rule applies to.
     * <p>
     * An empty set means that everything is allowed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#resource_names ClusterRoleV1#resource_names}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceNames() {
        return null;
    }

    /**
     * Resources is a list of resources this rule applies to. ResourceAll represents all resources.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#resources ClusterRoleV1#resources}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResources() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleV1Rule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleV1Rule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterRoleV1Rule> {
        java.util.List<java.lang.String> verbs;
        java.util.List<java.lang.String> apiGroups;
        java.util.List<java.lang.String> nonResourceUrls;
        java.util.List<java.lang.String> resourceNames;
        java.util.List<java.lang.String> resources;

        /**
         * Sets the value of {@link ClusterRoleV1Rule#getVerbs}
         * @param verbs Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule. This parameter is required.
         *              VerbAll represents all kinds.
         *              <p>
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#verbs ClusterRoleV1#verbs}
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1Rule#getApiGroups}
         * @param apiGroups APIGroups is the name of the APIGroup that contains the resources.
         *                  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#api_groups ClusterRoleV1#api_groups}
         * @return {@code this}
         */
        public Builder apiGroups(java.util.List<java.lang.String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1Rule#getNonResourceUrls}
         * @param nonResourceUrls NonResourceURLs is a set of partial urls that a user should have access to.
         *                        *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"), but not both.
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#non_resource_urls ClusterRoleV1#non_resource_urls}
         * @return {@code this}
         */
        public Builder nonResourceUrls(java.util.List<java.lang.String> nonResourceUrls) {
            this.nonResourceUrls = nonResourceUrls;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1Rule#getResourceNames}
         * @param resourceNames ResourceNames is an optional white list of names that the rule applies to.
         *                      An empty set means that everything is allowed.
         *                      <p>
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#resource_names ClusterRoleV1#resource_names}
         * @return {@code this}
         */
        public Builder resourceNames(java.util.List<java.lang.String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1Rule#getResources}
         * @param resources Resources is a list of resources this rule applies to. ResourceAll represents all resources.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#resources ClusterRoleV1#resources}
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleV1Rule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterRoleV1Rule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterRoleV1Rule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleV1Rule {
        private final java.util.List<java.lang.String> verbs;
        private final java.util.List<java.lang.String> apiGroups;
        private final java.util.List<java.lang.String> nonResourceUrls;
        private final java.util.List<java.lang.String> resourceNames;
        private final java.util.List<java.lang.String> resources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.verbs = software.amazon.jsii.Kernel.get(this, "verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.apiGroups = software.amazon.jsii.Kernel.get(this, "apiGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nonResourceUrls = software.amazon.jsii.Kernel.get(this, "nonResourceUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resourceNames = software.amazon.jsii.Kernel.get(this, "resourceNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.verbs = java.util.Objects.requireNonNull(builder.verbs, "verbs is required");
            this.apiGroups = builder.apiGroups;
            this.nonResourceUrls = builder.nonResourceUrls;
            this.resourceNames = builder.resourceNames;
            this.resources = builder.resources;
        }

        @Override
        public final java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        public final java.util.List<java.lang.String> getApiGroups() {
            return this.apiGroups;
        }

        @Override
        public final java.util.List<java.lang.String> getNonResourceUrls() {
            return this.nonResourceUrls;
        }

        @Override
        public final java.util.List<java.lang.String> getResourceNames() {
            return this.resourceNames;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("verbs", om.valueToTree(this.getVerbs()));
            if (this.getApiGroups() != null) {
                data.set("apiGroups", om.valueToTree(this.getApiGroups()));
            }
            if (this.getNonResourceUrls() != null) {
                data.set("nonResourceUrls", om.valueToTree(this.getNonResourceUrls()));
            }
            if (this.getResourceNames() != null) {
                data.set("resourceNames", om.valueToTree(this.getResourceNames()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ClusterRoleV1Rule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleV1Rule.Jsii$Proxy that = (ClusterRoleV1Rule.Jsii$Proxy) o;

            if (!verbs.equals(that.verbs)) return false;
            if (this.apiGroups != null ? !this.apiGroups.equals(that.apiGroups) : that.apiGroups != null) return false;
            if (this.nonResourceUrls != null ? !this.nonResourceUrls.equals(that.nonResourceUrls) : that.nonResourceUrls != null) return false;
            if (this.resourceNames != null ? !this.resourceNames.equals(that.resourceNames) : that.resourceNames != null) return false;
            return this.resources != null ? this.resources.equals(that.resources) : that.resources == null;
        }

        @Override
        public final int hashCode() {
            int result = this.verbs.hashCode();
            result = 31 * result + (this.apiGroups != null ? this.apiGroups.hashCode() : 0);
            result = 31 * result + (this.nonResourceUrls != null ? this.nonResourceUrls.hashCode() : 0);
            result = 31 * result + (this.resourceNames != null ? this.resourceNames.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            return result;
        }
    }
}
