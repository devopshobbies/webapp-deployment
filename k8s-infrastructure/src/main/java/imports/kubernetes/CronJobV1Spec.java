package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.014Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1Spec")
@software.amazon.jsii.Jsii.Proxy(CronJobV1Spec.Jsii$Proxy.class)
public interface CronJobV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * job_template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#job_template CronJobV1#job_template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplate getJobTemplate();

    /**
     * Cron format string, e.g. 0 * * * * or @hourly, as schedule time of its jobs to be created and executed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#schedule CronJobV1#schedule}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSchedule();

    /**
     * Specifies how to treat concurrent executions of a Job. Defaults to Allow.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#concurrency_policy CronJobV1#concurrency_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConcurrencyPolicy() {
        return null;
    }

    /**
     * The number of failed finished jobs to retain.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#failed_jobs_history_limit CronJobV1#failed_jobs_history_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailedJobsHistoryLimit() {
        return null;
    }

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
     * <p>
     * Missed jobs executions will be counted as failed ones.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#starting_deadline_seconds CronJobV1#starting_deadline_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getStartingDeadlineSeconds() {
        return null;
    }

    /**
     * The number of successful finished jobs to retain. Defaults to 3.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#successful_jobs_history_limit CronJobV1#successful_jobs_history_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuccessfulJobsHistoryLimit() {
        return null;
    }

    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
     * <p>
     * Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#suspend CronJobV1#suspend}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSuspend() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobV1Spec> {
        imports.kubernetes.CronJobV1SpecJobTemplate jobTemplate;
        java.lang.String schedule;
        java.lang.String concurrencyPolicy;
        java.lang.Number failedJobsHistoryLimit;
        java.lang.Number startingDeadlineSeconds;
        java.lang.Number successfulJobsHistoryLimit;
        java.lang.Object suspend;

        /**
         * Sets the value of {@link CronJobV1Spec#getJobTemplate}
         * @param jobTemplate job_template block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#job_template CronJobV1#job_template}
         * @return {@code this}
         */
        public Builder jobTemplate(imports.kubernetes.CronJobV1SpecJobTemplate jobTemplate) {
            this.jobTemplate = jobTemplate;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getSchedule}
         * @param schedule Cron format string, e.g. 0 * * * * or @hourly, as schedule time of its jobs to be created and executed. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#schedule CronJobV1#schedule}
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getConcurrencyPolicy}
         * @param concurrencyPolicy Specifies how to treat concurrent executions of a Job. Defaults to Allow.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#concurrency_policy CronJobV1#concurrency_policy}
         * @return {@code this}
         */
        public Builder concurrencyPolicy(java.lang.String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getFailedJobsHistoryLimit}
         * @param failedJobsHistoryLimit The number of failed finished jobs to retain.
         *                               This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
         *                               <p>
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#failed_jobs_history_limit CronJobV1#failed_jobs_history_limit}
         * @return {@code this}
         */
        public Builder failedJobsHistoryLimit(java.lang.Number failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getStartingDeadlineSeconds}
         * @param startingDeadlineSeconds Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
         *                                Missed jobs executions will be counted as failed ones.
         *                                <p>
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#starting_deadline_seconds CronJobV1#starting_deadline_seconds}
         * @return {@code this}
         */
        public Builder startingDeadlineSeconds(java.lang.Number startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getSuccessfulJobsHistoryLimit}
         * @param successfulJobsHistoryLimit The number of successful finished jobs to retain. Defaults to 3.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#successful_jobs_history_limit CronJobV1#successful_jobs_history_limit}
         * @return {@code this}
         */
        public Builder successfulJobsHistoryLimit(java.lang.Number successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getSuspend}
         * @param suspend This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
         *                Defaults to false.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#suspend CronJobV1#suspend}
         * @return {@code this}
         */
        public Builder suspend(java.lang.Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1Spec#getSuspend}
         * @param suspend This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
         *                Defaults to false.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#suspend CronJobV1#suspend}
         * @return {@code this}
         */
        public Builder suspend(com.hashicorp.cdktf.IResolvable suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobV1Spec {
        private final imports.kubernetes.CronJobV1SpecJobTemplate jobTemplate;
        private final java.lang.String schedule;
        private final java.lang.String concurrencyPolicy;
        private final java.lang.Number failedJobsHistoryLimit;
        private final java.lang.Number startingDeadlineSeconds;
        private final java.lang.Number successfulJobsHistoryLimit;
        private final java.lang.Object suspend;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jobTemplate = software.amazon.jsii.Kernel.get(this, "jobTemplate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplate.class));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.concurrencyPolicy = software.amazon.jsii.Kernel.get(this, "concurrencyPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.failedJobsHistoryLimit = software.amazon.jsii.Kernel.get(this, "failedJobsHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.startingDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "startingDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.successfulJobsHistoryLimit = software.amazon.jsii.Kernel.get(this, "successfulJobsHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.suspend = software.amazon.jsii.Kernel.get(this, "suspend", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jobTemplate = java.util.Objects.requireNonNull(builder.jobTemplate, "jobTemplate is required");
            this.schedule = java.util.Objects.requireNonNull(builder.schedule, "schedule is required");
            this.concurrencyPolicy = builder.concurrencyPolicy;
            this.failedJobsHistoryLimit = builder.failedJobsHistoryLimit;
            this.startingDeadlineSeconds = builder.startingDeadlineSeconds;
            this.successfulJobsHistoryLimit = builder.successfulJobsHistoryLimit;
            this.suspend = builder.suspend;
        }

        @Override
        public final imports.kubernetes.CronJobV1SpecJobTemplate getJobTemplate() {
            return this.jobTemplate;
        }

        @Override
        public final java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.lang.String getConcurrencyPolicy() {
            return this.concurrencyPolicy;
        }

        @Override
        public final java.lang.Number getFailedJobsHistoryLimit() {
            return this.failedJobsHistoryLimit;
        }

        @Override
        public final java.lang.Number getStartingDeadlineSeconds() {
            return this.startingDeadlineSeconds;
        }

        @Override
        public final java.lang.Number getSuccessfulJobsHistoryLimit() {
            return this.successfulJobsHistoryLimit;
        }

        @Override
        public final java.lang.Object getSuspend() {
            return this.suspend;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jobTemplate", om.valueToTree(this.getJobTemplate()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            if (this.getConcurrencyPolicy() != null) {
                data.set("concurrencyPolicy", om.valueToTree(this.getConcurrencyPolicy()));
            }
            if (this.getFailedJobsHistoryLimit() != null) {
                data.set("failedJobsHistoryLimit", om.valueToTree(this.getFailedJobsHistoryLimit()));
            }
            if (this.getStartingDeadlineSeconds() != null) {
                data.set("startingDeadlineSeconds", om.valueToTree(this.getStartingDeadlineSeconds()));
            }
            if (this.getSuccessfulJobsHistoryLimit() != null) {
                data.set("successfulJobsHistoryLimit", om.valueToTree(this.getSuccessfulJobsHistoryLimit()));
            }
            if (this.getSuspend() != null) {
                data.set("suspend", om.valueToTree(this.getSuspend()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobV1Spec.Jsii$Proxy that = (CronJobV1Spec.Jsii$Proxy) o;

            if (!jobTemplate.equals(that.jobTemplate)) return false;
            if (!schedule.equals(that.schedule)) return false;
            if (this.concurrencyPolicy != null ? !this.concurrencyPolicy.equals(that.concurrencyPolicy) : that.concurrencyPolicy != null) return false;
            if (this.failedJobsHistoryLimit != null ? !this.failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) : that.failedJobsHistoryLimit != null) return false;
            if (this.startingDeadlineSeconds != null ? !this.startingDeadlineSeconds.equals(that.startingDeadlineSeconds) : that.startingDeadlineSeconds != null) return false;
            if (this.successfulJobsHistoryLimit != null ? !this.successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) : that.successfulJobsHistoryLimit != null) return false;
            return this.suspend != null ? this.suspend.equals(that.suspend) : that.suspend == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jobTemplate.hashCode();
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.concurrencyPolicy != null ? this.concurrencyPolicy.hashCode() : 0);
            result = 31 * result + (this.failedJobsHistoryLimit != null ? this.failedJobsHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.startingDeadlineSeconds != null ? this.startingDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.successfulJobsHistoryLimit != null ? this.successfulJobsHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.suspend != null ? this.suspend.hashCode() : 0);
            return result;
        }
    }
}
