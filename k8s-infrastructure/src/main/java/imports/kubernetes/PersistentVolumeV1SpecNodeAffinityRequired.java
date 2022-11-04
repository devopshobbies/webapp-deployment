package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.266Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecNodeAffinityRequired")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecNodeAffinityRequired.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecNodeAffinityRequired extends software.amazon.jsii.JsiiSerializable {

    /**
     * node_selector_term block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#node_selector_term PersistentVolumeV1#node_selector_term}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getNodeSelectorTerm();

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecNodeAffinityRequired}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecNodeAffinityRequired}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecNodeAffinityRequired> {
        java.lang.Object nodeSelectorTerm;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequired#getNodeSelectorTerm}
         * @param nodeSelectorTerm node_selector_term block. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#node_selector_term PersistentVolumeV1#node_selector_term}
         * @return {@code this}
         */
        public Builder nodeSelectorTerm(com.hashicorp.cdktf.IResolvable nodeSelectorTerm) {
            this.nodeSelectorTerm = nodeSelectorTerm;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinityRequired#getNodeSelectorTerm}
         * @param nodeSelectorTerm node_selector_term block. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#node_selector_term PersistentVolumeV1#node_selector_term}
         * @return {@code this}
         */
        public Builder nodeSelectorTerm(java.util.List<? extends imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredNodeSelectorTerm> nodeSelectorTerm) {
            this.nodeSelectorTerm = nodeSelectorTerm;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecNodeAffinityRequired}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecNodeAffinityRequired build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecNodeAffinityRequired}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecNodeAffinityRequired {
        private final java.lang.Object nodeSelectorTerm;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeSelectorTerm = software.amazon.jsii.Kernel.get(this, "nodeSelectorTerm", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeSelectorTerm = java.util.Objects.requireNonNull(builder.nodeSelectorTerm, "nodeSelectorTerm is required");
        }

        @Override
        public final java.lang.Object getNodeSelectorTerm() {
            return this.nodeSelectorTerm;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("nodeSelectorTerm", om.valueToTree(this.getNodeSelectorTerm()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecNodeAffinityRequired"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecNodeAffinityRequired.Jsii$Proxy that = (PersistentVolumeV1SpecNodeAffinityRequired.Jsii$Proxy) o;

            return this.nodeSelectorTerm.equals(that.nodeSelectorTerm);
        }

        @Override
        public final int hashCode() {
            int result = this.nodeSelectorTerm.hashCode();
            return result;
        }
    }
}
