package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.022Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.HelmProviderConfig")
@software.amazon.jsii.Jsii.Proxy(HelmProviderConfig.Jsii$Proxy.class)
public interface HelmProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Alias name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#alias HelmProvider#alias}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * Debug indicates whether or not Helm is running in Debug mode.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#debug HelmProvider#debug}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDebug() {
        return null;
    }

    /**
     * experiments block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#experiments HelmProvider#experiments}
     */
    default @org.jetbrains.annotations.Nullable imports.helm.HelmProviderExperiments getExperiments() {
        return null;
    }

    /**
     * The backend storage driver. Values are: configmap, secret, memory, sql.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#helm_driver HelmProvider#helm_driver}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHelmDriver() {
        return null;
    }

    /**
     * kubernetes block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#kubernetes HelmProvider#kubernetes}
     */
    default @org.jetbrains.annotations.Nullable imports.helm.HelmProviderKubernetes getKubernetes() {
        return null;
    }

    /**
     * The path to the helm plugins directory.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#plugins_path HelmProvider#plugins_path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPluginsPath() {
        return null;
    }

    /**
     * The path to the registry config file.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#registry_config_path HelmProvider#registry_config_path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRegistryConfigPath() {
        return null;
    }

    /**
     * The path to the file containing cached repository indexes.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_cache HelmProvider#repository_cache}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCache() {
        return null;
    }

    /**
     * The path to the file containing repository names and URLs.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_config_path HelmProvider#repository_config_path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryConfigPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HelmProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HelmProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HelmProviderConfig> {
        java.lang.String alias;
        java.lang.Object debug;
        imports.helm.HelmProviderExperiments experiments;
        java.lang.String helmDriver;
        imports.helm.HelmProviderKubernetes kubernetes;
        java.lang.String pluginsPath;
        java.lang.String registryConfigPath;
        java.lang.String repositoryCache;
        java.lang.String repositoryConfigPath;

        /**
         * Sets the value of {@link HelmProviderConfig#getAlias}
         * @param alias Alias name.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#alias HelmProvider#alias}
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getDebug}
         * @param debug Debug indicates whether or not Helm is running in Debug mode.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#debug HelmProvider#debug}
         * @return {@code this}
         */
        public Builder debug(java.lang.Boolean debug) {
            this.debug = debug;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getDebug}
         * @param debug Debug indicates whether or not Helm is running in Debug mode.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#debug HelmProvider#debug}
         * @return {@code this}
         */
        public Builder debug(com.hashicorp.cdktf.IResolvable debug) {
            this.debug = debug;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getExperiments}
         * @param experiments experiments block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#experiments HelmProvider#experiments}
         * @return {@code this}
         */
        public Builder experiments(imports.helm.HelmProviderExperiments experiments) {
            this.experiments = experiments;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getHelmDriver}
         * @param helmDriver The backend storage driver. Values are: configmap, secret, memory, sql.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#helm_driver HelmProvider#helm_driver}
         * @return {@code this}
         */
        public Builder helmDriver(java.lang.String helmDriver) {
            this.helmDriver = helmDriver;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getKubernetes}
         * @param kubernetes kubernetes block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#kubernetes HelmProvider#kubernetes}
         * @return {@code this}
         */
        public Builder kubernetes(imports.helm.HelmProviderKubernetes kubernetes) {
            this.kubernetes = kubernetes;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getPluginsPath}
         * @param pluginsPath The path to the helm plugins directory.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#plugins_path HelmProvider#plugins_path}
         * @return {@code this}
         */
        public Builder pluginsPath(java.lang.String pluginsPath) {
            this.pluginsPath = pluginsPath;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getRegistryConfigPath}
         * @param registryConfigPath The path to the registry config file.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#registry_config_path HelmProvider#registry_config_path}
         * @return {@code this}
         */
        public Builder registryConfigPath(java.lang.String registryConfigPath) {
            this.registryConfigPath = registryConfigPath;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getRepositoryCache}
         * @param repositoryCache The path to the file containing cached repository indexes.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_cache HelmProvider#repository_cache}
         * @return {@code this}
         */
        public Builder repositoryCache(java.lang.String repositoryCache) {
            this.repositoryCache = repositoryCache;
            return this;
        }

        /**
         * Sets the value of {@link HelmProviderConfig#getRepositoryConfigPath}
         * @param repositoryConfigPath The path to the file containing repository names and URLs.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_config_path HelmProvider#repository_config_path}
         * @return {@code this}
         */
        public Builder repositoryConfigPath(java.lang.String repositoryConfigPath) {
            this.repositoryConfigPath = repositoryConfigPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HelmProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HelmProviderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HelmProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HelmProviderConfig {
        private final java.lang.String alias;
        private final java.lang.Object debug;
        private final imports.helm.HelmProviderExperiments experiments;
        private final java.lang.String helmDriver;
        private final imports.helm.HelmProviderKubernetes kubernetes;
        private final java.lang.String pluginsPath;
        private final java.lang.String registryConfigPath;
        private final java.lang.String repositoryCache;
        private final java.lang.String repositoryConfigPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.debug = software.amazon.jsii.Kernel.get(this, "debug", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.experiments = software.amazon.jsii.Kernel.get(this, "experiments", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderExperiments.class));
            this.helmDriver = software.amazon.jsii.Kernel.get(this, "helmDriver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kubernetes = software.amazon.jsii.Kernel.get(this, "kubernetes", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderKubernetes.class));
            this.pluginsPath = software.amazon.jsii.Kernel.get(this, "pluginsPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.registryConfigPath = software.amazon.jsii.Kernel.get(this, "registryConfigPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryCache = software.amazon.jsii.Kernel.get(this, "repositoryCache", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryConfigPath = software.amazon.jsii.Kernel.get(this, "repositoryConfigPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alias = builder.alias;
            this.debug = builder.debug;
            this.experiments = builder.experiments;
            this.helmDriver = builder.helmDriver;
            this.kubernetes = builder.kubernetes;
            this.pluginsPath = builder.pluginsPath;
            this.registryConfigPath = builder.registryConfigPath;
            this.repositoryCache = builder.repositoryCache;
            this.repositoryConfigPath = builder.repositoryConfigPath;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.lang.Object getDebug() {
            return this.debug;
        }

        @Override
        public final imports.helm.HelmProviderExperiments getExperiments() {
            return this.experiments;
        }

        @Override
        public final java.lang.String getHelmDriver() {
            return this.helmDriver;
        }

        @Override
        public final imports.helm.HelmProviderKubernetes getKubernetes() {
            return this.kubernetes;
        }

        @Override
        public final java.lang.String getPluginsPath() {
            return this.pluginsPath;
        }

        @Override
        public final java.lang.String getRegistryConfigPath() {
            return this.registryConfigPath;
        }

        @Override
        public final java.lang.String getRepositoryCache() {
            return this.repositoryCache;
        }

        @Override
        public final java.lang.String getRepositoryConfigPath() {
            return this.repositoryConfigPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getDebug() != null) {
                data.set("debug", om.valueToTree(this.getDebug()));
            }
            if (this.getExperiments() != null) {
                data.set("experiments", om.valueToTree(this.getExperiments()));
            }
            if (this.getHelmDriver() != null) {
                data.set("helmDriver", om.valueToTree(this.getHelmDriver()));
            }
            if (this.getKubernetes() != null) {
                data.set("kubernetes", om.valueToTree(this.getKubernetes()));
            }
            if (this.getPluginsPath() != null) {
                data.set("pluginsPath", om.valueToTree(this.getPluginsPath()));
            }
            if (this.getRegistryConfigPath() != null) {
                data.set("registryConfigPath", om.valueToTree(this.getRegistryConfigPath()));
            }
            if (this.getRepositoryCache() != null) {
                data.set("repositoryCache", om.valueToTree(this.getRepositoryCache()));
            }
            if (this.getRepositoryConfigPath() != null) {
                data.set("repositoryConfigPath", om.valueToTree(this.getRepositoryConfigPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.HelmProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HelmProviderConfig.Jsii$Proxy that = (HelmProviderConfig.Jsii$Proxy) o;

            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.debug != null ? !this.debug.equals(that.debug) : that.debug != null) return false;
            if (this.experiments != null ? !this.experiments.equals(that.experiments) : that.experiments != null) return false;
            if (this.helmDriver != null ? !this.helmDriver.equals(that.helmDriver) : that.helmDriver != null) return false;
            if (this.kubernetes != null ? !this.kubernetes.equals(that.kubernetes) : that.kubernetes != null) return false;
            if (this.pluginsPath != null ? !this.pluginsPath.equals(that.pluginsPath) : that.pluginsPath != null) return false;
            if (this.registryConfigPath != null ? !this.registryConfigPath.equals(that.registryConfigPath) : that.registryConfigPath != null) return false;
            if (this.repositoryCache != null ? !this.repositoryCache.equals(that.repositoryCache) : that.repositoryCache != null) return false;
            return this.repositoryConfigPath != null ? this.repositoryConfigPath.equals(that.repositoryConfigPath) : that.repositoryConfigPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.alias != null ? this.alias.hashCode() : 0;
            result = 31 * result + (this.debug != null ? this.debug.hashCode() : 0);
            result = 31 * result + (this.experiments != null ? this.experiments.hashCode() : 0);
            result = 31 * result + (this.helmDriver != null ? this.helmDriver.hashCode() : 0);
            result = 31 * result + (this.kubernetes != null ? this.kubernetes.hashCode() : 0);
            result = 31 * result + (this.pluginsPath != null ? this.pluginsPath.hashCode() : 0);
            result = 31 * result + (this.registryConfigPath != null ? this.registryConfigPath.hashCode() : 0);
            result = 31 * result + (this.repositoryCache != null ? this.repositoryCache.hashCode() : 0);
            result = 31 * result + (this.repositoryConfigPath != null ? this.repositoryConfigPath.hashCode() : 0);
            return result;
        }
    }
}
