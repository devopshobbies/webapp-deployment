package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.038Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path specifies a relative path to the mount point of the projected volume.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#path StatefulSet#path}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Audience is the intended audience of the token.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#audience StatefulSet#audience}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAudience() {
        return null;
    }

    /**
     * ExpirationSeconds is the expected duration of validity of the service account token.
     * <p>
     * It defaults to 1 hour and must be at least 10 minutes (600 seconds).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#expiration_seconds StatefulSet#expiration_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken> {
        java.lang.String path;
        java.lang.String audience;
        java.lang.Number expirationSeconds;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken#getPath}
         * @param path Path specifies a relative path to the mount point of the projected volume. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#path StatefulSet#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken#getAudience}
         * @param audience Audience is the intended audience of the token.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#audience StatefulSet#audience}
         * @return {@code this}
         */
        public Builder audience(java.lang.String audience) {
            this.audience = audience;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken#getExpirationSeconds}
         * @param expirationSeconds ExpirationSeconds is the expected duration of validity of the service account token.
         *                          It defaults to 1 hour and must be at least 10 minutes (600 seconds).
         *                          <p>
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#expiration_seconds StatefulSet#expiration_seconds}
         * @return {@code this}
         */
        public Builder expirationSeconds(java.lang.Number expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken {
        private final java.lang.String path;
        private final java.lang.String audience;
        private final java.lang.Number expirationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.audience = software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expirationSeconds = software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.audience = builder.audience;
            this.expirationSeconds = builder.expirationSeconds;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getAudience() {
            return this.audience;
        }

        @Override
        public final java.lang.Number getExpirationSeconds() {
            return this.expirationSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getAudience() != null) {
                data.set("audience", om.valueToTree(this.getAudience()));
            }
            if (this.getExpirationSeconds() != null) {
                data.set("expirationSeconds", om.valueToTree(this.getExpirationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.Jsii$Proxy that = (StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.audience != null ? !this.audience.equals(that.audience) : that.audience != null) return false;
            return this.expirationSeconds != null ? this.expirationSeconds.equals(that.expirationSeconds) : that.expirationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.audience != null ? this.audience.hashCode() : 0);
            result = 31 * result + (this.expirationSeconds != null ? this.expirationSeconds.hashCode() : 0);
            return result;
        }
    }
}
