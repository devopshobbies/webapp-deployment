package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.309Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions.Jsii$Proxy.class)
public interface PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#level PodSecurityPolicyV1Beta1#level}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLevel();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#role PodSecurityPolicyV1Beta1#role}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRole();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#type PodSecurityPolicyV1Beta1#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#user PodSecurityPolicyV1Beta1#user}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUser();

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions> {
        java.lang.String level;
        java.lang.String role;
        java.lang.String type;
        java.lang.String user;

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions#getLevel}
         * @param level Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#level PodSecurityPolicyV1Beta1#level}. This parameter is required.
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions#getRole}
         * @param role Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#role PodSecurityPolicyV1Beta1#role}. This parameter is required.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#type PodSecurityPolicyV1Beta1#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions#getUser}
         * @param user Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#user PodSecurityPolicyV1Beta1#user}. This parameter is required.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions {
        private final java.lang.String level;
        private final java.lang.String role;
        private final java.lang.String type;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.level = software.amazon.jsii.Kernel.get(this, "level", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.level = java.util.Objects.requireNonNull(builder.level, "level is required");
            this.role = java.util.Objects.requireNonNull(builder.role, "role is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.user = java.util.Objects.requireNonNull(builder.user, "user is required");
        }

        @Override
        public final java.lang.String getLevel() {
            return this.level;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("level", om.valueToTree(this.getLevel()));
            data.set("role", om.valueToTree(this.getRole()));
            data.set("type", om.valueToTree(this.getType()));
            data.set("user", om.valueToTree(this.getUser()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions.Jsii$Proxy that = (PodSecurityPolicyV1Beta1SpecSeLinuxSeLinuxOptions.Jsii$Proxy) o;

            if (!level.equals(that.level)) return false;
            if (!role.equals(that.role)) return false;
            if (!type.equals(that.type)) return false;
            return this.user.equals(that.user);
        }

        @Override
        public final int hashCode() {
            int result = this.level.hashCode();
            result = 31 * result + (this.role.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.user.hashCode());
            return result;
        }
    }
}
