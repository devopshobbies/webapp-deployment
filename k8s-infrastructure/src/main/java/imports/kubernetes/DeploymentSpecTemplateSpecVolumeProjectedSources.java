package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.719Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSources")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecVolumeProjectedSources extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map Deployment#config_map}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfigMap() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#downward_api Deployment#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret Deployment#secret}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSecret() {
        return null;
    }

    /**
     * service_account_token block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#service_account_token Deployment#service_account_token}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecVolumeProjectedSources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecVolumeProjectedSources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecVolumeProjectedSources> {
        java.lang.Object configMap;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        java.lang.Object secret;
        imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map Deployment#config_map}
         * @return {@code this}
         */
        public Builder configMap(com.hashicorp.cdktf.IResolvable configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#config_map Deployment#config_map}
         * @return {@code this}
         */
        public Builder configMap(java.util.List<? extends imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesConfigMap> configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#downward_api Deployment#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret Deployment#secret}
         * @return {@code this}
         */
        public Builder secret(com.hashicorp.cdktf.IResolvable secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#secret Deployment#secret}
         * @return {@code this}
         */
        public Builder secret(java.util.List<? extends imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesSecret> secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeProjectedSources#getServiceAccountToken}
         * @param serviceAccountToken service_account_token block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#service_account_token Deployment#service_account_token}
         * @return {@code this}
         */
        public Builder serviceAccountToken(imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecVolumeProjectedSources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecVolumeProjectedSources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecVolumeProjectedSources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecVolumeProjectedSources {
        private final java.lang.Object configMap;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        private final java.lang.Object secret;
        private final imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.serviceAccountToken = software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMap = builder.configMap;
            this.downwardApi = builder.downwardApi;
            this.secret = builder.secret;
            this.serviceAccountToken = builder.serviceAccountToken;
        }

        @Override
        public final java.lang.Object getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final java.lang.Object getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
            return this.serviceAccountToken;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardApi", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getServiceAccountToken() != null) {
                data.set("serviceAccountToken", om.valueToTree(this.getServiceAccountToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecVolumeProjectedSources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy that = (DeploymentSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy) o;

            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            return this.serviceAccountToken != null ? this.serviceAccountToken.equals(that.serviceAccountToken) : that.serviceAccountToken == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMap != null ? this.configMap.hashCode() : 0;
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.serviceAccountToken != null ? this.serviceAccountToken.hashCode() : 0);
            return result;
        }
    }
}
