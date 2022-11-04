package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.926Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecRule")
@software.amazon.jsii.Jsii.Proxy(IngressV1SpecRule.Jsii$Proxy.class)
public interface IngressV1SpecRule extends software.amazon.jsii.JsiiSerializable {

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
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#host IngressV1#host}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * http block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#http IngressV1#http}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecRuleHttp getHttp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressV1SpecRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressV1SpecRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressV1SpecRule> {
        java.lang.String host;
        imports.kubernetes.IngressV1SpecRuleHttp http;

        /**
         * Sets the value of {@link IngressV1SpecRule#getHost}
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
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#host IngressV1#host}
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link IngressV1SpecRule#getHttp}
         * @param http http block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/ingress_v1#http IngressV1#http}
         * @return {@code this}
         */
        public Builder http(imports.kubernetes.IngressV1SpecRuleHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressV1SpecRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressV1SpecRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressV1SpecRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressV1SpecRule {
        private final java.lang.String host;
        private final imports.kubernetes.IngressV1SpecRuleHttp http;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecRuleHttp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.host = builder.host;
            this.http = builder.http;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        public final imports.kubernetes.IngressV1SpecRuleHttp getHttp() {
            return this.http;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getHttp() != null) {
                data.set("http", om.valueToTree(this.getHttp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.IngressV1SpecRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressV1SpecRule.Jsii$Proxy that = (IngressV1SpecRule.Jsii$Proxy) o;

            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            return this.http != null ? this.http.equals(that.http) : that.http == null;
        }

        @Override
        public final int hashCode() {
            int result = this.host != null ? this.host.hashCode() : 0;
            result = 31 * result + (this.http != null ? this.http.hashCode() : 0);
            return result;
        }
    }
}
