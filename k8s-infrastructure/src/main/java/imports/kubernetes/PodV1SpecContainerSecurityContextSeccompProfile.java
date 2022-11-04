package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.537Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecContainerSecurityContextSeccompProfile")
@software.amazon.jsii.Jsii.Proxy(PodV1SpecContainerSecurityContextSeccompProfile.Jsii$Proxy.class)
public interface PodV1SpecContainerSecurityContextSeccompProfile extends software.amazon.jsii.JsiiSerializable {

    /**
     * Localhost Profile indicates a profile defined in a file on the node should be used.
     * <p>
     * The profile must be preconfigured on the node to work.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#localhost_profile PodV1#localhost_profile}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocalhostProfile() {
        return null;
    }

    /**
     * Type indicates which kind of seccomp profile will be applied. Valid options are: Localhost, RuntimeDefault, Unconfined.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#type PodV1#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodV1SpecContainerSecurityContextSeccompProfile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodV1SpecContainerSecurityContextSeccompProfile}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodV1SpecContainerSecurityContextSeccompProfile> {
        java.lang.String localhostProfile;
        java.lang.String type;

        /**
         * Sets the value of {@link PodV1SpecContainerSecurityContextSeccompProfile#getLocalhostProfile}
         * @param localhostProfile Localhost Profile indicates a profile defined in a file on the node should be used.
         *                         The profile must be preconfigured on the node to work.
         *                         <p>
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#localhost_profile PodV1#localhost_profile}
         * @return {@code this}
         */
        public Builder localhostProfile(java.lang.String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * Sets the value of {@link PodV1SpecContainerSecurityContextSeccompProfile#getType}
         * @param type Type indicates which kind of seccomp profile will be applied. Valid options are: Localhost, RuntimeDefault, Unconfined.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_v1#type PodV1#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodV1SpecContainerSecurityContextSeccompProfile}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodV1SpecContainerSecurityContextSeccompProfile build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodV1SpecContainerSecurityContextSeccompProfile}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodV1SpecContainerSecurityContextSeccompProfile {
        private final java.lang.String localhostProfile;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.localhostProfile = software.amazon.jsii.Kernel.get(this, "localhostProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.localhostProfile = builder.localhostProfile;
            this.type = builder.type;
        }

        @Override
        public final java.lang.String getLocalhostProfile() {
            return this.localhostProfile;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLocalhostProfile() != null) {
                data.set("localhostProfile", om.valueToTree(this.getLocalhostProfile()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodV1SpecContainerSecurityContextSeccompProfile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodV1SpecContainerSecurityContextSeccompProfile.Jsii$Proxy that = (PodV1SpecContainerSecurityContextSeccompProfile.Jsii$Proxy) o;

            if (this.localhostProfile != null ? !this.localhostProfile.equals(that.localhostProfile) : that.localhostProfile != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.localhostProfile != null ? this.localhostProfile.hashCode() : 0;
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
