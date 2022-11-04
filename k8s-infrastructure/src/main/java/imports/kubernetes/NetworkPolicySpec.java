package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.206Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.NetworkPolicySpec")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicySpec.Jsii$Proxy.class)
public interface NetworkPolicySpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * pod_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#pod_selector NetworkPolicy#pod_selector}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.NetworkPolicySpecPodSelector getPodSelector();

    /**
     * List of rule types that the NetworkPolicy relates to.
     * <p>
     * Valid options are ["Ingress"], ["Egress"], or ["Ingress", "Egress"]. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#policy_types NetworkPolicy#policy_types}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPolicyTypes();

    /**
     * egress block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#egress NetworkPolicy#egress}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEgress() {
        return null;
    }

    /**
     * ingress block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#ingress NetworkPolicy#ingress}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIngress() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicySpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicySpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicySpec> {
        imports.kubernetes.NetworkPolicySpecPodSelector podSelector;
        java.util.List<java.lang.String> policyTypes;
        java.lang.Object egress;
        java.lang.Object ingress;

        /**
         * Sets the value of {@link NetworkPolicySpec#getPodSelector}
         * @param podSelector pod_selector block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#pod_selector NetworkPolicy#pod_selector}
         * @return {@code this}
         */
        public Builder podSelector(imports.kubernetes.NetworkPolicySpecPodSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getPolicyTypes}
         * @param policyTypes List of rule types that the NetworkPolicy relates to. This parameter is required.
         *                    Valid options are ["Ingress"], ["Egress"], or ["Ingress", "Egress"]. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#policy_types NetworkPolicy#policy_types}
         * @return {@code this}
         */
        public Builder policyTypes(java.util.List<java.lang.String> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getEgress}
         * @param egress egress block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#egress NetworkPolicy#egress}
         * @return {@code this}
         */
        public Builder egress(com.hashicorp.cdktf.IResolvable egress) {
            this.egress = egress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getEgress}
         * @param egress egress block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#egress NetworkPolicy#egress}
         * @return {@code this}
         */
        public Builder egress(java.util.List<? extends imports.kubernetes.NetworkPolicySpecEgress> egress) {
            this.egress = egress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getIngress}
         * @param ingress ingress block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#ingress NetworkPolicy#ingress}
         * @return {@code this}
         */
        public Builder ingress(com.hashicorp.cdktf.IResolvable ingress) {
            this.ingress = ingress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getIngress}
         * @param ingress ingress block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/network_policy#ingress NetworkPolicy#ingress}
         * @return {@code this}
         */
        public Builder ingress(java.util.List<? extends imports.kubernetes.NetworkPolicySpecIngress> ingress) {
            this.ingress = ingress;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicySpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicySpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicySpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicySpec {
        private final imports.kubernetes.NetworkPolicySpecPodSelector podSelector;
        private final java.util.List<java.lang.String> policyTypes;
        private final java.lang.Object egress;
        private final java.lang.Object ingress;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podSelector = software.amazon.jsii.Kernel.get(this, "podSelector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.NetworkPolicySpecPodSelector.class));
            this.policyTypes = software.amazon.jsii.Kernel.get(this, "policyTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.egress = software.amazon.jsii.Kernel.get(this, "egress", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ingress = software.amazon.jsii.Kernel.get(this, "ingress", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podSelector = java.util.Objects.requireNonNull(builder.podSelector, "podSelector is required");
            this.policyTypes = java.util.Objects.requireNonNull(builder.policyTypes, "policyTypes is required");
            this.egress = builder.egress;
            this.ingress = builder.ingress;
        }

        @Override
        public final imports.kubernetes.NetworkPolicySpecPodSelector getPodSelector() {
            return this.podSelector;
        }

        @Override
        public final java.util.List<java.lang.String> getPolicyTypes() {
            return this.policyTypes;
        }

        @Override
        public final java.lang.Object getEgress() {
            return this.egress;
        }

        @Override
        public final java.lang.Object getIngress() {
            return this.ingress;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("podSelector", om.valueToTree(this.getPodSelector()));
            data.set("policyTypes", om.valueToTree(this.getPolicyTypes()));
            if (this.getEgress() != null) {
                data.set("egress", om.valueToTree(this.getEgress()));
            }
            if (this.getIngress() != null) {
                data.set("ingress", om.valueToTree(this.getIngress()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.NetworkPolicySpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicySpec.Jsii$Proxy that = (NetworkPolicySpec.Jsii$Proxy) o;

            if (!podSelector.equals(that.podSelector)) return false;
            if (!policyTypes.equals(that.policyTypes)) return false;
            if (this.egress != null ? !this.egress.equals(that.egress) : that.egress != null) return false;
            return this.ingress != null ? this.ingress.equals(that.ingress) : that.ingress == null;
        }

        @Override
        public final int hashCode() {
            int result = this.podSelector.hashCode();
            result = 31 * result + (this.policyTypes.hashCode());
            result = 31 * result + (this.egress != null ? this.egress.hashCode() : 0);
            result = 31 * result + (this.ingress != null ? this.ingress.hashCode() : 0);
            return result;
        }
    }
}
