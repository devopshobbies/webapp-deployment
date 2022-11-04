package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.180Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.LimitRangeV1SpecLimit")
@software.amazon.jsii.Jsii.Proxy(LimitRangeV1SpecLimit.Jsii$Proxy.class)
public interface LimitRangeV1SpecLimit extends software.amazon.jsii.JsiiSerializable {

    /**
     * Default resource requirement limit value by resource name if resource limit is omitted.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#default LimitRangeV1#default}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDefaultValue() {
        return null;
    }

    /**
     * The default resource requirement request value by resource name if resource request is omitted.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#default_request LimitRangeV1#default_request}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDefaultRequest() {
        return null;
    }

    /**
     * Max usage constraints on this kind by resource name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#max LimitRangeV1#max}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMax() {
        return null;
    }

    /**
     * The named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value;
     * <p>
     * this represents the max burst for the named resource.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#max_limit_request_ratio LimitRangeV1#max_limit_request_ratio}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMaxLimitRequestRatio() {
        return null;
    }

    /**
     * Min usage constraints on this kind by resource name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#min LimitRangeV1#min}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMin() {
        return null;
    }

    /**
     * Type of resource that this limit applies to.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#type LimitRangeV1#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LimitRangeV1SpecLimit}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitRangeV1SpecLimit}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LimitRangeV1SpecLimit> {
        java.util.Map<java.lang.String, java.lang.String> defaultValue;
        java.util.Map<java.lang.String, java.lang.String> defaultRequest;
        java.util.Map<java.lang.String, java.lang.String> max;
        java.util.Map<java.lang.String, java.lang.String> maxLimitRequestRatio;
        java.util.Map<java.lang.String, java.lang.String> min;
        java.lang.String type;

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getDefaultValue}
         * @param defaultValue Default resource requirement limit value by resource name if resource limit is omitted.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#default LimitRangeV1#default}
         * @return {@code this}
         */
        public Builder defaultValue(java.util.Map<java.lang.String, java.lang.String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getDefaultRequest}
         * @param defaultRequest The default resource requirement request value by resource name if resource request is omitted.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#default_request LimitRangeV1#default_request}
         * @return {@code this}
         */
        public Builder defaultRequest(java.util.Map<java.lang.String, java.lang.String> defaultRequest) {
            this.defaultRequest = defaultRequest;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getMax}
         * @param max Max usage constraints on this kind by resource name.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#max LimitRangeV1#max}
         * @return {@code this}
         */
        public Builder max(java.util.Map<java.lang.String, java.lang.String> max) {
            this.max = max;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getMaxLimitRequestRatio}
         * @param maxLimitRequestRatio The named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value;.
         *                             this represents the max burst for the named resource.
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#max_limit_request_ratio LimitRangeV1#max_limit_request_ratio}
         * @return {@code this}
         */
        public Builder maxLimitRequestRatio(java.util.Map<java.lang.String, java.lang.String> maxLimitRequestRatio) {
            this.maxLimitRequestRatio = maxLimitRequestRatio;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getMin}
         * @param min Min usage constraints on this kind by resource name.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#min LimitRangeV1#min}
         * @return {@code this}
         */
        public Builder min(java.util.Map<java.lang.String, java.lang.String> min) {
            this.min = min;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeV1SpecLimit#getType}
         * @param type Type of resource that this limit applies to.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/limit_range_v1#type LimitRangeV1#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitRangeV1SpecLimit}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LimitRangeV1SpecLimit build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LimitRangeV1SpecLimit}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitRangeV1SpecLimit {
        private final java.util.Map<java.lang.String, java.lang.String> defaultValue;
        private final java.util.Map<java.lang.String, java.lang.String> defaultRequest;
        private final java.util.Map<java.lang.String, java.lang.String> max;
        private final java.util.Map<java.lang.String, java.lang.String> maxLimitRequestRatio;
        private final java.util.Map<java.lang.String, java.lang.String> min;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "default", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultRequest = software.amazon.jsii.Kernel.get(this, "defaultRequest", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.max = software.amazon.jsii.Kernel.get(this, "max", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maxLimitRequestRatio = software.amazon.jsii.Kernel.get(this, "maxLimitRequestRatio", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.min = software.amazon.jsii.Kernel.get(this, "min", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultValue = builder.defaultValue;
            this.defaultRequest = builder.defaultRequest;
            this.max = builder.max;
            this.maxLimitRequestRatio = builder.maxLimitRequestRatio;
            this.min = builder.min;
            this.type = builder.type;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDefaultRequest() {
            return this.defaultRequest;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMax() {
            return this.max;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMaxLimitRequestRatio() {
            return this.maxLimitRequestRatio;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMin() {
            return this.min;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultValue() != null) {
                data.set("default", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getDefaultRequest() != null) {
                data.set("defaultRequest", om.valueToTree(this.getDefaultRequest()));
            }
            if (this.getMax() != null) {
                data.set("max", om.valueToTree(this.getMax()));
            }
            if (this.getMaxLimitRequestRatio() != null) {
                data.set("maxLimitRequestRatio", om.valueToTree(this.getMaxLimitRequestRatio()));
            }
            if (this.getMin() != null) {
                data.set("min", om.valueToTree(this.getMin()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.LimitRangeV1SpecLimit"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitRangeV1SpecLimit.Jsii$Proxy that = (LimitRangeV1SpecLimit.Jsii$Proxy) o;

            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.defaultRequest != null ? !this.defaultRequest.equals(that.defaultRequest) : that.defaultRequest != null) return false;
            if (this.max != null ? !this.max.equals(that.max) : that.max != null) return false;
            if (this.maxLimitRequestRatio != null ? !this.maxLimitRequestRatio.equals(that.maxLimitRequestRatio) : that.maxLimitRequestRatio != null) return false;
            if (this.min != null ? !this.min.equals(that.min) : that.min != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultValue != null ? this.defaultValue.hashCode() : 0;
            result = 31 * result + (this.defaultRequest != null ? this.defaultRequest.hashCode() : 0);
            result = 31 * result + (this.max != null ? this.max.hashCode() : 0);
            result = 31 * result + (this.maxLimitRequestRatio != null ? this.maxLimitRequestRatio.hashCode() : 0);
            result = 31 * result + (this.min != null ? this.min.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
