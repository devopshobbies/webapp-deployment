package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.588Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesStorageClassV1Config")
@software.amazon.jsii.Jsii.Proxy(DataKubernetesStorageClassV1Config.Jsii$Proxy.class)
public interface DataKubernetesStorageClassV1Config extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * metadata block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#metadata DataKubernetesStorageClassV1#metadata}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesStorageClassV1Metadata getMetadata();

    /**
     * allowed_topologies block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#allowed_topologies DataKubernetesStorageClassV1#allowed_topologies}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies getAllowedTopologies() {
        return null;
    }

    /**
     * Indicates whether the storage class allow volume expand.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#allow_volume_expansion DataKubernetesStorageClassV1#allow_volume_expansion}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowVolumeExpansion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#id DataKubernetesStorageClassV1#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Persistent Volumes that are dynamically created by a storage class will have the mount options specified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#mount_options DataKubernetesStorageClassV1#mount_options}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * The parameters for the provisioner that should create volumes of this storage class.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#parameters DataKubernetesStorageClassV1#parameters}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * Indicates the type of the reclaim policy.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#reclaim_policy DataKubernetesStorageClassV1#reclaim_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReclaimPolicy() {
        return null;
    }

    /**
     * Indicates when volume binding and dynamic provisioning should occur.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#volume_binding_mode DataKubernetesStorageClassV1#volume_binding_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeBindingMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataKubernetesStorageClassV1Config}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataKubernetesStorageClassV1Config}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataKubernetesStorageClassV1Config> {
        imports.kubernetes.DataKubernetesStorageClassV1Metadata metadata;
        imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies allowedTopologies;
        java.lang.Object allowVolumeExpansion;
        java.lang.String id;
        java.util.List<java.lang.String> mountOptions;
        java.util.Map<java.lang.String, java.lang.String> parameters;
        java.lang.String reclaimPolicy;
        java.lang.String volumeBindingMode;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getMetadata}
         * @param metadata metadata block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#metadata DataKubernetesStorageClassV1#metadata}
         * @return {@code this}
         */
        public Builder metadata(imports.kubernetes.DataKubernetesStorageClassV1Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getAllowedTopologies}
         * @param allowedTopologies allowed_topologies block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#allowed_topologies DataKubernetesStorageClassV1#allowed_topologies}
         * @return {@code this}
         */
        public Builder allowedTopologies(imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getAllowVolumeExpansion}
         * @param allowVolumeExpansion Indicates whether the storage class allow volume expand.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#allow_volume_expansion DataKubernetesStorageClassV1#allow_volume_expansion}
         * @return {@code this}
         */
        public Builder allowVolumeExpansion(java.lang.Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getAllowVolumeExpansion}
         * @param allowVolumeExpansion Indicates whether the storage class allow volume expand.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#allow_volume_expansion DataKubernetesStorageClassV1#allow_volume_expansion}
         * @return {@code this}
         */
        public Builder allowVolumeExpansion(com.hashicorp.cdktf.IResolvable allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#id DataKubernetesStorageClassV1#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getMountOptions}
         * @param mountOptions Persistent Volumes that are dynamically created by a storage class will have the mount options specified.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#mount_options DataKubernetesStorageClassV1#mount_options}
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getParameters}
         * @param parameters The parameters for the provisioner that should create volumes of this storage class.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#parameters DataKubernetesStorageClassV1#parameters}
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getReclaimPolicy}
         * @param reclaimPolicy Indicates the type of the reclaim policy.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#reclaim_policy DataKubernetesStorageClassV1#reclaim_policy}
         * @return {@code this}
         */
        public Builder reclaimPolicy(java.lang.String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getVolumeBindingMode}
         * @param volumeBindingMode Indicates when volume binding and dynamic provisioning should occur.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/storage_class_v1#volume_binding_mode DataKubernetesStorageClassV1#volume_binding_mode}
         * @return {@code this}
         */
        public Builder volumeBindingMode(java.lang.String volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesStorageClassV1Config#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataKubernetesStorageClassV1Config}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataKubernetesStorageClassV1Config build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataKubernetesStorageClassV1Config}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataKubernetesStorageClassV1Config {
        private final imports.kubernetes.DataKubernetesStorageClassV1Metadata metadata;
        private final imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies allowedTopologies;
        private final java.lang.Object allowVolumeExpansion;
        private final java.lang.String id;
        private final java.util.List<java.lang.String> mountOptions;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.lang.String reclaimPolicy;
        private final java.lang.String volumeBindingMode;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesStorageClassV1Metadata.class));
            this.allowedTopologies = software.amazon.jsii.Kernel.get(this, "allowedTopologies", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies.class));
            this.allowVolumeExpansion = software.amazon.jsii.Kernel.get(this, "allowVolumeExpansion", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mountOptions = software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.reclaimPolicy = software.amazon.jsii.Kernel.get(this, "reclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeBindingMode = software.amazon.jsii.Kernel.get(this, "volumeBindingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = java.util.Objects.requireNonNull(builder.metadata, "metadata is required");
            this.allowedTopologies = builder.allowedTopologies;
            this.allowVolumeExpansion = builder.allowVolumeExpansion;
            this.id = builder.id;
            this.mountOptions = builder.mountOptions;
            this.parameters = builder.parameters;
            this.reclaimPolicy = builder.reclaimPolicy;
            this.volumeBindingMode = builder.volumeBindingMode;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final imports.kubernetes.DataKubernetesStorageClassV1Metadata getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.kubernetes.DataKubernetesStorageClassV1AllowedTopologies getAllowedTopologies() {
            return this.allowedTopologies;
        }

        @Override
        public final java.lang.Object getAllowVolumeExpansion() {
            return this.allowVolumeExpansion;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.lang.String getReclaimPolicy() {
            return this.reclaimPolicy;
        }

        @Override
        public final java.lang.String getVolumeBindingMode() {
            return this.volumeBindingMode;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metadata", om.valueToTree(this.getMetadata()));
            if (this.getAllowedTopologies() != null) {
                data.set("allowedTopologies", om.valueToTree(this.getAllowedTopologies()));
            }
            if (this.getAllowVolumeExpansion() != null) {
                data.set("allowVolumeExpansion", om.valueToTree(this.getAllowVolumeExpansion()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getReclaimPolicy() != null) {
                data.set("reclaimPolicy", om.valueToTree(this.getReclaimPolicy()));
            }
            if (this.getVolumeBindingMode() != null) {
                data.set("volumeBindingMode", om.valueToTree(this.getVolumeBindingMode()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DataKubernetesStorageClassV1Config"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataKubernetesStorageClassV1Config.Jsii$Proxy that = (DataKubernetesStorageClassV1Config.Jsii$Proxy) o;

            if (!metadata.equals(that.metadata)) return false;
            if (this.allowedTopologies != null ? !this.allowedTopologies.equals(that.allowedTopologies) : that.allowedTopologies != null) return false;
            if (this.allowVolumeExpansion != null ? !this.allowVolumeExpansion.equals(that.allowVolumeExpansion) : that.allowVolumeExpansion != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.reclaimPolicy != null ? !this.reclaimPolicy.equals(that.reclaimPolicy) : that.reclaimPolicy != null) return false;
            if (this.volumeBindingMode != null ? !this.volumeBindingMode.equals(that.volumeBindingMode) : that.volumeBindingMode != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata.hashCode();
            result = 31 * result + (this.allowedTopologies != null ? this.allowedTopologies.hashCode() : 0);
            result = 31 * result + (this.allowVolumeExpansion != null ? this.allowVolumeExpansion.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.reclaimPolicy != null ? this.reclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.volumeBindingMode != null ? this.volumeBindingMode.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
