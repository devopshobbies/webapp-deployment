package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.732Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CertificateSigningRequestSpec")
@software.amazon.jsii.Jsii.Proxy(CertificateSigningRequestSpec.Jsii$Proxy.class)
public interface CertificateSigningRequestSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Base64-encoded PKCS#10 CSR data.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#request CertificateSigningRequest#request}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRequest();

    /**
     * Requested signer for the request.
     * <p>
     * It is a qualified name in the form: <code>scope-hostname.io/name</code>.If empty, it will be defaulted: 1. If it's a kubelet client certificate, it is assigned <code>kubernetes.io/kube-apiserver-client-kubelet</code>.2. If it's a kubelet serving certificate, it is assigned <code>kubernetes.io/kubelet-serving</code>.3. Otherwise, it is assigned <code>kubernetes.io/legacy-unknown</code>. Distribution of trust for signers happens out of band.You can select on this field using <code>spec.signerName</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#signer_name CertificateSigningRequest#signer_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSignerName() {
        return null;
    }

    /**
     * allowedUsages specifies a set of usage contexts the key will be valid for.
     * <p>
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     * https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * Valid values are:
     * "signing",
     * "digital signature",
     * "content commitment",
     * "key encipherment",
     * "key agreement",
     * "data encipherment",
     * "cert sign",
     * "crl sign",
     * "encipher only",
     * "decipher only",
     * "any",
     * "server auth",
     * "client auth",
     * "code signing",
     * "email protection",
     * "s/mime",
     * "ipsec end system",
     * "ipsec tunnel",
     * "ipsec user",
     * "timestamping",
     * "ocsp signing",
     * "microsoft sgc",
     * "netscape sgc"
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#usages CertificateSigningRequest#usages}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSigningRequestSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSigningRequestSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSigningRequestSpec> {
        java.lang.String request;
        java.lang.String signerName;
        java.util.List<java.lang.String> usages;

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getRequest}
         * @param request Base64-encoded PKCS#10 CSR data. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#request CertificateSigningRequest#request}
         * @return {@code this}
         */
        public Builder request(java.lang.String request) {
            this.request = request;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getSignerName}
         * @param signerName Requested signer for the request.
         *                   It is a qualified name in the form: <code>scope-hostname.io/name</code>.If empty, it will be defaulted: 1. If it's a kubelet client certificate, it is assigned <code>kubernetes.io/kube-apiserver-client-kubelet</code>.2. If it's a kubelet serving certificate, it is assigned <code>kubernetes.io/kubelet-serving</code>.3. Otherwise, it is assigned <code>kubernetes.io/legacy-unknown</code>. Distribution of trust for signers happens out of band.You can select on this field using <code>spec.signerName</code>.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#signer_name CertificateSigningRequest#signer_name}
         * @return {@code this}
         */
        public Builder signerName(java.lang.String signerName) {
            this.signerName = signerName;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUsages}
         * @param usages allowedUsages specifies a set of usage contexts the key will be valid for.
         *               See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
         *               https://tools.ietf.org/html/rfc5280#section-4.2.1.12
         *               Valid values are:
         *               "signing",
         *               "digital signature",
         *               "content commitment",
         *               "key encipherment",
         *               "key agreement",
         *               "data encipherment",
         *               "cert sign",
         *               "crl sign",
         *               "encipher only",
         *               "decipher only",
         *               "any",
         *               "server auth",
         *               "client auth",
         *               "code signing",
         *               "email protection",
         *               "s/mime",
         *               "ipsec end system",
         *               "ipsec tunnel",
         *               "ipsec user",
         *               "timestamping",
         *               "ocsp signing",
         *               "microsoft sgc",
         *               "netscape sgc"
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request#usages CertificateSigningRequest#usages}
         * @return {@code this}
         */
        public Builder usages(java.util.List<java.lang.String> usages) {
            this.usages = usages;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSigningRequestSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSigningRequestSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSigningRequestSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSigningRequestSpec {
        private final java.lang.String request;
        private final java.lang.String signerName;
        private final java.util.List<java.lang.String> usages;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.request = software.amazon.jsii.Kernel.get(this, "request", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signerName = software.amazon.jsii.Kernel.get(this, "signerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.usages = software.amazon.jsii.Kernel.get(this, "usages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.request = java.util.Objects.requireNonNull(builder.request, "request is required");
            this.signerName = builder.signerName;
            this.usages = builder.usages;
        }

        @Override
        public final java.lang.String getRequest() {
            return this.request;
        }

        @Override
        public final java.lang.String getSignerName() {
            return this.signerName;
        }

        @Override
        public final java.util.List<java.lang.String> getUsages() {
            return this.usages;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("request", om.valueToTree(this.getRequest()));
            if (this.getSignerName() != null) {
                data.set("signerName", om.valueToTree(this.getSignerName()));
            }
            if (this.getUsages() != null) {
                data.set("usages", om.valueToTree(this.getUsages()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CertificateSigningRequestSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSigningRequestSpec.Jsii$Proxy that = (CertificateSigningRequestSpec.Jsii$Proxy) o;

            if (!request.equals(that.request)) return false;
            if (this.signerName != null ? !this.signerName.equals(that.signerName) : that.signerName != null) return false;
            return this.usages != null ? this.usages.equals(that.usages) : that.usages == null;
        }

        @Override
        public final int hashCode() {
            int result = this.request.hashCode();
            result = 31 * result + (this.signerName != null ? this.signerName.hashCode() : 0);
            result = 31 * result + (this.usages != null ? this.usages.hashCode() : 0);
            return result;
        }
    }
}
