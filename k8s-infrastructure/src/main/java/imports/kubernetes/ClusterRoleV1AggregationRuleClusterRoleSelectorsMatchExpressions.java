package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.777Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions.Jsii$Proxy.class)
public interface ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions extends software.amazon.jsii.JsiiSerializable {

    /**
     * The label key that the selector applies to.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#key ClusterRoleV1#key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * A key's relationship to a set of values. Valid operators ard `In`, `NotIn`, `Exists` and `DoesNotExist`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#operator ClusterRoleV1#operator}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperator() {
        return null;
    }

    /**
     * An array of string values.
     * <p>
     * If the operator is <code>In</code> or <code>NotIn</code>, the values array must be non-empty. If the operator is <code>Exists</code> or <code>DoesNotExist</code>, the values array must be empty. This array is replaced during a strategic merge patch.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#values ClusterRoleV1#values}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions> {
        java.lang.String key;
        java.lang.String operator;
        java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions#getKey}
         * @param key The label key that the selector applies to.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#key ClusterRoleV1#key}
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions#getOperator}
         * @param operator A key's relationship to a set of values. Valid operators ard `In`, `NotIn`, `Exists` and `DoesNotExist`.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#operator ClusterRoleV1#operator}
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions#getValues}
         * @param values An array of string values.
         *               If the operator is <code>In</code> or <code>NotIn</code>, the values array must be non-empty. If the operator is <code>Exists</code> or <code>DoesNotExist</code>, the values array must be empty. This array is replaced during a strategic merge patch.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cluster_role_v1#values ClusterRoleV1#values}
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions {
        private final java.lang.String key;
        private final java.lang.String operator;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
            this.operator = builder.operator;
            this.values = builder.values;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getOperator() != null) {
                data.set("operator", om.valueToTree(this.getOperator()));
            }
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions.Jsii$Proxy that = (ClusterRoleV1AggregationRuleClusterRoleSelectorsMatchExpressions.Jsii$Proxy) o;

            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.operator != null ? !this.operator.equals(that.operator) : that.operator != null) return false;
            return this.values != null ? this.values.equals(that.values) : that.values == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            result = 31 * result + (this.operator != null ? this.operator.hashCode() : 0);
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            return result;
        }
    }
}
