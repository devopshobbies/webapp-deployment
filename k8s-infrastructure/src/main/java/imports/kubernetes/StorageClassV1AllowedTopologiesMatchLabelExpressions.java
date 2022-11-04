package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.168Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StorageClassV1AllowedTopologiesMatchLabelExpressions")
@software.amazon.jsii.Jsii.Proxy(StorageClassV1AllowedTopologiesMatchLabelExpressions.Jsii$Proxy.class)
public interface StorageClassV1AllowedTopologiesMatchLabelExpressions extends software.amazon.jsii.JsiiSerializable {

    /**
     * The label key that the selector applies to.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class_v1#key StorageClassV1#key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * An array of string values. One value must match the label to be selected.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class_v1#values StorageClassV1#values}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StorageClassV1AllowedTopologiesMatchLabelExpressions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StorageClassV1AllowedTopologiesMatchLabelExpressions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StorageClassV1AllowedTopologiesMatchLabelExpressions> {
        java.lang.String key;
        java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link StorageClassV1AllowedTopologiesMatchLabelExpressions#getKey}
         * @param key The label key that the selector applies to.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class_v1#key StorageClassV1#key}
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassV1AllowedTopologiesMatchLabelExpressions#getValues}
         * @param values An array of string values. One value must match the label to be selected.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/storage_class_v1#values StorageClassV1#values}
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StorageClassV1AllowedTopologiesMatchLabelExpressions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StorageClassV1AllowedTopologiesMatchLabelExpressions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StorageClassV1AllowedTopologiesMatchLabelExpressions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StorageClassV1AllowedTopologiesMatchLabelExpressions {
        private final java.lang.String key;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
            this.values = builder.values;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StorageClassV1AllowedTopologiesMatchLabelExpressions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StorageClassV1AllowedTopologiesMatchLabelExpressions.Jsii$Proxy that = (StorageClassV1AllowedTopologiesMatchLabelExpressions.Jsii$Proxy) o;

            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            return this.values != null ? this.values.equals(that.values) : that.values == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            return result;
        }
    }
}
