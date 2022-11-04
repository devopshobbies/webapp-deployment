package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.772Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1Spec")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1Spec.Jsii$Proxy.class)
public interface ReplicationControllerV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A label query over pods that should match the Replicas count.
     * <p>
     * If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#selector ReplicationControllerV1#selector}
     */
    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getSelector();

    /**
     * template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#template ReplicationControllerV1#template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplate getTemplate();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready)
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#min_ready_seconds ReplicationControllerV1#min_ready_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * The number of desired replicas. Defaults to 1. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#replicas ReplicationControllerV1#replicas}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1Spec> {
        java.util.Map<java.lang.String, java.lang.String> selector;
        imports.kubernetes.ReplicationControllerV1SpecTemplate template;
        java.lang.Number minReadySeconds;
        java.lang.Number replicas;

        /**
         * Sets the value of {@link ReplicationControllerV1Spec#getSelector}
         * @param selector A label query over pods that should match the Replicas count. This parameter is required.
         *                 If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#selector ReplicationControllerV1#selector}
         * @return {@code this}
         */
        public Builder selector(java.util.Map<java.lang.String, java.lang.String> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Spec#getTemplate}
         * @param template template block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#template ReplicationControllerV1#template}
         * @return {@code this}
         */
        public Builder template(imports.kubernetes.ReplicationControllerV1SpecTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Spec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#min_ready_seconds ReplicationControllerV1#min_ready_seconds}
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Spec#getReplicas}
         * @param replicas The number of desired replicas. Defaults to 1. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#replicas ReplicationControllerV1#replicas}
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1Spec {
        private final java.util.Map<java.lang.String, java.lang.String> selector;
        private final imports.kubernetes.ReplicationControllerV1SpecTemplate template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number replicas;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplate.class));
            this.minReadySeconds = software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replicas = software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(builder.selector, "selector is required");
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.minReadySeconds = builder.minReadySeconds;
            this.replicas = builder.replicas;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getSelector() {
            return this.selector;
        }

        @Override
        public final imports.kubernetes.ReplicationControllerV1SpecTemplate getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public final java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1Spec.Jsii$Proxy that = (ReplicationControllerV1Spec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            return this.replicas != null ? this.replicas.equals(that.replicas) : that.replicas == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            return result;
        }
    }
}
