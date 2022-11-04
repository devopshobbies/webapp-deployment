package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceV1SpecSessionAffinityConfigClientIp")
@software.amazon.jsii.Jsii.Proxy(ServiceV1SpecSessionAffinityConfigClientIp.Jsii$Proxy.class)
public interface ServiceV1SpecSessionAffinityConfigClientIp extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the seconds of `ClientIP` type session sticky time.
     * <p>
     * The value must be &gt; 0 and &lt;= 86400(for 1 day) if <code>ServiceAffinity</code> == <code>ClientIP</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service_v1#timeout_seconds ServiceV1#timeout_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceV1SpecSessionAffinityConfigClientIp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceV1SpecSessionAffinityConfigClientIp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceV1SpecSessionAffinityConfigClientIp> {
        java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link ServiceV1SpecSessionAffinityConfigClientIp#getTimeoutSeconds}
         * @param timeoutSeconds Specifies the seconds of `ClientIP` type session sticky time.
         *                       The value must be &gt; 0 and &lt;= 86400(for 1 day) if <code>ServiceAffinity</code> == <code>ClientIP</code>.
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service_v1#timeout_seconds ServiceV1#timeout_seconds}
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceV1SpecSessionAffinityConfigClientIp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceV1SpecSessionAffinityConfigClientIp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceV1SpecSessionAffinityConfigClientIp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceV1SpecSessionAffinityConfigClientIp {
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        @Override
        public final java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ServiceV1SpecSessionAffinityConfigClientIp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceV1SpecSessionAffinityConfigClientIp.Jsii$Proxy that = (ServiceV1SpecSessionAffinityConfigClientIp.Jsii$Proxy) o;

            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0;
            return result;
        }
    }
}
