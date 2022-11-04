package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes kubernetes}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.173Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.KubernetesProvider")
public class KubernetesProvider extends com.hashicorp.cdktf.TerraformProvider {

    protected KubernetesProvider(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubernetesProvider(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.KubernetesProvider.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes kubernetes} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public KubernetesProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes kubernetes} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public KubernetesProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientCertificate() {
        software.amazon.jsii.Kernel.call(this, "resetClientCertificate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientKey() {
        software.amazon.jsii.Kernel.call(this, "resetClientKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterCaCertificate() {
        software.amazon.jsii.Kernel.call(this, "resetClusterCaCertificate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigContext() {
        software.amazon.jsii.Kernel.call(this, "resetConfigContext", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigContextAuthInfo() {
        software.amazon.jsii.Kernel.call(this, "resetConfigContextAuthInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigContextCluster() {
        software.amazon.jsii.Kernel.call(this, "resetConfigContextCluster", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigPath() {
        software.amazon.jsii.Kernel.call(this, "resetConfigPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigPaths() {
        software.amazon.jsii.Kernel.call(this, "resetConfigPaths", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExec() {
        software.amazon.jsii.Kernel.call(this, "resetExec", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExperiments() {
        software.amazon.jsii.Kernel.call(this, "resetExperiments", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHost() {
        software.amazon.jsii.Kernel.call(this, "resetHost", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnoreAnnotations() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreAnnotations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnoreLabels() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreLabels", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsecure() {
        software.amazon.jsii.Kernel.call(this, "resetInsecure", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassword() {
        software.amazon.jsii.Kernel.call(this, "resetPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProxyUrl() {
        software.amazon.jsii.Kernel.call(this, "resetProxyUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetToken() {
        software.amazon.jsii.Kernel.call(this, "resetToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsername() {
        software.amazon.jsii.Kernel.call(this, "resetUsername", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAliasInput() {
        return software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterCaCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterCaCertificateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContextAuthInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "configContextAuthInfoInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContextClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "configContextClusterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContextInput() {
        return software.amazon.jsii.Kernel.get(this, "configContextInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigPathInput() {
        return software.amazon.jsii.Kernel.get(this, "configPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getConfigPathsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "configPathsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExec getExecInput() {
        return software.amazon.jsii.Kernel.get(this, "execInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExperiments getExperimentsInput() {
        return software.amazon.jsii.Kernel.get(this, "experimentsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExperiments.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostInput() {
        return software.amazon.jsii.Kernel.get(this, "hostInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreAnnotationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ignoreAnnotationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreLabelsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ignoreLabelsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecureInput() {
        return software.amazon.jsii.Kernel.get(this, "insecureInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProxyUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "proxyUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public void setAlias(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alias", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertificate() {
        return software.amazon.jsii.Kernel.get(this, "clientCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCertificate(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCertificate", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKey() {
        return software.amazon.jsii.Kernel.get(this, "clientKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientKey", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterCaCertificate() {
        return software.amazon.jsii.Kernel.get(this, "clusterCaCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterCaCertificate(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterCaCertificate", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContext() {
        return software.amazon.jsii.Kernel.get(this, "configContext", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigContext(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configContext", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContextAuthInfo() {
        return software.amazon.jsii.Kernel.get(this, "configContextAuthInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigContextAuthInfo(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configContextAuthInfo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigContextCluster() {
        return software.amazon.jsii.Kernel.get(this, "configContextCluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigContextCluster(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configContextCluster", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigPath() {
        return software.amazon.jsii.Kernel.get(this, "configPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getConfigPaths() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "configPaths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setConfigPaths(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "configPaths", value);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExec getExec() {
        return software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExec.class));
    }

    public void setExec(final @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExec value) {
        software.amazon.jsii.Kernel.set(this, "exec", value);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExperiments getExperiments() {
        return software.amazon.jsii.Kernel.get(this, "experiments", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExperiments.class));
    }

    public void setExperiments(final @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExperiments value) {
        software.amazon.jsii.Kernel.set(this, "experiments", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHost(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "host", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreAnnotations() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ignoreAnnotations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setIgnoreAnnotations(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ignoreAnnotations", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreLabels() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ignoreLabels", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setIgnoreLabels(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ignoreLabels", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecure() {
        return software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInsecure(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "insecure", value);
    }

    public void setInsecure(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "insecure", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProxyUrl() {
        return software.amazon.jsii.Kernel.get(this, "proxyUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProxyUrl(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "proxyUrl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setToken(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "token", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", value);
    }

    /**
     * A fluent builder for {@link imports.kubernetes.KubernetesProvider}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.KubernetesProvider> {
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
        private imports.kubernetes.KubernetesProviderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * Alias name.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#alias KubernetesProvider#alias}
         * <p>
         * @return {@code this}
         * @param alias Alias name. This parameter is required.
         */
        public Builder alias(final java.lang.String alias) {
            this.config().alias(alias);
            return this;
        }

        /**
         * PEM-encoded client certificate for TLS authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_certificate KubernetesProvider#client_certificate}
         * <p>
         * @return {@code this}
         * @param clientCertificate PEM-encoded client certificate for TLS authentication. This parameter is required.
         */
        public Builder clientCertificate(final java.lang.String clientCertificate) {
            this.config().clientCertificate(clientCertificate);
            return this;
        }

        /**
         * PEM-encoded client certificate key for TLS authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_key KubernetesProvider#client_key}
         * <p>
         * @return {@code this}
         * @param clientKey PEM-encoded client certificate key for TLS authentication. This parameter is required.
         */
        public Builder clientKey(final java.lang.String clientKey) {
            this.config().clientKey(clientKey);
            return this;
        }

        /**
         * PEM-encoded root certificates bundle for TLS authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#cluster_ca_certificate KubernetesProvider#cluster_ca_certificate}
         * <p>
         * @return {@code this}
         * @param clusterCaCertificate PEM-encoded root certificates bundle for TLS authentication. This parameter is required.
         */
        public Builder clusterCaCertificate(final java.lang.String clusterCaCertificate) {
            this.config().clusterCaCertificate(clusterCaCertificate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context KubernetesProvider#config_context}.
         * <p>
         * @return {@code this}
         * @param configContext Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context KubernetesProvider#config_context}. This parameter is required.
         */
        public Builder configContext(final java.lang.String configContext) {
            this.config().configContext(configContext);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_auth_info KubernetesProvider#config_context_auth_info}.
         * <p>
         * @return {@code this}
         * @param configContextAuthInfo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_auth_info KubernetesProvider#config_context_auth_info}. This parameter is required.
         */
        public Builder configContextAuthInfo(final java.lang.String configContextAuthInfo) {
            this.config().configContextAuthInfo(configContextAuthInfo);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_cluster KubernetesProvider#config_context_cluster}.
         * <p>
         * @return {@code this}
         * @param configContextCluster Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_cluster KubernetesProvider#config_context_cluster}. This parameter is required.
         */
        public Builder configContextCluster(final java.lang.String configContextCluster) {
            this.config().configContextCluster(configContextCluster);
            return this;
        }

        /**
         * Path to the kube config file. Can be set with KUBE_CONFIG_PATH.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_path KubernetesProvider#config_path}
         * <p>
         * @return {@code this}
         * @param configPath Path to the kube config file. Can be set with KUBE_CONFIG_PATH. This parameter is required.
         */
        public Builder configPath(final java.lang.String configPath) {
            this.config().configPath(configPath);
            return this;
        }

        /**
         * A list of paths to kube config files. Can be set with KUBE_CONFIG_PATHS environment variable.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_paths KubernetesProvider#config_paths}
         * <p>
         * @return {@code this}
         * @param configPaths A list of paths to kube config files. Can be set with KUBE_CONFIG_PATHS environment variable. This parameter is required.
         */
        public Builder configPaths(final java.util.List<java.lang.String> configPaths) {
            this.config().configPaths(configPaths);
            return this;
        }

        /**
         * exec block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#exec KubernetesProvider#exec}
         * <p>
         * @return {@code this}
         * @param exec exec block. This parameter is required.
         */
        public Builder exec(final imports.kubernetes.KubernetesProviderExec exec) {
            this.config().exec(exec);
            return this;
        }

        /**
         * experiments block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#experiments KubernetesProvider#experiments}
         * <p>
         * @return {@code this}
         * @param experiments experiments block. This parameter is required.
         */
        public Builder experiments(final imports.kubernetes.KubernetesProviderExperiments experiments) {
            this.config().experiments(experiments);
            return this;
        }

        /**
         * The hostname (in form of URI) of Kubernetes master.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#host KubernetesProvider#host}
         * <p>
         * @return {@code this}
         * @param host The hostname (in form of URI) of Kubernetes master. This parameter is required.
         */
        public Builder host(final java.lang.String host) {
            this.config().host(host);
            return this;
        }

        /**
         * List of Kubernetes metadata annotations to ignore across all resources handled by this provider for situations where external systems are managing certain resource annotations.
         * <p>
         * Each item is a regular expression.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_annotations KubernetesProvider#ignore_annotations}
         * <p>
         * @return {@code this}
         * @param ignoreAnnotations List of Kubernetes metadata annotations to ignore across all resources handled by this provider for situations where external systems are managing certain resource annotations. This parameter is required.
         */
        public Builder ignoreAnnotations(final java.util.List<java.lang.String> ignoreAnnotations) {
            this.config().ignoreAnnotations(ignoreAnnotations);
            return this;
        }

        /**
         * List of Kubernetes metadata labels to ignore across all resources handled by this provider for situations where external systems are managing certain resource labels.
         * <p>
         * Each item is a regular expression.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_labels KubernetesProvider#ignore_labels}
         * <p>
         * @return {@code this}
         * @param ignoreLabels List of Kubernetes metadata labels to ignore across all resources handled by this provider for situations where external systems are managing certain resource labels. This parameter is required.
         */
        public Builder ignoreLabels(final java.util.List<java.lang.String> ignoreLabels) {
            this.config().ignoreLabels(ignoreLabels);
            return this;
        }

        /**
         * Whether server should be accessed without verifying the TLS certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#insecure KubernetesProvider#insecure}
         * <p>
         * @return {@code this}
         * @param insecure Whether server should be accessed without verifying the TLS certificate. This parameter is required.
         */
        public Builder insecure(final java.lang.Boolean insecure) {
            this.config().insecure(insecure);
            return this;
        }
        /**
         * Whether server should be accessed without verifying the TLS certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#insecure KubernetesProvider#insecure}
         * <p>
         * @return {@code this}
         * @param insecure Whether server should be accessed without verifying the TLS certificate. This parameter is required.
         */
        public Builder insecure(final com.hashicorp.cdktf.IResolvable insecure) {
            this.config().insecure(insecure);
            return this;
        }

        /**
         * The password to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#password KubernetesProvider#password}
         * <p>
         * @return {@code this}
         * @param password The password to use for HTTP basic authentication when accessing the Kubernetes master endpoint. This parameter is required.
         */
        public Builder password(final java.lang.String password) {
            this.config().password(password);
            return this;
        }

        /**
         * URL to the proxy to be used for all API requests.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#proxy_url KubernetesProvider#proxy_url}
         * <p>
         * @return {@code this}
         * @param proxyUrl URL to the proxy to be used for all API requests. This parameter is required.
         */
        public Builder proxyUrl(final java.lang.String proxyUrl) {
            this.config().proxyUrl(proxyUrl);
            return this;
        }

        /**
         * Token to authenticate an service account.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#token KubernetesProvider#token}
         * <p>
         * @return {@code this}
         * @param token Token to authenticate an service account. This parameter is required.
         */
        public Builder token(final java.lang.String token) {
            this.config().token(token);
            return this;
        }

        /**
         * The username to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#username KubernetesProvider#username}
         * <p>
         * @return {@code this}
         * @param username The username to use for HTTP basic authentication when accessing the Kubernetes master endpoint. This parameter is required.
         */
        public Builder username(final java.lang.String username) {
            this.config().username(username);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.KubernetesProvider}.
         */
        @Override
        public imports.kubernetes.KubernetesProvider build() {
            return new imports.kubernetes.KubernetesProvider(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.kubernetes.KubernetesProviderConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.kubernetes.KubernetesProviderConfig.Builder();
            }
            return this.config;
        }
    }
}
