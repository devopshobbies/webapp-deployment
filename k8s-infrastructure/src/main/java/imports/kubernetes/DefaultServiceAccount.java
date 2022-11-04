package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account kubernetes_default_service_account}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.595Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DefaultServiceAccount")
public class DefaultServiceAccount extends com.hashicorp.cdktf.TerraformResource {

    protected DefaultServiceAccount(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DefaultServiceAccount(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.DefaultServiceAccount.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account kubernetes_default_service_account} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DefaultServiceAccount(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putImagePullSecret(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putImagePullSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutomountServiceAccountToken() {
        software.amazon.jsii.Kernel.call(this, "resetAutomountServiceAccountToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImagePullSecret() {
        software.amazon.jsii.Kernel.call(this, "resetImagePullSecret", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecret() {
        software.amazon.jsii.Kernel.call(this, "resetSecret", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSecretName() {
        return software.amazon.jsii.Kernel.get(this, "defaultSecretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountImagePullSecretList getImagePullSecret() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DefaultServiceAccountImagePullSecretList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DefaultServiceAccountMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountSecretList getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DefaultServiceAccountSecretList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DefaultServiceAccountTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DefaultServiceAccountTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutomountServiceAccountTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getImagePullSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecretInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DefaultServiceAccountMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DefaultServiceAccountMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutomountServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutomountServiceAccountToken(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "automountServiceAccountToken", java.util.Objects.requireNonNull(value, "automountServiceAccountToken is required"));
    }

    public void setAutomountServiceAccountToken(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "automountServiceAccountToken", java.util.Objects.requireNonNull(value, "automountServiceAccountToken is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.DefaultServiceAccount}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.DefaultServiceAccount> {
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
        private final imports.kubernetes.DefaultServiceAccountConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.DefaultServiceAccountConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * metadata block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#metadata DefaultServiceAccount#metadata}
         * <p>
         * @return {@code this}
         * @param metadata metadata block. This parameter is required.
         */
        public Builder metadata(final imports.kubernetes.DefaultServiceAccountMetadata metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * Enable automatic mounting of the service account token.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#automount_service_account_token DefaultServiceAccount#automount_service_account_token}
         * <p>
         * @return {@code this}
         * @param automountServiceAccountToken Enable automatic mounting of the service account token. This parameter is required.
         */
        public Builder automountServiceAccountToken(final java.lang.Boolean automountServiceAccountToken) {
            this.config.automountServiceAccountToken(automountServiceAccountToken);
            return this;
        }
        /**
         * Enable automatic mounting of the service account token.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#automount_service_account_token DefaultServiceAccount#automount_service_account_token}
         * <p>
         * @return {@code this}
         * @param automountServiceAccountToken Enable automatic mounting of the service account token. This parameter is required.
         */
        public Builder automountServiceAccountToken(final com.hashicorp.cdktf.IResolvable automountServiceAccountToken) {
            this.config.automountServiceAccountToken(automountServiceAccountToken);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#id DefaultServiceAccount#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#id DefaultServiceAccount#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * image_pull_secret block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#image_pull_secret DefaultServiceAccount#image_pull_secret}
         * <p>
         * @return {@code this}
         * @param imagePullSecret image_pull_secret block. This parameter is required.
         */
        public Builder imagePullSecret(final com.hashicorp.cdktf.IResolvable imagePullSecret) {
            this.config.imagePullSecret(imagePullSecret);
            return this;
        }
        /**
         * image_pull_secret block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#image_pull_secret DefaultServiceAccount#image_pull_secret}
         * <p>
         * @return {@code this}
         * @param imagePullSecret image_pull_secret block. This parameter is required.
         */
        public Builder imagePullSecret(final java.util.List<? extends imports.kubernetes.DefaultServiceAccountImagePullSecret> imagePullSecret) {
            this.config.imagePullSecret(imagePullSecret);
            return this;
        }

        /**
         * secret block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#secret DefaultServiceAccount#secret}
         * <p>
         * @return {@code this}
         * @param secret secret block. This parameter is required.
         */
        public Builder secret(final com.hashicorp.cdktf.IResolvable secret) {
            this.config.secret(secret);
            return this;
        }
        /**
         * secret block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#secret DefaultServiceAccount#secret}
         * <p>
         * @return {@code this}
         * @param secret secret block. This parameter is required.
         */
        public Builder secret(final java.util.List<? extends imports.kubernetes.DefaultServiceAccountSecret> secret) {
            this.config.secret(secret);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/default_service_account#timeouts DefaultServiceAccount#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.kubernetes.DefaultServiceAccountTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.DefaultServiceAccount}.
         */
        @Override
        public imports.kubernetes.DefaultServiceAccount build() {
            return new imports.kubernetes.DefaultServiceAccount(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
