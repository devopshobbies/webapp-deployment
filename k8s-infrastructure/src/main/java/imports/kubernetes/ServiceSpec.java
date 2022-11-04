package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.909Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceSpec")
@software.amazon.jsii.Jsii.Proxy(ServiceSpec.Jsii$Proxy.class)
public interface ServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Defines if `NodePorts` will be automatically allocated for services with type `LoadBalancer`.
     * <p>
     * It may be set to <code>false</code> if the cluster load-balancer does not rely on <code>NodePorts</code>.  If the caller requests specific <code>NodePorts</code> (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type <code>LoadBalancer</code>. Default is <code>true</code>. More info: https://kubernetes.io/docs/concepts/services-networking/service/#load-balancer-nodeport-allocation
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#allocate_load_balancer_node_ports Service#allocate_load_balancer_node_ports}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllocateLoadBalancerNodePorts() {
        return null;
    }

    /**
     * The IP address of the service.
     * <p>
     * It is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. <code>None</code> can be specified for headless services when proxying is not required. Ignored if type is <code>ExternalName</code>. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#cluster_ip Service#cluster_ip}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClusterIp() {
        return null;
    }

    /**
     * List of IP addresses assigned to this service, and are usually assigned randomly.
     * <p>
     * If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise creation of the service will fail. If this field is not specified, it will be initialized from the <code>clusterIP</code> field. If this field is specified, clients must ensure that <code>clusterIPs[0]</code> and <code>clusterIP</code> have the same value. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#cluster_ips Service#cluster_ips}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterIps() {
        return null;
    }

    /**
     * A list of IP addresses for which nodes in the cluster will also accept traffic for this service.
     * <p>
     * These IPs are not managed by Kubernetes. The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_ips Service#external_ips}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExternalIps() {
        return null;
    }

    /**
     * The external reference that kubedns or equivalent will return as a CNAME record for this service.
     * <p>
     * No proxying will be involved. Must be a valid DNS name and requires <code>type</code> to be <code>ExternalName</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_name Service#external_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalName() {
        return null;
    }

    /**
     * Denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
     * <p>
     * <code>Local</code> preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. <code>Cluster</code> obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading. More info: https://kubernetes.io/docs/tutorials/services/source-ip/
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_traffic_policy Service#external_traffic_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalTrafficPolicy() {
        return null;
    }

    /**
     * Specifies the Healthcheck NodePort for the service.
     * <p>
     * Only effects when type is set to <code>LoadBalancer</code> and external_traffic_policy is set to <code>Local</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#health_check_node_port Service#health_check_node_port}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckNodePort() {
        return null;
    }

    /**
     * Specifies if the cluster internal traffic should be routed to all endpoints or node-local endpoints only.
     * <p>
     * <code>Cluster</code> routes internal traffic to a Service to all endpoints. <code>Local</code> routes traffic to node-local endpoints only, traffic is dropped if no node-local endpoints are ready. The default value is <code>Cluster</code>.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#internal_traffic_policy Service#internal_traffic_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInternalTrafficPolicy() {
        return null;
    }

    /**
     * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#ip_families Service#ip_families}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpFamilies() {
        return null;
    }

    /**
     * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service.
     * <p>
     * If there is no value provided, then this field will be set to SingleStack. Services can be 'SingleStack' (a single IP family), 'PreferDualStack' (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or 'RequireDualStack' (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#ip_family_policy Service#ip_family_policy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIpFamilyPolicy() {
        return null;
    }

    /**
     * The class of the load balancer implementation this Service belongs to.
     * <p>
     * If specified, the value of this field must be a label-style identifier, with an optional prefix. This field can only be set when the Service type is <code>LoadBalancer</code>. If not set, the default load balancer implementation is used. This field can only be set when creating or updating a Service to type <code>LoadBalancer</code>. More info: https://kubernetes.io/docs/concepts/services-networking/service/#load-balancer-class
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_class Service#load_balancer_class}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerClass() {
        return null;
    }

    /**
     * Only applies to `type = LoadBalancer`.
     * <p>
     * LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying this field when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_ip Service#load_balancer_ip}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerIp() {
        return null;
    }

    /**
     * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
     * <p>
     * This field will be ignored if the cloud-provider does not support the feature. More info: http://kubernetes.io/docs/user-guide/services-firewalls
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_source_ranges Service#load_balancer_source_ranges}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
        return null;
    }

    /**
     * port block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#port Service#port}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPort() {
        return null;
    }

    /**
     * When set to true, indicates that DNS implementations must publish the `notReadyAddresses` of subsets for the Endpoints associated with the Service.
     * <p>
     * The default value is <code>false</code>. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate <code>SRV</code> records for its Pods without respect to their readiness for purpose of peer discovery.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#publish_not_ready_addresses Service#publish_not_ready_addresses}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPublishNotReadyAddresses() {
        return null;
    }

    /**
     * Route service traffic to pods with label keys and values matching this selector.
     * <p>
     * Only applies to types <code>ClusterIP</code>, <code>NodePort</code>, and <code>LoadBalancer</code>. More info: http://kubernetes.io/docs/user-guide/services#overview
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#selector Service#selector}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSelector() {
        return null;
    }

    /**
     * Used to maintain session affinity. Supports `ClientIP` and `None`. Defaults to `None`. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#session_affinity Service#session_affinity}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSessionAffinity() {
        return null;
    }

    /**
     * session_affinity_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#session_affinity_config Service#session_affinity_config}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpecSessionAffinityConfig getSessionAffinityConfig() {
        return null;
    }

    /**
     * Determines how the service is exposed.
     * <p>
     * Defaults to <code>ClusterIP</code>. Valid options are <code>ExternalName</code>, <code>ClusterIP</code>, <code>NodePort</code>, and <code>LoadBalancer</code>. <code>ExternalName</code> maps to the specified <code>external_name</code>. More info: http://kubernetes.io/docs/user-guide/services#overview
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#type Service#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceSpec> {
        java.lang.Object allocateLoadBalancerNodePorts;
        java.lang.String clusterIp;
        java.util.List<java.lang.String> clusterIps;
        java.util.List<java.lang.String> externalIps;
        java.lang.String externalName;
        java.lang.String externalTrafficPolicy;
        java.lang.Number healthCheckNodePort;
        java.lang.String internalTrafficPolicy;
        java.util.List<java.lang.String> ipFamilies;
        java.lang.String ipFamilyPolicy;
        java.lang.String loadBalancerClass;
        java.lang.String loadBalancerIp;
        java.util.List<java.lang.String> loadBalancerSourceRanges;
        java.lang.Object port;
        java.lang.Object publishNotReadyAddresses;
        java.util.Map<java.lang.String, java.lang.String> selector;
        java.lang.String sessionAffinity;
        imports.kubernetes.ServiceSpecSessionAffinityConfig sessionAffinityConfig;
        java.lang.String type;

        /**
         * Sets the value of {@link ServiceSpec#getAllocateLoadBalancerNodePorts}
         * @param allocateLoadBalancerNodePorts Defines if `NodePorts` will be automatically allocated for services with type `LoadBalancer`.
         *                                      It may be set to <code>false</code> if the cluster load-balancer does not rely on <code>NodePorts</code>.  If the caller requests specific <code>NodePorts</code> (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type <code>LoadBalancer</code>. Default is <code>true</code>. More info: https://kubernetes.io/docs/concepts/services-networking/service/#load-balancer-nodeport-allocation
         *                                      <p>
         *                                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#allocate_load_balancer_node_ports Service#allocate_load_balancer_node_ports}
         * @return {@code this}
         */
        public Builder allocateLoadBalancerNodePorts(java.lang.Boolean allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getAllocateLoadBalancerNodePorts}
         * @param allocateLoadBalancerNodePorts Defines if `NodePorts` will be automatically allocated for services with type `LoadBalancer`.
         *                                      It may be set to <code>false</code> if the cluster load-balancer does not rely on <code>NodePorts</code>.  If the caller requests specific <code>NodePorts</code> (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type <code>LoadBalancer</code>. Default is <code>true</code>. More info: https://kubernetes.io/docs/concepts/services-networking/service/#load-balancer-nodeport-allocation
         *                                      <p>
         *                                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#allocate_load_balancer_node_ports Service#allocate_load_balancer_node_ports}
         * @return {@code this}
         */
        public Builder allocateLoadBalancerNodePorts(com.hashicorp.cdktf.IResolvable allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getClusterIp}
         * @param clusterIp The IP address of the service.
         *                  It is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. <code>None</code> can be specified for headless services when proxying is not required. Ignored if type is <code>ExternalName</code>. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#cluster_ip Service#cluster_ip}
         * @return {@code this}
         */
        public Builder clusterIp(java.lang.String clusterIp) {
            this.clusterIp = clusterIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getClusterIps}
         * @param clusterIps List of IP addresses assigned to this service, and are usually assigned randomly.
         *                   If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise creation of the service will fail. If this field is not specified, it will be initialized from the <code>clusterIP</code> field. If this field is specified, clients must ensure that <code>clusterIPs[0]</code> and <code>clusterIP</code> have the same value. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#cluster_ips Service#cluster_ips}
         * @return {@code this}
         */
        public Builder clusterIps(java.util.List<java.lang.String> clusterIps) {
            this.clusterIps = clusterIps;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalIps}
         * @param externalIps A list of IP addresses for which nodes in the cluster will also accept traffic for this service.
         *                    These IPs are not managed by Kubernetes. The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_ips Service#external_ips}
         * @return {@code this}
         */
        public Builder externalIps(java.util.List<java.lang.String> externalIps) {
            this.externalIps = externalIps;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalName}
         * @param externalName The external reference that kubedns or equivalent will return as a CNAME record for this service.
         *                     No proxying will be involved. Must be a valid DNS name and requires <code>type</code> to be <code>ExternalName</code>.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_name Service#external_name}
         * @return {@code this}
         */
        public Builder externalName(java.lang.String externalName) {
            this.externalName = externalName;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalTrafficPolicy}
         * @param externalTrafficPolicy Denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
         *                              <code>Local</code> preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. <code>Cluster</code> obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading. More info: https://kubernetes.io/docs/tutorials/services/source-ip/
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#external_traffic_policy Service#external_traffic_policy}
         * @return {@code this}
         */
        public Builder externalTrafficPolicy(java.lang.String externalTrafficPolicy) {
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getHealthCheckNodePort}
         * @param healthCheckNodePort Specifies the Healthcheck NodePort for the service.
         *                            Only effects when type is set to <code>LoadBalancer</code> and external_traffic_policy is set to <code>Local</code>.
         *                            <p>
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#health_check_node_port Service#health_check_node_port}
         * @return {@code this}
         */
        public Builder healthCheckNodePort(java.lang.Number healthCheckNodePort) {
            this.healthCheckNodePort = healthCheckNodePort;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getInternalTrafficPolicy}
         * @param internalTrafficPolicy Specifies if the cluster internal traffic should be routed to all endpoints or node-local endpoints only.
         *                              <code>Cluster</code> routes internal traffic to a Service to all endpoints. <code>Local</code> routes traffic to node-local endpoints only, traffic is dropped if no node-local endpoints are ready. The default value is <code>Cluster</code>.
         *                              <p>
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#internal_traffic_policy Service#internal_traffic_policy}
         * @return {@code this}
         */
        public Builder internalTrafficPolicy(java.lang.String internalTrafficPolicy) {
            this.internalTrafficPolicy = internalTrafficPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getIpFamilies}
         * @param ipFamilies IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#ip_families Service#ip_families}
         * @return {@code this}
         */
        public Builder ipFamilies(java.util.List<java.lang.String> ipFamilies) {
            this.ipFamilies = ipFamilies;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getIpFamilyPolicy}
         * @param ipFamilyPolicy IPFamilyPolicy represents the dual-stack-ness requested or required by this Service.
         *                       If there is no value provided, then this field will be set to SingleStack. Services can be 'SingleStack' (a single IP family), 'PreferDualStack' (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or 'RequireDualStack' (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field.
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#ip_family_policy Service#ip_family_policy}
         * @return {@code this}
         */
        public Builder ipFamilyPolicy(java.lang.String ipFamilyPolicy) {
            this.ipFamilyPolicy = ipFamilyPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerClass}
         * @param loadBalancerClass The class of the load balancer implementation this Service belongs to.
         *                          If specified, the value of this field must be a label-style identifier, with an optional prefix. This field can only be set when the Service type is <code>LoadBalancer</code>. If not set, the default load balancer implementation is used. This field can only be set when creating or updating a Service to type <code>LoadBalancer</code>. More info: https://kubernetes.io/docs/concepts/services-networking/service/#load-balancer-class
         *                          <p>
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_class Service#load_balancer_class}
         * @return {@code this}
         */
        public Builder loadBalancerClass(java.lang.String loadBalancerClass) {
            this.loadBalancerClass = loadBalancerClass;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerIp}
         * @param loadBalancerIp Only applies to `type = LoadBalancer`.
         *                       LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying this field when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_ip Service#load_balancer_ip}
         * @return {@code this}
         */
        public Builder loadBalancerIp(java.lang.String loadBalancerIp) {
            this.loadBalancerIp = loadBalancerIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerSourceRanges}
         * @param loadBalancerSourceRanges If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
         *                                 This field will be ignored if the cloud-provider does not support the feature. More info: http://kubernetes.io/docs/user-guide/services-firewalls
         *                                 <p>
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#load_balancer_source_ranges Service#load_balancer_source_ranges}
         * @return {@code this}
         */
        public Builder loadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPort}
         * @param port port block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#port Service#port}
         * @return {@code this}
         */
        public Builder port(com.hashicorp.cdktf.IResolvable port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPort}
         * @param port port block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#port Service#port}
         * @return {@code this}
         */
        public Builder port(java.util.List<? extends imports.kubernetes.ServiceSpecPort> port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPublishNotReadyAddresses}
         * @param publishNotReadyAddresses When set to true, indicates that DNS implementations must publish the `notReadyAddresses` of subsets for the Endpoints associated with the Service.
         *                                 The default value is <code>false</code>. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate <code>SRV</code> records for its Pods without respect to their readiness for purpose of peer discovery.
         *                                 <p>
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#publish_not_ready_addresses Service#publish_not_ready_addresses}
         * @return {@code this}
         */
        public Builder publishNotReadyAddresses(java.lang.Boolean publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPublishNotReadyAddresses}
         * @param publishNotReadyAddresses When set to true, indicates that DNS implementations must publish the `notReadyAddresses` of subsets for the Endpoints associated with the Service.
         *                                 The default value is <code>false</code>. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate <code>SRV</code> records for its Pods without respect to their readiness for purpose of peer discovery.
         *                                 <p>
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#publish_not_ready_addresses Service#publish_not_ready_addresses}
         * @return {@code this}
         */
        public Builder publishNotReadyAddresses(com.hashicorp.cdktf.IResolvable publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSelector}
         * @param selector Route service traffic to pods with label keys and values matching this selector.
         *                 Only applies to types <code>ClusterIP</code>, <code>NodePort</code>, and <code>LoadBalancer</code>. More info: http://kubernetes.io/docs/user-guide/services#overview
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#selector Service#selector}
         * @return {@code this}
         */
        public Builder selector(java.util.Map<java.lang.String, java.lang.String> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinity}
         * @param sessionAffinity Used to maintain session affinity. Supports `ClientIP` and `None`. Defaults to `None`. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#session_affinity Service#session_affinity}
         * @return {@code this}
         */
        public Builder sessionAffinity(java.lang.String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinityConfig}
         * @param sessionAffinityConfig session_affinity_config block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#session_affinity_config Service#session_affinity_config}
         * @return {@code this}
         */
        public Builder sessionAffinityConfig(imports.kubernetes.ServiceSpecSessionAffinityConfig sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getType}
         * @param type Determines how the service is exposed.
         *             Defaults to <code>ClusterIP</code>. Valid options are <code>ExternalName</code>, <code>ClusterIP</code>, <code>NodePort</code>, and <code>LoadBalancer</code>. <code>ExternalName</code> maps to the specified <code>external_name</code>. More info: http://kubernetes.io/docs/user-guide/services#overview
         *             <p>
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/service#type Service#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceSpec {
        private final java.lang.Object allocateLoadBalancerNodePorts;
        private final java.lang.String clusterIp;
        private final java.util.List<java.lang.String> clusterIps;
        private final java.util.List<java.lang.String> externalIps;
        private final java.lang.String externalName;
        private final java.lang.String externalTrafficPolicy;
        private final java.lang.Number healthCheckNodePort;
        private final java.lang.String internalTrafficPolicy;
        private final java.util.List<java.lang.String> ipFamilies;
        private final java.lang.String ipFamilyPolicy;
        private final java.lang.String loadBalancerClass;
        private final java.lang.String loadBalancerIp;
        private final java.util.List<java.lang.String> loadBalancerSourceRanges;
        private final java.lang.Object port;
        private final java.lang.Object publishNotReadyAddresses;
        private final java.util.Map<java.lang.String, java.lang.String> selector;
        private final java.lang.String sessionAffinity;
        private final imports.kubernetes.ServiceSpecSessionAffinityConfig sessionAffinityConfig;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allocateLoadBalancerNodePorts = software.amazon.jsii.Kernel.get(this, "allocateLoadBalancerNodePorts", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.clusterIp = software.amazon.jsii.Kernel.get(this, "clusterIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterIps = software.amazon.jsii.Kernel.get(this, "clusterIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.externalIps = software.amazon.jsii.Kernel.get(this, "externalIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.externalName = software.amazon.jsii.Kernel.get(this, "externalName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.externalTrafficPolicy = software.amazon.jsii.Kernel.get(this, "externalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.healthCheckNodePort = software.amazon.jsii.Kernel.get(this, "healthCheckNodePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.internalTrafficPolicy = software.amazon.jsii.Kernel.get(this, "internalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipFamilies = software.amazon.jsii.Kernel.get(this, "ipFamilies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ipFamilyPolicy = software.amazon.jsii.Kernel.get(this, "ipFamilyPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerClass = software.amazon.jsii.Kernel.get(this, "loadBalancerClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerIp = software.amazon.jsii.Kernel.get(this, "loadBalancerIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerSourceRanges = software.amazon.jsii.Kernel.get(this, "loadBalancerSourceRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.publishNotReadyAddresses = software.amazon.jsii.Kernel.get(this, "publishNotReadyAddresses", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sessionAffinity = software.amazon.jsii.Kernel.get(this, "sessionAffinity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionAffinityConfig = software.amazon.jsii.Kernel.get(this, "sessionAffinityConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfig.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allocateLoadBalancerNodePorts = builder.allocateLoadBalancerNodePorts;
            this.clusterIp = builder.clusterIp;
            this.clusterIps = builder.clusterIps;
            this.externalIps = builder.externalIps;
            this.externalName = builder.externalName;
            this.externalTrafficPolicy = builder.externalTrafficPolicy;
            this.healthCheckNodePort = builder.healthCheckNodePort;
            this.internalTrafficPolicy = builder.internalTrafficPolicy;
            this.ipFamilies = builder.ipFamilies;
            this.ipFamilyPolicy = builder.ipFamilyPolicy;
            this.loadBalancerClass = builder.loadBalancerClass;
            this.loadBalancerIp = builder.loadBalancerIp;
            this.loadBalancerSourceRanges = builder.loadBalancerSourceRanges;
            this.port = builder.port;
            this.publishNotReadyAddresses = builder.publishNotReadyAddresses;
            this.selector = builder.selector;
            this.sessionAffinity = builder.sessionAffinity;
            this.sessionAffinityConfig = builder.sessionAffinityConfig;
            this.type = builder.type;
        }

        @Override
        public final java.lang.Object getAllocateLoadBalancerNodePorts() {
            return this.allocateLoadBalancerNodePorts;
        }

        @Override
        public final java.lang.String getClusterIp() {
            return this.clusterIp;
        }

        @Override
        public final java.util.List<java.lang.String> getClusterIps() {
            return this.clusterIps;
        }

        @Override
        public final java.util.List<java.lang.String> getExternalIps() {
            return this.externalIps;
        }

        @Override
        public final java.lang.String getExternalName() {
            return this.externalName;
        }

        @Override
        public final java.lang.String getExternalTrafficPolicy() {
            return this.externalTrafficPolicy;
        }

        @Override
        public final java.lang.Number getHealthCheckNodePort() {
            return this.healthCheckNodePort;
        }

        @Override
        public final java.lang.String getInternalTrafficPolicy() {
            return this.internalTrafficPolicy;
        }

        @Override
        public final java.util.List<java.lang.String> getIpFamilies() {
            return this.ipFamilies;
        }

        @Override
        public final java.lang.String getIpFamilyPolicy() {
            return this.ipFamilyPolicy;
        }

        @Override
        public final java.lang.String getLoadBalancerClass() {
            return this.loadBalancerClass;
        }

        @Override
        public final java.lang.String getLoadBalancerIp() {
            return this.loadBalancerIp;
        }

        @Override
        public final java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
            return this.loadBalancerSourceRanges;
        }

        @Override
        public final java.lang.Object getPort() {
            return this.port;
        }

        @Override
        public final java.lang.Object getPublishNotReadyAddresses() {
            return this.publishNotReadyAddresses;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getSessionAffinity() {
            return this.sessionAffinity;
        }

        @Override
        public final imports.kubernetes.ServiceSpecSessionAffinityConfig getSessionAffinityConfig() {
            return this.sessionAffinityConfig;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllocateLoadBalancerNodePorts() != null) {
                data.set("allocateLoadBalancerNodePorts", om.valueToTree(this.getAllocateLoadBalancerNodePorts()));
            }
            if (this.getClusterIp() != null) {
                data.set("clusterIp", om.valueToTree(this.getClusterIp()));
            }
            if (this.getClusterIps() != null) {
                data.set("clusterIps", om.valueToTree(this.getClusterIps()));
            }
            if (this.getExternalIps() != null) {
                data.set("externalIps", om.valueToTree(this.getExternalIps()));
            }
            if (this.getExternalName() != null) {
                data.set("externalName", om.valueToTree(this.getExternalName()));
            }
            if (this.getExternalTrafficPolicy() != null) {
                data.set("externalTrafficPolicy", om.valueToTree(this.getExternalTrafficPolicy()));
            }
            if (this.getHealthCheckNodePort() != null) {
                data.set("healthCheckNodePort", om.valueToTree(this.getHealthCheckNodePort()));
            }
            if (this.getInternalTrafficPolicy() != null) {
                data.set("internalTrafficPolicy", om.valueToTree(this.getInternalTrafficPolicy()));
            }
            if (this.getIpFamilies() != null) {
                data.set("ipFamilies", om.valueToTree(this.getIpFamilies()));
            }
            if (this.getIpFamilyPolicy() != null) {
                data.set("ipFamilyPolicy", om.valueToTree(this.getIpFamilyPolicy()));
            }
            if (this.getLoadBalancerClass() != null) {
                data.set("loadBalancerClass", om.valueToTree(this.getLoadBalancerClass()));
            }
            if (this.getLoadBalancerIp() != null) {
                data.set("loadBalancerIp", om.valueToTree(this.getLoadBalancerIp()));
            }
            if (this.getLoadBalancerSourceRanges() != null) {
                data.set("loadBalancerSourceRanges", om.valueToTree(this.getLoadBalancerSourceRanges()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getPublishNotReadyAddresses() != null) {
                data.set("publishNotReadyAddresses", om.valueToTree(this.getPublishNotReadyAddresses()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getSessionAffinity() != null) {
                data.set("sessionAffinity", om.valueToTree(this.getSessionAffinity()));
            }
            if (this.getSessionAffinityConfig() != null) {
                data.set("sessionAffinityConfig", om.valueToTree(this.getSessionAffinityConfig()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceSpec.Jsii$Proxy that = (ServiceSpec.Jsii$Proxy) o;

            if (this.allocateLoadBalancerNodePorts != null ? !this.allocateLoadBalancerNodePorts.equals(that.allocateLoadBalancerNodePorts) : that.allocateLoadBalancerNodePorts != null) return false;
            if (this.clusterIp != null ? !this.clusterIp.equals(that.clusterIp) : that.clusterIp != null) return false;
            if (this.clusterIps != null ? !this.clusterIps.equals(that.clusterIps) : that.clusterIps != null) return false;
            if (this.externalIps != null ? !this.externalIps.equals(that.externalIps) : that.externalIps != null) return false;
            if (this.externalName != null ? !this.externalName.equals(that.externalName) : that.externalName != null) return false;
            if (this.externalTrafficPolicy != null ? !this.externalTrafficPolicy.equals(that.externalTrafficPolicy) : that.externalTrafficPolicy != null) return false;
            if (this.healthCheckNodePort != null ? !this.healthCheckNodePort.equals(that.healthCheckNodePort) : that.healthCheckNodePort != null) return false;
            if (this.internalTrafficPolicy != null ? !this.internalTrafficPolicy.equals(that.internalTrafficPolicy) : that.internalTrafficPolicy != null) return false;
            if (this.ipFamilies != null ? !this.ipFamilies.equals(that.ipFamilies) : that.ipFamilies != null) return false;
            if (this.ipFamilyPolicy != null ? !this.ipFamilyPolicy.equals(that.ipFamilyPolicy) : that.ipFamilyPolicy != null) return false;
            if (this.loadBalancerClass != null ? !this.loadBalancerClass.equals(that.loadBalancerClass) : that.loadBalancerClass != null) return false;
            if (this.loadBalancerIp != null ? !this.loadBalancerIp.equals(that.loadBalancerIp) : that.loadBalancerIp != null) return false;
            if (this.loadBalancerSourceRanges != null ? !this.loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) : that.loadBalancerSourceRanges != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.publishNotReadyAddresses != null ? !this.publishNotReadyAddresses.equals(that.publishNotReadyAddresses) : that.publishNotReadyAddresses != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.sessionAffinity != null ? !this.sessionAffinity.equals(that.sessionAffinity) : that.sessionAffinity != null) return false;
            if (this.sessionAffinityConfig != null ? !this.sessionAffinityConfig.equals(that.sessionAffinityConfig) : that.sessionAffinityConfig != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allocateLoadBalancerNodePorts != null ? this.allocateLoadBalancerNodePorts.hashCode() : 0;
            result = 31 * result + (this.clusterIp != null ? this.clusterIp.hashCode() : 0);
            result = 31 * result + (this.clusterIps != null ? this.clusterIps.hashCode() : 0);
            result = 31 * result + (this.externalIps != null ? this.externalIps.hashCode() : 0);
            result = 31 * result + (this.externalName != null ? this.externalName.hashCode() : 0);
            result = 31 * result + (this.externalTrafficPolicy != null ? this.externalTrafficPolicy.hashCode() : 0);
            result = 31 * result + (this.healthCheckNodePort != null ? this.healthCheckNodePort.hashCode() : 0);
            result = 31 * result + (this.internalTrafficPolicy != null ? this.internalTrafficPolicy.hashCode() : 0);
            result = 31 * result + (this.ipFamilies != null ? this.ipFamilies.hashCode() : 0);
            result = 31 * result + (this.ipFamilyPolicy != null ? this.ipFamilyPolicy.hashCode() : 0);
            result = 31 * result + (this.loadBalancerClass != null ? this.loadBalancerClass.hashCode() : 0);
            result = 31 * result + (this.loadBalancerIp != null ? this.loadBalancerIp.hashCode() : 0);
            result = 31 * result + (this.loadBalancerSourceRanges != null ? this.loadBalancerSourceRanges.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.publishNotReadyAddresses != null ? this.publishNotReadyAddresses.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.sessionAffinity != null ? this.sessionAffinity.hashCode() : 0);
            result = 31 * result + (this.sessionAffinityConfig != null ? this.sessionAffinityConfig.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
