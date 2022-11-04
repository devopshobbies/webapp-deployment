package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.711Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#name Deployment#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef> {
        java.lang.String name;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef#getName}
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment#name Deployment#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef.Jsii$Proxy that = (DeploymentSpecTemplateSpecVolumeCsiNodePublishSecretRef.Jsii$Proxy) o;

            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            return result;
        }
    }
}
