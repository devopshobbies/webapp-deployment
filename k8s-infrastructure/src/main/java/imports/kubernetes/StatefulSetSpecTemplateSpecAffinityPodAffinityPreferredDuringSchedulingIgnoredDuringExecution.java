package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.935Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution extends software.amazon.jsii.JsiiSerializable {

    /**
     * pod_affinity_term block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#pod_affinity_term StatefulSet#pod_affinity_term}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm();

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#weight StatefulSet#weight}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution> {
        imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
        java.lang.Number weight;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#getPodAffinityTerm}
         * @param podAffinityTerm pod_affinity_term block. This parameter is required.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#pod_affinity_term StatefulSet#pod_affinity_term}
         * @return {@code this}
         */
        public Builder podAffinityTerm(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#getWeight}
         * @param weight weight associated with matching the corresponding podAffinityTerm, in the range 1-100. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#weight StatefulSet#weight}
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
        private final imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podAffinityTerm = software.amazon.jsii.Kernel.get(this, "podAffinityTerm", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podAffinityTerm = java.util.Objects.requireNonNull(builder.podAffinityTerm, "podAffinityTerm is required");
            this.weight = java.util.Objects.requireNonNull(builder.weight, "weight is required");
        }

        @Override
        public final imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

        @Override
        public final java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("podAffinityTerm", om.valueToTree(this.getPodAffinityTerm()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy that = (StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy) o;

            if (!podAffinityTerm.equals(that.podAffinityTerm)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public final int hashCode() {
            int result = this.podAffinityTerm.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
