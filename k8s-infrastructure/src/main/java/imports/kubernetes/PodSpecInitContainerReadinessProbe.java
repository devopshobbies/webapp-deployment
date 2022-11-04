package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.361Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecInitContainerReadinessProbe")
@software.amazon.jsii.Jsii.Proxy(PodSpecInitContainerReadinessProbe.Jsii$Proxy.class)
public interface PodSpecInitContainerReadinessProbe extends software.amazon.jsii.JsiiSerializable {

    /**
     * exec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#exec Pod#exec}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecInitContainerReadinessProbeExec getExec() {
        return null;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#failure_threshold Pod#failure_threshold}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailureThreshold() {
        return null;
    }

    /**
     * http_get block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#http_get Pod#http_get}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet getHttpGet() {
        return null;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#initial_delay_seconds Pod#initial_delay_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialDelaySeconds() {
        return null;
    }

    /**
     * How often (in seconds) to perform the probe.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#period_seconds Pod#period_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPeriodSeconds() {
        return null;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#success_threshold Pod#success_threshold}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuccessThreshold() {
        return null;
    }

    /**
     * tcp_socket block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#tcp_socket Pod#tcp_socket}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTcpSocket() {
        return null;
    }

    /**
     * Number of seconds after which the probe times out. More info: http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#timeout_seconds Pod#timeout_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecInitContainerReadinessProbe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecInitContainerReadinessProbe}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecInitContainerReadinessProbe> {
        imports.kubernetes.PodSpecInitContainerReadinessProbeExec exec;
        java.lang.Number failureThreshold;
        imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet httpGet;
        java.lang.Number initialDelaySeconds;
        java.lang.Number periodSeconds;
        java.lang.Number successThreshold;
        java.lang.Object tcpSocket;
        java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getExec}
         * @param exec exec block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#exec Pod#exec}
         * @return {@code this}
         */
        public Builder exec(imports.kubernetes.PodSpecInitContainerReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getFailureThreshold}
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#failure_threshold Pod#failure_threshold}
         * @return {@code this}
         */
        public Builder failureThreshold(java.lang.Number failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getHttpGet}
         * @param httpGet http_get block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#http_get Pod#http_get}
         * @return {@code this}
         */
        public Builder httpGet(imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getInitialDelaySeconds}
         * @param initialDelaySeconds Number of seconds after the container has started before liveness probes are initiated. More info: http://kubernetes.io/docs/user-guide/pod-states#container-probes.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#initial_delay_seconds Pod#initial_delay_seconds}
         * @return {@code this}
         */
        public Builder initialDelaySeconds(java.lang.Number initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getPeriodSeconds}
         * @param periodSeconds How often (in seconds) to perform the probe.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#period_seconds Pod#period_seconds}
         * @return {@code this}
         */
        public Builder periodSeconds(java.lang.Number periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getSuccessThreshold}
         * @param successThreshold Minimum consecutive successes for the probe to be considered successful after having failed.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#success_threshold Pod#success_threshold}
         * @return {@code this}
         */
        public Builder successThreshold(java.lang.Number successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getTcpSocket}
         * @param tcpSocket tcp_socket block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#tcp_socket Pod#tcp_socket}
         * @return {@code this}
         */
        public Builder tcpSocket(com.hashicorp.cdktf.IResolvable tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getTcpSocket}
         * @param tcpSocket tcp_socket block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#tcp_socket Pod#tcp_socket}
         * @return {@code this}
         */
        public Builder tcpSocket(java.util.List<? extends imports.kubernetes.PodSpecInitContainerReadinessProbeTcpSocket> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecInitContainerReadinessProbe#getTimeoutSeconds}
         * @param timeoutSeconds Number of seconds after which the probe times out. More info: http://kubernetes.io/docs/user-guide/pod-states#container-probes.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#timeout_seconds Pod#timeout_seconds}
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecInitContainerReadinessProbe}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecInitContainerReadinessProbe build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecInitContainerReadinessProbe}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecInitContainerReadinessProbe {
        private final imports.kubernetes.PodSpecInitContainerReadinessProbeExec exec;
        private final java.lang.Number failureThreshold;
        private final imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet httpGet;
        private final java.lang.Number initialDelaySeconds;
        private final java.lang.Number periodSeconds;
        private final java.lang.Number successThreshold;
        private final java.lang.Object tcpSocket;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecInitContainerReadinessProbeExec.class));
            this.failureThreshold = software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.httpGet = software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet.class));
            this.initialDelaySeconds = software.amazon.jsii.Kernel.get(this, "initialDelaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.periodSeconds = software.amazon.jsii.Kernel.get(this, "periodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.successThreshold = software.amazon.jsii.Kernel.get(this, "successThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tcpSocket = software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        @Override
        public final imports.kubernetes.PodSpecInitContainerReadinessProbeExec getExec() {
            return this.exec;
        }

        @Override
        public final java.lang.Number getFailureThreshold() {
            return this.failureThreshold;
        }

        @Override
        public final imports.kubernetes.PodSpecInitContainerReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        @Override
        public final java.lang.Number getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        @Override
        public final java.lang.Number getPeriodSeconds() {
            return this.periodSeconds;
        }

        @Override
        public final java.lang.Number getSuccessThreshold() {
            return this.successThreshold;
        }

        @Override
        public final java.lang.Object getTcpSocket() {
            return this.tcpSocket;
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

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getFailureThreshold() != null) {
                data.set("failureThreshold", om.valueToTree(this.getFailureThreshold()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getInitialDelaySeconds() != null) {
                data.set("initialDelaySeconds", om.valueToTree(this.getInitialDelaySeconds()));
            }
            if (this.getPeriodSeconds() != null) {
                data.set("periodSeconds", om.valueToTree(this.getPeriodSeconds()));
            }
            if (this.getSuccessThreshold() != null) {
                data.set("successThreshold", om.valueToTree(this.getSuccessThreshold()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecInitContainerReadinessProbe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecInitContainerReadinessProbe.Jsii$Proxy that = (PodSpecInitContainerReadinessProbe.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.failureThreshold != null ? !this.failureThreshold.equals(that.failureThreshold) : that.failureThreshold != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            if (this.initialDelaySeconds != null ? !this.initialDelaySeconds.equals(that.initialDelaySeconds) : that.initialDelaySeconds != null) return false;
            if (this.periodSeconds != null ? !this.periodSeconds.equals(that.periodSeconds) : that.periodSeconds != null) return false;
            if (this.successThreshold != null ? !this.successThreshold.equals(that.successThreshold) : that.successThreshold != null) return false;
            if (this.tcpSocket != null ? !this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.failureThreshold != null ? this.failureThreshold.hashCode() : 0);
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.initialDelaySeconds != null ? this.initialDelaySeconds.hashCode() : 0);
            result = 31 * result + (this.periodSeconds != null ? this.periodSeconds.hashCode() : 0);
            result = 31 * result + (this.successThreshold != null ? this.successThreshold.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
