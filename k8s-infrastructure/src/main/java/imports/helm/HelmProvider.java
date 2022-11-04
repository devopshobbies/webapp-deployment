package imports.helm;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/helm helm}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.010Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.HelmProvider")
public class HelmProvider extends com.hashicorp.cdktf.TerraformProvider {

    protected HelmProvider(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HelmProvider(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.helm.HelmProvider.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/helm helm} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public HelmProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.helm.HelmProviderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/helm helm} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public HelmProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDebug() {
        software.amazon.jsii.Kernel.call(this, "resetDebug", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExperiments() {
        software.amazon.jsii.Kernel.call(this, "resetExperiments", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHelmDriver() {
        software.amazon.jsii.Kernel.call(this, "resetHelmDriver", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKubernetes() {
        software.amazon.jsii.Kernel.call(this, "resetKubernetes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPluginsPath() {
        software.amazon.jsii.Kernel.call(this, "resetPluginsPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegistryConfigPath() {
        software.amazon.jsii.Kernel.call(this, "resetRegistryConfigPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryCache() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryCache", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryConfigPath() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryConfigPath", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAliasInput() {
        return software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDebugInput() {
        return software.amazon.jsii.Kernel.get(this, "debugInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.helm.HelmProviderExperiments getExperimentsInput() {
        return software.amazon.jsii.Kernel.get(this, "experimentsInput", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderExperiments.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHelmDriverInput() {
        return software.amazon.jsii.Kernel.get(this, "helmDriverInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.helm.HelmProviderKubernetes getKubernetesInput() {
        return software.amazon.jsii.Kernel.get(this, "kubernetesInput", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderKubernetes.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPluginsPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pluginsPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegistryConfigPathInput() {
        return software.amazon.jsii.Kernel.get(this, "registryConfigPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCacheInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCacheInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryConfigPathInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryConfigPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public void setAlias(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alias", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDebug() {
        return software.amazon.jsii.Kernel.get(this, "debug", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDebug(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "debug", value);
    }

    public void setDebug(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "debug", value);
    }

    public @org.jetbrains.annotations.Nullable imports.helm.HelmProviderExperiments getExperiments() {
        return software.amazon.jsii.Kernel.get(this, "experiments", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderExperiments.class));
    }

    public void setExperiments(final @org.jetbrains.annotations.Nullable imports.helm.HelmProviderExperiments value) {
        software.amazon.jsii.Kernel.set(this, "experiments", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHelmDriver() {
        return software.amazon.jsii.Kernel.get(this, "helmDriver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHelmDriver(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "helmDriver", value);
    }

    public @org.jetbrains.annotations.Nullable imports.helm.HelmProviderKubernetes getKubernetes() {
        return software.amazon.jsii.Kernel.get(this, "kubernetes", software.amazon.jsii.NativeType.forClass(imports.helm.HelmProviderKubernetes.class));
    }

    public void setKubernetes(final @org.jetbrains.annotations.Nullable imports.helm.HelmProviderKubernetes value) {
        software.amazon.jsii.Kernel.set(this, "kubernetes", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPluginsPath() {
        return software.amazon.jsii.Kernel.get(this, "pluginsPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPluginsPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pluginsPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegistryConfigPath() {
        return software.amazon.jsii.Kernel.get(this, "registryConfigPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegistryConfigPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "registryConfigPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCache() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCache", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryCache(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryCache", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryConfigPath() {
        return software.amazon.jsii.Kernel.get(this, "repositoryConfigPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryConfigPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryConfigPath", value);
    }

    /**
     * A fluent builder for {@link imports.helm.HelmProvider}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.helm.HelmProvider> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.helm.HelmProviderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * Alias name.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#alias HelmProvider#alias}
         * <p>
         * @return {@code this}
         * @param alias Alias name. This parameter is required.
         */
        public Builder alias(final java.lang.String alias) {
            this.config().alias(alias);
            return this;
        }

        /**
         * Debug indicates whether or not Helm is running in Debug mode.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#debug HelmProvider#debug}
         * <p>
         * @return {@code this}
         * @param debug Debug indicates whether or not Helm is running in Debug mode. This parameter is required.
         */
        public Builder debug(final java.lang.Boolean debug) {
            this.config().debug(debug);
            return this;
        }
        /**
         * Debug indicates whether or not Helm is running in Debug mode.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#debug HelmProvider#debug}
         * <p>
         * @return {@code this}
         * @param debug Debug indicates whether or not Helm is running in Debug mode. This parameter is required.
         */
        public Builder debug(final com.hashicorp.cdktf.IResolvable debug) {
            this.config().debug(debug);
            return this;
        }

        /**
         * experiments block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#experiments HelmProvider#experiments}
         * <p>
         * @return {@code this}
         * @param experiments experiments block. This parameter is required.
         */
        public Builder experiments(final imports.helm.HelmProviderExperiments experiments) {
            this.config().experiments(experiments);
            return this;
        }

        /**
         * The backend storage driver. Values are: configmap, secret, memory, sql.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#helm_driver HelmProvider#helm_driver}
         * <p>
         * @return {@code this}
         * @param helmDriver The backend storage driver. Values are: configmap, secret, memory, sql. This parameter is required.
         */
        public Builder helmDriver(final java.lang.String helmDriver) {
            this.config().helmDriver(helmDriver);
            return this;
        }

        /**
         * kubernetes block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#kubernetes HelmProvider#kubernetes}
         * <p>
         * @return {@code this}
         * @param kubernetes kubernetes block. This parameter is required.
         */
        public Builder kubernetes(final imports.helm.HelmProviderKubernetes kubernetes) {
            this.config().kubernetes(kubernetes);
            return this;
        }

        /**
         * The path to the helm plugins directory.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#plugins_path HelmProvider#plugins_path}
         * <p>
         * @return {@code this}
         * @param pluginsPath The path to the helm plugins directory. This parameter is required.
         */
        public Builder pluginsPath(final java.lang.String pluginsPath) {
            this.config().pluginsPath(pluginsPath);
            return this;
        }

        /**
         * The path to the registry config file.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#registry_config_path HelmProvider#registry_config_path}
         * <p>
         * @return {@code this}
         * @param registryConfigPath The path to the registry config file. This parameter is required.
         */
        public Builder registryConfigPath(final java.lang.String registryConfigPath) {
            this.config().registryConfigPath(registryConfigPath);
            return this;
        }

        /**
         * The path to the file containing cached repository indexes.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_cache HelmProvider#repository_cache}
         * <p>
         * @return {@code this}
         * @param repositoryCache The path to the file containing cached repository indexes. This parameter is required.
         */
        public Builder repositoryCache(final java.lang.String repositoryCache) {
            this.config().repositoryCache(repositoryCache);
            return this;
        }

        /**
         * The path to the file containing repository names and URLs.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm#repository_config_path HelmProvider#repository_config_path}
         * <p>
         * @return {@code this}
         * @param repositoryConfigPath The path to the file containing repository names and URLs. This parameter is required.
         */
        public Builder repositoryConfigPath(final java.lang.String repositoryConfigPath) {
            this.config().repositoryConfigPath(repositoryConfigPath);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.helm.HelmProvider}.
         */
        @Override
        public imports.helm.HelmProvider build() {
            return new imports.helm.HelmProvider(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.helm.HelmProviderConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.helm.HelmProviderConfig.Builder();
            }
            return this.config;
        }
    }
}
