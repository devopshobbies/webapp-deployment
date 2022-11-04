package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.585Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesStorageClassAllowedTopologies")
@software.amazon.jsii.Jsii.Proxy(DataKubernetesStorageClassAllowedTopologies.Jsii$Proxy.class)
public interface DataKubernetesStorageClassAllowedTopologies extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_label_expressions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class#match_label_expressions DataKubernetesStorageClass#match_label_expressions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchLabelExpressions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataKubernetesStorageClassAllowedTopologies}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataKubernetesStorageClassAllowedTopologies}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataKubernetesStorageClassAllowedTopologies> {
        java.lang.Object matchLabelExpressions;

        /**
         * Sets the value of {@link DataKubernetesStorageClassAllowedTopologies#getMatchLabelExpressions}
         * @param matchLabelExpressions match_label_expressions block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class#match_label_expressions DataKubernetesStorageClass#match_label_expressions}
         * @return {@code this}
         */
        public Builder matchLabelExpressions(com.hashicorp.cdktf.IResolvable matchLabelExpressions) {
            this.matchLabelExpressions = matchLabelExpressions;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassAllowedTopologies#getMatchLabelExpressions}
         * @param matchLabelExpressions match_label_expressions block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class#match_label_expressions DataKubernetesStorageClass#match_label_expressions}
         * @return {@code this}
         */
        public Builder matchLabelExpressions(java.util.List<? extends imports.kubernetes.DataKubernetesStorageClassAllowedTopologiesMatchLabelExpressions> matchLabelExpressions) {
            this.matchLabelExpressions = matchLabelExpressions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataKubernetesStorageClassAllowedTopologies}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataKubernetesStorageClassAllowedTopologies build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataKubernetesStorageClassAllowedTopologies}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataKubernetesStorageClassAllowedTopologies {
        private final java.lang.Object matchLabelExpressions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchLabelExpressions = software.amazon.jsii.Kernel.get(this, "matchLabelExpressions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchLabelExpressions = builder.matchLabelExpressions;
        }

        @Override
        public final java.lang.Object getMatchLabelExpressions() {
            return this.matchLabelExpressions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchLabelExpressions() != null) {
                data.set("matchLabelExpressions", om.valueToTree(this.getMatchLabelExpressions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DataKubernetesStorageClassAllowedTopologies"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataKubernetesStorageClassAllowedTopologies.Jsii$Proxy that = (DataKubernetesStorageClassAllowedTopologies.Jsii$Proxy) o;

            return this.matchLabelExpressions != null ? this.matchLabelExpressions.equals(that.matchLabelExpressions) : that.matchLabelExpressions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchLabelExpressions != null ? this.matchLabelExpressions.hashCode() : 0;
            return result;
        }
    }
}
