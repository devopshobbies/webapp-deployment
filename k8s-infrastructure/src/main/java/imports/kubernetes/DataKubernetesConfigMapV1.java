package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1 kubernetes_config_map_v1}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.410Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesConfigMapV1")
public class DataKubernetesConfigMapV1 extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataKubernetesConfigMapV1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesConfigMapV1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.DataKubernetesConfigMapV1.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1 kubernetes_config_map_v1} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataKubernetesConfigMapV1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesConfigMapV1Config config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesConfigMapV1Metadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImmutable() {
        software.amazon.jsii.Kernel.call(this, "resetImmutable", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getBinaryData() {
        return software.amazon.jsii.Kernel.get(this, "binaryData", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getData() {
        return software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesConfigMapV1MetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesConfigMapV1MetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getImmutableInput() {
        return software.amazon.jsii.Kernel.get(this, "immutableInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesConfigMapV1Metadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesConfigMapV1Metadata.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getImmutable() {
        return software.amazon.jsii.Kernel.get(this, "immutable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setImmutable(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "immutable", java.util.Objects.requireNonNull(value, "immutable is required"));
    }

    public void setImmutable(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "immutable", java.util.Objects.requireNonNull(value, "immutable is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.DataKubernetesConfigMapV1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.DataKubernetesConfigMapV1> {
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
        private final imports.kubernetes.DataKubernetesConfigMapV1Config.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.DataKubernetesConfigMapV1Config.Builder();
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1#metadata DataKubernetesConfigMapV1#metadata}
         * <p>
         * @return {@code this}
         * @param metadata metadata block. This parameter is required.
         */
        public Builder metadata(final imports.kubernetes.DataKubernetesConfigMapV1Metadata metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1#id DataKubernetesConfigMapV1#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1#id DataKubernetesConfigMapV1#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).
         * <p>
         * If not set to true, the field can be modified at any time. Defaulted to nil.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1#immutable DataKubernetesConfigMapV1#immutable}
         * <p>
         * @return {@code this}
         * @param immutable Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). This parameter is required.
         */
        public Builder immutable(final java.lang.Boolean immutable) {
            this.config.immutable(immutable);
            return this;
        }
        /**
         * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).
         * <p>
         * If not set to true, the field can be modified at any time. Defaulted to nil.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/config_map_v1#immutable DataKubernetesConfigMapV1#immutable}
         * <p>
         * @return {@code this}
         * @param immutable Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). This parameter is required.
         */
        public Builder immutable(final com.hashicorp.cdktf.IResolvable immutable) {
            this.config.immutable(immutable);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.DataKubernetesConfigMapV1}.
         */
        @Override
        public imports.kubernetes.DataKubernetesConfigMapV1 build() {
            return new imports.kubernetes.DataKubernetesConfigMapV1(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
