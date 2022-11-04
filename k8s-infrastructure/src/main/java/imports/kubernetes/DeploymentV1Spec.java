package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.728Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1Spec")
@software.amazon.jsii.Jsii.Proxy(DeploymentV1Spec.Jsii$Proxy.class)
public interface DeploymentV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#template DeploymentV1#template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplate getTemplate();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready)
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#min_ready_seconds DeploymentV1#min_ready_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * Indicates that the deployment is paused.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#paused DeploymentV1#paused}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPaused() {
        return null;
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed.
     * <p>
     * The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#progress_deadline_seconds DeploymentV1#progress_deadline_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getProgressDeadlineSeconds() {
        return null;
    }

    /**
     * Number of desired pods. This is a string to be able to distinguish between explicit zero and not specified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#replicas DeploymentV1#replicas}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReplicas() {
        return null;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#revision_history_limit DeploymentV1#revision_history_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#selector DeploymentV1#selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecSelector getSelector() {
        return null;
    }

    /**
     * strategy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#strategy DeploymentV1#strategy}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecStrategy getStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentV1Spec> {
        imports.kubernetes.DeploymentV1SpecTemplate template;
        java.lang.Number minReadySeconds;
        java.lang.Object paused;
        java.lang.Number progressDeadlineSeconds;
        java.lang.String replicas;
        java.lang.Number revisionHistoryLimit;
        imports.kubernetes.DeploymentV1SpecSelector selector;
        imports.kubernetes.DeploymentV1SpecStrategy strategy;

        /**
         * Sets the value of {@link DeploymentV1Spec#getTemplate}
         * @param template template block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#template DeploymentV1#template}
         * @return {@code this}
         */
        public Builder template(imports.kubernetes.DeploymentV1SpecTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#min_ready_seconds DeploymentV1#min_ready_seconds}
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getPaused}
         * @param paused Indicates that the deployment is paused.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#paused DeploymentV1#paused}
         * @return {@code this}
         */
        public Builder paused(java.lang.Boolean paused) {
            this.paused = paused;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getPaused}
         * @param paused Indicates that the deployment is paused.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#paused DeploymentV1#paused}
         * @return {@code this}
         */
        public Builder paused(com.hashicorp.cdktf.IResolvable paused) {
            this.paused = paused;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getProgressDeadlineSeconds}
         * @param progressDeadlineSeconds The maximum time in seconds for a deployment to make progress before it is considered to be failed.
         *                                The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
         *                                <p>
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#progress_deadline_seconds DeploymentV1#progress_deadline_seconds}
         * @return {@code this}
         */
        public Builder progressDeadlineSeconds(java.lang.Number progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getReplicas}
         * @param replicas Number of desired pods. This is a string to be able to distinguish between explicit zero and not specified.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#replicas DeploymentV1#replicas}
         * @return {@code this}
         */
        public Builder replicas(java.lang.String replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The number of old ReplicaSets to retain to allow rollback.
         *                             This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#revision_history_limit DeploymentV1#revision_history_limit}
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#selector DeploymentV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.DeploymentV1SpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1Spec#getStrategy}
         * @param strategy strategy block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#strategy DeploymentV1#strategy}
         * @return {@code this}
         */
        public Builder strategy(imports.kubernetes.DeploymentV1SpecStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentV1Spec {
        private final imports.kubernetes.DeploymentV1SpecTemplate template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Object paused;
        private final java.lang.Number progressDeadlineSeconds;
        private final java.lang.String replicas;
        private final java.lang.Number revisionHistoryLimit;
        private final imports.kubernetes.DeploymentV1SpecSelector selector;
        private final imports.kubernetes.DeploymentV1SpecStrategy strategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplate.class));
            this.minReadySeconds = software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.paused = software.amazon.jsii.Kernel.get(this, "paused", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.progressDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "progressDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replicas = software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecSelector.class));
            this.strategy = software.amazon.jsii.Kernel.get(this, "strategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecStrategy.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.minReadySeconds = builder.minReadySeconds;
            this.paused = builder.paused;
            this.progressDeadlineSeconds = builder.progressDeadlineSeconds;
            this.replicas = builder.replicas;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.selector = builder.selector;
            this.strategy = builder.strategy;
        }

        @Override
        public final imports.kubernetes.DeploymentV1SpecTemplate getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public final java.lang.Object getPaused() {
            return this.paused;
        }

        @Override
        public final java.lang.Number getProgressDeadlineSeconds() {
            return this.progressDeadlineSeconds;
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
        public final imports.kubernetes.DeploymentV1SpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final imports.kubernetes.DeploymentV1SpecStrategy getStrategy() {
            return this.strategy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getPaused() != null) {
                data.set("paused", om.valueToTree(this.getPaused()));
            }
            if (this.getProgressDeadlineSeconds() != null) {
                data.set("progressDeadlineSeconds", om.valueToTree(this.getProgressDeadlineSeconds()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getStrategy() != null) {
                data.set("strategy", om.valueToTree(this.getStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentV1Spec.Jsii$Proxy that = (DeploymentV1Spec.Jsii$Proxy) o;

            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.paused != null ? !this.paused.equals(that.paused) : that.paused != null) return false;
            if (this.progressDeadlineSeconds != null ? !this.progressDeadlineSeconds.equals(that.progressDeadlineSeconds) : that.progressDeadlineSeconds != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.strategy != null ? this.strategy.equals(that.strategy) : that.strategy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.template.hashCode();
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.paused != null ? this.paused.hashCode() : 0);
            result = 31 * result + (this.progressDeadlineSeconds != null ? this.progressDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.strategy != null ? this.strategy.hashCode() : 0);
            return result;
        }
    }
}
