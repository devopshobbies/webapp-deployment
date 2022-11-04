package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.874Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ResourceQuotaSpec")
@software.amazon.jsii.Jsii.Proxy(ResourceQuotaSpec.Jsii$Proxy.class)
public interface ResourceQuotaSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * The set of desired hard limits for each named resource. More info: http://releases.k8s.io/HEAD/docs/design/admission_control_resource_quota.md#admissioncontrol-plugin-resourcequota.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#hard ResourceQuota#hard}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getHard() {
        return null;
    }

    /**
     * A collection of filters that must match each object tracked by a quota.
     * <p>
     * If not specified, the quota matches all objects.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#scopes ResourceQuota#scopes}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getScopes() {
        return null;
    }

    /**
     * scope_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#scope_selector ResourceQuota#scope_selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ResourceQuotaSpecScopeSelector getScopeSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceQuotaSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceQuotaSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceQuotaSpec> {
        java.util.Map<java.lang.String, java.lang.String> hard;
        java.util.List<java.lang.String> scopes;
        imports.kubernetes.ResourceQuotaSpecScopeSelector scopeSelector;

        /**
         * Sets the value of {@link ResourceQuotaSpec#getHard}
         * @param hard The set of desired hard limits for each named resource. More info: http://releases.k8s.io/HEAD/docs/design/admission_control_resource_quota.md#admissioncontrol-plugin-resourcequota.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#hard ResourceQuota#hard}
         * @return {@code this}
         */
        public Builder hard(java.util.Map<java.lang.String, java.lang.String> hard) {
            this.hard = hard;
            return this;
        }

        /**
         * Sets the value of {@link ResourceQuotaSpec#getScopes}
         * @param scopes A collection of filters that must match each object tracked by a quota.
         *               If not specified, the quota matches all objects.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#scopes ResourceQuota#scopes}
         * @return {@code this}
         */
        public Builder scopes(java.util.List<java.lang.String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * Sets the value of {@link ResourceQuotaSpec#getScopeSelector}
         * @param scopeSelector scope_selector block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota#scope_selector ResourceQuota#scope_selector}
         * @return {@code this}
         */
        public Builder scopeSelector(imports.kubernetes.ResourceQuotaSpecScopeSelector scopeSelector) {
            this.scopeSelector = scopeSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceQuotaSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceQuotaSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceQuotaSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceQuotaSpec {
        private final java.util.Map<java.lang.String, java.lang.String> hard;
        private final java.util.List<java.lang.String> scopes;
        private final imports.kubernetes.ResourceQuotaSpecScopeSelector scopeSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hard = software.amazon.jsii.Kernel.get(this, "hard", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scopes = software.amazon.jsii.Kernel.get(this, "scopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scopeSelector = software.amazon.jsii.Kernel.get(this, "scopeSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ResourceQuotaSpecScopeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hard = builder.hard;
            this.scopes = builder.scopes;
            this.scopeSelector = builder.scopeSelector;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getHard() {
            return this.hard;
        }

        @Override
        public final java.util.List<java.lang.String> getScopes() {
            return this.scopes;
        }

        @Override
        public final imports.kubernetes.ResourceQuotaSpecScopeSelector getScopeSelector() {
            return this.scopeSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHard() != null) {
                data.set("hard", om.valueToTree(this.getHard()));
            }
            if (this.getScopes() != null) {
                data.set("scopes", om.valueToTree(this.getScopes()));
            }
            if (this.getScopeSelector() != null) {
                data.set("scopeSelector", om.valueToTree(this.getScopeSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ResourceQuotaSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceQuotaSpec.Jsii$Proxy that = (ResourceQuotaSpec.Jsii$Proxy) o;

            if (this.hard != null ? !this.hard.equals(that.hard) : that.hard != null) return false;
            if (this.scopes != null ? !this.scopes.equals(that.scopes) : that.scopes != null) return false;
            return this.scopeSelector != null ? this.scopeSelector.equals(that.scopeSelector) : that.scopeSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hard != null ? this.hard.hashCode() : 0;
            result = 31 * result + (this.scopes != null ? this.scopes.hashCode() : 0);
            result = 31 * result + (this.scopeSelector != null ? this.scopeSelector.hashCode() : 0);
            return result;
        }
    }
}
