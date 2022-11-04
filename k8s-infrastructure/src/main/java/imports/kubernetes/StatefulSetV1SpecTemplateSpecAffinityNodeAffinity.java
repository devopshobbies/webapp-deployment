package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.057Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinity")
@software.amazon.jsii.Jsii.Proxy(StatefulSetV1SpecTemplateSpecAffinityNodeAffinity.Jsii$Proxy.class)
public interface StatefulSetV1SpecTemplateSpecAffinityNodeAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * preferred_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#preferred_during_scheduling_ignored_during_execution StatefulSetV1#preferred_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPreferredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * required_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#required_during_scheduling_ignored_during_execution StatefulSetV1#required_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetV1SpecTemplateSpecAffinityNodeAffinity> {
        java.lang.Object preferredDuringSchedulingIgnoredDuringExecution;
        imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution preferred_during_scheduling_ignored_during_execution block.
         *                                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#preferred_during_scheduling_ignored_during_execution StatefulSetV1#preferred_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(com.hashicorp.cdktf.IResolvable preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution preferred_during_scheduling_ignored_during_execution block.
         *                                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#preferred_during_scheduling_ignored_during_execution StatefulSetV1#preferred_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution}
         * @param requiredDuringSchedulingIgnoredDuringExecution required_during_scheduling_ignored_during_execution block.
         *                                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#required_during_scheduling_ignored_during_execution StatefulSetV1#required_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetV1SpecTemplateSpecAffinityNodeAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetV1SpecTemplateSpecAffinityNodeAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetV1SpecTemplateSpecAffinityNodeAffinity {
        private final java.lang.Object preferredDuringSchedulingIgnoredDuringExecution;
        private final imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preferredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.requiredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.preferredDuringSchedulingIgnoredDuringExecution = builder.preferredDuringSchedulingIgnoredDuringExecution;
            this.requiredDuringSchedulingIgnoredDuringExecution = builder.requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final java.lang.Object getPreferredDuringSchedulingIgnoredDuringExecution() {
            return this.preferredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
            return this.requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPreferredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("preferredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getPreferredDuringSchedulingIgnoredDuringExecution()));
            }
            if (this.getRequiredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("requiredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getRequiredDuringSchedulingIgnoredDuringExecution()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetV1SpecTemplateSpecAffinityNodeAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetV1SpecTemplateSpecAffinityNodeAffinity.Jsii$Proxy that = (StatefulSetV1SpecTemplateSpecAffinityNodeAffinity.Jsii$Proxy) o;

            if (this.preferredDuringSchedulingIgnoredDuringExecution != null ? !this.preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) : that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
            return this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) : that.requiredDuringSchedulingIgnoredDuringExecution == null;
        }

        @Override
        public final int hashCode() {
            int result = this.preferredDuringSchedulingIgnoredDuringExecution != null ? this.preferredDuringSchedulingIgnoredDuringExecution.hashCode() : 0;
            result = 31 * result + (this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.hashCode() : 0);
            return result;
        }
    }
}
