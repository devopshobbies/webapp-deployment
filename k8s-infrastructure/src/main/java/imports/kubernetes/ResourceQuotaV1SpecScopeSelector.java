package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.877Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ResourceQuotaV1SpecScopeSelector")
@software.amazon.jsii.Jsii.Proxy(ResourceQuotaV1SpecScopeSelector.Jsii$Proxy.class)
public interface ResourceQuotaV1SpecScopeSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_expression block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota_v1#match_expression ResourceQuotaV1#match_expression}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpression() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceQuotaV1SpecScopeSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceQuotaV1SpecScopeSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceQuotaV1SpecScopeSelector> {
        java.lang.Object matchExpression;

        /**
         * Sets the value of {@link ResourceQuotaV1SpecScopeSelector#getMatchExpression}
         * @param matchExpression match_expression block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota_v1#match_expression ResourceQuotaV1#match_expression}
         * @return {@code this}
         */
        public Builder matchExpression(com.hashicorp.cdktf.IResolvable matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * Sets the value of {@link ResourceQuotaV1SpecScopeSelector#getMatchExpression}
         * @param matchExpression match_expression block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/resource_quota_v1#match_expression ResourceQuotaV1#match_expression}
         * @return {@code this}
         */
        public Builder matchExpression(java.util.List<? extends imports.kubernetes.ResourceQuotaV1SpecScopeSelectorMatchExpression> matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceQuotaV1SpecScopeSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceQuotaV1SpecScopeSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceQuotaV1SpecScopeSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceQuotaV1SpecScopeSelector {
        private final java.lang.Object matchExpression;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpression = software.amazon.jsii.Kernel.get(this, "matchExpression", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpression = builder.matchExpression;
        }

        @Override
        public final java.lang.Object getMatchExpression() {
            return this.matchExpression;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpression() != null) {
                data.set("matchExpression", om.valueToTree(this.getMatchExpression()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ResourceQuotaV1SpecScopeSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceQuotaV1SpecScopeSelector.Jsii$Proxy that = (ResourceQuotaV1SpecScopeSelector.Jsii$Proxy) o;

            return this.matchExpression != null ? this.matchExpression.equals(that.matchExpression) : that.matchExpression == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpression != null ? this.matchExpression.hashCode() : 0;
            return result;
        }
    }
}
