package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.442Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPersistentVolumeClaimV1Spec")
@software.amazon.jsii.Jsii.Proxy(DataKubernetesPersistentVolumeClaimV1Spec.Jsii$Proxy.class)
public interface DataKubernetesPersistentVolumeClaimV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#selector DataKubernetesPersistentVolumeClaimV1#selector}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSelector() {
        return null;
    }

    /**
     * Name of the storage class requested by the claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#storage_class_name DataKubernetesPersistentVolumeClaimV1#storage_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * The binding reference to the PersistentVolume backing this claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#volume_name DataKubernetesPersistentVolumeClaimV1#volume_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataKubernetesPersistentVolumeClaimV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataKubernetesPersistentVolumeClaimV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataKubernetesPersistentVolumeClaimV1Spec> {
        java.lang.Object selector;
        java.lang.String storageClassName;
        java.lang.String volumeName;

        /**
         * Sets the value of {@link DataKubernetesPersistentVolumeClaimV1Spec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#selector DataKubernetesPersistentVolumeClaimV1#selector}
         * @return {@code this}
         */
        public Builder selector(com.hashicorp.cdktf.IResolvable selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesPersistentVolumeClaimV1Spec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#selector DataKubernetesPersistentVolumeClaimV1#selector}
         * @return {@code this}
         */
        public Builder selector(java.util.List<? extends imports.kubernetes.DataKubernetesPersistentVolumeClaimV1SpecSelector> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesPersistentVolumeClaimV1Spec#getStorageClassName}
         * @param storageClassName Name of the storage class requested by the claim.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#storage_class_name DataKubernetesPersistentVolumeClaimV1#storage_class_name}
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link DataKubernetesPersistentVolumeClaimV1Spec#getVolumeName}
         * @param volumeName The binding reference to the PersistentVolume backing this claim.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/d/persistent_volume_claim_v1#volume_name DataKubernetesPersistentVolumeClaimV1#volume_name}
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataKubernetesPersistentVolumeClaimV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataKubernetesPersistentVolumeClaimV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataKubernetesPersistentVolumeClaimV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataKubernetesPersistentVolumeClaimV1Spec {
        private final java.lang.Object selector;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeName = software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = builder.selector;
            this.storageClassName = builder.storageClassName;
            this.volumeName = builder.volumeName;
        }

        @Override
        public final java.lang.Object getSelector() {
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
            struct.set("fqn", om.valueToTree("kubernetes.DataKubernetesPersistentVolumeClaimV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataKubernetesPersistentVolumeClaimV1Spec.Jsii$Proxy that = (DataKubernetesPersistentVolumeClaimV1Spec.Jsii$Proxy) o;

            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector != null ? this.selector.hashCode() : 0;
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
