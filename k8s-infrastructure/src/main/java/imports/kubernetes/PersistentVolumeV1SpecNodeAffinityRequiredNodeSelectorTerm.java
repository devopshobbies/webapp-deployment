package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.266Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_expressions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_expressions PersistentVolumeV1#match_expressions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchExpressions() {
        return null;
    }

    /**
     * match_fields block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_fields PersistentVolumeV1#match_fields}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMatchFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm> {
        java.lang.Object matchExpressions;
        java.lang.Object matchFields;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_expressions PersistentVolumeV1#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(com.hashicorp.cdktf.IResolvable matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_expressions PersistentVolumeV1#match_expressions}
         * @return {@code this}
         */
        public Builder matchExpressions(java.util.List<? extends imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTermMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm#getMatchFields}
         * @param matchFields match_fields block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_fields PersistentVolumeV1#match_fields}
         * @return {@code this}
         */
        public Builder matchFields(com.hashicorp.cdktf.IResolvable matchFields) {
            this.matchFields = matchFields;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm#getMatchFields}
         * @param matchFields match_fields block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#match_fields PersistentVolumeV1#match_fields}
         * @return {@code this}
         */
        public Builder matchFields(java.util.List<? extends imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTermMatchFields> matchFields) {
            this.matchFields = matchFields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm {
        private final java.lang.Object matchExpressions;
        private final java.lang.Object matchFields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.matchFields = software.amazon.jsii.Kernel.get(this, "matchFields", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = builder.matchExpressions;
            this.matchFields = builder.matchFields;
        }

        @Override
        public final java.lang.Object getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        public final java.lang.Object getMatchFields() {
            return this.matchFields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }
            if (this.getMatchFields() != null) {
                data.set("matchFields", om.valueToTree(this.getMatchFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm.Jsii$Proxy that = (PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm.Jsii$Proxy) o;

            if (this.matchExpressions != null ? !this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions != null) return false;
            return this.matchFields != null ? this.matchFields.equals(that.matchFields) : that.matchFields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            result = 31 * result + (this.matchFields != null ? this.matchFields.hashCode() : 0);
            return result;
        }
    }
}
