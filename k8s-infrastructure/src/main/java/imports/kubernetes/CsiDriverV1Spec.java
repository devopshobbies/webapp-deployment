package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.153Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CsiDriverV1Spec")
@software.amazon.jsii.Jsii.Proxy(CsiDriverV1Spec.Jsii$Proxy.class)
public interface CsiDriverV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Indicates if the CSI volume driver requires an attach operation.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#attach_required CsiDriverV1#attach_required}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getAttachRequired();

    /**
     * Indicates that the CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#pod_info_on_mount CsiDriverV1#pod_info_on_mount}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPodInfoOnMount() {
        return null;
    }

    /**
     * Defines what kind of volumes this CSI volume driver supports.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#volume_lifecycle_modes CsiDriverV1#volume_lifecycle_modes}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumeLifecycleModes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiDriverV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiDriverV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiDriverV1Spec> {
        java.lang.Object attachRequired;
        java.lang.Object podInfoOnMount;
        java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Sets the value of {@link CsiDriverV1Spec#getAttachRequired}
         * @param attachRequired Indicates if the CSI volume driver requires an attach operation. This parameter is required.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#attach_required CsiDriverV1#attach_required}
         * @return {@code this}
         */
        public Builder attachRequired(java.lang.Boolean attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverV1Spec#getAttachRequired}
         * @param attachRequired Indicates if the CSI volume driver requires an attach operation. This parameter is required.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#attach_required CsiDriverV1#attach_required}
         * @return {@code this}
         */
        public Builder attachRequired(com.hashicorp.cdktf.IResolvable attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverV1Spec#getPodInfoOnMount}
         * @param podInfoOnMount Indicates that the CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#pod_info_on_mount CsiDriverV1#pod_info_on_mount}
         * @return {@code this}
         */
        public Builder podInfoOnMount(java.lang.Boolean podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverV1Spec#getPodInfoOnMount}
         * @param podInfoOnMount Indicates that the CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#pod_info_on_mount CsiDriverV1#pod_info_on_mount}
         * @return {@code this}
         */
        public Builder podInfoOnMount(com.hashicorp.cdktf.IResolvable podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverV1Spec#getVolumeLifecycleModes}
         * @param volumeLifecycleModes Defines what kind of volumes this CSI volume driver supports.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver_v1#volume_lifecycle_modes CsiDriverV1#volume_lifecycle_modes}
         * @return {@code this}
         */
        public Builder volumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiDriverV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiDriverV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiDriverV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiDriverV1Spec {
        private final java.lang.Object attachRequired;
        private final java.lang.Object podInfoOnMount;
        private final java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attachRequired = software.amazon.jsii.Kernel.get(this, "attachRequired", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.podInfoOnMount = software.amazon.jsii.Kernel.get(this, "podInfoOnMount", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeLifecycleModes = software.amazon.jsii.Kernel.get(this, "volumeLifecycleModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attachRequired = java.util.Objects.requireNonNull(builder.attachRequired, "attachRequired is required");
            this.podInfoOnMount = builder.podInfoOnMount;
            this.volumeLifecycleModes = builder.volumeLifecycleModes;
        }

        @Override
        public final java.lang.Object getAttachRequired() {
            return this.attachRequired;
        }

        @Override
        public final java.lang.Object getPodInfoOnMount() {
            return this.podInfoOnMount;
        }

        @Override
        public final java.util.List<java.lang.String> getVolumeLifecycleModes() {
            return this.volumeLifecycleModes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("attachRequired", om.valueToTree(this.getAttachRequired()));
            if (this.getPodInfoOnMount() != null) {
                data.set("podInfoOnMount", om.valueToTree(this.getPodInfoOnMount()));
            }
            if (this.getVolumeLifecycleModes() != null) {
                data.set("volumeLifecycleModes", om.valueToTree(this.getVolumeLifecycleModes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CsiDriverV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiDriverV1Spec.Jsii$Proxy that = (CsiDriverV1Spec.Jsii$Proxy) o;

            if (!attachRequired.equals(that.attachRequired)) return false;
            if (this.podInfoOnMount != null ? !this.podInfoOnMount.equals(that.podInfoOnMount) : that.podInfoOnMount != null) return false;
            return this.volumeLifecycleModes != null ? this.volumeLifecycleModes.equals(that.volumeLifecycleModes) : that.volumeLifecycleModes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attachRequired.hashCode();
            result = 31 * result + (this.podInfoOnMount != null ? this.podInfoOnMount.hashCode() : 0);
            result = 31 * result + (this.volumeLifecycleModes != null ? this.volumeLifecycleModes.hashCode() : 0);
            return result;
        }
    }
}
