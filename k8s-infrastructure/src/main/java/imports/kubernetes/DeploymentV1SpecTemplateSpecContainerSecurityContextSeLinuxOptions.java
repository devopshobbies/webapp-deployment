package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.769Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions")
@software.amazon.jsii.Jsii.Proxy(DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions.Jsii$Proxy.class)
public interface DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Level is SELinux level label that applies to the container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#level DeploymentV1#level}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLevel() {
        return null;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#role DeploymentV1#role}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRole() {
        return null;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#type DeploymentV1#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#user DeploymentV1#user}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions> {
        java.lang.String level;
        java.lang.String role;
        java.lang.String type;
        java.lang.String user;

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions#getLevel}
         * @param level Level is SELinux level label that applies to the container.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#level DeploymentV1#level}
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions#getRole}
         * @param role Role is a SELinux role label that applies to the container.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#role DeploymentV1#role}
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions#getType}
         * @param type Type is a SELinux type label that applies to the container.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#type DeploymentV1#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions#getUser}
         * @param user User is a SELinux user label that applies to the container.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#user DeploymentV1#user}
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions {
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
            this.level = builder.level;
            this.role = builder.role;
            this.type = builder.type;
            this.user = builder.user;
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

            if (this.getLevel() != null) {
                data.set("level", om.valueToTree(this.getLevel()));
            }
            if (this.getRole() != null) {
                data.set("role", om.valueToTree(this.getRole()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions.Jsii$Proxy that = (DeploymentV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions.Jsii$Proxy) o;

            if (this.level != null ? !this.level.equals(that.level) : that.level != null) return false;
            if (this.role != null ? !this.role.equals(that.role) : that.role != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.level != null ? this.level.hashCode() : 0;
            result = 31 * result + (this.role != null ? this.role.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
