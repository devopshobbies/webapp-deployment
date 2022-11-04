package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.825Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateSpec")
@software.amazon.jsii.Jsii.Proxy(CronJobSpecJobTemplateSpecTemplateSpec.Jsii$Proxy.class)
public interface CronJobSpecJobTemplateSpecTemplateSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
     * <p>
     * Value must be a positive integer.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#active_deadline_seconds CronJob#active_deadline_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSeconds() {
        return null;
    }

    /**
     * affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#affinity CronJob#affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity getAffinity() {
        return null;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#automount_service_account_token CronJob#automount_service_account_token}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutomountServiceAccountToken() {
        return null;
    }

    /**
     * container block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#container CronJob#container}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getContainer() {
        return null;
    }

    /**
     * dns_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#dns_config CronJob#dns_config}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig getDnsConfig() {
        return null;
    }

    /**
     * Set DNS policy for containers within the pod.
     * <p>
     * Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. Optional: Defaults to 'ClusterFirst', see <a href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Kubernetes reference</a>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#dns_policy CronJob#dns_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDnsPolicy() {
        return null;
    }

    /**
     * Enables generating environment variables for service discovery. Defaults to true.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#enable_service_links CronJob#enable_service_links}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableServiceLinks() {
        return null;
    }

    /**
     * host_aliases block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_aliases CronJob#host_aliases}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHostAliases() {
        return null;
    }

    /**
     * Use the host's ipc namespace. Optional: Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_ipc CronJob#host_ipc}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHostIpc() {
        return null;
    }

    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#hostname CronJob#hostname}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * Host networking requested for this pod.
     * <p>
     * Use the host's network namespace. If this option is set, the ports that will be used must be specified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_network CronJob#host_network}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHostNetwork() {
        return null;
    }

    /**
     * Use the host's pid namespace.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_pid CronJob#host_pid}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHostPid() {
        return null;
    }

    /**
     * image_pull_secrets block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#image_pull_secrets CronJob#image_pull_secrets}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getImagePullSecrets() {
        return null;
    }

    /**
     * init_container block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#init_container CronJob#init_container}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInitContainer() {
        return null;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node.
     * <p>
     * If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#node_name CronJob#node_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * <p>
     * Selector which must match a node's labels for the pod to be scheduled on that node. More info: http://kubernetes.io/docs/user-guide/node-selection.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#node_selector CronJob#node_selector}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
        return null;
    }

    /**
     * If specified, indicates the pod's priority.
     * <p>
     * "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#priority_class_name CronJob#priority_class_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPriorityClassName() {
        return null;
    }

    /**
     * readiness_gate block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#readiness_gate CronJob#readiness_gate}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadinessGate() {
        return null;
    }

    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. More info: http://kubernetes.io/docs/user-guide/pod-states#restartpolicy.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#restart_policy CronJob#restart_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRestartPolicy() {
        return null;
    }

    /**
     * security_context block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#security_context CronJob#security_context}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext getSecurityContext() {
        return null;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: http://releases.k8s.io/HEAD/docs/design/service_accounts.md.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#service_account_name CronJob#service_account_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountName() {
        return null;
    }

    /**
     * Share a single process namespace between all of the containers in a pod.
     * <p>
     * When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#share_process_namespace CronJob#share_process_namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getShareProcessNamespace() {
        return null;
    }

    /**
     * If specified, the fully qualified Pod hostname will be "...svc.". If not specified, the pod will not have a domainname at all..
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#subdomain CronJob#subdomain}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubdomain() {
        return null;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully.
     * <p>
     * May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#termination_grace_period_seconds CronJob#termination_grace_period_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTerminationGracePeriodSeconds() {
        return null;
    }

    /**
     * toleration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#toleration CronJob#toleration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getToleration() {
        return null;
    }

    /**
     * topology_spread_constraint block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#topology_spread_constraint CronJob#topology_spread_constraint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTopologySpreadConstraint() {
        return null;
    }

    /**
     * volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#volume CronJob#volume}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobSpecJobTemplateSpecTemplateSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobSpecJobTemplateSpecTemplateSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobSpecJobTemplateSpecTemplateSpec> {
        java.lang.Number activeDeadlineSeconds;
        imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity;
        java.lang.Object automountServiceAccountToken;
        java.lang.Object container;
        imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig dnsConfig;
        java.lang.String dnsPolicy;
        java.lang.Object enableServiceLinks;
        java.lang.Object hostAliases;
        java.lang.Object hostIpc;
        java.lang.String hostname;
        java.lang.Object hostNetwork;
        java.lang.Object hostPid;
        java.lang.Object imagePullSecrets;
        java.lang.Object initContainer;
        java.lang.String nodeName;
        java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        java.lang.String priorityClassName;
        java.lang.Object readinessGate;
        java.lang.String restartPolicy;
        imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext;
        java.lang.String serviceAccountName;
        java.lang.Object shareProcessNamespace;
        java.lang.String subdomain;
        java.lang.Number terminationGracePeriodSeconds;
        java.lang.Object toleration;
        java.lang.Object topologySpreadConstraint;
        java.lang.Object volume;

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getActiveDeadlineSeconds}
         * @param activeDeadlineSeconds Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
         *                              Value must be a positive integer.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#active_deadline_seconds CronJob#active_deadline_seconds}
         * @return {@code this}
         */
        public Builder activeDeadlineSeconds(java.lang.Number activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getAffinity}
         * @param affinity affinity block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#affinity CronJob#affinity}
         * @return {@code this}
         */
        public Builder affinity(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getAutomountServiceAccountToken}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
         *                                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#automount_service_account_token CronJob#automount_service_account_token}
         * @return {@code this}
         */
        public Builder automountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getAutomountServiceAccountToken}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
         *                                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#automount_service_account_token CronJob#automount_service_account_token}
         * @return {@code this}
         */
        public Builder automountServiceAccountToken(com.hashicorp.cdktf.IResolvable automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getContainer}
         * @param container container block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#container CronJob#container}
         * @return {@code this}
         */
        public Builder container(com.hashicorp.cdktf.IResolvable container) {
            this.container = container;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getContainer}
         * @param container container block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#container CronJob#container}
         * @return {@code this}
         */
        public Builder container(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecContainer> container) {
            this.container = container;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getDnsConfig}
         * @param dnsConfig dns_config block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#dns_config CronJob#dns_config}
         * @return {@code this}
         */
        public Builder dnsConfig(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getDnsPolicy}
         * @param dnsPolicy Set DNS policy for containers within the pod.
         *                  Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. Optional: Defaults to 'ClusterFirst', see <a href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Kubernetes reference</a>.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#dns_policy CronJob#dns_policy}
         * @return {@code this}
         */
        public Builder dnsPolicy(java.lang.String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getEnableServiceLinks}
         * @param enableServiceLinks Enables generating environment variables for service discovery. Defaults to true.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#enable_service_links CronJob#enable_service_links}
         * @return {@code this}
         */
        public Builder enableServiceLinks(java.lang.Boolean enableServiceLinks) {
            this.enableServiceLinks = enableServiceLinks;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getEnableServiceLinks}
         * @param enableServiceLinks Enables generating environment variables for service discovery. Defaults to true.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#enable_service_links CronJob#enable_service_links}
         * @return {@code this}
         */
        public Builder enableServiceLinks(com.hashicorp.cdktf.IResolvable enableServiceLinks) {
            this.enableServiceLinks = enableServiceLinks;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostAliases}
         * @param hostAliases host_aliases block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_aliases CronJob#host_aliases}
         * @return {@code this}
         */
        public Builder hostAliases(com.hashicorp.cdktf.IResolvable hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostAliases}
         * @param hostAliases host_aliases block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_aliases CronJob#host_aliases}
         * @return {@code this}
         */
        public Builder hostAliases(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostIpc}
         * @param hostIpc Use the host's ipc namespace. Optional: Defaults to false.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_ipc CronJob#host_ipc}
         * @return {@code this}
         */
        public Builder hostIpc(java.lang.Boolean hostIpc) {
            this.hostIpc = hostIpc;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostIpc}
         * @param hostIpc Use the host's ipc namespace. Optional: Defaults to false.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_ipc CronJob#host_ipc}
         * @return {@code this}
         */
        public Builder hostIpc(com.hashicorp.cdktf.IResolvable hostIpc) {
            this.hostIpc = hostIpc;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostname}
         * @param hostname Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#hostname CronJob#hostname}
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostNetwork}
         * @param hostNetwork Host networking requested for this pod.
         *                    Use the host's network namespace. If this option is set, the ports that will be used must be specified.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_network CronJob#host_network}
         * @return {@code this}
         */
        public Builder hostNetwork(java.lang.Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostNetwork}
         * @param hostNetwork Host networking requested for this pod.
         *                    Use the host's network namespace. If this option is set, the ports that will be used must be specified.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_network CronJob#host_network}
         * @return {@code this}
         */
        public Builder hostNetwork(com.hashicorp.cdktf.IResolvable hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostPid}
         * @param hostPid Use the host's pid namespace.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_pid CronJob#host_pid}
         * @return {@code this}
         */
        public Builder hostPid(java.lang.Boolean hostPid) {
            this.hostPid = hostPid;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getHostPid}
         * @param hostPid Use the host's pid namespace.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#host_pid CronJob#host_pid}
         * @return {@code this}
         */
        public Builder hostPid(com.hashicorp.cdktf.IResolvable hostPid) {
            this.hostPid = hostPid;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getImagePullSecrets}
         * @param imagePullSecrets image_pull_secrets block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#image_pull_secrets CronJob#image_pull_secrets}
         * @return {@code this}
         */
        public Builder imagePullSecrets(com.hashicorp.cdktf.IResolvable imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getImagePullSecrets}
         * @param imagePullSecrets image_pull_secrets block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#image_pull_secrets CronJob#image_pull_secrets}
         * @return {@code this}
         */
        public Builder imagePullSecrets(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getInitContainer}
         * @param initContainer init_container block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#init_container CronJob#init_container}
         * @return {@code this}
         */
        public Builder initContainer(com.hashicorp.cdktf.IResolvable initContainer) {
            this.initContainer = initContainer;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getInitContainer}
         * @param initContainer init_container block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#init_container CronJob#init_container}
         * @return {@code this}
         */
        public Builder initContainer(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecInitContainer> initContainer) {
            this.initContainer = initContainer;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getNodeName}
         * @param nodeName NodeName is a request to schedule this pod onto a specific node.
         *                 If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#node_name CronJob#node_name}
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getNodeSelector}
         * @param nodeSelector NodeSelector is a selector which must be true for the pod to fit on a node.
         *                     Selector which must match a node's labels for the pod to be scheduled on that node. More info: http://kubernetes.io/docs/user-guide/node-selection.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#node_selector CronJob#node_selector}
         * @return {@code this}
         */
        public Builder nodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getPriorityClassName}
         * @param priorityClassName If specified, indicates the pod's priority.
         *                          "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
         *                          <p>
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#priority_class_name CronJob#priority_class_name}
         * @return {@code this}
         */
        public Builder priorityClassName(java.lang.String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getReadinessGate}
         * @param readinessGate readiness_gate block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#readiness_gate CronJob#readiness_gate}
         * @return {@code this}
         */
        public Builder readinessGate(com.hashicorp.cdktf.IResolvable readinessGate) {
            this.readinessGate = readinessGate;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getReadinessGate}
         * @param readinessGate readiness_gate block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#readiness_gate CronJob#readiness_gate}
         * @return {@code this}
         */
        public Builder readinessGate(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecReadinessGate> readinessGate) {
            this.readinessGate = readinessGate;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getRestartPolicy}
         * @param restartPolicy Restart policy for all containers within the pod. One of Always, OnFailure, Never. More info: http://kubernetes.io/docs/user-guide/pod-states#restartpolicy.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#restart_policy CronJob#restart_policy}
         * @return {@code this}
         */
        public Builder restartPolicy(java.lang.String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getSecurityContext}
         * @param securityContext security_context block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#security_context CronJob#security_context}
         * @return {@code this}
         */
        public Builder securityContext(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getServiceAccountName}
         * @param serviceAccountName ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: http://releases.k8s.io/HEAD/docs/design/service_accounts.md.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#service_account_name CronJob#service_account_name}
         * @return {@code this}
         */
        public Builder serviceAccountName(java.lang.String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getShareProcessNamespace}
         * @param shareProcessNamespace Share a single process namespace between all of the containers in a pod.
         *                              When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Defaults to false.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#share_process_namespace CronJob#share_process_namespace}
         * @return {@code this}
         */
        public Builder shareProcessNamespace(java.lang.Boolean shareProcessNamespace) {
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getShareProcessNamespace}
         * @param shareProcessNamespace Share a single process namespace between all of the containers in a pod.
         *                              When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Defaults to false.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#share_process_namespace CronJob#share_process_namespace}
         * @return {@code this}
         */
        public Builder shareProcessNamespace(com.hashicorp.cdktf.IResolvable shareProcessNamespace) {
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getSubdomain}
         * @param subdomain If specified, the fully qualified Pod hostname will be "...svc.". If not specified, the pod will not have a domainname at all..
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#subdomain CronJob#subdomain}
         * @return {@code this}
         */
        public Builder subdomain(java.lang.String subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getTerminationGracePeriodSeconds}
         * @param terminationGracePeriodSeconds Optional duration in seconds the pod needs to terminate gracefully.
         *                                      May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process.
         *                                      <p>
         *                                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#termination_grace_period_seconds CronJob#termination_grace_period_seconds}
         * @return {@code this}
         */
        public Builder terminationGracePeriodSeconds(java.lang.Number terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getToleration}
         * @param toleration toleration block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#toleration CronJob#toleration}
         * @return {@code this}
         */
        public Builder toleration(com.hashicorp.cdktf.IResolvable toleration) {
            this.toleration = toleration;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getToleration}
         * @param toleration toleration block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#toleration CronJob#toleration}
         * @return {@code this}
         */
        public Builder toleration(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecToleration> toleration) {
            this.toleration = toleration;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getTopologySpreadConstraint}
         * @param topologySpreadConstraint topology_spread_constraint block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#topology_spread_constraint CronJob#topology_spread_constraint}
         * @return {@code this}
         */
        public Builder topologySpreadConstraint(com.hashicorp.cdktf.IResolvable topologySpreadConstraint) {
            this.topologySpreadConstraint = topologySpreadConstraint;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getTopologySpreadConstraint}
         * @param topologySpreadConstraint topology_spread_constraint block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#topology_spread_constraint CronJob#topology_spread_constraint}
         * @return {@code this}
         */
        public Builder topologySpreadConstraint(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint> topologySpreadConstraint) {
            this.topologySpreadConstraint = topologySpreadConstraint;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getVolume}
         * @param volume volume block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#volume CronJob#volume}
         * @return {@code this}
         */
        public Builder volume(com.hashicorp.cdktf.IResolvable volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpec#getVolume}
         * @param volume volume block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#volume CronJob#volume}
         * @return {@code this}
         */
        public Builder volume(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolume> volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobSpecJobTemplateSpecTemplateSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobSpecJobTemplateSpecTemplateSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobSpecJobTemplateSpecTemplateSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobSpecJobTemplateSpecTemplateSpec {
        private final java.lang.Number activeDeadlineSeconds;
        private final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity;
        private final java.lang.Object automountServiceAccountToken;
        private final java.lang.Object container;
        private final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig dnsConfig;
        private final java.lang.String dnsPolicy;
        private final java.lang.Object enableServiceLinks;
        private final java.lang.Object hostAliases;
        private final java.lang.Object hostIpc;
        private final java.lang.String hostname;
        private final java.lang.Object hostNetwork;
        private final java.lang.Object hostPid;
        private final java.lang.Object imagePullSecrets;
        private final java.lang.Object initContainer;
        private final java.lang.String nodeName;
        private final java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private final java.lang.String priorityClassName;
        private final java.lang.Object readinessGate;
        private final java.lang.String restartPolicy;
        private final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext;
        private final java.lang.String serviceAccountName;
        private final java.lang.Object shareProcessNamespace;
        private final java.lang.String subdomain;
        private final java.lang.Number terminationGracePeriodSeconds;
        private final java.lang.Object toleration;
        private final java.lang.Object topologySpreadConstraint;
        private final java.lang.Object volume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.activeDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.affinity = software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity.class));
            this.automountServiceAccountToken = software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.container = software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dnsConfig = software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig.class));
            this.dnsPolicy = software.amazon.jsii.Kernel.get(this, "dnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableServiceLinks = software.amazon.jsii.Kernel.get(this, "enableServiceLinks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostAliases = software.amazon.jsii.Kernel.get(this, "hostAliases", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostIpc = software.amazon.jsii.Kernel.get(this, "hostIpc", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostNetwork = software.amazon.jsii.Kernel.get(this, "hostNetwork", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostPid = software.amazon.jsii.Kernel.get(this, "hostPid", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.imagePullSecrets = software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.initContainer = software.amazon.jsii.Kernel.get(this, "initContainer", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.nodeName = software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeSelector = software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.priorityClassName = software.amazon.jsii.Kernel.get(this, "priorityClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readinessGate = software.amazon.jsii.Kernel.get(this, "readinessGate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.restartPolicy = software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityContext = software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext.class));
            this.serviceAccountName = software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareProcessNamespace = software.amazon.jsii.Kernel.get(this, "shareProcessNamespace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.subdomain = software.amazon.jsii.Kernel.get(this, "subdomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.terminationGracePeriodSeconds = software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.toleration = software.amazon.jsii.Kernel.get(this, "toleration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.topologySpreadConstraint = software.amazon.jsii.Kernel.get(this, "topologySpreadConstraint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volume = software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.affinity = builder.affinity;
            this.automountServiceAccountToken = builder.automountServiceAccountToken;
            this.container = builder.container;
            this.dnsConfig = builder.dnsConfig;
            this.dnsPolicy = builder.dnsPolicy;
            this.enableServiceLinks = builder.enableServiceLinks;
            this.hostAliases = builder.hostAliases;
            this.hostIpc = builder.hostIpc;
            this.hostname = builder.hostname;
            this.hostNetwork = builder.hostNetwork;
            this.hostPid = builder.hostPid;
            this.imagePullSecrets = builder.imagePullSecrets;
            this.initContainer = builder.initContainer;
            this.nodeName = builder.nodeName;
            this.nodeSelector = builder.nodeSelector;
            this.priorityClassName = builder.priorityClassName;
            this.readinessGate = builder.readinessGate;
            this.restartPolicy = builder.restartPolicy;
            this.securityContext = builder.securityContext;
            this.serviceAccountName = builder.serviceAccountName;
            this.shareProcessNamespace = builder.shareProcessNamespace;
            this.subdomain = builder.subdomain;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.toleration = builder.toleration;
            this.topologySpreadConstraint = builder.topologySpreadConstraint;
            this.volume = builder.volume;
        }

        @Override
        public final java.lang.Number getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        @Override
        public final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecAffinity getAffinity() {
            return this.affinity;
        }

        @Override
        public final java.lang.Object getAutomountServiceAccountToken() {
            return this.automountServiceAccountToken;
        }

        @Override
        public final java.lang.Object getContainer() {
            return this.container;
        }

        @Override
        public final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecDnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        @Override
        public final java.lang.String getDnsPolicy() {
            return this.dnsPolicy;
        }

        @Override
        public final java.lang.Object getEnableServiceLinks() {
            return this.enableServiceLinks;
        }

        @Override
        public final java.lang.Object getHostAliases() {
            return this.hostAliases;
        }

        @Override
        public final java.lang.Object getHostIpc() {
            return this.hostIpc;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.Object getHostNetwork() {
            return this.hostNetwork;
        }

        @Override
        public final java.lang.Object getHostPid() {
            return this.hostPid;
        }

        @Override
        public final java.lang.Object getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        @Override
        public final java.lang.Object getInitContainer() {
            return this.initContainer;
        }

        @Override
        public final java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        public final java.lang.String getPriorityClassName() {
            return this.priorityClassName;
        }

        @Override
        public final java.lang.Object getReadinessGate() {
            return this.readinessGate;
        }

        @Override
        public final java.lang.String getRestartPolicy() {
            return this.restartPolicy;
        }

        @Override
        public final imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        @Override
        public final java.lang.String getServiceAccountName() {
            return this.serviceAccountName;
        }

        @Override
        public final java.lang.Object getShareProcessNamespace() {
            return this.shareProcessNamespace;
        }

        @Override
        public final java.lang.String getSubdomain() {
            return this.subdomain;
        }

        @Override
        public final java.lang.Number getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        @Override
        public final java.lang.Object getToleration() {
            return this.toleration;
        }

        @Override
        public final java.lang.Object getTopologySpreadConstraint() {
            return this.topologySpreadConstraint;
        }

        @Override
        public final java.lang.Object getVolume() {
            return this.volume;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getActiveDeadlineSeconds() != null) {
                data.set("activeDeadlineSeconds", om.valueToTree(this.getActiveDeadlineSeconds()));
            }
            if (this.getAffinity() != null) {
                data.set("affinity", om.valueToTree(this.getAffinity()));
            }
            if (this.getAutomountServiceAccountToken() != null) {
                data.set("automountServiceAccountToken", om.valueToTree(this.getAutomountServiceAccountToken()));
            }
            if (this.getContainer() != null) {
                data.set("container", om.valueToTree(this.getContainer()));
            }
            if (this.getDnsConfig() != null) {
                data.set("dnsConfig", om.valueToTree(this.getDnsConfig()));
            }
            if (this.getDnsPolicy() != null) {
                data.set("dnsPolicy", om.valueToTree(this.getDnsPolicy()));
            }
            if (this.getEnableServiceLinks() != null) {
                data.set("enableServiceLinks", om.valueToTree(this.getEnableServiceLinks()));
            }
            if (this.getHostAliases() != null) {
                data.set("hostAliases", om.valueToTree(this.getHostAliases()));
            }
            if (this.getHostIpc() != null) {
                data.set("hostIpc", om.valueToTree(this.getHostIpc()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getHostNetwork() != null) {
                data.set("hostNetwork", om.valueToTree(this.getHostNetwork()));
            }
            if (this.getHostPid() != null) {
                data.set("hostPid", om.valueToTree(this.getHostPid()));
            }
            if (this.getImagePullSecrets() != null) {
                data.set("imagePullSecrets", om.valueToTree(this.getImagePullSecrets()));
            }
            if (this.getInitContainer() != null) {
                data.set("initContainer", om.valueToTree(this.getInitContainer()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }
            if (this.getPriorityClassName() != null) {
                data.set("priorityClassName", om.valueToTree(this.getPriorityClassName()));
            }
            if (this.getReadinessGate() != null) {
                data.set("readinessGate", om.valueToTree(this.getReadinessGate()));
            }
            if (this.getRestartPolicy() != null) {
                data.set("restartPolicy", om.valueToTree(this.getRestartPolicy()));
            }
            if (this.getSecurityContext() != null) {
                data.set("securityContext", om.valueToTree(this.getSecurityContext()));
            }
            if (this.getServiceAccountName() != null) {
                data.set("serviceAccountName", om.valueToTree(this.getServiceAccountName()));
            }
            if (this.getShareProcessNamespace() != null) {
                data.set("shareProcessNamespace", om.valueToTree(this.getShareProcessNamespace()));
            }
            if (this.getSubdomain() != null) {
                data.set("subdomain", om.valueToTree(this.getSubdomain()));
            }
            if (this.getTerminationGracePeriodSeconds() != null) {
                data.set("terminationGracePeriodSeconds", om.valueToTree(this.getTerminationGracePeriodSeconds()));
            }
            if (this.getToleration() != null) {
                data.set("toleration", om.valueToTree(this.getToleration()));
            }
            if (this.getTopologySpreadConstraint() != null) {
                data.set("topologySpreadConstraint", om.valueToTree(this.getTopologySpreadConstraint()));
            }
            if (this.getVolume() != null) {
                data.set("volume", om.valueToTree(this.getVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobSpecJobTemplateSpecTemplateSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobSpecJobTemplateSpecTemplateSpec.Jsii$Proxy that = (CronJobSpecJobTemplateSpecTemplateSpec.Jsii$Proxy) o;

            if (this.activeDeadlineSeconds != null ? !this.activeDeadlineSeconds.equals(that.activeDeadlineSeconds) : that.activeDeadlineSeconds != null) return false;
            if (this.affinity != null ? !this.affinity.equals(that.affinity) : that.affinity != null) return false;
            if (this.automountServiceAccountToken != null ? !this.automountServiceAccountToken.equals(that.automountServiceAccountToken) : that.automountServiceAccountToken != null) return false;
            if (this.container != null ? !this.container.equals(that.container) : that.container != null) return false;
            if (this.dnsConfig != null ? !this.dnsConfig.equals(that.dnsConfig) : that.dnsConfig != null) return false;
            if (this.dnsPolicy != null ? !this.dnsPolicy.equals(that.dnsPolicy) : that.dnsPolicy != null) return false;
            if (this.enableServiceLinks != null ? !this.enableServiceLinks.equals(that.enableServiceLinks) : that.enableServiceLinks != null) return false;
            if (this.hostAliases != null ? !this.hostAliases.equals(that.hostAliases) : that.hostAliases != null) return false;
            if (this.hostIpc != null ? !this.hostIpc.equals(that.hostIpc) : that.hostIpc != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.hostNetwork != null ? !this.hostNetwork.equals(that.hostNetwork) : that.hostNetwork != null) return false;
            if (this.hostPid != null ? !this.hostPid.equals(that.hostPid) : that.hostPid != null) return false;
            if (this.imagePullSecrets != null ? !this.imagePullSecrets.equals(that.imagePullSecrets) : that.imagePullSecrets != null) return false;
            if (this.initContainer != null ? !this.initContainer.equals(that.initContainer) : that.initContainer != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            if (this.nodeSelector != null ? !this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null) return false;
            if (this.priorityClassName != null ? !this.priorityClassName.equals(that.priorityClassName) : that.priorityClassName != null) return false;
            if (this.readinessGate != null ? !this.readinessGate.equals(that.readinessGate) : that.readinessGate != null) return false;
            if (this.restartPolicy != null ? !this.restartPolicy.equals(that.restartPolicy) : that.restartPolicy != null) return false;
            if (this.securityContext != null ? !this.securityContext.equals(that.securityContext) : that.securityContext != null) return false;
            if (this.serviceAccountName != null ? !this.serviceAccountName.equals(that.serviceAccountName) : that.serviceAccountName != null) return false;
            if (this.shareProcessNamespace != null ? !this.shareProcessNamespace.equals(that.shareProcessNamespace) : that.shareProcessNamespace != null) return false;
            if (this.subdomain != null ? !this.subdomain.equals(that.subdomain) : that.subdomain != null) return false;
            if (this.terminationGracePeriodSeconds != null ? !this.terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) : that.terminationGracePeriodSeconds != null) return false;
            if (this.toleration != null ? !this.toleration.equals(that.toleration) : that.toleration != null) return false;
            if (this.topologySpreadConstraint != null ? !this.topologySpreadConstraint.equals(that.topologySpreadConstraint) : that.topologySpreadConstraint != null) return false;
            return this.volume != null ? this.volume.equals(that.volume) : that.volume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.activeDeadlineSeconds != null ? this.activeDeadlineSeconds.hashCode() : 0;
            result = 31 * result + (this.affinity != null ? this.affinity.hashCode() : 0);
            result = 31 * result + (this.automountServiceAccountToken != null ? this.automountServiceAccountToken.hashCode() : 0);
            result = 31 * result + (this.container != null ? this.container.hashCode() : 0);
            result = 31 * result + (this.dnsConfig != null ? this.dnsConfig.hashCode() : 0);
            result = 31 * result + (this.dnsPolicy != null ? this.dnsPolicy.hashCode() : 0);
            result = 31 * result + (this.enableServiceLinks != null ? this.enableServiceLinks.hashCode() : 0);
            result = 31 * result + (this.hostAliases != null ? this.hostAliases.hashCode() : 0);
            result = 31 * result + (this.hostIpc != null ? this.hostIpc.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.hostNetwork != null ? this.hostNetwork.hashCode() : 0);
            result = 31 * result + (this.hostPid != null ? this.hostPid.hashCode() : 0);
            result = 31 * result + (this.imagePullSecrets != null ? this.imagePullSecrets.hashCode() : 0);
            result = 31 * result + (this.initContainer != null ? this.initContainer.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            result = 31 * result + (this.priorityClassName != null ? this.priorityClassName.hashCode() : 0);
            result = 31 * result + (this.readinessGate != null ? this.readinessGate.hashCode() : 0);
            result = 31 * result + (this.restartPolicy != null ? this.restartPolicy.hashCode() : 0);
            result = 31 * result + (this.securityContext != null ? this.securityContext.hashCode() : 0);
            result = 31 * result + (this.serviceAccountName != null ? this.serviceAccountName.hashCode() : 0);
            result = 31 * result + (this.shareProcessNamespace != null ? this.shareProcessNamespace.hashCode() : 0);
            result = 31 * result + (this.subdomain != null ? this.subdomain.hashCode() : 0);
            result = 31 * result + (this.terminationGracePeriodSeconds != null ? this.terminationGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.toleration != null ? this.toleration.hashCode() : 0);
            result = 31 * result + (this.topologySpreadConstraint != null ? this.topologySpreadConstraint.hashCode() : 0);
            result = 31 * result + (this.volume != null ? this.volume.hashCode() : 0);
            return result;
        }
    }
}
