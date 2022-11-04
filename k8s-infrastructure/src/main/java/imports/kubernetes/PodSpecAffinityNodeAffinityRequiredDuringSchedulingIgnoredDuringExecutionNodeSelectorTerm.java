package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.314Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm")
@software.amazon.jsii.Jsii.Proxy(PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm.Jsii$Proxy.class)
public interface PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_expressions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#match_expressions Pod#match_expressions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm> {
        java.lang.Object matchExpressions;

        /**
         * Sets the value of {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#match_expressions Pod#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(com.hashicorp.cdktf.IResolvable matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#match_expressions Pod#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(java.util.List<? extends imports.kubernetes.PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm {
        private final java.lang.Object matchExpressions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = builder.matchExpressions;
        }

        @Override
        public final java.lang.Object getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm.Jsii$Proxy that = (PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerm.Jsii$Proxy) o;

            return this.matchExpressions != null ? this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            return result;
        }
    }
}
