package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.265Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1Spec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1Spec.Jsii$Proxy.class)
public interface PersistentVolumeV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Contains all ways the volume can be mounted. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#access_modes PersistentVolumeV1#access_modes}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccessModes();

    /**
     * A description of the persistent volume's resources and capacity. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#capacity PersistentVolumeV1#capacity}
     */
    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getCapacity();

    /**
     * persistent_volume_source block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#persistent_volume_source PersistentVolumeV1#persistent_volume_source}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource getPersistentVolumeSource();

    /**
     * claim_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#claim_ref PersistentVolumeV1#claim_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecClaimRef getClaimRef() {
        return null;
    }

    /**
     * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#mount_options PersistentVolumeV1#mount_options}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * node_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#node_affinity PersistentVolumeV1#node_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * What happens to a persistent volume when released from its claim.
     * <p>
     * Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#recycling-policy
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#persistent_volume_reclaim_policy PersistentVolumeV1#persistent_volume_reclaim_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeReclaimPolicy() {
        return null;
    }

    /**
     * A description of the persistent volume's class. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#class.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#storage_class_name PersistentVolumeV1#storage_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * Defines if a volume is intended to be used with a formatted filesystem.
     * <p>
     * or to remain in raw block state.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#volume_mode PersistentVolumeV1#volume_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1Spec> {
        java.util.List<java.lang.String> accessModes;
        java.util.Map<java.lang.String, java.lang.String> capacity;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource persistentVolumeSource;
        imports.kubernetes.PersistentVolumeV1SpecClaimRef claimRef;
        java.util.List<java.lang.String> mountOptions;
        imports.kubernetes.PersistentVolumeV1SpecNodeAffinity nodeAffinity;
        java.lang.String persistentVolumeReclaimPolicy;
        java.lang.String storageClassName;
        java.lang.String volumeMode;

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getAccessModes}
         * @param accessModes Contains all ways the volume can be mounted. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#access_modes PersistentVolumeV1#access_modes}
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getCapacity}
         * @param capacity A description of the persistent volume's resources and capacity. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#capacity PersistentVolumeV1#capacity}
         * @return {@code this}
         */
        public Builder capacity(java.util.Map<java.lang.String, java.lang.String> capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getPersistentVolumeSource}
         * @param persistentVolumeSource persistent_volume_source block. This parameter is required.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#persistent_volume_source PersistentVolumeV1#persistent_volume_source}
         * @return {@code this}
         */
        public Builder persistentVolumeSource(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource persistentVolumeSource) {
            this.persistentVolumeSource = persistentVolumeSource;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getClaimRef}
         * @param claimRef claim_ref block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#claim_ref PersistentVolumeV1#claim_ref}
         * @return {@code this}
         */
        public Builder claimRef(imports.kubernetes.PersistentVolumeV1SpecClaimRef claimRef) {
            this.claimRef = claimRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getMountOptions}
         * @param mountOptions A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#mount_options PersistentVolumeV1#mount_options}
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getNodeAffinity}
         * @param nodeAffinity node_affinity block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#node_affinity PersistentVolumeV1#node_affinity}
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.kubernetes.PersistentVolumeV1SpecNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getPersistentVolumeReclaimPolicy}
         * @param persistentVolumeReclaimPolicy What happens to a persistent volume when released from its claim.
         *                                      Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#recycling-policy
         *                                      <p>
         *                                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#persistent_volume_reclaim_policy PersistentVolumeV1#persistent_volume_reclaim_policy}
         * @return {@code this}
         */
        public Builder persistentVolumeReclaimPolicy(java.lang.String persistentVolumeReclaimPolicy) {
            this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getStorageClassName}
         * @param storageClassName A description of the persistent volume's class. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#class.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#storage_class_name PersistentVolumeV1#storage_class_name}
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1Spec#getVolumeMode}
         * @param volumeMode Defines if a volume is intended to be used with a formatted filesystem.
         *                   or to remain in raw block state.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#volume_mode PersistentVolumeV1#volume_mode}
         * @return {@code this}
         */
        public Builder volumeMode(java.lang.String volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1Spec {
        private final java.util.List<java.lang.String> accessModes;
        private final java.util.Map<java.lang.String, java.lang.String> capacity;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource persistentVolumeSource;
        private final imports.kubernetes.PersistentVolumeV1SpecClaimRef claimRef;
        private final java.util.List<java.lang.String> mountOptions;
        private final imports.kubernetes.PersistentVolumeV1SpecNodeAffinity nodeAffinity;
        private final java.lang.String persistentVolumeReclaimPolicy;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.capacity = software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.persistentVolumeSource = software.amazon.jsii.Kernel.get(this, "persistentVolumeSource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource.class));
            this.claimRef = software.amazon.jsii.Kernel.get(this, "claimRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecClaimRef.class));
            this.mountOptions = software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecNodeAffinity.class));
            this.persistentVolumeReclaimPolicy = software.amazon.jsii.Kernel.get(this, "persistentVolumeReclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeMode = software.amazon.jsii.Kernel.get(this, "volumeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = java.util.Objects.requireNonNull(builder.accessModes, "accessModes is required");
            this.capacity = java.util.Objects.requireNonNull(builder.capacity, "capacity is required");
            this.persistentVolumeSource = java.util.Objects.requireNonNull(builder.persistentVolumeSource, "persistentVolumeSource is required");
            this.claimRef = builder.claimRef;
            this.mountOptions = builder.mountOptions;
            this.nodeAffinity = builder.nodeAffinity;
            this.persistentVolumeReclaimPolicy = builder.persistentVolumeReclaimPolicy;
            this.storageClassName = builder.storageClassName;
            this.volumeMode = builder.volumeMode;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCapacity() {
            return this.capacity;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSource getPersistentVolumeSource() {
            return this.persistentVolumeSource;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecClaimRef getClaimRef() {
            return this.claimRef;
        }

        @Override
        public final java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final java.lang.String getPersistentVolumeReclaimPolicy() {
            return this.persistentVolumeReclaimPolicy;
        }

        @Override
        public final java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public final java.lang.String getVolumeMode() {
            return this.volumeMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("accessModes", om.valueToTree(this.getAccessModes()));
            data.set("capacity", om.valueToTree(this.getCapacity()));
            data.set("persistentVolumeSource", om.valueToTree(this.getPersistentVolumeSource()));
            if (this.getClaimRef() != null) {
                data.set("claimRef", om.valueToTree(this.getClaimRef()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPersistentVolumeReclaimPolicy() != null) {
                data.set("persistentVolumeReclaimPolicy", om.valueToTree(this.getPersistentVolumeReclaimPolicy()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getVolumeMode() != null) {
                data.set("volumeMode", om.valueToTree(this.getVolumeMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1Spec.Jsii$Proxy that = (PersistentVolumeV1Spec.Jsii$Proxy) o;

            if (!accessModes.equals(that.accessModes)) return false;
            if (!capacity.equals(that.capacity)) return false;
            if (!persistentVolumeSource.equals(that.persistentVolumeSource)) return false;
            if (this.claimRef != null ? !this.claimRef.equals(that.claimRef) : that.claimRef != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.persistentVolumeReclaimPolicy != null ? !this.persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy) : that.persistentVolumeReclaimPolicy != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            return this.volumeMode != null ? this.volumeMode.equals(that.volumeMode) : that.volumeMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessModes.hashCode();
            result = 31 * result + (this.capacity.hashCode());
            result = 31 * result + (this.persistentVolumeSource.hashCode());
            result = 31 * result + (this.claimRef != null ? this.claimRef.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeReclaimPolicy != null ? this.persistentVolumeReclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.volumeMode != null ? this.volumeMode.hashCode() : 0);
            return result;
        }
    }
}
