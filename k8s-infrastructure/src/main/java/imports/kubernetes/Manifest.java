package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/r/manifest kubernetes_manifest}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.181Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.Manifest")
public class Manifest extends com.hashicorp.cdktf.TerraformResource {

    protected Manifest(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Manifest(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.Manifest.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/r/manifest kubernetes_manifest} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Manifest(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFieldManager(final @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestFieldManager value) {
        software.amazon.jsii.Kernel.call(this, "putFieldManager", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWait(final @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestWait value) {
        software.amazon.jsii.Kernel.call(this, "putWait", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetComputedFields() {
        software.amazon.jsii.Kernel.call(this, "resetComputedFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFieldManager() {
        software.amazon.jsii.Kernel.call(this, "resetFieldManager", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObject() {
        software.amazon.jsii.Kernel.call(this, "resetObject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWait() {
        software.amazon.jsii.Kernel.call(this, "resetWait", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitFor() {
        software.amazon.jsii.Kernel.call(this, "resetWaitFor", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestFieldManagerOutputReference getFieldManager() {
        return software.amazon.jsii.Kernel.get(this, "fieldManager", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestFieldManagerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestWaitOutputReference getWait() {
        return software.amazon.jsii.Kernel.get(this, "wait", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestWaitOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getComputedFieldsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "computedFieldsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestFieldManager getFieldManagerInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldManagerInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestFieldManager.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getManifestInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "manifestInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getObjectInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "objectInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitForInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestWait getWaitInput() {
        return software.amazon.jsii.Kernel.get(this, "waitInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestWait.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getComputedFields() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "computedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setComputedFields(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "computedFields", java.util.Objects.requireNonNull(value, "computedFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> getManifest() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "manifest", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public void setManifest(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "manifest", java.util.Objects.requireNonNull(value, "manifest is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> getObject() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public void setObject(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "object", java.util.Objects.requireNonNull(value, "object is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWaitFor() {
        return software.amazon.jsii.Kernel.get(this, "waitFor", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWaitFor(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "waitFor", java.util.Objects.requireNonNull(value, "waitFor is required"));
    }

    public void setWaitFor(final @org.jetbrains.annotations.NotNull imports.kubernetes.ManifestWaitFor value) {
        software.amazon.jsii.Kernel.set(this, "waitFor", java.util.Objects.requireNonNull(value, "waitFor is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.Manifest}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.Manifest> {
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
        private final imports.kubernetes.ManifestConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.ManifestConfig.Builder();
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
         * A Kubernetes manifest describing the desired state of the resource in HCL format.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#manifest Manifest#manifest}
         * <p>
         * @return {@code this}
         * @param manifest A Kubernetes manifest describing the desired state of the resource in HCL format. This parameter is required.
         */
        public Builder manifest(final java.util.Map<java.lang.String, ? extends java.lang.Object> manifest) {
            this.config.manifest(manifest);
            return this;
        }

        /**
         * List of manifest fields whose values can be altered by the API server during 'apply'. Defaults to: ["metadata.annotations", "metadata.labels"].
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#computed_fields Manifest#computed_fields}
         * <p>
         * @return {@code this}
         * @param computedFields List of manifest fields whose values can be altered by the API server during 'apply'. Defaults to: ["metadata.annotations", "metadata.labels"]. This parameter is required.
         */
        public Builder computedFields(final java.util.List<java.lang.String> computedFields) {
            this.config.computedFields(computedFields);
            return this;
        }

        /**
         * field_manager block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#field_manager Manifest#field_manager}
         * <p>
         * @return {@code this}
         * @param fieldManager field_manager block. This parameter is required.
         */
        public Builder fieldManager(final imports.kubernetes.ManifestFieldManager fieldManager) {
            this.config.fieldManager(fieldManager);
            return this;
        }

        /**
         * The resulting resource state, as returned by the API server after applying the desired state from `manifest`.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#object Manifest#object}
         * <p>
         * @return {@code this}
         * @param object The resulting resource state, as returned by the API server after applying the desired state from `manifest`. This parameter is required.
         */
        public Builder object(final java.util.Map<java.lang.String, ? extends java.lang.Object> object) {
            this.config.object(object);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#timeouts Manifest#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.kubernetes.ManifestTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * wait block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait Manifest#wait}
         * <p>
         * @return {@code this}
         * @param wait wait block. This parameter is required.
         */
        public Builder wait(final imports.kubernetes.ManifestWait wait) {
            this.config.wait(wait);
            return this;
        }

        /**
         * A map of attribute paths and desired patterns to be matched.
         * <p>
         * After each apply the provider will wait for all attributes listed here to reach a value that matches the desired pattern.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait_for Manifest#wait_for}
         * <p>
         * @return {@code this}
         * @param waitFor A map of attribute paths and desired patterns to be matched. This parameter is required.
         */
        public Builder waitFor(final com.hashicorp.cdktf.IResolvable waitFor) {
            this.config.waitFor(waitFor);
            return this;
        }
        /**
         * A map of attribute paths and desired patterns to be matched.
         * <p>
         * After each apply the provider will wait for all attributes listed here to reach a value that matches the desired pattern.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait_for Manifest#wait_for}
         * <p>
         * @return {@code this}
         * @param waitFor A map of attribute paths and desired patterns to be matched. This parameter is required.
         */
        public Builder waitFor(final imports.kubernetes.ManifestWaitFor waitFor) {
            this.config.waitFor(waitFor);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.Manifest}.
         */
        @Override
        public imports.kubernetes.Manifest build() {
            return new imports.kubernetes.Manifest(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
