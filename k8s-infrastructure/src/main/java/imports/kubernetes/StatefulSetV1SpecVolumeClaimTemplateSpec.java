package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.155Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpec")
@software.amazon.jsii.Jsii.Proxy(StatefulSetV1SpecVolumeClaimTemplateSpec.Jsii$Proxy.class)
public interface StatefulSetV1SpecVolumeClaimTemplateSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A set of the desired access modes the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#access_modes StatefulSetV1#access_modes}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccessModes();

    /**
     * resources block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#resources StatefulSetV1#resources}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources getResources();

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#selector StatefulSetV1#selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector getSelector() {
        return null;
    }

    /**
     * Name of the storage class requested by the claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#storage_class_name StatefulSetV1#storage_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * The binding reference to the PersistentVolume backing this claim.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#volume_name StatefulSetV1#volume_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetV1SpecVolumeClaimTemplateSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetV1SpecVolumeClaimTemplateSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetV1SpecVolumeClaimTemplateSpec> {
        java.util.List<java.lang.String> accessModes;
        imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources resources;
        imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector selector;
        java.lang.String storageClassName;
        java.lang.String volumeName;

        /**
         * Sets the value of {@link StatefulSetV1SpecVolumeClaimTemplateSpec#getAccessModes}
         * @param accessModes A set of the desired access modes the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#access_modes StatefulSetV1#access_modes}
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecVolumeClaimTemplateSpec#getResources}
         * @param resources resources block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#resources StatefulSetV1#resources}
         * @return {@code this}
         */
        public Builder resources(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecVolumeClaimTemplateSpec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#selector StatefulSetV1#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecVolumeClaimTemplateSpec#getStorageClassName}
         * @param storageClassName Name of the storage class requested by the claim.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#storage_class_name StatefulSetV1#storage_class_name}
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetV1SpecVolumeClaimTemplateSpec#getVolumeName}
         * @param volumeName The binding reference to the PersistentVolume backing this claim.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set_v1#volume_name StatefulSetV1#volume_name}
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetV1SpecVolumeClaimTemplateSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetV1SpecVolumeClaimTemplateSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetV1SpecVolumeClaimTemplateSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetV1SpecVolumeClaimTemplateSpec {
        private final java.util.List<java.lang.String> accessModes;
        private final imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources resources;
        private final imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector selector;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector.class));
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
        public final imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecResources getResources() {
            return this.resources;
        }

        @Override
        public final imports.kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpecSelector getSelector() {
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
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetV1SpecVolumeClaimTemplateSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetV1SpecVolumeClaimTemplateSpec.Jsii$Proxy that = (StatefulSetV1SpecVolumeClaimTemplateSpec.Jsii$Proxy) o;

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
