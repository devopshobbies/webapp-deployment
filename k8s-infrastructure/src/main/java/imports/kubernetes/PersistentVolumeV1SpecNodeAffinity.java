package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.265Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecNodeAffinity")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecNodeAffinity.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecNodeAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * required block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#required PersistentVolumeV1#required}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired getRequired() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecNodeAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecNodeAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecNodeAffinity> {
        imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired required;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecNodeAffinity#getRequired}
         * @param required required block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#required PersistentVolumeV1#required}
         * @return {@code this}
         */
        public Builder required(imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired required) {
            this.required = required;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecNodeAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecNodeAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecNodeAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecNodeAffinity {
        private final imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired required;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.required = software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.required = builder.required;
        }

        @Override
        public final imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired getRequired() {
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
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecNodeAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecNodeAffinity.Jsii$Proxy that = (PersistentVolumeV1SpecNodeAffinity.Jsii$Proxy) o;

            return this.required != null ? this.required.equals(that.required) : that.required == null;
        }

        @Override
        public final int hashCode() {
            int result = this.required != null ? this.required.hashCode() : 0;
            return result;
        }
    }
}
