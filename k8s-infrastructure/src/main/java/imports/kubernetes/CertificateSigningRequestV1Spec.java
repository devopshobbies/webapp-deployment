package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.740Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CertificateSigningRequestV1Spec")
@software.amazon.jsii.Jsii.Proxy(CertificateSigningRequestV1Spec.Jsii$Proxy.class)
public interface CertificateSigningRequestV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block.
     * <p>
     * When serialized as JSON or YAML, the data is additionally base64-encoded.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#request CertificateSigningRequestV1#request}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRequest();

    /**
     * signerName indicates the requested signer, and is a qualified name.
     * <p>
     * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
     * <p>
     * Well-known Kubernetes signers are:
     * <p>
     * <ol>
     * <li>"kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
     * Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * <li>"kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
     * Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * <li>"kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
     * Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * </ol>
     * <p>
     * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
     * <p>
     * Custom signerNames can also be specified. The signer defines:
     * <p>
     * <ol>
     * <li>Trust distribution: how trust (CA bundles) are distributed.</li>
     * <li>Permitted subjects: and behavior when a disallowed subject is requested.</li>
     * <li>Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.</li>
     * <li>Required, permitted, or forbidden key usages / extended key usages.</li>
     * <li>Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.</li>
     * <li>Whether or not requests for CA certificates are allowed.</li>
     * </ol>
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#signer_name CertificateSigningRequestV1#signer_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSignerName();

    /**
     * usages specifies a set of key usages requested in the issued certificate.
     * <p>
     * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
     * <p>
     * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
     * <p>
     * Valid values are:
     * "signing", "digital signature", "content commitment",
     * "key encipherment", "key agreement", "data encipherment",
     * "cert sign", "crl sign", "encipher only", "decipher only", "any",
     * "server auth", "client auth",
     * "code signing", "email protection", "s/mime",
     * "ipsec end system", "ipsec tunnel", "ipsec user",
     * "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#usages CertificateSigningRequestV1#usages}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSigningRequestV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSigningRequestV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSigningRequestV1Spec> {
        java.lang.String request;
        java.lang.String signerName;
        java.util.List<java.lang.String> usages;

        /**
         * Sets the value of {@link CertificateSigningRequestV1Spec#getRequest}
         * @param request request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. This parameter is required.
         *                When serialized as JSON or YAML, the data is additionally base64-encoded.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#request CertificateSigningRequestV1#request}
         * @return {@code this}
         */
        public Builder request(java.lang.String request) {
            this.request = request;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestV1Spec#getSignerName}
         * @param signerName signerName indicates the requested signer, and is a qualified name. This parameter is required.
         *                   List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
         *                   <p>
         *                   Well-known Kubernetes signers are:
         *                   <p>
         *                   <ol>
         *                   <li>"kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
         *                   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   <li>"kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
         *                   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   <li>"kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
         *                   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   </ol>
         *                   <p>
         *                   More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
         *                   <p>
         *                   Custom signerNames can also be specified. The signer defines:
         *                   <p>
         *                   <ol>
         *                   <li>Trust distribution: how trust (CA bundles) are distributed.</li>
         *                   <li>Permitted subjects: and behavior when a disallowed subject is requested.</li>
         *                   <li>Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.</li>
         *                   <li>Required, permitted, or forbidden key usages / extended key usages.</li>
         *                   <li>Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.</li>
         *                   <li>Whether or not requests for CA certificates are allowed.</li>
         *                   </ol>
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#signer_name CertificateSigningRequestV1#signer_name}
         * @return {@code this}
         */
        public Builder signerName(java.lang.String signerName) {
            this.signerName = signerName;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestV1Spec#getUsages}
         * @param usages usages specifies a set of key usages requested in the issued certificate.
         *               Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
         *               <p>
         *               Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
         *               <p>
         *               Valid values are:
         *               "signing", "digital signature", "content commitment",
         *               "key encipherment", "key agreement", "data encipherment",
         *               "cert sign", "crl sign", "encipher only", "decipher only", "any",
         *               "server auth", "client auth",
         *               "code signing", "email protection", "s/mime",
         *               "ipsec end system", "ipsec tunnel", "ipsec user",
         *               "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/certificate_signing_request_v1#usages CertificateSigningRequestV1#usages}
         * @return {@code this}
         */
        public Builder usages(java.util.List<java.lang.String> usages) {
            this.usages = usages;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSigningRequestV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSigningRequestV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSigningRequestV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSigningRequestV1Spec {
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
            this.signerName = java.util.Objects.requireNonNull(builder.signerName, "signerName is required");
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
            data.set("signerName", om.valueToTree(this.getSignerName()));
            if (this.getUsages() != null) {
                data.set("usages", om.valueToTree(this.getUsages()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CertificateSigningRequestV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSigningRequestV1Spec.Jsii$Proxy that = (CertificateSigningRequestV1Spec.Jsii$Proxy) o;

            if (!request.equals(that.request)) return false;
            if (!signerName.equals(that.signerName)) return false;
            return this.usages != null ? this.usages.equals(that.usages) : that.usages == null;
        }

        @Override
        public final int hashCode() {
            int result = this.request.hashCode();
            result = 31 * result + (this.signerName.hashCode());
            result = 31 * result + (this.usages != null ? this.usages.hashCode() : 0);
            return result;
        }
    }
}
