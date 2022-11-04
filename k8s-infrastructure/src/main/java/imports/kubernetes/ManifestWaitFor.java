package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.183Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ManifestWaitFor")
@software.amazon.jsii.Jsii.Proxy(ManifestWaitFor.Jsii$Proxy.class)
public interface ManifestWaitFor extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/manifest#fields Manifest#fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManifestWaitFor}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManifestWaitFor}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManifestWaitFor> {
        java.util.Map<java.lang.String, java.lang.String> fields;

        /**
         * Sets the value of {@link ManifestWaitFor#getFields}
         * @param fields Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/manifest#fields Manifest#fields}.
         * @return {@code this}
         */
        public Builder fields(java.util.Map<java.lang.String, java.lang.String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManifestWaitFor}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManifestWaitFor build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ManifestWaitFor}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManifestWaitFor {
        private final java.util.Map<java.lang.String, java.lang.String> fields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fields = builder.fields;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getFields() {
            return this.fields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFields() != null) {
                data.set("fields", om.valueToTree(this.getFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ManifestWaitFor"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManifestWaitFor.Jsii$Proxy that = (ManifestWaitFor.Jsii$Proxy) o;

            return this.fields != null ? this.fields.equals(that.fields) : that.fields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fields != null ? this.fields.hashCode() : 0;
            return result;
        }
    }
}
