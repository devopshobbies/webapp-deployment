package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.029Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.HelmProviderKubernetesExec")
@software.amazon.jsii.Jsii.Proxy(HelmProviderKubernetesExec.Jsii$Proxy.class)
public interface HelmProviderKubernetesExec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#api_version HelmProvider#api_version}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiVersion();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#command HelmProvider#command}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCommand();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#args HelmProvider#args}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArgs() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#env HelmProvider#env}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnv() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HelmProviderKubernetesExec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HelmProviderKubernetesExec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HelmProviderKubernetesExec> {
        java.lang.String apiVersion;
        java.lang.String command;
        java.util.List<java.lang.String> args;
        java.util.Map<java.lang.String, java.lang.String> env;

        /**
         * Sets the value of {@link HelmProviderKubernetesExec#getApiVersion}
         * @param apiVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#api_version HelmProvider#api_version}. This parameter is required.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderKubernetesExec#getCommand}
         * @param command Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#command HelmProvider#command}. This parameter is required.
         * @return {@code this}
         */
        public Builder command(java.lang.String command) {
            this.command = command;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderKubernetesExec#getArgs}
         * @param args Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#args HelmProvider#args}.
         * @return {@code this}
         */
        public Builder args(java.util.List<java.lang.String> args) {
            this.args = args;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderKubernetesExec#getEnv}
         * @param env Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm#env HelmProvider#env}.
         * @return {@code this}
         */
        public Builder env(java.util.Map<java.lang.String, java.lang.String> env) {
            this.env = env;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HelmProviderKubernetesExec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HelmProviderKubernetesExec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HelmProviderKubernetesExec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HelmProviderKubernetesExec {
        private final java.lang.String apiVersion;
        private final java.lang.String command;
        private final java.util.List<java.lang.String> args;
        private final java.util.Map<java.lang.String, java.lang.String> env;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.command = software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.args = software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.env = software.amazon.jsii.Kernel.get(this, "env", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = java.util.Objects.requireNonNull(builder.apiVersion, "apiVersion is required");
            this.command = java.util.Objects.requireNonNull(builder.command, "command is required");
            this.args = builder.args;
            this.env = builder.env;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getCommand() {
            return this.command;
        }

        @Override
        public final java.util.List<java.lang.String> getArgs() {
            return this.args;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getEnv() {
            return this.env;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            data.set("command", om.valueToTree(this.getCommand()));
            if (this.getArgs() != null) {
                data.set("args", om.valueToTree(this.getArgs()));
            }
            if (this.getEnv() != null) {
                data.set("env", om.valueToTree(this.getEnv()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.HelmProviderKubernetesExec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HelmProviderKubernetesExec.Jsii$Proxy that = (HelmProviderKubernetesExec.Jsii$Proxy) o;

            if (!apiVersion.equals(that.apiVersion)) return false;
            if (!command.equals(that.command)) return false;
            if (this.args != null ? !this.args.equals(that.args) : that.args != null) return false;
            return this.env != null ? this.env.equals(that.env) : that.env == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion.hashCode();
            result = 31 * result + (this.command.hashCode());
            result = 31 * result + (this.args != null ? this.args.hashCode() : 0);
            result = 31 * result + (this.env != null ? this.env.hashCode() : 0);
            return result;
        }
    }
}
