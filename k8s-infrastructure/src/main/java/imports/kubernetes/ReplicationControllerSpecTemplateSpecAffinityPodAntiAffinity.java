package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.673Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * preferred_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#preferred_during_scheduling_ignored_during_execution ReplicationController#preferred_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPreferredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * required_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#required_during_scheduling_ignored_during_execution ReplicationController#required_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRequiredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity> {
        java.lang.Object preferredDuringSchedulingIgnoredDuringExecution;
        java.lang.Object requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution preferred_during_scheduling_ignored_during_execution block.
         *                                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#preferred_during_scheduling_ignored_during_execution ReplicationController#preferred_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(com.hashicorp.cdktf.IResolvable preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution preferred_during_scheduling_ignored_during_execution block.
         *                                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#preferred_during_scheduling_ignored_during_execution ReplicationController#preferred_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.kubernetes.ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity#getRequiredDuringSchedulingIgnoredDuringExecution}
         * @param requiredDuringSchedulingIgnoredDuringExecution required_during_scheduling_ignored_during_execution block.
         *                                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#required_during_scheduling_ignored_during_execution ReplicationController#required_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(com.hashicorp.cdktf.IResolvable requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity#getRequiredDuringSchedulingIgnoredDuringExecution}
         * @param requiredDuringSchedulingIgnoredDuringExecution required_during_scheduling_ignored_during_execution block.
         *                                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller#required_during_scheduling_ignored_during_execution ReplicationController#required_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.kubernetes.ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity {
        private final java.lang.Object preferredDuringSchedulingIgnoredDuringExecution;
        private final java.lang.Object requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preferredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.requiredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
        public final java.lang.Object getRequiredDuringSchedulingIgnoredDuringExecution() {
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
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity.Jsii$Proxy) o;

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
