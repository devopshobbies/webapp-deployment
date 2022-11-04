package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.056Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.ReleasePostrender")
@software.amazon.jsii.Jsii.Proxy(ReleasePostrender.Jsii$Proxy.class)
public interface ReleasePostrender extends software.amazon.jsii.JsiiSerializable {

    /**
     * The command binary path.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#binary_path Release#binary_path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBinaryPath();

    /**
     * @return a {@link Builder} of {@link ReleasePostrender}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReleasePostrender}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReleasePostrender> {
        java.lang.String binaryPath;

        /**
         * Sets the value of {@link ReleasePostrender#getBinaryPath}
         * @param binaryPath The command binary path. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#binary_path Release#binary_path}
         * @return {@code this}
         */
        public Builder binaryPath(java.lang.String binaryPath) {
            this.binaryPath = binaryPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReleasePostrender}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReleasePostrender build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReleasePostrender}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReleasePostrender {
        private final java.lang.String binaryPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.binaryPath = software.amazon.jsii.Kernel.get(this, "binaryPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.binaryPath = java.util.Objects.requireNonNull(builder.binaryPath, "binaryPath is required");
        }

        @Override
        public final java.lang.String getBinaryPath() {
            return this.binaryPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("binaryPath", om.valueToTree(this.getBinaryPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.ReleasePostrender"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReleasePostrender.Jsii$Proxy that = (ReleasePostrender.Jsii$Proxy) o;

            return this.binaryPath.equals(that.binaryPath);
        }

        @Override
        public final int hashCode() {
            int result = this.binaryPath.hashCode();
            return result;
        }
    }
}
