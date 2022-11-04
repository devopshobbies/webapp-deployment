package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.250Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef.Jsii$Proxy.class)
public interface PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#name PersistentVolume#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#namespace PersistentVolume#namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef> {
        java.lang.String name;
        java.lang.String namespace;

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef#getName}
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#name PersistentVolume#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef#getNamespace}
         * @param namespace Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#namespace PersistentVolume#namespace}
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef {
        private final java.lang.String name;
        private final java.lang.String namespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef.Jsii$Proxy that = (PersistentVolumeSpecPersistentVolumeSourceCsiNodePublishSecretRef.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.namespace != null ? this.namespace.equals(that.namespace) : that.namespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            return result;
        }
    }
}
