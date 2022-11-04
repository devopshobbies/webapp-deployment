package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.239Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeClaimV1Spec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeClaimV1Spec.Jsii$Proxy.class)
public interface PersistentVolumeClaimV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A set of the desired access modes the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#access_modes PersistentVolumeClaimV1#access_modes}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccessModes();

    /**
     * resources block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#resources PersistentVolumeClaimV1#resources}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeClaimV1SpecResources getResources();

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#selector PersistentVolumeClaimV1#selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeClaimV1SpecSelector getSelector() {
        return null;
    }

    /**
     * Name of the storage class requested by the claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#storage_class_name PersistentVolumeClaimV1#storage_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * The binding reference to the PersistentVolume backing this claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#volume_name PersistentVolumeClaimV1#volume_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeClaimV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeClaimV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeClaimV1Spec> {
        java.util.List<java.lang.String> accessModes;
        imports.kubernetes.PersistentVolumeClaimV1SpecResources resources;
        imports.kubernetes.PersistentVolumeClaimV1SpecSelector selector;
        java.lang.String storageClassName;
        java.lang.String volumeName;

        /**
         * Sets the value of {@link PersistentVolumeClaimV1Spec#getAccessModes}
         * @param accessModes A set of the desired access modes the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#access_modes PersistentVolumeClaimV1#access_modes}
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimV1Spec#getResources}
         * @param resources resources block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#resources PersistentVolumeClaimV1#resources}
         * @return {@code this}
         */
        public Builder resources(imports.kubernetes.PersistentVolumeClaimV1SpecResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimV1Spec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#selector PersistentVolumeClaimV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.PersistentVolumeClaimV1SpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimV1Spec#getStorageClassName}
         * @param storageClassName Name of the storage class requested by the claim.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#storage_class_name PersistentVolumeClaimV1#storage_class_name}
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimV1Spec#getVolumeName}
         * @param volumeName The binding reference to the PersistentVolume backing this claim.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_claim_v1#volume_name PersistentVolumeClaimV1#volume_name}
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeClaimV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeClaimV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeClaimV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeClaimV1Spec {
        private final java.util.List<java.lang.String> accessModes;
        private final imports.kubernetes.PersistentVolumeClaimV1SpecResources resources;
        private final imports.kubernetes.PersistentVolumeClaimV1SpecSelector selector;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecResources.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeClaimV1SpecSelector.class));
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeName = software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = java.util.Objects.requireNonNull(builder.accessModes, "accessModes is required");
            this.resources = java.util.Objects.requireNonNull(builder.resources, "resources is required");
            this.selector = builder.selector;
            this.storageClassName = builder.storageClassName;
            this.volumeName = builder.volumeName;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeClaimV1SpecResources getResources() {
            return this.resources;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeClaimV1SpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public final java.lang.String getVolumeName() {
            return this.volumeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("accessModes", om.valueToTree(this.getAccessModes()));
            data.set("resources", om.valueToTree(this.getResources()));
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeClaimV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeClaimV1Spec.Jsii$Proxy that = (PersistentVolumeClaimV1Spec.Jsii$Proxy) o;

            if (!accessModes.equals(that.accessModes)) return false;
            if (!resources.equals(that.resources)) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessModes.hashCode();
            result = 31 * result + (this.resources.hashCode());
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
