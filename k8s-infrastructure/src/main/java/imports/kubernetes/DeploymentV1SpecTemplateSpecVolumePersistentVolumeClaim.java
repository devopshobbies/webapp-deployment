package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.821Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim")
@software.amazon.jsii.Jsii.Proxy(DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim.Jsii$Proxy.class)
public interface DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim extends software.amazon.jsii.JsiiSerializable {

    /**
     * ClaimName is the name of a PersistentVolumeClaim in the same.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#claim_name DeploymentV1#claim_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClaimName() {
        return null;
    }

    /**
     * Will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim> {
        java.lang.String claimName;
        java.lang.Object readOnly;

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim#getClaimName}
         * @param claimName ClaimName is the name of a PersistentVolumeClaim in the same.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#claim_name DeploymentV1#claim_name}
         * @return {@code this}
         */
        public Builder claimName(java.lang.String claimName) {
            this.claimName = claimName;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim#getReadOnly}
         * @param readOnly Will force the ReadOnly setting in VolumeMounts.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim#getReadOnly}
         * @param readOnly Will force the ReadOnly setting in VolumeMounts.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#read_only DeploymentV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim {
        private final java.lang.String claimName;
        private final java.lang.Object readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.claimName = software.amazon.jsii.Kernel.get(this, "claimName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.claimName = builder.claimName;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getClaimName() {
            return this.claimName;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClaimName() != null) {
                data.set("claimName", om.valueToTree(this.getClaimName()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim.Jsii$Proxy that = (DeploymentV1SpecTemplateSpecVolumePersistentVolumeClaim.Jsii$Proxy) o;

            if (this.claimName != null ? !this.claimName.equals(that.claimName) : that.claimName != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.claimName != null ? this.claimName.hashCode() : 0;
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
