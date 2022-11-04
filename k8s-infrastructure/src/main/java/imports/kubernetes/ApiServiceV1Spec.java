package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.718Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ApiServiceV1Spec")
@software.amazon.jsii.Jsii.Proxy(ApiServiceV1Spec.Jsii$Proxy.class)
public interface ApiServiceV1Spec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Group is the API group name this server hosts.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#group ApiServiceV1#group}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getGroup();

    /**
     * GroupPriorityMinimum is the priority this group should have at least.
     * <p>
     * Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object. (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#group_priority_minimum ApiServiceV1#group_priority_minimum}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getGroupPriorityMinimum();

    /**
     * Version is the API version this server hosts. For example, `v1`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#version ApiServiceV1#version}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    /**
     * VersionPriority controls the ordering of this API version inside of its group.
     * <p>
     * Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is <code>kube-like</code>, it will sort above non <code>kube-like</code> version strings, which are ordered lexicographically. <code>Kube-like</code> versions start with a <code>v</code>, then are followed by a number (the major version), then optionally the string <code>alpha</code> or <code>beta</code> and another number (the minor version). These are sorted first by GA &gt; <code>beta</code> &gt; <code>alpha</code> (where GA is a version with no suffix such as <code>beta</code> or <code>alpha</code>), and then by comparing major version, then minor version. An example sorted list of versions: <code>v10</code>, <code>v2</code>, <code>v1</code>, <code>v11beta2</code>, <code>v10beta3</code>, <code>v3beta1</code>, <code>v12alpha1</code>, <code>v11alpha2</code>, <code>foo1</code>, <code>foo10</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#version_priority ApiServiceV1#version_priority}
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getVersionPriority();

    /**
     * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
     * <p>
     * If unspecified, system trust roots on the apiserver are used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#ca_bundle ApiServiceV1#ca_bundle}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaBundle() {
        return null;
    }

    /**
     * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
     * <p>
     * This is strongly discouraged. You should use the CABundle instead.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#insecure_skip_tls_verify ApiServiceV1#insecure_skip_tls_verify}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInsecureSkipTlsVerify() {
        return null;
    }

    /**
     * service block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#service ApiServiceV1#service}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ApiServiceV1SpecService getService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiServiceV1Spec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiServiceV1Spec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiServiceV1Spec> {
        java.lang.String group;
        java.lang.Number groupPriorityMinimum;
        java.lang.String version;
        java.lang.Number versionPriority;
        java.lang.String caBundle;
        java.lang.Object insecureSkipTlsVerify;
        imports.kubernetes.ApiServiceV1SpecService service;

        /**
         * Sets the value of {@link ApiServiceV1Spec#getGroup}
         * @param group Group is the API group name this server hosts. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#group ApiServiceV1#group}
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getGroupPriorityMinimum}
         * @param groupPriorityMinimum GroupPriorityMinimum is the priority this group should have at least. This parameter is required.
         *                             Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object. (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s.
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#group_priority_minimum ApiServiceV1#group_priority_minimum}
         * @return {@code this}
         */
        public Builder groupPriorityMinimum(java.lang.Number groupPriorityMinimum) {
            this.groupPriorityMinimum = groupPriorityMinimum;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getVersion}
         * @param version Version is the API version this server hosts. For example, `v1`. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#version ApiServiceV1#version}
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getVersionPriority}
         * @param versionPriority VersionPriority controls the ordering of this API version inside of its group. This parameter is required.
         *                        Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is <code>kube-like</code>, it will sort above non <code>kube-like</code> version strings, which are ordered lexicographically. <code>Kube-like</code> versions start with a <code>v</code>, then are followed by a number (the major version), then optionally the string <code>alpha</code> or <code>beta</code> and another number (the minor version). These are sorted first by GA &gt; <code>beta</code> &gt; <code>alpha</code> (where GA is a version with no suffix such as <code>beta</code> or <code>alpha</code>), and then by comparing major version, then minor version. An example sorted list of versions: <code>v10</code>, <code>v2</code>, <code>v1</code>, <code>v11beta2</code>, <code>v10beta3</code>, <code>v3beta1</code>, <code>v12alpha1</code>, <code>v11alpha2</code>, <code>foo1</code>, <code>foo10</code>.
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#version_priority ApiServiceV1#version_priority}
         * @return {@code this}
         */
        public Builder versionPriority(java.lang.Number versionPriority) {
            this.versionPriority = versionPriority;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getCaBundle}
         * @param caBundle CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
         *                 If unspecified, system trust roots on the apiserver are used.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#ca_bundle ApiServiceV1#ca_bundle}
         * @return {@code this}
         */
        public Builder caBundle(java.lang.String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getInsecureSkipTlsVerify}
         * @param insecureSkipTlsVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
         *                              This is strongly discouraged. You should use the CABundle instead.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#insecure_skip_tls_verify ApiServiceV1#insecure_skip_tls_verify}
         * @return {@code this}
         */
        public Builder insecureSkipTlsVerify(java.lang.Boolean insecureSkipTlsVerify) {
            this.insecureSkipTlsVerify = insecureSkipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getInsecureSkipTlsVerify}
         * @param insecureSkipTlsVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
         *                              This is strongly discouraged. You should use the CABundle instead.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#insecure_skip_tls_verify ApiServiceV1#insecure_skip_tls_verify}
         * @return {@code this}
         */
        public Builder insecureSkipTlsVerify(com.hashicorp.cdktf.IResolvable insecureSkipTlsVerify) {
            this.insecureSkipTlsVerify = insecureSkipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceV1Spec#getService}
         * @param service service block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/api_service_v1#service ApiServiceV1#service}
         * @return {@code this}
         */
        public Builder service(imports.kubernetes.ApiServiceV1SpecService service) {
            this.service = service;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiServiceV1Spec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiServiceV1Spec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiServiceV1Spec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiServiceV1Spec {
        private final java.lang.String group;
        private final java.lang.Number groupPriorityMinimum;
        private final java.lang.String version;
        private final java.lang.Number versionPriority;
        private final java.lang.String caBundle;
        private final java.lang.Object insecureSkipTlsVerify;
        private final imports.kubernetes.ApiServiceV1SpecService service;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupPriorityMinimum = software.amazon.jsii.Kernel.get(this, "groupPriorityMinimum", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versionPriority = software.amazon.jsii.Kernel.get(this, "versionPriority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.caBundle = software.amazon.jsii.Kernel.get(this, "caBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.insecureSkipTlsVerify = software.amazon.jsii.Kernel.get(this, "insecureSkipTlsVerify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ApiServiceV1SpecService.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.group = java.util.Objects.requireNonNull(builder.group, "group is required");
            this.groupPriorityMinimum = java.util.Objects.requireNonNull(builder.groupPriorityMinimum, "groupPriorityMinimum is required");
            this.version = java.util.Objects.requireNonNull(builder.version, "version is required");
            this.versionPriority = java.util.Objects.requireNonNull(builder.versionPriority, "versionPriority is required");
            this.caBundle = builder.caBundle;
            this.insecureSkipTlsVerify = builder.insecureSkipTlsVerify;
            this.service = builder.service;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.Number getGroupPriorityMinimum() {
            return this.groupPriorityMinimum;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final java.lang.Number getVersionPriority() {
            return this.versionPriority;
        }

        @Override
        public final java.lang.String getCaBundle() {
            return this.caBundle;
        }

        @Override
        public final java.lang.Object getInsecureSkipTlsVerify() {
            return this.insecureSkipTlsVerify;
        }

        @Override
        public final imports.kubernetes.ApiServiceV1SpecService getService() {
            return this.service;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("group", om.valueToTree(this.getGroup()));
            data.set("groupPriorityMinimum", om.valueToTree(this.getGroupPriorityMinimum()));
            data.set("version", om.valueToTree(this.getVersion()));
            data.set("versionPriority", om.valueToTree(this.getVersionPriority()));
            if (this.getCaBundle() != null) {
                data.set("caBundle", om.valueToTree(this.getCaBundle()));
            }
            if (this.getInsecureSkipTlsVerify() != null) {
                data.set("insecureSkipTlsVerify", om.valueToTree(this.getInsecureSkipTlsVerify()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ApiServiceV1Spec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiServiceV1Spec.Jsii$Proxy that = (ApiServiceV1Spec.Jsii$Proxy) o;

            if (!group.equals(that.group)) return false;
            if (!groupPriorityMinimum.equals(that.groupPriorityMinimum)) return false;
            if (!version.equals(that.version)) return false;
            if (!versionPriority.equals(that.versionPriority)) return false;
            if (this.caBundle != null ? !this.caBundle.equals(that.caBundle) : that.caBundle != null) return false;
            if (this.insecureSkipTlsVerify != null ? !this.insecureSkipTlsVerify.equals(that.insecureSkipTlsVerify) : that.insecureSkipTlsVerify != null) return false;
            return this.service != null ? this.service.equals(that.service) : that.service == null;
        }

        @Override
        public final int hashCode() {
            int result = this.group.hashCode();
            result = 31 * result + (this.groupPriorityMinimum.hashCode());
            result = 31 * result + (this.version.hashCode());
            result = 31 * result + (this.versionPriority.hashCode());
            result = 31 * result + (this.caBundle != null ? this.caBundle.hashCode() : 0);
            result = 31 * result + (this.insecureSkipTlsVerify != null ? this.insecureSkipTlsVerify.hashCode() : 0);
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            return result;
        }
    }
}
