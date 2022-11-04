package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.292Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicySpecFsGroupRange")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicySpecFsGroupRange.Jsii$Proxy.class)
public interface PodSecurityPolicySpecFsGroupRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * max is the end of the range, inclusive.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#max PodSecurityPolicy#max}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMax();

    /**
     * min is the start of the range, inclusive.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#min PodSecurityPolicy#min}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMin();

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicySpecFsGroupRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicySpecFsGroupRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicySpecFsGroupRange> {
        java.lang.Number max;
        java.lang.Number min;

        /**
         * Sets the value of {@link PodSecurityPolicySpecFsGroupRange#getMax}
         * @param max max is the end of the range, inclusive. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#max PodSecurityPolicy#max}
         * @return {@code this}
         */
        public Builder max(java.lang.Number max) {
            this.max = max;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpecFsGroupRange#getMin}
         * @param min min is the start of the range, inclusive. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy#min PodSecurityPolicy#min}
         * @return {@code this}
         */
        public Builder min(java.lang.Number min) {
            this.min = min;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicySpecFsGroupRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicySpecFsGroupRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicySpecFsGroupRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicySpecFsGroupRange {
        private final java.lang.Number max;
        private final java.lang.Number min;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.max = software.amazon.jsii.Kernel.get(this, "max", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.min = software.amazon.jsii.Kernel.get(this, "min", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.max = java.util.Objects.requireNonNull(builder.max, "max is required");
            this.min = java.util.Objects.requireNonNull(builder.min, "min is required");
        }

        @Override
        public final java.lang.Number getMax() {
            return this.max;
        }

        @Override
        public final java.lang.Number getMin() {
            return this.min;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("max", om.valueToTree(this.getMax()));
            data.set("min", om.valueToTree(this.getMin()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicySpecFsGroupRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicySpecFsGroupRange.Jsii$Proxy that = (PodSecurityPolicySpecFsGroupRange.Jsii$Proxy) o;

            if (!max.equals(that.max)) return false;
            return this.min.equals(that.min);
        }

        @Override
        public final int hashCode() {
            int result = this.max.hashCode();
            result = 31 * result + (this.min.hashCode());
            return result;
        }
    }
}
