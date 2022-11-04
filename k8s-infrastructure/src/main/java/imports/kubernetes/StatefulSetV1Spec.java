package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.046Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1Spec")
@software.amazon.jsii.Jsii.Proxy(StatefulSetV1Spec.Jsii$Proxy.class)
public interface StatefulSetV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#selector StatefulSetV1#selector}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecSelector getSelector();

    /**
     * The name of the service that governs this StatefulSet.
     * <p>
     * This service must exist before the StatefulSet, and is responsible for the network identity of the set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#service_name StatefulSetV1#service_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    /**
     * template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#template StatefulSetV1#template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplate getTemplate();

    /**
     * Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#pod_management_policy StatefulSetV1#pod_management_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPodManagementPolicy() {
        return null;
    }

    /**
     * The desired number of replicas of the given Template, in the sense that they are instantiations of the same Template.
     * <p>
     * Value must be a positive integer.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#replicas StatefulSetV1#replicas}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReplicas() {
        return null;
    }

    /**
     * The maximum number of revisions that will be maintained in the StatefulSet's revision history. The default value is 10.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#revision_history_limit StatefulSetV1#revision_history_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * update_strategy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#update_strategy StatefulSetV1#update_strategy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUpdateStrategy() {
        return null;
    }

    /**
     * volume_claim_template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#volume_claim_template StatefulSetV1#volume_claim_template}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getVolumeClaimTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetV1Spec> {
        imports.kubernetes.StatefulSetV1SpecSelector selector;
        java.lang.String serviceName;
        imports.kubernetes.StatefulSetV1SpecTemplate template;
        java.lang.String podManagementPolicy;
        java.lang.String replicas;
        java.lang.Number revisionHistoryLimit;
        java.lang.Object updateStrategy;
        java.lang.Object volumeClaimTemplate;

        /**
         * Sets the value of {@link StatefulSetV1Spec#getSelector}
         * @param selector selector block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#selector StatefulSetV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.StatefulSetV1SpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getServiceName}
         * @param serviceName The name of the service that governs this StatefulSet. This parameter is required.
         *                    This service must exist before the StatefulSet, and is responsible for the network identity of the set.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#service_name StatefulSetV1#service_name}
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getTemplate}
         * @param template template block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#template StatefulSetV1#template}
         * @return {@code this}
         */
        public Builder template(imports.kubernetes.StatefulSetV1SpecTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getPodManagementPolicy}
         * @param podManagementPolicy Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#pod_management_policy StatefulSetV1#pod_management_policy}
         * @return {@code this}
         */
        public Builder podManagementPolicy(java.lang.String podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getReplicas}
         * @param replicas The desired number of replicas of the given Template, in the sense that they are instantiations of the same Template.
         *                 Value must be a positive integer.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#replicas StatefulSetV1#replicas}
         * @return {@code this}
         */
        public Builder replicas(java.lang.String replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The maximum number of revisions that will be maintained in the StatefulSet's revision history. The default value is 10.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#revision_history_limit StatefulSetV1#revision_history_limit}
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getUpdateStrategy}
         * @param updateStrategy update_strategy block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#update_strategy StatefulSetV1#update_strategy}
         * @return {@code this}
         */
        public Builder updateStrategy(com.hashicorp.cdktf.IResolvable updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getUpdateStrategy}
         * @param updateStrategy update_strategy block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#update_strategy StatefulSetV1#update_strategy}
         * @return {@code this}
         */
        public Builder updateStrategy(java.util.List<? extends imports.kubernetes.StatefulSetV1SpecUpdateStrategy> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getVolumeClaimTemplate}
         * @param volumeClaimTemplate volume_claim_template block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#volume_claim_template StatefulSetV1#volume_claim_template}
         * @return {@code this}
         */
        public Builder volumeClaimTemplate(com.hashicorp.cdktf.IResolvable volumeClaimTemplate) {
            this.volumeClaimTemplate = volumeClaimTemplate;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1Spec#getVolumeClaimTemplate}
         * @param volumeClaimTemplate volume_claim_template block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#volume_claim_template StatefulSetV1#volume_claim_template}
         * @return {@code this}
         */
        public Builder volumeClaimTemplate(java.util.List<? extends imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplate> volumeClaimTemplate) {
            this.volumeClaimTemplate = volumeClaimTemplate;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetV1Spec {
        private final imports.kubernetes.StatefulSetV1SpecSelector selector;
        private final java.lang.String serviceName;
        private final imports.kubernetes.StatefulSetV1SpecTemplate template;
        private final java.lang.String podManagementPolicy;
        private final java.lang.String replicas;
        private final java.lang.Number revisionHistoryLimit;
        private final java.lang.Object updateStrategy;
        private final java.lang.Object volumeClaimTemplate;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecSelector.class));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplate.class));
            this.podManagementPolicy = software.amazon.jsii.Kernel.get(this, "podManagementPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicas = software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.updateStrategy = software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeClaimTemplate = software.amazon.jsii.Kernel.get(this, "volumeClaimTemplate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(builder.selector, "selector is required");
            this.serviceName = java.util.Objects.requireNonNull(builder.serviceName, "serviceName is required");
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.podManagementPolicy = builder.podManagementPolicy;
            this.replicas = builder.replicas;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.updateStrategy = builder.updateStrategy;
            this.volumeClaimTemplate = builder.volumeClaimTemplate;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecTemplate getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.String getPodManagementPolicy() {
            return this.podManagementPolicy;
        }

        @Override
        public final java.lang.String getReplicas() {
            return this.replicas;
        }

        @Override
        public final java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public final java.lang.Object getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        public final java.lang.Object getVolumeClaimTemplate() {
            return this.volumeClaimTemplate;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("serviceName", om.valueToTree(this.getServiceName()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getPodManagementPolicy() != null) {
                data.set("podManagementPolicy", om.valueToTree(this.getPodManagementPolicy()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }
            if (this.getVolumeClaimTemplate() != null) {
                data.set("volumeClaimTemplate", om.valueToTree(this.getVolumeClaimTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetV1Spec.Jsii$Proxy that = (StatefulSetV1Spec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!serviceName.equals(that.serviceName)) return false;
            if (!template.equals(that.template)) return false;
            if (this.podManagementPolicy != null ? !this.podManagementPolicy.equals(that.podManagementPolicy) : that.podManagementPolicy != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.updateStrategy != null ? !this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy != null) return false;
            return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.equals(that.volumeClaimTemplate) : that.volumeClaimTemplate == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.serviceName.hashCode());
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.podManagementPolicy != null ? this.podManagementPolicy.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            result = 31 * result + (this.volumeClaimTemplate != null ? this.volumeClaimTemplate.hashCode() : 0);
            return result;
        }
    }
}
