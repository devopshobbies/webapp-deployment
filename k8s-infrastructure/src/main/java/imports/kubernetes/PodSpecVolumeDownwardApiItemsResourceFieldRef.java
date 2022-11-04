package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.391Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecVolumeDownwardApiItemsResourceFieldRef")
@software.amazon.jsii.Jsii.Proxy(PodSpecVolumeDownwardApiItemsResourceFieldRef.Jsii$Proxy.class)
public interface PodSpecVolumeDownwardApiItemsResourceFieldRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod#container_name Pod#container_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContainerName();

    /**
     * Resource to select.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#resource Pod#resource}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod#divisor Pod#divisor}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDivisor() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecVolumeDownwardApiItemsResourceFieldRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecVolumeDownwardApiItemsResourceFieldRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecVolumeDownwardApiItemsResourceFieldRef> {
        java.lang.String containerName;
        java.lang.String resource;
        java.lang.String divisor;

        /**
         * Sets the value of {@link PodSpecVolumeDownwardApiItemsResourceFieldRef#getContainerName}
         * @param containerName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod#container_name Pod#container_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeDownwardApiItemsResourceFieldRef#getResource}
         * @param resource Resource to select. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#resource Pod#resource}
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeDownwardApiItemsResourceFieldRef#getDivisor}
         * @param divisor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod#divisor Pod#divisor}.
         * @return {@code this}
         */
        public Builder divisor(java.lang.String divisor) {
            this.divisor = divisor;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecVolumeDownwardApiItemsResourceFieldRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecVolumeDownwardApiItemsResourceFieldRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecVolumeDownwardApiItemsResourceFieldRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecVolumeDownwardApiItemsResourceFieldRef {
        private final java.lang.String containerName;
        private final java.lang.String resource;
        private final java.lang.String divisor;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.divisor = software.amazon.jsii.Kernel.get(this, "divisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.containerName = java.util.Objects.requireNonNull(builder.containerName, "containerName is required");
            this.resource = java.util.Objects.requireNonNull(builder.resource, "resource is required");
            this.divisor = builder.divisor;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getDivisor() {
            return this.divisor;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("containerName", om.valueToTree(this.getContainerName()));
            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getDivisor() != null) {
                data.set("divisor", om.valueToTree(this.getDivisor()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecVolumeDownwardApiItemsResourceFieldRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecVolumeDownwardApiItemsResourceFieldRef.Jsii$Proxy that = (PodSpecVolumeDownwardApiItemsResourceFieldRef.Jsii$Proxy) o;

            if (!containerName.equals(that.containerName)) return false;
            if (!resource.equals(that.resource)) return false;
            return this.divisor != null ? this.divisor.equals(that.divisor) : that.divisor == null;
        }

        @Override
        public final int hashCode() {
            int result = this.containerName.hashCode();
            result = 31 * result + (this.resource.hashCode());
            result = 31 * result + (this.divisor != null ? this.divisor.hashCode() : 0);
            return result;
        }
    }
}
