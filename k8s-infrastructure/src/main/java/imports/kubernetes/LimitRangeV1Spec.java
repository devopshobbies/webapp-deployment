package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.180Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.LimitRangeV1Spec")
@software.amazon.jsii.Jsii.Proxy(LimitRangeV1Spec.Jsii$Proxy.class)
public interface LimitRangeV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * limit block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#limit LimitRangeV1#limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLimit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LimitRangeV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitRangeV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LimitRangeV1Spec> {
        java.lang.Object limit;

        /**
         * Sets the value of {@link LimitRangeV1Spec#getLimit}
         * @param limit limit block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#limit LimitRangeV1#limit}
         * @return {@code this}
         */
        public Builder limit(com.hashicorp.cdktf.IResolvable limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1Spec#getLimit}
         * @param limit limit block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#limit LimitRangeV1#limit}
         * @return {@code this}
         */
        public Builder limit(java.util.List<? extends imports.kubernetes.LimitRangeV1SpecLimit> limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitRangeV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LimitRangeV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LimitRangeV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitRangeV1Spec {
        private final java.lang.Object limit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limit = software.amazon.jsii.Kernel.get(this, "limit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limit = builder.limit;
        }

        @Override
        public final java.lang.Object getLimit() {
            return this.limit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLimit() != null) {
                data.set("limit", om.valueToTree(this.getLimit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.LimitRangeV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitRangeV1Spec.Jsii$Proxy that = (LimitRangeV1Spec.Jsii$Proxy) o;

            return this.limit != null ? this.limit.equals(that.limit) : that.limit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limit != null ? this.limit.hashCode() : 0;
            return result;
        }
    }
}
