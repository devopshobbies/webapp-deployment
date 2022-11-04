package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.286Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodDisruptionBudgetV1Spec")
@software.amazon.jsii.Jsii.Proxy(PodDisruptionBudgetV1Spec.Jsii$Proxy.class)
public interface PodDisruptionBudgetV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#selector PodDisruptionBudgetV1#selector}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.PodDisruptionBudgetV1SpecSelector getSelector();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#max_unavailable PodDisruptionBudgetV1#max_unavailable}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMaxUnavailable() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#min_available PodDisruptionBudgetV1#min_available}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMinAvailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodDisruptionBudgetV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodDisruptionBudgetV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodDisruptionBudgetV1Spec> {
        imports.kubernetes.PodDisruptionBudgetV1SpecSelector selector;
        java.lang.String maxUnavailable;
        java.lang.String minAvailable;

        /**
         * Sets the value of {@link PodDisruptionBudgetV1Spec#getSelector}
         * @param selector selector block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#selector PodDisruptionBudgetV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.PodDisruptionBudgetV1SpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetV1Spec#getMaxUnavailable}
         * @param maxUnavailable Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#max_unavailable PodDisruptionBudgetV1#max_unavailable}.
         * @return {@code this}
         */
        public Builder maxUnavailable(java.lang.String maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetV1Spec#getMinAvailable}
         * @param minAvailable Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_disruption_budget_v1#min_available PodDisruptionBudgetV1#min_available}.
         * @return {@code this}
         */
        public Builder minAvailable(java.lang.String minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodDisruptionBudgetV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodDisruptionBudgetV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodDisruptionBudgetV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodDisruptionBudgetV1Spec {
        private final imports.kubernetes.PodDisruptionBudgetV1SpecSelector selector;
        private final java.lang.String maxUnavailable;
        private final java.lang.String minAvailable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodDisruptionBudgetV1SpecSelector.class));
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minAvailable = software.amazon.jsii.Kernel.get(this, "minAvailable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(builder.selector, "selector is required");
            this.maxUnavailable = builder.maxUnavailable;
            this.minAvailable = builder.minAvailable;
        }

        @Override
        public final imports.kubernetes.PodDisruptionBudgetV1SpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public final java.lang.String getMinAvailable() {
            return this.minAvailable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }
            if (this.getMinAvailable() != null) {
                data.set("minAvailable", om.valueToTree(this.getMinAvailable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodDisruptionBudgetV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodDisruptionBudgetV1Spec.Jsii$Proxy that = (PodDisruptionBudgetV1Spec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            return this.minAvailable != null ? this.minAvailable.equals(that.minAvailable) : that.minAvailable == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0);
            result = 31 * result + (this.minAvailable != null ? this.minAvailable.hashCode() : 0);
            return result;
        }
    }
}
