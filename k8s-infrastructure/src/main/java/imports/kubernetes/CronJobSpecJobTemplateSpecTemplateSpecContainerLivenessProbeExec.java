package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.901Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec")
@software.amazon.jsii.Jsii.Proxy(CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec.Jsii$Proxy.class)
public interface CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem.
     * <p>
     * The command is simply exec'd, it is not run inside a shell, so traditional shell instructions. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#command CronJob#command}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCommand() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec> {
        java.util.List<java.lang.String> command;

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec#getCommand}
         * @param command Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem.
         *                The command is simply exec'd, it is not run inside a shell, so traditional shell instructions. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#command CronJob#command}
         * @return {@code this}
         */
        public Builder command(java.util.List<java.lang.String> command) {
            this.command = command;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec {
        private final java.util.List<java.lang.String> command;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.command = software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.command = builder.command;
        }

        @Override
        public final java.util.List<java.lang.String> getCommand() {
            return this.command;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCommand() != null) {
                data.set("command", om.valueToTree(this.getCommand()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec.Jsii$Proxy that = (CronJobSpecJobTemplateSpecTemplateSpecContainerLivenessProbeExec.Jsii$Proxy) o;

            return this.command != null ? this.command.equals(that.command) : that.command == null;
        }

        @Override
        public final int hashCode() {
            int result = this.command != null ? this.command.hashCode() : 0;
            return result;
        }
    }
}
