package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.036Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1Spec")
@software.amazon.jsii.Jsii.Proxy(JobV1Spec.Jsii$Proxy.class)
public interface JobV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#template JobV1#template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.JobV1SpecTemplate getTemplate();

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
     * <p>
     * Value must be a positive integer.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#active_deadline_seconds JobV1#active_deadline_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSeconds() {
        return null;
    }

    /**
     * Specifies the number of retries before marking this job failed. Defaults to 6.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#backoff_limit JobV1#backoff_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBackoffLimit() {
        return null;
    }

    /**
     * CompletionMode specifies how Pod completions are tracked.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#completion_mode JobV1#completion_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCompletionMode() {
        return null;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.
     * <p>
     * Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value. Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#completions JobV1#completions}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCompletions() {
        return null;
    }

    /**
     * Controls generation of pod labels and pod selectors.
     * <p>
     * Leave unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template. When true, the user is responsible for picking unique labels and specifying the selector. Failure to pick a unique label may cause this and other jobs to not function correctly. More info: https://git.k8s.io/community/contributors/design-proposals/selector-generation.md
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#manual_selector JobV1#manual_selector}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getManualSelector() {
        return null;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time.
     * <p>
     * The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#parallelism JobV1#parallelism}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getParallelism() {
        return null;
    }

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#selector JobV1#selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecSelector getSelector() {
        return null;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
     * <p>
     * If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#ttl_seconds_after_finished JobV1#ttl_seconds_after_finished}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTtlSecondsAfterFinished() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobV1Spec> {
        imports.kubernetes.JobV1SpecTemplate template;
        java.lang.Number activeDeadlineSeconds;
        java.lang.Number backoffLimit;
        java.lang.String completionMode;
        java.lang.Number completions;
        java.lang.Object manualSelector;
        java.lang.Number parallelism;
        imports.kubernetes.JobV1SpecSelector selector;
        java.lang.String ttlSecondsAfterFinished;

        /**
         * Sets the value of {@link JobV1Spec#getTemplate}
         * @param template template block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#template JobV1#template}
         * @return {@code this}
         */
        public Builder template(imports.kubernetes.JobV1SpecTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getActiveDeadlineSeconds}
         * @param activeDeadlineSeconds Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
         *                              Value must be a positive integer.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#active_deadline_seconds JobV1#active_deadline_seconds}
         * @return {@code this}
         */
        public Builder activeDeadlineSeconds(java.lang.Number activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getBackoffLimit}
         * @param backoffLimit Specifies the number of retries before marking this job failed. Defaults to 6.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#backoff_limit JobV1#backoff_limit}
         * @return {@code this}
         */
        public Builder backoffLimit(java.lang.Number backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getCompletionMode}
         * @param completionMode CompletionMode specifies how Pod completions are tracked.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#completion_mode JobV1#completion_mode}
         * @return {@code this}
         */
        public Builder completionMode(java.lang.String completionMode) {
            this.completionMode = completionMode;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getCompletions}
         * @param completions Specifies the desired number of successfully finished pods the job should be run with.
         *                    Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value. Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#completions JobV1#completions}
         * @return {@code this}
         */
        public Builder completions(java.lang.Number completions) {
            this.completions = completions;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getManualSelector}
         * @param manualSelector Controls generation of pod labels and pod selectors.
         *                       Leave unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template. When true, the user is responsible for picking unique labels and specifying the selector. Failure to pick a unique label may cause this and other jobs to not function correctly. More info: https://git.k8s.io/community/contributors/design-proposals/selector-generation.md
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#manual_selector JobV1#manual_selector}
         * @return {@code this}
         */
        public Builder manualSelector(java.lang.Boolean manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getManualSelector}
         * @param manualSelector Controls generation of pod labels and pod selectors.
         *                       Leave unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template. When true, the user is responsible for picking unique labels and specifying the selector. Failure to pick a unique label may cause this and other jobs to not function correctly. More info: https://git.k8s.io/community/contributors/design-proposals/selector-generation.md
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#manual_selector JobV1#manual_selector}
         * @return {@code this}
         */
        public Builder manualSelector(com.hashicorp.cdktf.IResolvable manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getParallelism}
         * @param parallelism Specifies the maximum desired number of pods the job should run at any given time.
         *                    The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#parallelism JobV1#parallelism}
         * @return {@code this}
         */
        public Builder parallelism(java.lang.Number parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#selector JobV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.JobV1SpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link JobV1Spec#getTtlSecondsAfterFinished}
         * @param ttlSecondsAfterFinished ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
         *                                If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
         *                                <p>
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#ttl_seconds_after_finished JobV1#ttl_seconds_after_finished}
         * @return {@code this}
         */
        public Builder ttlSecondsAfterFinished(java.lang.String ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobV1Spec {
        private final imports.kubernetes.JobV1SpecTemplate template;
        private final java.lang.Number activeDeadlineSeconds;
        private final java.lang.Number backoffLimit;
        private final java.lang.String completionMode;
        private final java.lang.Number completions;
        private final java.lang.Object manualSelector;
        private final java.lang.Number parallelism;
        private final imports.kubernetes.JobV1SpecSelector selector;
        private final java.lang.String ttlSecondsAfterFinished;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplate.class));
            this.activeDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.backoffLimit = software.amazon.jsii.Kernel.get(this, "backoffLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.completionMode = software.amazon.jsii.Kernel.get(this, "completionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.completions = software.amazon.jsii.Kernel.get(this, "completions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.manualSelector = software.amazon.jsii.Kernel.get(this, "manualSelector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.parallelism = software.amazon.jsii.Kernel.get(this, "parallelism", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecSelector.class));
            this.ttlSecondsAfterFinished = software.amazon.jsii.Kernel.get(this, "ttlSecondsAfterFinished", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.backoffLimit = builder.backoffLimit;
            this.completionMode = builder.completionMode;
            this.completions = builder.completions;
            this.manualSelector = builder.manualSelector;
            this.parallelism = builder.parallelism;
            this.selector = builder.selector;
            this.ttlSecondsAfterFinished = builder.ttlSecondsAfterFinished;
        }

        @Override
        public final imports.kubernetes.JobV1SpecTemplate getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        @Override
        public final java.lang.Number getBackoffLimit() {
            return this.backoffLimit;
        }

        @Override
        public final java.lang.String getCompletionMode() {
            return this.completionMode;
        }

        @Override
        public final java.lang.Number getCompletions() {
            return this.completions;
        }

        @Override
        public final java.lang.Object getManualSelector() {
            return this.manualSelector;
        }

        @Override
        public final java.lang.Number getParallelism() {
            return this.parallelism;
        }

        @Override
        public final imports.kubernetes.JobV1SpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getTtlSecondsAfterFinished() {
            return this.ttlSecondsAfterFinished;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getActiveDeadlineSeconds() != null) {
                data.set("activeDeadlineSeconds", om.valueToTree(this.getActiveDeadlineSeconds()));
            }
            if (this.getBackoffLimit() != null) {
                data.set("backoffLimit", om.valueToTree(this.getBackoffLimit()));
            }
            if (this.getCompletionMode() != null) {
                data.set("completionMode", om.valueToTree(this.getCompletionMode()));
            }
            if (this.getCompletions() != null) {
                data.set("completions", om.valueToTree(this.getCompletions()));
            }
            if (this.getManualSelector() != null) {
                data.set("manualSelector", om.valueToTree(this.getManualSelector()));
            }
            if (this.getParallelism() != null) {
                data.set("parallelism", om.valueToTree(this.getParallelism()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getTtlSecondsAfterFinished() != null) {
                data.set("ttlSecondsAfterFinished", om.valueToTree(this.getTtlSecondsAfterFinished()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobV1Spec.Jsii$Proxy that = (JobV1Spec.Jsii$Proxy) o;

            if (!template.equals(that.template)) return false;
            if (this.activeDeadlineSeconds != null ? !this.activeDeadlineSeconds.equals(that.activeDeadlineSeconds) : that.activeDeadlineSeconds != null) return false;
            if (this.backoffLimit != null ? !this.backoffLimit.equals(that.backoffLimit) : that.backoffLimit != null) return false;
            if (this.completionMode != null ? !this.completionMode.equals(that.completionMode) : that.completionMode != null) return false;
            if (this.completions != null ? !this.completions.equals(that.completions) : that.completions != null) return false;
            if (this.manualSelector != null ? !this.manualSelector.equals(that.manualSelector) : that.manualSelector != null) return false;
            if (this.parallelism != null ? !this.parallelism.equals(that.parallelism) : that.parallelism != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished) : that.ttlSecondsAfterFinished == null;
        }

        @Override
        public final int hashCode() {
            int result = this.template.hashCode();
            result = 31 * result + (this.activeDeadlineSeconds != null ? this.activeDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.backoffLimit != null ? this.backoffLimit.hashCode() : 0);
            result = 31 * result + (this.completionMode != null ? this.completionMode.hashCode() : 0);
            result = 31 * result + (this.completions != null ? this.completions.hashCode() : 0);
            result = 31 * result + (this.manualSelector != null ? this.manualSelector.hashCode() : 0);
            result = 31 * result + (this.parallelism != null ? this.parallelism.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.hashCode() : 0);
            return result;
        }
    }
}
