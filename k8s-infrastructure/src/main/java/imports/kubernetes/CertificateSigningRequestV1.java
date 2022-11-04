package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1 kubernetes_certificate_signing_request_v1}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.734Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CertificateSigningRequestV1")
public class CertificateSigningRequestV1 extends com.hashicorp.cdktf.TerraformResource {

    protected CertificateSigningRequestV1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CertificateSigningRequestV1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.CertificateSigningRequestV1.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1 kubernetes_certificate_signing_request_v1} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CertificateSigningRequestV1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1Config config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1Metadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1Spec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1Timeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutoApprove() {
        software.amazon.jsii.Kernel.call(this, "resetAutoApprove", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1MetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestV1MetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1SpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestV1SpecOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CertificateSigningRequestV1TimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestV1TimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoApproveInput() {
        return software.amazon.jsii.Kernel.get(this, "autoApproveInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CertificateSigningRequestV1Metadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestV1Metadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CertificateSigningRequestV1Spec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CertificateSigningRequestV1Spec.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoApprove() {
        return software.amazon.jsii.Kernel.get(this, "autoApprove", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoApprove(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoApprove", java.util.Objects.requireNonNull(value, "autoApprove is required"));
    }

    public void setAutoApprove(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoApprove", java.util.Objects.requireNonNull(value, "autoApprove is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.CertificateSigningRequestV1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.CertificateSigningRequestV1> {
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
        private final imports.kubernetes.CertificateSigningRequestV1Config.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.CertificateSigningRequestV1Config.Builder();
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#metadata CertificateSigningRequestV1#metadata}
         * <p>
         * @return {@code this}
         * @param metadata metadata block. This parameter is required.
         */
        public Builder metadata(final imports.kubernetes.CertificateSigningRequestV1Metadata metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * spec block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#spec CertificateSigningRequestV1#spec}
         * <p>
         * @return {@code this}
         * @param spec spec block. This parameter is required.
         */
        public Builder spec(final imports.kubernetes.CertificateSigningRequestV1Spec spec) {
            this.config.spec(spec);
            return this;
        }

        /**
         * Automatically approve the CertificateSigningRequest.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#auto_approve CertificateSigningRequestV1#auto_approve}
         * <p>
         * @return {@code this}
         * @param autoApprove Automatically approve the CertificateSigningRequest. This parameter is required.
         */
        public Builder autoApprove(final java.lang.Boolean autoApprove) {
            this.config.autoApprove(autoApprove);
            return this;
        }
        /**
         * Automatically approve the CertificateSigningRequest.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#auto_approve CertificateSigningRequestV1#auto_approve}
         * <p>
         * @return {@code this}
         * @param autoApprove Automatically approve the CertificateSigningRequest. This parameter is required.
         */
        public Builder autoApprove(final com.hashicorp.cdktf.IResolvable autoApprove) {
            this.config.autoApprove(autoApprove);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#id CertificateSigningRequestV1#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#id CertificateSigningRequestV1#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#timeouts CertificateSigningRequestV1#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.kubernetes.CertificateSigningRequestV1Timeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.CertificateSigningRequestV1}.
         */
        @Override
        public imports.kubernetes.CertificateSigningRequestV1 build() {
            return new imports.kubernetes.CertificateSigningRequestV1(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
