package imports.kubernetes;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kubernetes/r/storage_class kubernetes_storage_class}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.157Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StorageClass")
public class StorageClass extends com.hashicorp.cdktf.TerraformResource {

    protected StorageClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StorageClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kubernetes.StorageClass.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kubernetes/r/storage_class kubernetes_storage_class} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public StorageClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAllowedTopologies(final @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassAllowedTopologies value) {
        software.amazon.jsii.Kernel.call(this, "putAllowedTopologies", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowedTopologies() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedTopologies", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowVolumeExpansion() {
        software.amazon.jsii.Kernel.call(this, "resetAllowVolumeExpansion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMountOptions() {
        software.amazon.jsii.Kernel.call(this, "resetMountOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReclaimPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetReclaimPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeBindingMode() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeBindingMode", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassAllowedTopologiesOutputReference getAllowedTopologies() {
        return software.amazon.jsii.Kernel.get(this, "allowedTopologies", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassAllowedTopologiesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StorageClassAllowedTopologies getAllowedTopologiesInput() {
        return software.amazon.jsii.Kernel.get(this, "allowedTopologiesInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassAllowedTopologies.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowVolumeExpansionInput() {
        return software.amazon.jsii.Kernel.get(this, "allowVolumeExpansionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StorageClassMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "mountOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReclaimPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "reclaimPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageProvisionerInput() {
        return software.amazon.jsii.Kernel.get(this, "storageProvisionerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVolumeBindingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeBindingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowVolumeExpansion() {
        return software.amazon.jsii.Kernel.get(this, "allowVolumeExpansion", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowVolumeExpansion(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowVolumeExpansion", java.util.Objects.requireNonNull(value, "allowVolumeExpansion is required"));
    }

    public void setAllowVolumeExpansion(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowVolumeExpansion", java.util.Objects.requireNonNull(value, "allowVolumeExpansion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMountOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMountOptions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "mountOptions", java.util.Objects.requireNonNull(value, "mountOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "parameters", java.util.Objects.requireNonNull(value, "parameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReclaimPolicy() {
        return software.amazon.jsii.Kernel.get(this, "reclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReclaimPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reclaimPolicy", java.util.Objects.requireNonNull(value, "reclaimPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageProvisioner() {
        return software.amazon.jsii.Kernel.get(this, "storageProvisioner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageProvisioner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageProvisioner", java.util.Objects.requireNonNull(value, "storageProvisioner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeBindingMode() {
        return software.amazon.jsii.Kernel.get(this, "volumeBindingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVolumeBindingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "volumeBindingMode", java.util.Objects.requireNonNull(value, "volumeBindingMode is required"));
    }

    /**
     * A fluent builder for {@link imports.kubernetes.StorageClass}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kubernetes.StorageClass> {
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
        private final imports.kubernetes.StorageClassConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kubernetes.StorageClassConfig.Builder();
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#metadata StorageClass#metadata}
         * <p>
         * @return {@code this}
         * @param metadata metadata block. This parameter is required.
         */
        public Builder metadata(final imports.kubernetes.StorageClassMetadata metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * Indicates the type of the provisioner.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#storage_provisioner StorageClass#storage_provisioner}
         * <p>
         * @return {@code this}
         * @param storageProvisioner Indicates the type of the provisioner. This parameter is required.
         */
        public Builder storageProvisioner(final java.lang.String storageProvisioner) {
            this.config.storageProvisioner(storageProvisioner);
            return this;
        }

        /**
         * allowed_topologies block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#allowed_topologies StorageClass#allowed_topologies}
         * <p>
         * @return {@code this}
         * @param allowedTopologies allowed_topologies block. This parameter is required.
         */
        public Builder allowedTopologies(final imports.kubernetes.StorageClassAllowedTopologies allowedTopologies) {
            this.config.allowedTopologies(allowedTopologies);
            return this;
        }

        /**
         * Indicates whether the storage class allow volume expand.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#allow_volume_expansion StorageClass#allow_volume_expansion}
         * <p>
         * @return {@code this}
         * @param allowVolumeExpansion Indicates whether the storage class allow volume expand. This parameter is required.
         */
        public Builder allowVolumeExpansion(final java.lang.Boolean allowVolumeExpansion) {
            this.config.allowVolumeExpansion(allowVolumeExpansion);
            return this;
        }
        /**
         * Indicates whether the storage class allow volume expand.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#allow_volume_expansion StorageClass#allow_volume_expansion}
         * <p>
         * @return {@code this}
         * @param allowVolumeExpansion Indicates whether the storage class allow volume expand. This parameter is required.
         */
        public Builder allowVolumeExpansion(final com.hashicorp.cdktf.IResolvable allowVolumeExpansion) {
            this.config.allowVolumeExpansion(allowVolumeExpansion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#id StorageClass#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#id StorageClass#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Persistent Volumes that are dynamically created by a storage class will have the mount options specified.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#mount_options StorageClass#mount_options}
         * <p>
         * @return {@code this}
         * @param mountOptions Persistent Volumes that are dynamically created by a storage class will have the mount options specified. This parameter is required.
         */
        public Builder mountOptions(final java.util.List<java.lang.String> mountOptions) {
            this.config.mountOptions(mountOptions);
            return this;
        }

        /**
         * The parameters for the provisioner that should create volumes of this storage class.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#parameters StorageClass#parameters}
         * <p>
         * @return {@code this}
         * @param parameters The parameters for the provisioner that should create volumes of this storage class. This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.config.parameters(parameters);
            return this;
        }

        /**
         * Indicates the type of the reclaim policy.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#reclaim_policy StorageClass#reclaim_policy}
         * <p>
         * @return {@code this}
         * @param reclaimPolicy Indicates the type of the reclaim policy. This parameter is required.
         */
        public Builder reclaimPolicy(final java.lang.String reclaimPolicy) {
            this.config.reclaimPolicy(reclaimPolicy);
            return this;
        }

        /**
         * Indicates when volume binding and dynamic provisioning should occur.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class#volume_binding_mode StorageClass#volume_binding_mode}
         * <p>
         * @return {@code this}
         * @param volumeBindingMode Indicates when volume binding and dynamic provisioning should occur. This parameter is required.
         */
        public Builder volumeBindingMode(final java.lang.String volumeBindingMode) {
            this.config.volumeBindingMode(volumeBindingMode);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kubernetes.StorageClass}.
         */
        @Override
        public imports.kubernetes.StorageClass build() {
            return new imports.kubernetes.StorageClass(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
