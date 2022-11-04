package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.208Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecDnsConfig")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecDnsConfig.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecDnsConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of DNS name server IP addresses.
     * <p>
     * This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#nameservers DaemonSetV1#nameservers}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNameservers() {
        return null;
    }

    /**
     * option block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#option DaemonSetV1#option}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOption() {
        return null;
    }

    /**
     * A list of DNS search domains for host-name lookup.
     * <p>
     * This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#searches DaemonSetV1#searches}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSearches() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecDnsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecDnsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecDnsConfig> {
        java.util.List<java.lang.String> nameservers;
        java.lang.Object option;
        java.util.List<java.lang.String> searches;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfig#getNameservers}
         * @param nameservers A list of DNS name server IP addresses.
         *                    This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#nameservers DaemonSetV1#nameservers}
         * @return {@code this}
         */
        public Builder nameservers(java.util.List<java.lang.String> nameservers) {
            this.nameservers = nameservers;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfig#getOption}
         * @param option option block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#option DaemonSetV1#option}
         * @return {@code this}
         */
        public Builder option(com.hashicorp.cdktf.IResolvable option) {
            this.option = option;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfig#getOption}
         * @param option option block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#option DaemonSetV1#option}
         * @return {@code this}
         */
        public Builder option(java.util.List<? extends imports.kubernetes.DaemonSetV1SpecTemplateSpecDnsConfigOption> option) {
            this.option = option;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfig#getSearches}
         * @param searches A list of DNS search domains for host-name lookup.
         *                 This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#searches DaemonSetV1#searches}
         * @return {@code this}
         */
        public Builder searches(java.util.List<java.lang.String> searches) {
            this.searches = searches;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecDnsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecDnsConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecDnsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecDnsConfig {
        private final java.util.List<java.lang.String> nameservers;
        private final java.lang.Object option;
        private final java.util.List<java.lang.String> searches;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nameservers = software.amazon.jsii.Kernel.get(this, "nameservers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.option = software.amazon.jsii.Kernel.get(this, "option", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.searches = software.amazon.jsii.Kernel.get(this, "searches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nameservers = builder.nameservers;
            this.option = builder.option;
            this.searches = builder.searches;
        }

        @Override
        public final java.util.List<java.lang.String> getNameservers() {
            return this.nameservers;
        }

        @Override
        public final java.lang.Object getOption() {
            return this.option;
        }

        @Override
        public final java.util.List<java.lang.String> getSearches() {
            return this.searches;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNameservers() != null) {
                data.set("nameservers", om.valueToTree(this.getNameservers()));
            }
            if (this.getOption() != null) {
                data.set("option", om.valueToTree(this.getOption()));
            }
            if (this.getSearches() != null) {
                data.set("searches", om.valueToTree(this.getSearches()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecDnsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecDnsConfig.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecDnsConfig.Jsii$Proxy) o;

            if (this.nameservers != null ? !this.nameservers.equals(that.nameservers) : that.nameservers != null) return false;
            if (this.option != null ? !this.option.equals(that.option) : that.option != null) return false;
            return this.searches != null ? this.searches.equals(that.searches) : that.searches == null;
        }

        @Override
        public final int hashCode() {
            int result = this.nameservers != null ? this.nameservers.hashCode() : 0;
            result = 31 * result + (this.option != null ? this.option.hashCode() : 0);
            result = 31 * result + (this.searches != null ? this.searches.hashCode() : 0);
            return result;
        }
    }
}
