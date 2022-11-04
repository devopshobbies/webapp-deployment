package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressSpecRule")
@software.amazon.jsii.Jsii.Proxy(IngressSpecRule.Jsii$Proxy.class)
public interface IngressSpecRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * http block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#http Ingress#http}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.IngressSpecRuleHttp getHttp();

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986.
     * <p>
     * Note the following deviations from the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
     * the IP in the Spec of the parent Ingress.
     * 2. The <code>:</code> delimiter is not respected because ports are not allowed.
     * Currently the port of an Ingress is implicitly :80 for http and
     * :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * <p>
     * Host can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. "<em>.foo.com"). The wildcard character '</em>' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "*"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#host Ingress#host}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressSpecRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressSpecRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressSpecRule> {
        imports.kubernetes.IngressSpecRuleHttp http;
        java.lang.String host;

        /**
         * Sets the value of {@link IngressSpecRule#getHttp}
         * @param http http block. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#http Ingress#http}
         * @return {@code this}
         */
        public Builder http(imports.kubernetes.IngressSpecRuleHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpecRule#getHost}
         * @param host Host is the fully qualified domain name of a network host, as defined by RFC 3986.
         *             Note the following deviations from the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
         *             the IP in the Spec of the parent Ingress.
         *             2. The <code>:</code> delimiter is not respected because ports are not allowed.
         *             Currently the port of an Ingress is implicitly :80 for http and
         *             :443 for https.
         *             Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
         *             <p>
         *             Host can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. "<em>.foo.com"). The wildcard character '</em>' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "*"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress#host Ingress#host}
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressSpecRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressSpecRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressSpecRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressSpecRule {
        private final imports.kubernetes.IngressSpecRuleHttp http;
        private final java.lang.String host;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecRuleHttp.class));
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.http = java.util.Objects.requireNonNull(builder.http, "http is required");
            this.host = builder.host;
        }

        @Override
        public final imports.kubernetes.IngressSpecRuleHttp getHttp() {
            return this.http;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("http", om.valueToTree(this.getHttp()));
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressSpecRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressSpecRule.Jsii$Proxy that = (IngressSpecRule.Jsii$Proxy) o;

            if (!http.equals(that.http)) return false;
            return this.host != null ? this.host.equals(that.host) : that.host == null;
        }

        @Override
        public final int hashCode() {
            int result = this.http.hashCode();
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            return result;
        }
    }
}
