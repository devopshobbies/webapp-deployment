package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.931Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution extends software.amazon.jsii.JsiiSerializable {

    /**
     * preference block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#preference StatefulSet#preference}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference();

    /**
     * weight is in the range 1-100.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#weight StatefulSet#weight}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> {
        imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
        java.lang.Number weight;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#getPreference}
         * @param preference preference block. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#preference StatefulSet#preference}
         * @return {@code this}
         */
        public Builder preference(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
            this.preference = preference;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#getWeight}
         * @param weight weight is in the range 1-100. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#weight StatefulSet#weight}
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
        private final imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preference = software.amazon.jsii.Kernel.get(this, "preference", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.preference = java.util.Objects.requireNonNull(builder.preference, "preference is required");
            this.weight = java.util.Objects.requireNonNull(builder.weight, "weight is required");
        }

        @Override
        public final imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
            return this.preference;
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

            data.set("preference", om.valueToTree(this.getPreference()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy that = (StatefulSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution.Jsii$Proxy) o;

            if (!preference.equals(that.preference)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public final int hashCode() {
            int result = this.preference.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
