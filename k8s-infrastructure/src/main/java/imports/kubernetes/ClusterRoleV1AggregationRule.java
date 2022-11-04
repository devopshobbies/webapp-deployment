package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.776Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ClusterRoleV1AggregationRule")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleV1AggregationRule.Jsii$Proxy.class)
public interface ClusterRoleV1AggregationRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * cluster_role_selectors block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#cluster_role_selectors ClusterRoleV1#cluster_role_selectors}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getClusterRoleSelectors() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleV1AggregationRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleV1AggregationRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterRoleV1AggregationRule> {
        java.lang.Object clusterRoleSelectors;

        /**
         * Sets the value of {@link ClusterRoleV1AggregationRule#getClusterRoleSelectors}
         * @param clusterRoleSelectors cluster_role_selectors block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#cluster_role_selectors ClusterRoleV1#cluster_role_selectors}
         * @return {@code this}
         */
        public Builder clusterRoleSelectors(com.hashicorp.cdktf.IResolvable clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1AggregationRule#getClusterRoleSelectors}
         * @param clusterRoleSelectors cluster_role_selectors block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#cluster_role_selectors ClusterRoleV1#cluster_role_selectors}
         * @return {@code this}
         */
        public Builder clusterRoleSelectors(java.util.List<? extends imports.kubernetes.ClusterRoleV1AggregationRuleClusterRoleSelectors> clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleV1AggregationRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterRoleV1AggregationRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterRoleV1AggregationRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleV1AggregationRule {
        private final java.lang.Object clusterRoleSelectors;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clusterRoleSelectors = software.amazon.jsii.Kernel.get(this, "clusterRoleSelectors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterRoleSelectors = builder.clusterRoleSelectors;
        }

        @Override
        public final java.lang.Object getClusterRoleSelectors() {
            return this.clusterRoleSelectors;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClusterRoleSelectors() != null) {
                data.set("clusterRoleSelectors", om.valueToTree(this.getClusterRoleSelectors()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ClusterRoleV1AggregationRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleV1AggregationRule.Jsii$Proxy that = (ClusterRoleV1AggregationRule.Jsii$Proxy) o;

            return this.clusterRoleSelectors != null ? this.clusterRoleSelectors.equals(that.clusterRoleSelectors) : that.clusterRoleSelectors == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterRoleSelectors != null ? this.clusterRoleSelectors.hashCode() : 0;
            return result;
        }
    }
}
