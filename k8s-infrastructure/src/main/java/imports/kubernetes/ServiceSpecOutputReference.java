package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.911Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceSpecOutputReference")
public class ServiceSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ServiceSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ServiceSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPort(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPort", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSessionAffinityConfig(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecSessionAffinityConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSessionAffinityConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllocateLoadBalancerNodePorts() {
        software.amazon.jsii.Kernel.call(this, "resetAllocateLoadBalancerNodePorts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterIp() {
        software.amazon.jsii.Kernel.call(this, "resetClusterIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterIps() {
        software.amazon.jsii.Kernel.call(this, "resetClusterIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExternalIps() {
        software.amazon.jsii.Kernel.call(this, "resetExternalIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExternalName() {
        software.amazon.jsii.Kernel.call(this, "resetExternalName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExternalTrafficPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetExternalTrafficPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckNodePort() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckNodePort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInternalTrafficPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetInternalTrafficPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpFamilies() {
        software.amazon.jsii.Kernel.call(this, "resetIpFamilies", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpFamilyPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetIpFamilyPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerClass() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerIp() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerIp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerSourceRanges() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerSourceRanges", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublishNotReadyAddresses() {
        software.amazon.jsii.Kernel.call(this, "resetPublishNotReadyAddresses", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelector() {
        software.amazon.jsii.Kernel.call(this, "resetSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSessionAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetSessionAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSessionAffinityConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSessionAffinityConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecPortList getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecPortList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecSessionAffinityConfigOutputReference getSessionAffinityConfig() {
        return software.amazon.jsii.Kernel.get(this, "sessionAffinityConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllocateLoadBalancerNodePortsInput() {
        return software.amazon.jsii.Kernel.get(this, "allocateLoadBalancerNodePortsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterIpInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterIpsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "clusterIpsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExternalIpsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "externalIpsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExternalNameInput() {
        return software.amazon.jsii.Kernel.get(this, "externalNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExternalTrafficPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "externalTrafficPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckNodePortInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckNodePortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInternalTrafficPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "internalTrafficPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpFamiliesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ipFamiliesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpFamilyPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "ipFamilyPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerClassInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerIpInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerIpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancerSourceRangesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "loadBalancerSourceRangesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPublishNotReadyAddressesInput() {
        return software.amazon.jsii.Kernel.get(this, "publishNotReadyAddressesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSelectorInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "selectorInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpecSessionAffinityConfig getSessionAffinityConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "sessionAffinityConfigInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSessionAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "sessionAffinityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllocateLoadBalancerNodePorts() {
        return software.amazon.jsii.Kernel.get(this, "allocateLoadBalancerNodePorts", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllocateLoadBalancerNodePorts(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allocateLoadBalancerNodePorts", java.util.Objects.requireNonNull(value, "allocateLoadBalancerNodePorts is required"));
    }

    public void setAllocateLoadBalancerNodePorts(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allocateLoadBalancerNodePorts", java.util.Objects.requireNonNull(value, "allocateLoadBalancerNodePorts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIp() {
        return software.amazon.jsii.Kernel.get(this, "clusterIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIp", java.util.Objects.requireNonNull(value, "clusterIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClusterIps() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clusterIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClusterIps(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "clusterIps", java.util.Objects.requireNonNull(value, "clusterIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExternalIps() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "externalIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExternalIps(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "externalIps", java.util.Objects.requireNonNull(value, "externalIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExternalName() {
        return software.amazon.jsii.Kernel.get(this, "externalName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExternalName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "externalName", java.util.Objects.requireNonNull(value, "externalName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExternalTrafficPolicy() {
        return software.amazon.jsii.Kernel.get(this, "externalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExternalTrafficPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "externalTrafficPolicy", java.util.Objects.requireNonNull(value, "externalTrafficPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckNodePort() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckNodePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckNodePort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckNodePort", java.util.Objects.requireNonNull(value, "healthCheckNodePort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInternalTrafficPolicy() {
        return software.amazon.jsii.Kernel.get(this, "internalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInternalTrafficPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "internalTrafficPolicy", java.util.Objects.requireNonNull(value, "internalTrafficPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIpFamilies() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ipFamilies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIpFamilies(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ipFamilies", java.util.Objects.requireNonNull(value, "ipFamilies is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpFamilyPolicy() {
        return software.amazon.jsii.Kernel.get(this, "ipFamilyPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpFamilyPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipFamilyPolicy", java.util.Objects.requireNonNull(value, "ipFamilyPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerClass() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerClass", java.util.Objects.requireNonNull(value, "loadBalancerClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerIp() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerIp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerIp", java.util.Objects.requireNonNull(value, "loadBalancerIp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "loadBalancerSourceRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLoadBalancerSourceRanges(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerSourceRanges", java.util.Objects.requireNonNull(value, "loadBalancerSourceRanges is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPublishNotReadyAddresses() {
        return software.amazon.jsii.Kernel.get(this, "publishNotReadyAddresses", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPublishNotReadyAddresses(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publishNotReadyAddresses", java.util.Objects.requireNonNull(value, "publishNotReadyAddresses is required"));
    }

    public void setPublishNotReadyAddresses(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "publishNotReadyAddresses", java.util.Objects.requireNonNull(value, "publishNotReadyAddresses is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getSelector() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSelector(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "selector", java.util.Objects.requireNonNull(value, "selector is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSessionAffinity() {
        return software.amazon.jsii.Kernel.get(this, "sessionAffinity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSessionAffinity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sessionAffinity", java.util.Objects.requireNonNull(value, "sessionAffinity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
