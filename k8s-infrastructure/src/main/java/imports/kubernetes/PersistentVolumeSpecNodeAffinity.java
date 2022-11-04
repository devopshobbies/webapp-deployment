package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.243Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeSpecNodeAffinity")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpecNodeAffinity.Jsii$Proxy.class)
public interface PersistentVolumeSpecNodeAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * required block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#required PersistentVolume#required}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired getRequired() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpecNodeAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpecNodeAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeSpecNodeAffinity> {
        imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired required;

        /**
         * Sets the value of {@link PersistentVolumeSpecNodeAffinity#getRequired}
         * @param required required block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume#required PersistentVolume#required}
         * @return {@code this}
         */
        public Builder required(imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired required) {
            this.required = required;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpecNodeAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeSpecNodeAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpecNodeAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpecNodeAffinity {
        private final imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired required;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.required = software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.required = builder.required;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeSpecNodeAffinityRequired getRequired() {
            return this.required;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRequired() != null) {
                data.set("required", om.valueToTree(this.getRequired()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeSpecNodeAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpecNodeAffinity.Jsii$Proxy that = (PersistentVolumeSpecNodeAffinity.Jsii$Proxy) o;

            return this.required != null ? this.required.equals(that.required) : that.required == null;
        }

        @Override
        public final int hashCode() {
            int result = this.required != null ? this.required.hashCode() : 0;
            return result;
        }
    }
}
