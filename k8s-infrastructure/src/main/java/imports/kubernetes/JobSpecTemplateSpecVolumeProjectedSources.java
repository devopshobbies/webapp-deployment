package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.027Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeProjectedSources")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy.class)
public interface JobSpecTemplateSpecVolumeProjectedSources extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#config_map Job#config_map}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfigMap() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#downward_api Job#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret Job#secret}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSecret() {
        return null;
    }

    /**
     * service_account_token block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#service_account_token Job#service_account_token}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecVolumeProjectedSources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecVolumeProjectedSources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecVolumeProjectedSources> {
        java.lang.Object configMap;
        imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        java.lang.Object secret;
        imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#config_map Job#config_map}
         * @return {@code this}
         */
        public Builder configMap(com.hashicorp.cdktf.IResolvable configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#config_map Job#config_map}
         * @return {@code this}
         */
        public Builder configMap(java.util.List<? extends imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesConfigMap> configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#downward_api Job#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret Job#secret}
         * @return {@code this}
         */
        public Builder secret(com.hashicorp.cdktf.IResolvable secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret Job#secret}
         * @return {@code this}
         */
        public Builder secret(java.util.List<? extends imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesSecret> secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSources#getServiceAccountToken}
         * @param serviceAccountToken service_account_token block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#service_account_token Job#service_account_token}
         * @return {@code this}
         */
        public Builder serviceAccountToken(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecVolumeProjectedSources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecVolumeProjectedSources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecVolumeProjectedSources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecVolumeProjectedSources {
        private final java.lang.Object configMap;
        private final imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        private final java.lang.Object secret;
        private final imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.serviceAccountToken = software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
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
        public final imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final java.lang.Object getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
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
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecVolumeProjectedSources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy that = (JobSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy) o;

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
