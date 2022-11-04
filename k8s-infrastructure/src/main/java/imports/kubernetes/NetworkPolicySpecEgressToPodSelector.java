package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.210Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicySpecEgressToPodSelector")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicySpecEgressToPodSelector.Jsii$Proxy.class)
public interface NetworkPolicySpecEgressToPodSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_expressions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#match_expressions NetworkPolicy#match_expressions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressions() {
        return null;
    }

    /**
     * A map of {key,value} pairs.
     * <p>
     * A single {key,value} in the matchLabels map is equivalent to an element of <code>match_expressions</code>, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#match_labels NetworkPolicy#match_labels}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMatchLabels() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicySpecEgressToPodSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicySpecEgressToPodSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicySpecEgressToPodSelector> {
        java.lang.Object matchExpressions;
        java.util.Map<java.lang.String, java.lang.String> matchLabels;

        /**
         * Sets the value of {@link NetworkPolicySpecEgressToPodSelector#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#match_expressions NetworkPolicy#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(com.hashicorp.cdktf.IResolvable matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpecEgressToPodSelector#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#match_expressions NetworkPolicy#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(java.util.List<? extends imports.kubernetes.NetworkPolicySpecEgressToPodSelectorMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpecEgressToPodSelector#getMatchLabels}
         * @param matchLabels A map of {key,value} pairs.
         *                    A single {key,value} in the matchLabels map is equivalent to an element of <code>match_expressions</code>, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#match_labels NetworkPolicy#match_labels}
         * @return {@code this}
         */
        public Builder matchLabels(java.util.Map<java.lang.String, java.lang.String> matchLabels) {
            this.matchLabels = matchLabels;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicySpecEgressToPodSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicySpecEgressToPodSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicySpecEgressToPodSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicySpecEgressToPodSelector {
        private final java.lang.Object matchExpressions;
        private final java.util.Map<java.lang.String, java.lang.String> matchLabels;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.matchLabels = software.amazon.jsii.Kernel.get(this, "matchLabels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = builder.matchExpressions;
            this.matchLabels = builder.matchLabels;
        }

        @Override
        public final java.lang.Object getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMatchLabels() {
            return this.matchLabels;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }
            if (this.getMatchLabels() != null) {
                data.set("matchLabels", om.valueToTree(this.getMatchLabels()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicySpecEgressToPodSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicySpecEgressToPodSelector.Jsii$Proxy that = (NetworkPolicySpecEgressToPodSelector.Jsii$Proxy) o;

            if (this.matchExpressions != null ? !this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions != null) return false;
            return this.matchLabels != null ? this.matchLabels.equals(that.matchLabels) : that.matchLabels == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            result = 31 * result + (this.matchLabels != null ? this.matchLabels.hashCode() : 0);
            return result;
        }
    }
}
