package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.138Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources")
@software.amazon.jsii.Jsii.Proxy(CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy.class)
public interface CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#config_map CronJobV1#config_map}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfigMap() {
        return null;
    }

    /**
     * downward_api block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#downward_api CronJobV1#downward_api}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * secret block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#secret CronJobV1#secret}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSecret() {
        return null;
    }

    /**
     * service_account_token block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#service_account_token CronJobV1#service_account_token}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources> {
        java.lang.Object configMap;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        java.lang.Object secret;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#config_map CronJobV1#config_map}
         * @return {@code this}
         */
        public Builder configMap(com.hashicorp.cdktf.IResolvable configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getConfigMap}
         * @param configMap config_map block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#config_map CronJobV1#config_map}
         * @return {@code this}
         */
        public Builder configMap(java.util.List<? extends imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesConfigMap> configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getDownwardApi}
         * @param downwardApi downward_api block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#downward_api CronJobV1#downward_api}
         * @return {@code this}
         */
        public Builder downwardApi(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#secret CronJobV1#secret}
         * @return {@code this}
         */
        public Builder secret(com.hashicorp.cdktf.IResolvable secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getSecret}
         * @param secret secret block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#secret CronJobV1#secret}
         * @return {@code this}
         */
        public Builder secret(java.util.List<? extends imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesSecret> secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources#getServiceAccountToken}
         * @param serviceAccountToken service_account_token block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#service_account_token CronJobV1#service_account_token}
         * @return {@code this}
         */
        public Builder serviceAccountToken(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources {
        private final java.lang.Object configMap;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi downwardApi;
        private final java.lang.Object secret;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.serviceAccountToken = software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
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
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final java.lang.Object getSecret() {
            return this.secret;
        }

        @Override
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountToken() {
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
            struct.set("fqn", om.valueToTree("kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy that = (CronJobV1SpecJobTemplateSpecTemplateSpecVolumeProjectedSources.Jsii$Proxy) o;

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
