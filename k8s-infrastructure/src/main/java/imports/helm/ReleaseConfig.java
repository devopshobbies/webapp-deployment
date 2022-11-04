package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.040Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.ReleaseConfig")
@software.amazon.jsii.Jsii.Proxy(ReleaseConfig.Jsii$Proxy.class)
public interface ReleaseConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Chart name to be installed. A path may be used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#chart Release#chart}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getChart();

    /**
     * Release name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#name Release#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#atomic Release#atomic}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAtomic() {
        return null;
    }

    /**
     * Allow deletion of new resources created in this upgrade when upgrade fails.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#cleanup_on_fail Release#cleanup_on_fail}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCleanupOnFail() {
        return null;
    }

    /**
     * Create the namespace if it does not exist.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#create_namespace Release#create_namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCreateNamespace() {
        return null;
    }

    /**
     * Run helm dependency update before installing the chart.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#dependency_update Release#dependency_update}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDependencyUpdate() {
        return null;
    }

    /**
     * Add a custom description.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#description Release#description}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#devel Release#devel}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDevel() {
        return null;
    }

    /**
     * Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_crd_hooks Release#disable_crd_hooks}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisableCrdHooks() {
        return null;
    }

    /**
     * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_openapi_validation Release#disable_openapi_validation}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisableOpenapiValidation() {
        return null;
    }

    /**
     * Prevent hooks from running.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_webhooks Release#disable_webhooks}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisableWebhooks() {
        return null;
    }

    /**
     * Force resource update through delete/recreate if needed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#force_update Release#force_update}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceUpdate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#id Release#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Location of public keys used for verification. Used only if `verify` is true.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#keyring Release#keyring}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyring() {
        return null;
    }

    /**
     * Run helm lint when planning.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#lint Release#lint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLint() {
        return null;
    }

    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#max_history Release#max_history}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxHistory() {
        return null;
    }

    /**
     * Namespace to install the release into.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#namespace Release#namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * postrender block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#postrender Release#postrender}
     */
    default @org.jetbrains.annotations.Nullable imports.helm.ReleasePostrender getPostrender() {
        return null;
    }

    /**
     * Perform pods restart during upgrade/rollback.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#recreate_pods Release#recreate_pods}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRecreatePods() {
        return null;
    }

    /**
     * If set, render subchart notes along with the parent.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#render_subchart_notes Release#render_subchart_notes}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRenderSubchartNotes() {
        return null;
    }

    /**
     * Re-use the given name, even if that name is already used. This is unsafe in production.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#replace Release#replace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReplace() {
        return null;
    }

    /**
     * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository Release#repository}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepository() {
        return null;
    }

    /**
     * The Repositories CA File.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_ca_file Release#repository_ca_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCaFile() {
        return null;
    }

    /**
     * The repositories cert file.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_cert_file Release#repository_cert_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCertFile() {
        return null;
    }

    /**
     * The repositories cert key file.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_key_file Release#repository_key_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryKeyFile() {
        return null;
    }

    /**
     * Password for HTTP basic authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_password Release#repository_password}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryPassword() {
        return null;
    }

    /**
     * Username for HTTP basic authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_username Release#repository_username}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryUsername() {
        return null;
    }

    /**
     * When upgrading, reset the values to the ones built into the chart.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reset_values Release#reset_values}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getResetValues() {
        return null;
    }

    /**
     * When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reuse_values Release#reuse_values}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReuseValues() {
        return null;
    }

    /**
     * set block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set Release#set}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSet() {
        return null;
    }

    /**
     * set_sensitive block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set_sensitive Release#set_sensitive}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSetSensitive() {
        return null;
    }

    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#skip_crds Release#skip_crds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipCrds() {
        return null;
    }

    /**
     * Time in seconds to wait for any individual kubernetes operation.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#timeout Release#timeout}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * List of values in raw yaml format to pass to helm.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#values Release#values}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * Verify the package before installing it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#verify Release#verify}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getVerify() {
        return null;
    }

    /**
     * Specify the exact chart version to install. If this is not specified, the latest version is installed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#version Release#version}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * Will wait until all resources are in a ready state before marking the release as successful.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait Release#wait}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWait() {
        return null;
    }

    /**
     * If wait is enabled, will wait until all Jobs have been completed before marking the release as successful.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait_for_jobs Release#wait_for_jobs}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitForJobs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReleaseConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReleaseConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReleaseConfig> {
        java.lang.String chart;
        java.lang.String name;
        java.lang.Object atomic;
        java.lang.Object cleanupOnFail;
        java.lang.Object createNamespace;
        java.lang.Object dependencyUpdate;
        java.lang.String description;
        java.lang.Object devel;
        java.lang.Object disableCrdHooks;
        java.lang.Object disableOpenapiValidation;
        java.lang.Object disableWebhooks;
        java.lang.Object forceUpdate;
        java.lang.String id;
        java.lang.String keyring;
        java.lang.Object lint;
        java.lang.Number maxHistory;
        java.lang.String namespace;
        imports.helm.ReleasePostrender postrender;
        java.lang.Object recreatePods;
        java.lang.Object renderSubchartNotes;
        java.lang.Object replace;
        java.lang.String repository;
        java.lang.String repositoryCaFile;
        java.lang.String repositoryCertFile;
        java.lang.String repositoryKeyFile;
        java.lang.String repositoryPassword;
        java.lang.String repositoryUsername;
        java.lang.Object resetValues;
        java.lang.Object reuseValues;
        java.lang.Object set;
        java.lang.Object setSensitive;
        java.lang.Object skipCrds;
        java.lang.Number timeout;
        java.util.List<java.lang.String> values;
        java.lang.Object verify;
        java.lang.String version;
        java.lang.Object wait;
        java.lang.Object waitForJobs;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ReleaseConfig#getChart}
         * @param chart Chart name to be installed. A path may be used. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#chart Release#chart}
         * @return {@code this}
         */
        public Builder chart(java.lang.String chart) {
            this.chart = chart;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getName}
         * @param name Release name. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#name Release#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getAtomic}
         * @param atomic If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#atomic Release#atomic}
         * @return {@code this}
         */
        public Builder atomic(java.lang.Boolean atomic) {
            this.atomic = atomic;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getAtomic}
         * @param atomic If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#atomic Release#atomic}
         * @return {@code this}
         */
        public Builder atomic(com.hashicorp.cdktf.IResolvable atomic) {
            this.atomic = atomic;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getCleanupOnFail}
         * @param cleanupOnFail Allow deletion of new resources created in this upgrade when upgrade fails.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#cleanup_on_fail Release#cleanup_on_fail}
         * @return {@code this}
         */
        public Builder cleanupOnFail(java.lang.Boolean cleanupOnFail) {
            this.cleanupOnFail = cleanupOnFail;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getCleanupOnFail}
         * @param cleanupOnFail Allow deletion of new resources created in this upgrade when upgrade fails.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#cleanup_on_fail Release#cleanup_on_fail}
         * @return {@code this}
         */
        public Builder cleanupOnFail(com.hashicorp.cdktf.IResolvable cleanupOnFail) {
            this.cleanupOnFail = cleanupOnFail;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getCreateNamespace}
         * @param createNamespace Create the namespace if it does not exist.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#create_namespace Release#create_namespace}
         * @return {@code this}
         */
        public Builder createNamespace(java.lang.Boolean createNamespace) {
            this.createNamespace = createNamespace;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getCreateNamespace}
         * @param createNamespace Create the namespace if it does not exist.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#create_namespace Release#create_namespace}
         * @return {@code this}
         */
        public Builder createNamespace(com.hashicorp.cdktf.IResolvable createNamespace) {
            this.createNamespace = createNamespace;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDependencyUpdate}
         * @param dependencyUpdate Run helm dependency update before installing the chart.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#dependency_update Release#dependency_update}
         * @return {@code this}
         */
        public Builder dependencyUpdate(java.lang.Boolean dependencyUpdate) {
            this.dependencyUpdate = dependencyUpdate;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDependencyUpdate}
         * @param dependencyUpdate Run helm dependency update before installing the chart.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#dependency_update Release#dependency_update}
         * @return {@code this}
         */
        public Builder dependencyUpdate(com.hashicorp.cdktf.IResolvable dependencyUpdate) {
            this.dependencyUpdate = dependencyUpdate;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDescription}
         * @param description Add a custom description.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#description Release#description}
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDevel}
         * @param devel Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#devel Release#devel}
         * @return {@code this}
         */
        public Builder devel(java.lang.Boolean devel) {
            this.devel = devel;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDevel}
         * @param devel Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#devel Release#devel}
         * @return {@code this}
         */
        public Builder devel(com.hashicorp.cdktf.IResolvable devel) {
            this.devel = devel;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableCrdHooks}
         * @param disableCrdHooks Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_crd_hooks Release#disable_crd_hooks}
         * @return {@code this}
         */
        public Builder disableCrdHooks(java.lang.Boolean disableCrdHooks) {
            this.disableCrdHooks = disableCrdHooks;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableCrdHooks}
         * @param disableCrdHooks Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_crd_hooks Release#disable_crd_hooks}
         * @return {@code this}
         */
        public Builder disableCrdHooks(com.hashicorp.cdktf.IResolvable disableCrdHooks) {
            this.disableCrdHooks = disableCrdHooks;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableOpenapiValidation}
         * @param disableOpenapiValidation If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_openapi_validation Release#disable_openapi_validation}
         * @return {@code this}
         */
        public Builder disableOpenapiValidation(java.lang.Boolean disableOpenapiValidation) {
            this.disableOpenapiValidation = disableOpenapiValidation;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableOpenapiValidation}
         * @param disableOpenapiValidation If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_openapi_validation Release#disable_openapi_validation}
         * @return {@code this}
         */
        public Builder disableOpenapiValidation(com.hashicorp.cdktf.IResolvable disableOpenapiValidation) {
            this.disableOpenapiValidation = disableOpenapiValidation;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableWebhooks}
         * @param disableWebhooks Prevent hooks from running.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_webhooks Release#disable_webhooks}
         * @return {@code this}
         */
        public Builder disableWebhooks(java.lang.Boolean disableWebhooks) {
            this.disableWebhooks = disableWebhooks;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDisableWebhooks}
         * @param disableWebhooks Prevent hooks from running.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_webhooks Release#disable_webhooks}
         * @return {@code this}
         */
        public Builder disableWebhooks(com.hashicorp.cdktf.IResolvable disableWebhooks) {
            this.disableWebhooks = disableWebhooks;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getForceUpdate}
         * @param forceUpdate Force resource update through delete/recreate if needed.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#force_update Release#force_update}
         * @return {@code this}
         */
        public Builder forceUpdate(java.lang.Boolean forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getForceUpdate}
         * @param forceUpdate Force resource update through delete/recreate if needed.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#force_update Release#force_update}
         * @return {@code this}
         */
        public Builder forceUpdate(com.hashicorp.cdktf.IResolvable forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#id Release#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getKeyring}
         * @param keyring Location of public keys used for verification. Used only if `verify` is true.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#keyring Release#keyring}
         * @return {@code this}
         */
        public Builder keyring(java.lang.String keyring) {
            this.keyring = keyring;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getLint}
         * @param lint Run helm lint when planning.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#lint Release#lint}
         * @return {@code this}
         */
        public Builder lint(java.lang.Boolean lint) {
            this.lint = lint;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getLint}
         * @param lint Run helm lint when planning.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#lint Release#lint}
         * @return {@code this}
         */
        public Builder lint(com.hashicorp.cdktf.IResolvable lint) {
            this.lint = lint;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getMaxHistory}
         * @param maxHistory Limit the maximum number of revisions saved per release. Use 0 for no limit.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#max_history Release#max_history}
         * @return {@code this}
         */
        public Builder maxHistory(java.lang.Number maxHistory) {
            this.maxHistory = maxHistory;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getNamespace}
         * @param namespace Namespace to install the release into.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#namespace Release#namespace}
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getPostrender}
         * @param postrender postrender block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#postrender Release#postrender}
         * @return {@code this}
         */
        public Builder postrender(imports.helm.ReleasePostrender postrender) {
            this.postrender = postrender;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRecreatePods}
         * @param recreatePods Perform pods restart during upgrade/rollback.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#recreate_pods Release#recreate_pods}
         * @return {@code this}
         */
        public Builder recreatePods(java.lang.Boolean recreatePods) {
            this.recreatePods = recreatePods;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRecreatePods}
         * @param recreatePods Perform pods restart during upgrade/rollback.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#recreate_pods Release#recreate_pods}
         * @return {@code this}
         */
        public Builder recreatePods(com.hashicorp.cdktf.IResolvable recreatePods) {
            this.recreatePods = recreatePods;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRenderSubchartNotes}
         * @param renderSubchartNotes If set, render subchart notes along with the parent.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#render_subchart_notes Release#render_subchart_notes}
         * @return {@code this}
         */
        public Builder renderSubchartNotes(java.lang.Boolean renderSubchartNotes) {
            this.renderSubchartNotes = renderSubchartNotes;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRenderSubchartNotes}
         * @param renderSubchartNotes If set, render subchart notes along with the parent.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#render_subchart_notes Release#render_subchart_notes}
         * @return {@code this}
         */
        public Builder renderSubchartNotes(com.hashicorp.cdktf.IResolvable renderSubchartNotes) {
            this.renderSubchartNotes = renderSubchartNotes;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getReplace}
         * @param replace Re-use the given name, even if that name is already used. This is unsafe in production.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#replace Release#replace}
         * @return {@code this}
         */
        public Builder replace(java.lang.Boolean replace) {
            this.replace = replace;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getReplace}
         * @param replace Re-use the given name, even if that name is already used. This is unsafe in production.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#replace Release#replace}
         * @return {@code this}
         */
        public Builder replace(com.hashicorp.cdktf.IResolvable replace) {
            this.replace = replace;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepository}
         * @param repository Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository Release#repository}
         * @return {@code this}
         */
        public Builder repository(java.lang.String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepositoryCaFile}
         * @param repositoryCaFile The Repositories CA File.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_ca_file Release#repository_ca_file}
         * @return {@code this}
         */
        public Builder repositoryCaFile(java.lang.String repositoryCaFile) {
            this.repositoryCaFile = repositoryCaFile;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepositoryCertFile}
         * @param repositoryCertFile The repositories cert file.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_cert_file Release#repository_cert_file}
         * @return {@code this}
         */
        public Builder repositoryCertFile(java.lang.String repositoryCertFile) {
            this.repositoryCertFile = repositoryCertFile;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepositoryKeyFile}
         * @param repositoryKeyFile The repositories cert key file.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_key_file Release#repository_key_file}
         * @return {@code this}
         */
        public Builder repositoryKeyFile(java.lang.String repositoryKeyFile) {
            this.repositoryKeyFile = repositoryKeyFile;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepositoryPassword}
         * @param repositoryPassword Password for HTTP basic authentication.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_password Release#repository_password}
         * @return {@code this}
         */
        public Builder repositoryPassword(java.lang.String repositoryPassword) {
            this.repositoryPassword = repositoryPassword;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getRepositoryUsername}
         * @param repositoryUsername Username for HTTP basic authentication.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_username Release#repository_username}
         * @return {@code this}
         */
        public Builder repositoryUsername(java.lang.String repositoryUsername) {
            this.repositoryUsername = repositoryUsername;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getResetValues}
         * @param resetValues When upgrading, reset the values to the ones built into the chart.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reset_values Release#reset_values}
         * @return {@code this}
         */
        public Builder resetValues(java.lang.Boolean resetValues) {
            this.resetValues = resetValues;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getResetValues}
         * @param resetValues When upgrading, reset the values to the ones built into the chart.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reset_values Release#reset_values}
         * @return {@code this}
         */
        public Builder resetValues(com.hashicorp.cdktf.IResolvable resetValues) {
            this.resetValues = resetValues;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getReuseValues}
         * @param reuseValues When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reuse_values Release#reuse_values}
         * @return {@code this}
         */
        public Builder reuseValues(java.lang.Boolean reuseValues) {
            this.reuseValues = reuseValues;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getReuseValues}
         * @param reuseValues When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reuse_values Release#reuse_values}
         * @return {@code this}
         */
        public Builder reuseValues(com.hashicorp.cdktf.IResolvable reuseValues) {
            this.reuseValues = reuseValues;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSet}
         * @param set set block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set Release#set}
         * @return {@code this}
         */
        public Builder set(com.hashicorp.cdktf.IResolvable set) {
            this.set = set;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSet}
         * @param set set block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set Release#set}
         * @return {@code this}
         */
        public Builder set(java.util.List<? extends imports.helm.ReleaseSet> set) {
            this.set = set;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSetSensitive}
         * @param setSensitive set_sensitive block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set_sensitive Release#set_sensitive}
         * @return {@code this}
         */
        public Builder setSensitive(com.hashicorp.cdktf.IResolvable setSensitive) {
            this.setSensitive = setSensitive;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSetSensitive}
         * @param setSensitive set_sensitive block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set_sensitive Release#set_sensitive}
         * @return {@code this}
         */
        public Builder setSensitive(java.util.List<? extends imports.helm.ReleaseSetSensitive> setSensitive) {
            this.setSensitive = setSensitive;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSkipCrds}
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#skip_crds Release#skip_crds}
         * @return {@code this}
         */
        public Builder skipCrds(java.lang.Boolean skipCrds) {
            this.skipCrds = skipCrds;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getSkipCrds}
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#skip_crds Release#skip_crds}
         * @return {@code this}
         */
        public Builder skipCrds(com.hashicorp.cdktf.IResolvable skipCrds) {
            this.skipCrds = skipCrds;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getTimeout}
         * @param timeout Time in seconds to wait for any individual kubernetes operation.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#timeout Release#timeout}
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getValues}
         * @param values List of values in raw yaml format to pass to helm.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#values Release#values}
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getVerify}
         * @param verify Verify the package before installing it.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#verify Release#verify}
         * @return {@code this}
         */
        public Builder verify(java.lang.Boolean verify) {
            this.verify = verify;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getVerify}
         * @param verify Verify the package before installing it.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#verify Release#verify}
         * @return {@code this}
         */
        public Builder verify(com.hashicorp.cdktf.IResolvable verify) {
            this.verify = verify;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getVersion}
         * @param version Specify the exact chart version to install. If this is not specified, the latest version is installed.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#version Release#version}
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getWait}
         * @param wait Will wait until all resources are in a ready state before marking the release as successful.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait Release#wait}
         * @return {@code this}
         */
        public Builder wait(java.lang.Boolean wait) {
            this.wait = wait;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getWait}
         * @param wait Will wait until all resources are in a ready state before marking the release as successful.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait Release#wait}
         * @return {@code this}
         */
        public Builder wait(com.hashicorp.cdktf.IResolvable wait) {
            this.wait = wait;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getWaitForJobs}
         * @param waitForJobs If wait is enabled, will wait until all Jobs have been completed before marking the release as successful.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait_for_jobs Release#wait_for_jobs}
         * @return {@code this}
         */
        public Builder waitForJobs(java.lang.Boolean waitForJobs) {
            this.waitForJobs = waitForJobs;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getWaitForJobs}
         * @param waitForJobs If wait is enabled, will wait until all Jobs have been completed before marking the release as successful.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait_for_jobs Release#wait_for_jobs}
         * @return {@code this}
         */
        public Builder waitForJobs(com.hashicorp.cdktf.IResolvable waitForJobs) {
            this.waitForJobs = waitForJobs;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReleaseConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReleaseConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReleaseConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReleaseConfig {
        private final java.lang.String chart;
        private final java.lang.String name;
        private final java.lang.Object atomic;
        private final java.lang.Object cleanupOnFail;
        private final java.lang.Object createNamespace;
        private final java.lang.Object dependencyUpdate;
        private final java.lang.String description;
        private final java.lang.Object devel;
        private final java.lang.Object disableCrdHooks;
        private final java.lang.Object disableOpenapiValidation;
        private final java.lang.Object disableWebhooks;
        private final java.lang.Object forceUpdate;
        private final java.lang.String id;
        private final java.lang.String keyring;
        private final java.lang.Object lint;
        private final java.lang.Number maxHistory;
        private final java.lang.String namespace;
        private final imports.helm.ReleasePostrender postrender;
        private final java.lang.Object recreatePods;
        private final java.lang.Object renderSubchartNotes;
        private final java.lang.Object replace;
        private final java.lang.String repository;
        private final java.lang.String repositoryCaFile;
        private final java.lang.String repositoryCertFile;
        private final java.lang.String repositoryKeyFile;
        private final java.lang.String repositoryPassword;
        private final java.lang.String repositoryUsername;
        private final java.lang.Object resetValues;
        private final java.lang.Object reuseValues;
        private final java.lang.Object set;
        private final java.lang.Object setSensitive;
        private final java.lang.Object skipCrds;
        private final java.lang.Number timeout;
        private final java.util.List<java.lang.String> values;
        private final java.lang.Object verify;
        private final java.lang.String version;
        private final java.lang.Object wait;
        private final java.lang.Object waitForJobs;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.chart = software.amazon.jsii.Kernel.get(this, "chart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.atomic = software.amazon.jsii.Kernel.get(this, "atomic", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.cleanupOnFail = software.amazon.jsii.Kernel.get(this, "cleanupOnFail", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.createNamespace = software.amazon.jsii.Kernel.get(this, "createNamespace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependencyUpdate = software.amazon.jsii.Kernel.get(this, "dependencyUpdate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.devel = software.amazon.jsii.Kernel.get(this, "devel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.disableCrdHooks = software.amazon.jsii.Kernel.get(this, "disableCrdHooks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.disableOpenapiValidation = software.amazon.jsii.Kernel.get(this, "disableOpenapiValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.disableWebhooks = software.amazon.jsii.Kernel.get(this, "disableWebhooks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.forceUpdate = software.amazon.jsii.Kernel.get(this, "forceUpdate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyring = software.amazon.jsii.Kernel.get(this, "keyring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lint = software.amazon.jsii.Kernel.get(this, "lint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxHistory = software.amazon.jsii.Kernel.get(this, "maxHistory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postrender = software.amazon.jsii.Kernel.get(this, "postrender", software.amazon.jsii.NativeType.forClass(imports.helm.ReleasePostrender.class));
            this.recreatePods = software.amazon.jsii.Kernel.get(this, "recreatePods", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.renderSubchartNotes = software.amazon.jsii.Kernel.get(this, "renderSubchartNotes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.replace = software.amazon.jsii.Kernel.get(this, "replace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.repository = software.amazon.jsii.Kernel.get(this, "repository", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryCaFile = software.amazon.jsii.Kernel.get(this, "repositoryCaFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryCertFile = software.amazon.jsii.Kernel.get(this, "repositoryCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryKeyFile = software.amazon.jsii.Kernel.get(this, "repositoryKeyFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryPassword = software.amazon.jsii.Kernel.get(this, "repositoryPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryUsername = software.amazon.jsii.Kernel.get(this, "repositoryUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resetValues = software.amazon.jsii.Kernel.get(this, "resetValues", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.reuseValues = software.amazon.jsii.Kernel.get(this, "reuseValues", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.set = software.amazon.jsii.Kernel.get(this, "set", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.setSensitive = software.amazon.jsii.Kernel.get(this, "setSensitive", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skipCrds = software.amazon.jsii.Kernel.get(this, "skipCrds", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.verify = software.amazon.jsii.Kernel.get(this, "verify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.wait = software.amazon.jsii.Kernel.get(this, "wait", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.waitForJobs = software.amazon.jsii.Kernel.get(this, "waitForJobs", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.chart = java.util.Objects.requireNonNull(builder.chart, "chart is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.atomic = builder.atomic;
            this.cleanupOnFail = builder.cleanupOnFail;
            this.createNamespace = builder.createNamespace;
            this.dependencyUpdate = builder.dependencyUpdate;
            this.description = builder.description;
            this.devel = builder.devel;
            this.disableCrdHooks = builder.disableCrdHooks;
            this.disableOpenapiValidation = builder.disableOpenapiValidation;
            this.disableWebhooks = builder.disableWebhooks;
            this.forceUpdate = builder.forceUpdate;
            this.id = builder.id;
            this.keyring = builder.keyring;
            this.lint = builder.lint;
            this.maxHistory = builder.maxHistory;
            this.namespace = builder.namespace;
            this.postrender = builder.postrender;
            this.recreatePods = builder.recreatePods;
            this.renderSubchartNotes = builder.renderSubchartNotes;
            this.replace = builder.replace;
            this.repository = builder.repository;
            this.repositoryCaFile = builder.repositoryCaFile;
            this.repositoryCertFile = builder.repositoryCertFile;
            this.repositoryKeyFile = builder.repositoryKeyFile;
            this.repositoryPassword = builder.repositoryPassword;
            this.repositoryUsername = builder.repositoryUsername;
            this.resetValues = builder.resetValues;
            this.reuseValues = builder.reuseValues;
            this.set = builder.set;
            this.setSensitive = builder.setSensitive;
            this.skipCrds = builder.skipCrds;
            this.timeout = builder.timeout;
            this.values = builder.values;
            this.verify = builder.verify;
            this.version = builder.version;
            this.wait = builder.wait;
            this.waitForJobs = builder.waitForJobs;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getChart() {
            return this.chart;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getAtomic() {
            return this.atomic;
        }

        @Override
        public final java.lang.Object getCleanupOnFail() {
            return this.cleanupOnFail;
        }

        @Override
        public final java.lang.Object getCreateNamespace() {
            return this.createNamespace;
        }

        @Override
        public final java.lang.Object getDependencyUpdate() {
            return this.dependencyUpdate;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Object getDevel() {
            return this.devel;
        }

        @Override
        public final java.lang.Object getDisableCrdHooks() {
            return this.disableCrdHooks;
        }

        @Override
        public final java.lang.Object getDisableOpenapiValidation() {
            return this.disableOpenapiValidation;
        }

        @Override
        public final java.lang.Object getDisableWebhooks() {
            return this.disableWebhooks;
        }

        @Override
        public final java.lang.Object getForceUpdate() {
            return this.forceUpdate;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getKeyring() {
            return this.keyring;
        }

        @Override
        public final java.lang.Object getLint() {
            return this.lint;
        }

        @Override
        public final java.lang.Number getMaxHistory() {
            return this.maxHistory;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final imports.helm.ReleasePostrender getPostrender() {
            return this.postrender;
        }

        @Override
        public final java.lang.Object getRecreatePods() {
            return this.recreatePods;
        }

        @Override
        public final java.lang.Object getRenderSubchartNotes() {
            return this.renderSubchartNotes;
        }

        @Override
        public final java.lang.Object getReplace() {
            return this.replace;
        }

        @Override
        public final java.lang.String getRepository() {
            return this.repository;
        }

        @Override
        public final java.lang.String getRepositoryCaFile() {
            return this.repositoryCaFile;
        }

        @Override
        public final java.lang.String getRepositoryCertFile() {
            return this.repositoryCertFile;
        }

        @Override
        public final java.lang.String getRepositoryKeyFile() {
            return this.repositoryKeyFile;
        }

        @Override
        public final java.lang.String getRepositoryPassword() {
            return this.repositoryPassword;
        }

        @Override
        public final java.lang.String getRepositoryUsername() {
            return this.repositoryUsername;
        }

        @Override
        public final java.lang.Object getResetValues() {
            return this.resetValues;
        }

        @Override
        public final java.lang.Object getReuseValues() {
            return this.reuseValues;
        }

        @Override
        public final java.lang.Object getSet() {
            return this.set;
        }

        @Override
        public final java.lang.Object getSetSensitive() {
            return this.setSensitive;
        }

        @Override
        public final java.lang.Object getSkipCrds() {
            return this.skipCrds;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        public final java.lang.Object getVerify() {
            return this.verify;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final java.lang.Object getWait() {
            return this.wait;
        }

        @Override
        public final java.lang.Object getWaitForJobs() {
            return this.waitForJobs;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("chart", om.valueToTree(this.getChart()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAtomic() != null) {
                data.set("atomic", om.valueToTree(this.getAtomic()));
            }
            if (this.getCleanupOnFail() != null) {
                data.set("cleanupOnFail", om.valueToTree(this.getCleanupOnFail()));
            }
            if (this.getCreateNamespace() != null) {
                data.set("createNamespace", om.valueToTree(this.getCreateNamespace()));
            }
            if (this.getDependencyUpdate() != null) {
                data.set("dependencyUpdate", om.valueToTree(this.getDependencyUpdate()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDevel() != null) {
                data.set("devel", om.valueToTree(this.getDevel()));
            }
            if (this.getDisableCrdHooks() != null) {
                data.set("disableCrdHooks", om.valueToTree(this.getDisableCrdHooks()));
            }
            if (this.getDisableOpenapiValidation() != null) {
                data.set("disableOpenapiValidation", om.valueToTree(this.getDisableOpenapiValidation()));
            }
            if (this.getDisableWebhooks() != null) {
                data.set("disableWebhooks", om.valueToTree(this.getDisableWebhooks()));
            }
            if (this.getForceUpdate() != null) {
                data.set("forceUpdate", om.valueToTree(this.getForceUpdate()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getKeyring() != null) {
                data.set("keyring", om.valueToTree(this.getKeyring()));
            }
            if (this.getLint() != null) {
                data.set("lint", om.valueToTree(this.getLint()));
            }
            if (this.getMaxHistory() != null) {
                data.set("maxHistory", om.valueToTree(this.getMaxHistory()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getPostrender() != null) {
                data.set("postrender", om.valueToTree(this.getPostrender()));
            }
            if (this.getRecreatePods() != null) {
                data.set("recreatePods", om.valueToTree(this.getRecreatePods()));
            }
            if (this.getRenderSubchartNotes() != null) {
                data.set("renderSubchartNotes", om.valueToTree(this.getRenderSubchartNotes()));
            }
            if (this.getReplace() != null) {
                data.set("replace", om.valueToTree(this.getReplace()));
            }
            if (this.getRepository() != null) {
                data.set("repository", om.valueToTree(this.getRepository()));
            }
            if (this.getRepositoryCaFile() != null) {
                data.set("repositoryCaFile", om.valueToTree(this.getRepositoryCaFile()));
            }
            if (this.getRepositoryCertFile() != null) {
                data.set("repositoryCertFile", om.valueToTree(this.getRepositoryCertFile()));
            }
            if (this.getRepositoryKeyFile() != null) {
                data.set("repositoryKeyFile", om.valueToTree(this.getRepositoryKeyFile()));
            }
            if (this.getRepositoryPassword() != null) {
                data.set("repositoryPassword", om.valueToTree(this.getRepositoryPassword()));
            }
            if (this.getRepositoryUsername() != null) {
                data.set("repositoryUsername", om.valueToTree(this.getRepositoryUsername()));
            }
            if (this.getResetValues() != null) {
                data.set("resetValues", om.valueToTree(this.getResetValues()));
            }
            if (this.getReuseValues() != null) {
                data.set("reuseValues", om.valueToTree(this.getReuseValues()));
            }
            if (this.getSet() != null) {
                data.set("set", om.valueToTree(this.getSet()));
            }
            if (this.getSetSensitive() != null) {
                data.set("setSensitive", om.valueToTree(this.getSetSensitive()));
            }
            if (this.getSkipCrds() != null) {
                data.set("skipCrds", om.valueToTree(this.getSkipCrds()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }
            if (this.getVerify() != null) {
                data.set("verify", om.valueToTree(this.getVerify()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }
            if (this.getWait() != null) {
                data.set("wait", om.valueToTree(this.getWait()));
            }
            if (this.getWaitForJobs() != null) {
                data.set("waitForJobs", om.valueToTree(this.getWaitForJobs()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.ReleaseConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReleaseConfig.Jsii$Proxy that = (ReleaseConfig.Jsii$Proxy) o;

            if (!chart.equals(that.chart)) return false;
            if (!name.equals(that.name)) return false;
            if (this.atomic != null ? !this.atomic.equals(that.atomic) : that.atomic != null) return false;
            if (this.cleanupOnFail != null ? !this.cleanupOnFail.equals(that.cleanupOnFail) : that.cleanupOnFail != null) return false;
            if (this.createNamespace != null ? !this.createNamespace.equals(that.createNamespace) : that.createNamespace != null) return false;
            if (this.dependencyUpdate != null ? !this.dependencyUpdate.equals(that.dependencyUpdate) : that.dependencyUpdate != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.devel != null ? !this.devel.equals(that.devel) : that.devel != null) return false;
            if (this.disableCrdHooks != null ? !this.disableCrdHooks.equals(that.disableCrdHooks) : that.disableCrdHooks != null) return false;
            if (this.disableOpenapiValidation != null ? !this.disableOpenapiValidation.equals(that.disableOpenapiValidation) : that.disableOpenapiValidation != null) return false;
            if (this.disableWebhooks != null ? !this.disableWebhooks.equals(that.disableWebhooks) : that.disableWebhooks != null) return false;
            if (this.forceUpdate != null ? !this.forceUpdate.equals(that.forceUpdate) : that.forceUpdate != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.keyring != null ? !this.keyring.equals(that.keyring) : that.keyring != null) return false;
            if (this.lint != null ? !this.lint.equals(that.lint) : that.lint != null) return false;
            if (this.maxHistory != null ? !this.maxHistory.equals(that.maxHistory) : that.maxHistory != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.postrender != null ? !this.postrender.equals(that.postrender) : that.postrender != null) return false;
            if (this.recreatePods != null ? !this.recreatePods.equals(that.recreatePods) : that.recreatePods != null) return false;
            if (this.renderSubchartNotes != null ? !this.renderSubchartNotes.equals(that.renderSubchartNotes) : that.renderSubchartNotes != null) return false;
            if (this.replace != null ? !this.replace.equals(that.replace) : that.replace != null) return false;
            if (this.repository != null ? !this.repository.equals(that.repository) : that.repository != null) return false;
            if (this.repositoryCaFile != null ? !this.repositoryCaFile.equals(that.repositoryCaFile) : that.repositoryCaFile != null) return false;
            if (this.repositoryCertFile != null ? !this.repositoryCertFile.equals(that.repositoryCertFile) : that.repositoryCertFile != null) return false;
            if (this.repositoryKeyFile != null ? !this.repositoryKeyFile.equals(that.repositoryKeyFile) : that.repositoryKeyFile != null) return false;
            if (this.repositoryPassword != null ? !this.repositoryPassword.equals(that.repositoryPassword) : that.repositoryPassword != null) return false;
            if (this.repositoryUsername != null ? !this.repositoryUsername.equals(that.repositoryUsername) : that.repositoryUsername != null) return false;
            if (this.resetValues != null ? !this.resetValues.equals(that.resetValues) : that.resetValues != null) return false;
            if (this.reuseValues != null ? !this.reuseValues.equals(that.reuseValues) : that.reuseValues != null) return false;
            if (this.set != null ? !this.set.equals(that.set) : that.set != null) return false;
            if (this.setSensitive != null ? !this.setSensitive.equals(that.setSensitive) : that.setSensitive != null) return false;
            if (this.skipCrds != null ? !this.skipCrds.equals(that.skipCrds) : that.skipCrds != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            if (this.values != null ? !this.values.equals(that.values) : that.values != null) return false;
            if (this.verify != null ? !this.verify.equals(that.verify) : that.verify != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.wait != null ? !this.wait.equals(that.wait) : that.wait != null) return false;
            if (this.waitForJobs != null ? !this.waitForJobs.equals(that.waitForJobs) : that.waitForJobs != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.chart.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.atomic != null ? this.atomic.hashCode() : 0);
            result = 31 * result + (this.cleanupOnFail != null ? this.cleanupOnFail.hashCode() : 0);
            result = 31 * result + (this.createNamespace != null ? this.createNamespace.hashCode() : 0);
            result = 31 * result + (this.dependencyUpdate != null ? this.dependencyUpdate.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.devel != null ? this.devel.hashCode() : 0);
            result = 31 * result + (this.disableCrdHooks != null ? this.disableCrdHooks.hashCode() : 0);
            result = 31 * result + (this.disableOpenapiValidation != null ? this.disableOpenapiValidation.hashCode() : 0);
            result = 31 * result + (this.disableWebhooks != null ? this.disableWebhooks.hashCode() : 0);
            result = 31 * result + (this.forceUpdate != null ? this.forceUpdate.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.keyring != null ? this.keyring.hashCode() : 0);
            result = 31 * result + (this.lint != null ? this.lint.hashCode() : 0);
            result = 31 * result + (this.maxHistory != null ? this.maxHistory.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.postrender != null ? this.postrender.hashCode() : 0);
            result = 31 * result + (this.recreatePods != null ? this.recreatePods.hashCode() : 0);
            result = 31 * result + (this.renderSubchartNotes != null ? this.renderSubchartNotes.hashCode() : 0);
            result = 31 * result + (this.replace != null ? this.replace.hashCode() : 0);
            result = 31 * result + (this.repository != null ? this.repository.hashCode() : 0);
            result = 31 * result + (this.repositoryCaFile != null ? this.repositoryCaFile.hashCode() : 0);
            result = 31 * result + (this.repositoryCertFile != null ? this.repositoryCertFile.hashCode() : 0);
            result = 31 * result + (this.repositoryKeyFile != null ? this.repositoryKeyFile.hashCode() : 0);
            result = 31 * result + (this.repositoryPassword != null ? this.repositoryPassword.hashCode() : 0);
            result = 31 * result + (this.repositoryUsername != null ? this.repositoryUsername.hashCode() : 0);
            result = 31 * result + (this.resetValues != null ? this.resetValues.hashCode() : 0);
            result = 31 * result + (this.reuseValues != null ? this.reuseValues.hashCode() : 0);
            result = 31 * result + (this.set != null ? this.set.hashCode() : 0);
            result = 31 * result + (this.setSensitive != null ? this.setSensitive.hashCode() : 0);
            result = 31 * result + (this.skipCrds != null ? this.skipCrds.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            result = 31 * result + (this.verify != null ? this.verify.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.wait != null ? this.wait.hashCode() : 0);
            result = 31 * result + (this.waitForJobs != null ? this.waitForJobs.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
