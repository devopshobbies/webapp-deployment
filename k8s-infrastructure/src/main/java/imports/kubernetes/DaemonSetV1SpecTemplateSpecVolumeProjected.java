package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.262Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecVolumeProjected")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecVolumeProjected.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecVolumeProjected extends software.amazon.jsii.JsiiSerializable {

    /**
     * sources block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#sources DaemonSetV1#sources}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getSources();

    /**
     * Optional: mode bits to use on created files by default.
     * <p>
     * Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#default_mode DaemonSetV1#default_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecVolumeProjected}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecVolumeProjected}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecVolumeProjected> {
        java.lang.Object sources;
        java.lang.String defaultMode;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecVolumeProjected#getSources}
         * @param sources sources block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#sources DaemonSetV1#sources}
         * @return {@code this}
         */
        public Builder sources(com.hashicorp.cdktf.IResolvable sources) {
            this.sources = sources;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecVolumeProjected#getSources}
         * @param sources sources block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#sources DaemonSetV1#sources}
         * @return {@code this}
         */
        public Builder sources(java.util.List<? extends imports.kubernetes.DaemonSetV1SpecTemplateSpecVolumeProjectedSources> sources) {
            this.sources = sources;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecVolumeProjected#getDefaultMode}
         * @param defaultMode Optional: mode bits to use on created files by default.
         *                    Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#default_mode DaemonSetV1#default_mode}
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.String defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecVolumeProjected}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecVolumeProjected build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecVolumeProjected}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecVolumeProjected {
        private final java.lang.Object sources;
        private final java.lang.String defaultMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sources = software.amazon.jsii.Kernel.get(this, "sources", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.defaultMode = software.amazon.jsii.Kernel.get(this, "defaultMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sources = java.util.Objects.requireNonNull(builder.sources, "sources is required");
            this.defaultMode = builder.defaultMode;
        }

        @Override
        public final java.lang.Object getSources() {
            return this.sources;
        }

        @Override
        public final java.lang.String getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sources", om.valueToTree(this.getSources()));
            if (this.getDefaultMode() != null) {
                data.set("defaultMode", om.valueToTree(this.getDefaultMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecVolumeProjected"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecVolumeProjected.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecVolumeProjected.Jsii$Proxy) o;

            if (!sources.equals(that.sources)) return false;
            return this.defaultMode != null ? this.defaultMode.equals(that.defaultMode) : that.defaultMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sources.hashCode();
            result = 31 * result + (this.defaultMode != null ? this.defaultMode.hashCode() : 0);
            return result;
        }
    }
}
