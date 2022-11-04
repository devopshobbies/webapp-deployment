package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.174Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.KubernetesProviderConfig")
@software.amazon.jsii.Jsii.Proxy(KubernetesProviderConfig.Jsii$Proxy.class)
public interface KubernetesProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Alias name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#alias KubernetesProvider#alias}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * PEM-encoded client certificate for TLS authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_certificate KubernetesProvider#client_certificate}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientCertificate() {
        return null;
    }

    /**
     * PEM-encoded client certificate key for TLS authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_key KubernetesProvider#client_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientKey() {
        return null;
    }

    /**
     * PEM-encoded root certificates bundle for TLS authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#cluster_ca_certificate KubernetesProvider#cluster_ca_certificate}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClusterCaCertificate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context KubernetesProvider#config_context}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfigContext() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_auth_info KubernetesProvider#config_context_auth_info}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfigContextAuthInfo() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_cluster KubernetesProvider#config_context_cluster}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfigContextCluster() {
        return null;
    }

    /**
     * Path to the kube config file. Can be set with KUBE_CONFIG_PATH.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_path KubernetesProvider#config_path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfigPath() {
        return null;
    }

    /**
     * A list of paths to kube config files. Can be set with KUBE_CONFIG_PATHS environment variable.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_paths KubernetesProvider#config_paths}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getConfigPaths() {
        return null;
    }

    /**
     * exec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#exec KubernetesProvider#exec}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExec getExec() {
        return null;
    }

    /**
     * experiments block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#experiments KubernetesProvider#experiments}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.KubernetesProviderExperiments getExperiments() {
        return null;
    }

    /**
     * The hostname (in form of URI) of Kubernetes master.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#host KubernetesProvider#host}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * List of Kubernetes metadata annotations to ignore across all resources handled by this provider for situations where external systems are managing certain resource annotations.
     * <p>
     * Each item is a regular expression.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_annotations KubernetesProvider#ignore_annotations}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreAnnotations() {
        return null;
    }

    /**
     * List of Kubernetes metadata labels to ignore across all resources handled by this provider for situations where external systems are managing certain resource labels.
     * <p>
     * Each item is a regular expression.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_labels KubernetesProvider#ignore_labels}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreLabels() {
        return null;
    }

    /**
     * Whether server should be accessed without verifying the TLS certificate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#insecure KubernetesProvider#insecure}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInsecure() {
        return null;
    }

    /**
     * The password to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#password KubernetesProvider#password}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return null;
    }

    /**
     * URL to the proxy to be used for all API requests.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#proxy_url KubernetesProvider#proxy_url}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProxyUrl() {
        return null;
    }

    /**
     * Token to authenticate an service account.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#token KubernetesProvider#token}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return null;
    }

    /**
     * The username to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#username KubernetesProvider#username}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubernetesProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubernetesProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubernetesProviderConfig> {
        java.lang.String alias;
        java.lang.String clientCertificate;
        java.lang.String clientKey;
        java.lang.String clusterCaCertificate;
        java.lang.String configContext;
        java.lang.String configContextAuthInfo;
        java.lang.String configContextCluster;
        java.lang.String configPath;
        java.util.List<java.lang.String> configPaths;
        imports.kubernetes.KubernetesProviderExec exec;
        imports.kubernetes.KubernetesProviderExperiments experiments;
        java.lang.String host;
        java.util.List<java.lang.String> ignoreAnnotations;
        java.util.List<java.lang.String> ignoreLabels;
        java.lang.Object insecure;
        java.lang.String password;
        java.lang.String proxyUrl;
        java.lang.String token;
        java.lang.String username;

        /**
         * Sets the value of {@link KubernetesProviderConfig#getAlias}
         * @param alias Alias name.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#alias KubernetesProvider#alias}
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getClientCertificate}
         * @param clientCertificate PEM-encoded client certificate for TLS authentication.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_certificate KubernetesProvider#client_certificate}
         * @return {@code this}
         */
        public Builder clientCertificate(java.lang.String clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getClientKey}
         * @param clientKey PEM-encoded client certificate key for TLS authentication.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#client_key KubernetesProvider#client_key}
         * @return {@code this}
         */
        public Builder clientKey(java.lang.String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getClusterCaCertificate}
         * @param clusterCaCertificate PEM-encoded root certificates bundle for TLS authentication.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#cluster_ca_certificate KubernetesProvider#cluster_ca_certificate}
         * @return {@code this}
         */
        public Builder clusterCaCertificate(java.lang.String clusterCaCertificate) {
            this.clusterCaCertificate = clusterCaCertificate;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getConfigContext}
         * @param configContext Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context KubernetesProvider#config_context}.
         * @return {@code this}
         */
        public Builder configContext(java.lang.String configContext) {
            this.configContext = configContext;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getConfigContextAuthInfo}
         * @param configContextAuthInfo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_auth_info KubernetesProvider#config_context_auth_info}.
         * @return {@code this}
         */
        public Builder configContextAuthInfo(java.lang.String configContextAuthInfo) {
            this.configContextAuthInfo = configContextAuthInfo;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getConfigContextCluster}
         * @param configContextCluster Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes#config_context_cluster KubernetesProvider#config_context_cluster}.
         * @return {@code this}
         */
        public Builder configContextCluster(java.lang.String configContextCluster) {
            this.configContextCluster = configContextCluster;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getConfigPath}
         * @param configPath Path to the kube config file. Can be set with KUBE_CONFIG_PATH.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_path KubernetesProvider#config_path}
         * @return {@code this}
         */
        public Builder configPath(java.lang.String configPath) {
            this.configPath = configPath;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getConfigPaths}
         * @param configPaths A list of paths to kube config files. Can be set with KUBE_CONFIG_PATHS environment variable.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#config_paths KubernetesProvider#config_paths}
         * @return {@code this}
         */
        public Builder configPaths(java.util.List<java.lang.String> configPaths) {
            this.configPaths = configPaths;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getExec}
         * @param exec exec block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#exec KubernetesProvider#exec}
         * @return {@code this}
         */
        public Builder exec(imports.kubernetes.KubernetesProviderExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getExperiments}
         * @param experiments experiments block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#experiments KubernetesProvider#experiments}
         * @return {@code this}
         */
        public Builder experiments(imports.kubernetes.KubernetesProviderExperiments experiments) {
            this.experiments = experiments;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getHost}
         * @param host The hostname (in form of URI) of Kubernetes master.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#host KubernetesProvider#host}
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getIgnoreAnnotations}
         * @param ignoreAnnotations List of Kubernetes metadata annotations to ignore across all resources handled by this provider for situations where external systems are managing certain resource annotations.
         *                          Each item is a regular expression.
         *                          <p>
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_annotations KubernetesProvider#ignore_annotations}
         * @return {@code this}
         */
        public Builder ignoreAnnotations(java.util.List<java.lang.String> ignoreAnnotations) {
            this.ignoreAnnotations = ignoreAnnotations;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getIgnoreLabels}
         * @param ignoreLabels List of Kubernetes metadata labels to ignore across all resources handled by this provider for situations where external systems are managing certain resource labels.
         *                     Each item is a regular expression.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#ignore_labels KubernetesProvider#ignore_labels}
         * @return {@code this}
         */
        public Builder ignoreLabels(java.util.List<java.lang.String> ignoreLabels) {
            this.ignoreLabels = ignoreLabels;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getInsecure}
         * @param insecure Whether server should be accessed without verifying the TLS certificate.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#insecure KubernetesProvider#insecure}
         * @return {@code this}
         */
        public Builder insecure(java.lang.Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getInsecure}
         * @param insecure Whether server should be accessed without verifying the TLS certificate.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#insecure KubernetesProvider#insecure}
         * @return {@code this}
         */
        public Builder insecure(com.hashicorp.cdktf.IResolvable insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getPassword}
         * @param password The password to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#password KubernetesProvider#password}
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getProxyUrl}
         * @param proxyUrl URL to the proxy to be used for all API requests.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#proxy_url KubernetesProvider#proxy_url}
         * @return {@code this}
         */
        public Builder proxyUrl(java.lang.String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getToken}
         * @param token Token to authenticate an service account.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#token KubernetesProvider#token}
         * @return {@code this}
         */
        public Builder token(java.lang.String token) {
            this.token = token;
            return this;
        }

        /**
         * Sets the value of {@link KubernetesProviderConfig#getUsername}
         * @param username The username to use for HTTP basic authentication when accessing the Kubernetes master endpoint.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes#username KubernetesProvider#username}
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubernetesProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubernetesProviderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubernetesProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubernetesProviderConfig {
        private final java.lang.String alias;
        private final java.lang.String clientCertificate;
        private final java.lang.String clientKey;
        private final java.lang.String clusterCaCertificate;
        private final java.lang.String configContext;
        private final java.lang.String configContextAuthInfo;
        private final java.lang.String configContextCluster;
        private final java.lang.String configPath;
        private final java.util.List<java.lang.String> configPaths;
        private final imports.kubernetes.KubernetesProviderExec exec;
        private final imports.kubernetes.KubernetesProviderExperiments experiments;
        private final java.lang.String host;
        private final java.util.List<java.lang.String> ignoreAnnotations;
        private final java.util.List<java.lang.String> ignoreLabels;
        private final java.lang.Object insecure;
        private final java.lang.String password;
        private final java.lang.String proxyUrl;
        private final java.lang.String token;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientCertificate = software.amazon.jsii.Kernel.get(this, "clientCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientKey = software.amazon.jsii.Kernel.get(this, "clientKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterCaCertificate = software.amazon.jsii.Kernel.get(this, "clusterCaCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configContext = software.amazon.jsii.Kernel.get(this, "configContext", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configContextAuthInfo = software.amazon.jsii.Kernel.get(this, "configContextAuthInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configContextCluster = software.amazon.jsii.Kernel.get(this, "configContextCluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configPath = software.amazon.jsii.Kernel.get(this, "configPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configPaths = software.amazon.jsii.Kernel.get(this, "configPaths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.exec = software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExec.class));
            this.experiments = software.amazon.jsii.Kernel.get(this, "experiments", software.amazon.jsii.NativeType.forClass(imports.kubernetes.KubernetesProviderExperiments.class));
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ignoreAnnotations = software.amazon.jsii.Kernel.get(this, "ignoreAnnotations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ignoreLabels = software.amazon.jsii.Kernel.get(this, "ignoreLabels", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.insecure = software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.proxyUrl = software.amazon.jsii.Kernel.get(this, "proxyUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.token = software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alias = builder.alias;
            this.clientCertificate = builder.clientCertificate;
            this.clientKey = builder.clientKey;
            this.clusterCaCertificate = builder.clusterCaCertificate;
            this.configContext = builder.configContext;
            this.configContextAuthInfo = builder.configContextAuthInfo;
            this.configContextCluster = builder.configContextCluster;
            this.configPath = builder.configPath;
            this.configPaths = builder.configPaths;
            this.exec = builder.exec;
            this.experiments = builder.experiments;
            this.host = builder.host;
            this.ignoreAnnotations = builder.ignoreAnnotations;
            this.ignoreLabels = builder.ignoreLabels;
            this.insecure = builder.insecure;
            this.password = builder.password;
            this.proxyUrl = builder.proxyUrl;
            this.token = builder.token;
            this.username = builder.username;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.lang.String getClientCertificate() {
            return this.clientCertificate;
        }

        @Override
        public final java.lang.String getClientKey() {
            return this.clientKey;
        }

        @Override
        public final java.lang.String getClusterCaCertificate() {
            return this.clusterCaCertificate;
        }

        @Override
        public final java.lang.String getConfigContext() {
            return this.configContext;
        }

        @Override
        public final java.lang.String getConfigContextAuthInfo() {
            return this.configContextAuthInfo;
        }

        @Override
        public final java.lang.String getConfigContextCluster() {
            return this.configContextCluster;
        }

        @Override
        public final java.lang.String getConfigPath() {
            return this.configPath;
        }

        @Override
        public final java.util.List<java.lang.String> getConfigPaths() {
            return this.configPaths;
        }

        @Override
        public final imports.kubernetes.KubernetesProviderExec getExec() {
            return this.exec;
        }

        @Override
        public final imports.kubernetes.KubernetesProviderExperiments getExperiments() {
            return this.experiments;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        public final java.util.List<java.lang.String> getIgnoreAnnotations() {
            return this.ignoreAnnotations;
        }

        @Override
        public final java.util.List<java.lang.String> getIgnoreLabels() {
            return this.ignoreLabels;
        }

        @Override
        public final java.lang.Object getInsecure() {
            return this.insecure;
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getProxyUrl() {
            return this.proxyUrl;
        }

        @Override
        public final java.lang.String getToken() {
            return this.token;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getClientCertificate() != null) {
                data.set("clientCertificate", om.valueToTree(this.getClientCertificate()));
            }
            if (this.getClientKey() != null) {
                data.set("clientKey", om.valueToTree(this.getClientKey()));
            }
            if (this.getClusterCaCertificate() != null) {
                data.set("clusterCaCertificate", om.valueToTree(this.getClusterCaCertificate()));
            }
            if (this.getConfigContext() != null) {
                data.set("configContext", om.valueToTree(this.getConfigContext()));
            }
            if (this.getConfigContextAuthInfo() != null) {
                data.set("configContextAuthInfo", om.valueToTree(this.getConfigContextAuthInfo()));
            }
            if (this.getConfigContextCluster() != null) {
                data.set("configContextCluster", om.valueToTree(this.getConfigContextCluster()));
            }
            if (this.getConfigPath() != null) {
                data.set("configPath", om.valueToTree(this.getConfigPath()));
            }
            if (this.getConfigPaths() != null) {
                data.set("configPaths", om.valueToTree(this.getConfigPaths()));
            }
            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getExperiments() != null) {
                data.set("experiments", om.valueToTree(this.getExperiments()));
            }
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getIgnoreAnnotations() != null) {
                data.set("ignoreAnnotations", om.valueToTree(this.getIgnoreAnnotations()));
            }
            if (this.getIgnoreLabels() != null) {
                data.set("ignoreLabels", om.valueToTree(this.getIgnoreLabels()));
            }
            if (this.getInsecure() != null) {
                data.set("insecure", om.valueToTree(this.getInsecure()));
            }
            if (this.getPassword() != null) {
                data.set("password", om.valueToTree(this.getPassword()));
            }
            if (this.getProxyUrl() != null) {
                data.set("proxyUrl", om.valueToTree(this.getProxyUrl()));
            }
            if (this.getToken() != null) {
                data.set("token", om.valueToTree(this.getToken()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.KubernetesProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubernetesProviderConfig.Jsii$Proxy that = (KubernetesProviderConfig.Jsii$Proxy) o;

            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.clientCertificate != null ? !this.clientCertificate.equals(that.clientCertificate) : that.clientCertificate != null) return false;
            if (this.clientKey != null ? !this.clientKey.equals(that.clientKey) : that.clientKey != null) return false;
            if (this.clusterCaCertificate != null ? !this.clusterCaCertificate.equals(that.clusterCaCertificate) : that.clusterCaCertificate != null) return false;
            if (this.configContext != null ? !this.configContext.equals(that.configContext) : that.configContext != null) return false;
            if (this.configContextAuthInfo != null ? !this.configContextAuthInfo.equals(that.configContextAuthInfo) : that.configContextAuthInfo != null) return false;
            if (this.configContextCluster != null ? !this.configContextCluster.equals(that.configContextCluster) : that.configContextCluster != null) return false;
            if (this.configPath != null ? !this.configPath.equals(that.configPath) : that.configPath != null) return false;
            if (this.configPaths != null ? !this.configPaths.equals(that.configPaths) : that.configPaths != null) return false;
            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.experiments != null ? !this.experiments.equals(that.experiments) : that.experiments != null) return false;
            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            if (this.ignoreAnnotations != null ? !this.ignoreAnnotations.equals(that.ignoreAnnotations) : that.ignoreAnnotations != null) return false;
            if (this.ignoreLabels != null ? !this.ignoreLabels.equals(that.ignoreLabels) : that.ignoreLabels != null) return false;
            if (this.insecure != null ? !this.insecure.equals(that.insecure) : that.insecure != null) return false;
            if (this.password != null ? !this.password.equals(that.password) : that.password != null) return false;
            if (this.proxyUrl != null ? !this.proxyUrl.equals(that.proxyUrl) : that.proxyUrl != null) return false;
            if (this.token != null ? !this.token.equals(that.token) : that.token != null) return false;
            return this.username != null ? this.username.equals(that.username) : that.username == null;
        }

        @Override
        public final int hashCode() {
            int result = this.alias != null ? this.alias.hashCode() : 0;
            result = 31 * result + (this.clientCertificate != null ? this.clientCertificate.hashCode() : 0);
            result = 31 * result + (this.clientKey != null ? this.clientKey.hashCode() : 0);
            result = 31 * result + (this.clusterCaCertificate != null ? this.clusterCaCertificate.hashCode() : 0);
            result = 31 * result + (this.configContext != null ? this.configContext.hashCode() : 0);
            result = 31 * result + (this.configContextAuthInfo != null ? this.configContextAuthInfo.hashCode() : 0);
            result = 31 * result + (this.configContextCluster != null ? this.configContextCluster.hashCode() : 0);
            result = 31 * result + (this.configPath != null ? this.configPath.hashCode() : 0);
            result = 31 * result + (this.configPaths != null ? this.configPaths.hashCode() : 0);
            result = 31 * result + (this.exec != null ? this.exec.hashCode() : 0);
            result = 31 * result + (this.experiments != null ? this.experiments.hashCode() : 0);
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            result = 31 * result + (this.ignoreAnnotations != null ? this.ignoreAnnotations.hashCode() : 0);
            result = 31 * result + (this.ignoreLabels != null ? this.ignoreLabels.hashCode() : 0);
            result = 31 * result + (this.insecure != null ? this.insecure.hashCode() : 0);
            result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
            result = 31 * result + (this.proxyUrl != null ? this.proxyUrl.hashCode() : 0);
            result = 31 * result + (this.token != null ? this.token.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            return result;
        }
    }
}
