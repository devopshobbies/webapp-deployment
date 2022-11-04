package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.312Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStop")
@software.amazon.jsii.Jsii.Proxy(DaemonsetSpecTemplateSpecContainerLifecyclePreStop.Jsii$Proxy.class)
public interface DaemonsetSpecTemplateSpecContainerLifecyclePreStop extends software.amazon.jsii.JsiiSerializable {

    /**
     * exec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#exec Daemonset#exec}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec getExec() {
        return null;
    }

    /**
     * http_get block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#http_get Daemonset#http_get}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet getHttpGet() {
        return null;
    }

    /**
     * tcp_socket block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#tcp_socket Daemonset#tcp_socket}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTcpSocket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonsetSpecTemplateSpecContainerLifecyclePreStop> {
        imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec exec;
        imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet httpGet;
        java.lang.Object tcpSocket;

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop#getExec}
         * @param exec exec block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#exec Daemonset#exec}
         * @return {@code this}
         */
        public Builder exec(imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop#getHttpGet}
         * @param httpGet http_get block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#http_get Daemonset#http_get}
         * @return {@code this}
         */
        public Builder httpGet(imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop#getTcpSocket}
         * @param tcpSocket tcp_socket block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#tcp_socket Daemonset#tcp_socket}
         * @return {@code this}
         */
        public Builder tcpSocket(com.hashicorp.cdktf.IResolvable tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop#getTcpSocket}
         * @param tcpSocket tcp_socket block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#tcp_socket Daemonset#tcp_socket}
         * @return {@code this}
         */
        public Builder tcpSocket(java.util.List<? extends imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopTcpSocket> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonsetSpecTemplateSpecContainerLifecyclePreStop build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonsetSpecTemplateSpecContainerLifecyclePreStop}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonsetSpecTemplateSpecContainerLifecyclePreStop {
        private final imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec exec;
        private final imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet httpGet;
        private final java.lang.Object tcpSocket;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec.class));
            this.httpGet = software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet.class));
            this.tcpSocket = software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = builder.exec;
            this.httpGet = builder.httpGet;
            this.tcpSocket = builder.tcpSocket;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopExec getExec() {
            return this.exec;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStopHttpGet getHttpGet() {
            return this.httpGet;
        }

        @Override
        public final java.lang.Object getTcpSocket() {
            return this.tcpSocket;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonsetSpecTemplateSpecContainerLifecyclePreStop"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonsetSpecTemplateSpecContainerLifecyclePreStop.Jsii$Proxy that = (DaemonsetSpecTemplateSpecContainerLifecyclePreStop.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            return this.tcpSocket != null ? this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket == null;
        }

        @Override
        public final int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            return result;
        }
    }
}
