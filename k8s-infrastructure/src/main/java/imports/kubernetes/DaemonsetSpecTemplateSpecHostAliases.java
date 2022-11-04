package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.336Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecHostAliases")
@software.amazon.jsii.Jsii.Proxy(DaemonsetSpecTemplateSpecHostAliases.Jsii$Proxy.class)
public interface DaemonsetSpecTemplateSpecHostAliases extends software.amazon.jsii.JsiiSerializable {

    /**
     * Hostnames for the IP address.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#hostnames Daemonset#hostnames}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getHostnames();

    /**
     * IP address of the host file entry.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#ip Daemonset#ip}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIp();

    /**
     * @return a {@link Builder} of {@link DaemonsetSpecTemplateSpecHostAliases}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonsetSpecTemplateSpecHostAliases}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonsetSpecTemplateSpecHostAliases> {
        java.util.List<java.lang.String> hostnames;
        java.lang.String ip;

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecHostAliases#getHostnames}
         * @param hostnames Hostnames for the IP address. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#hostnames Daemonset#hostnames}
         * @return {@code this}
         */
        public Builder hostnames(java.util.List<java.lang.String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecHostAliases#getIp}
         * @param ip IP address of the host file entry. This parameter is required.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#ip Daemonset#ip}
         * @return {@code this}
         */
        public Builder ip(java.lang.String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonsetSpecTemplateSpecHostAliases}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonsetSpecTemplateSpecHostAliases build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonsetSpecTemplateSpecHostAliases}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonsetSpecTemplateSpecHostAliases {
        private final java.util.List<java.lang.String> hostnames;
        private final java.lang.String ip;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostnames = software.amazon.jsii.Kernel.get(this, "hostnames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ip = software.amazon.jsii.Kernel.get(this, "ip", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostnames = java.util.Objects.requireNonNull(builder.hostnames, "hostnames is required");
            this.ip = java.util.Objects.requireNonNull(builder.ip, "ip is required");
        }

        @Override
        public final java.util.List<java.lang.String> getHostnames() {
            return this.hostnames;
        }

        @Override
        public final java.lang.String getIp() {
            return this.ip;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hostnames", om.valueToTree(this.getHostnames()));
            data.set("ip", om.valueToTree(this.getIp()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonsetSpecTemplateSpecHostAliases"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonsetSpecTemplateSpecHostAliases.Jsii$Proxy that = (DaemonsetSpecTemplateSpecHostAliases.Jsii$Proxy) o;

            if (!hostnames.equals(that.hostnames)) return false;
            return this.ip.equals(that.ip);
        }

        @Override
        public final int hashCode() {
            int result = this.hostnames.hashCode();
            result = 31 * result + (this.ip.hashCode());
            return result;
        }
    }
}
