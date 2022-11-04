package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.225Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicyV1SpecIngressFrom")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyV1SpecIngressFrom.Jsii$Proxy.class)
public interface NetworkPolicyV1SpecIngressFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * ip_block block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#ip_block NetworkPolicyV1#ip_block}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock getIpBlock() {
        return null;
    }

    /**
     * namespace_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#namespace_selector NetworkPolicyV1#namespace_selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector getNamespaceSelector() {
        return null;
    }

    /**
     * pod_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#pod_selector NetworkPolicyV1#pod_selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector getPodSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyV1SpecIngressFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyV1SpecIngressFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyV1SpecIngressFrom> {
        imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock ipBlock;
        imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector namespaceSelector;
        imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector podSelector;

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngressFrom#getIpBlock}
         * @param ipBlock ip_block block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#ip_block NetworkPolicyV1#ip_block}
         * @return {@code this}
         */
        public Builder ipBlock(imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngressFrom#getNamespaceSelector}
         * @param namespaceSelector namespace_selector block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#namespace_selector NetworkPolicyV1#namespace_selector}
         * @return {@code this}
         */
        public Builder namespaceSelector(imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyV1SpecIngressFrom#getPodSelector}
         * @param podSelector pod_selector block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy_v1#pod_selector NetworkPolicyV1#pod_selector}
         * @return {@code this}
         */
        public Builder podSelector(imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyV1SpecIngressFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyV1SpecIngressFrom build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyV1SpecIngressFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyV1SpecIngressFrom {
        private final imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock ipBlock;
        private final imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector namespaceSelector;
        private final imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector podSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ipBlock = software.amazon.jsii.Kernel.get(this, "ipBlock", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock.class));
            this.namespaceSelector = software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector.class));
            this.podSelector = software.amazon.jsii.Kernel.get(this, "podSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ipBlock = builder.ipBlock;
            this.namespaceSelector = builder.namespaceSelector;
            this.podSelector = builder.podSelector;
        }

        @Override
        public final imports.kubernetes.NetworkPolicyV1SpecIngressFromIpBlock getIpBlock() {
            return this.ipBlock;
        }

        @Override
        public final imports.kubernetes.NetworkPolicyV1SpecIngressFromNamespaceSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public final imports.kubernetes.NetworkPolicyV1SpecIngressFromPodSelector getPodSelector() {
            return this.podSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getIpBlock() != null) {
                data.set("ipBlock", om.valueToTree(this.getIpBlock()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getPodSelector() != null) {
                data.set("podSelector", om.valueToTree(this.getPodSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicyV1SpecIngressFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyV1SpecIngressFrom.Jsii$Proxy that = (NetworkPolicyV1SpecIngressFrom.Jsii$Proxy) o;

            if (this.ipBlock != null ? !this.ipBlock.equals(that.ipBlock) : that.ipBlock != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            return this.podSelector != null ? this.podSelector.equals(that.podSelector) : that.podSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ipBlock != null ? this.ipBlock.hashCode() : 0;
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.podSelector != null ? this.podSelector.hashCode() : 0);
            return result;
        }
    }
}
