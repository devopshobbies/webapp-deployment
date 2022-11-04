package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/r/service kubernetes_service}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.897Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.Service")
public class Service extends com.hashicorp.cdktf.TerraformResource {

    protected Service(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Service(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.Service.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/r/service kubernetes_service} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Service(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForLoadBalancer() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForLoadBalancer", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceStatusList getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceStatusList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpec.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitForLoadBalancerInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForLoadBalancerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWaitForLoadBalancer() {
        return software.amazon.jsii.Kernel.get(this, "waitForLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWaitForLoadBalancer(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForLoadBalancer", java.util.Objects.requireNonNull(value, "waitForLoadBalancer is required"));
    }

    public void setWaitForLoadBalancer(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "waitForLoadBalancer", java.util.Objects.requireNonNull(value, "waitForLoadBalancer is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.Service}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.Service> {
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
        private final imports.kubernetes.ServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.ServiceConfig.Builder();
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#metadata Service#metadata}
         * <p>
         * @return {@code this}
         * @param metadata metadata block. This parameter is required.
         */
        public Builder metadata(final imports.kubernetes.ServiceMetadata metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * spec block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#spec Service#spec}
         * <p>
         * @return {@code this}
         * @param spec spec block. This parameter is required.
         */
        public Builder spec(final imports.kubernetes.ServiceSpec spec) {
            this.config.spec(spec);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/service#id Service#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/service#id Service#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#timeouts Service#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.kubernetes.ServiceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Terraform will wait for the load balancer to have at least 1 endpoint before considering the resource created.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#wait_for_load_balancer Service#wait_for_load_balancer}
         * <p>
         * @return {@code this}
         * @param waitForLoadBalancer Terraform will wait for the load balancer to have at least 1 endpoint before considering the resource created. This parameter is required.
         */
        public Builder waitForLoadBalancer(final java.lang.Boolean waitForLoadBalancer) {
            this.config.waitForLoadBalancer(waitForLoadBalancer);
            return this;
        }
        /**
         * Terraform will wait for the load balancer to have at least 1 endpoint before considering the resource created.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#wait_for_load_balancer Service#wait_for_load_balancer}
         * <p>
         * @return {@code this}
         * @param waitForLoadBalancer Terraform will wait for the load balancer to have at least 1 endpoint before considering the resource created. This parameter is required.
         */
        public Builder waitForLoadBalancer(final com.hashicorp.cdktf.IResolvable waitForLoadBalancer) {
            this.config.waitForLoadBalancer(waitForLoadBalancer);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.Service}.
         */
        @Override
        public imports.kubernetes.Service build() {
            return new imports.kubernetes.Service(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
