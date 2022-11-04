package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.331Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecContainerEnvValueFromSecretKeyRef")
@software.amazon.jsii.Jsii.Proxy(PodSpecContainerEnvValueFromSecretKeyRef.Jsii$Proxy.class)
public interface PodSpecContainerEnvValueFromSecretKeyRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * The key of the secret to select from. Must be a valid secret key.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#key Pod#key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#name Pod#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Specify whether the Secret or its key must be defined.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#optional Pod#optional}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecContainerEnvValueFromSecretKeyRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecContainerEnvValueFromSecretKeyRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecContainerEnvValueFromSecretKeyRef> {
        java.lang.String key;
        java.lang.String name;
        java.lang.Object optional;

        /**
         * Sets the value of {@link PodSpecContainerEnvValueFromSecretKeyRef#getKey}
         * @param key The key of the secret to select from. Must be a valid secret key.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#key Pod#key}
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecContainerEnvValueFromSecretKeyRef#getName}
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#name Pod#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecContainerEnvValueFromSecretKeyRef#getOptional}
         * @param optional Specify whether the Secret or its key must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#optional Pod#optional}
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecContainerEnvValueFromSecretKeyRef#getOptional}
         * @param optional Specify whether the Secret or its key must be defined.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#optional Pod#optional}
         * @return {@code this}
         */
        public Builder optional(com.hashicorp.cdktf.IResolvable optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecContainerEnvValueFromSecretKeyRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecContainerEnvValueFromSecretKeyRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecContainerEnvValueFromSecretKeyRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecContainerEnvValueFromSecretKeyRef {
        private final java.lang.String key;
        private final java.lang.String name;
        private final java.lang.Object optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
            this.name = builder.name;
            this.optional = builder.optional;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getOptional() {
            return this.optional;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecContainerEnvValueFromSecretKeyRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecContainerEnvValueFromSecretKeyRef.Jsii$Proxy that = (PodSpecContainerEnvValueFromSecretKeyRef.Jsii$Proxy) o;

            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
