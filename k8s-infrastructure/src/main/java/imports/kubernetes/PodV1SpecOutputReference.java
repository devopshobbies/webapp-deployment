package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.591Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecOutputReference")
public class PodV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putContainer(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putContainer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDnsConfig(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecDnsConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDnsConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostAliases(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putHostAliases", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putImagePullSecrets(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putImagePullSecrets", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInitContainer(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInitContainer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putReadinessGate(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putReadinessGate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecurityContext(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecSecurityContext value) {
        software.amazon.jsii.Kernel.call(this, "putSecurityContext", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putToleration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putToleration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTopologySpreadConstraint(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTopologySpreadConstraint", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVolume(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetActiveDeadlineSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetActiveDeadlineSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutomountServiceAccountToken() {
        software.amazon.jsii.Kernel.call(this, "resetAutomountServiceAccountToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContainer() {
        software.amazon.jsii.Kernel.call(this, "resetContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDnsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDnsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDnsPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetDnsPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableServiceLinks() {
        software.amazon.jsii.Kernel.call(this, "resetEnableServiceLinks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostAliases() {
        software.amazon.jsii.Kernel.call(this, "resetHostAliases", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostIpc() {
        software.amazon.jsii.Kernel.call(this, "resetHostIpc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostname() {
        software.amazon.jsii.Kernel.call(this, "resetHostname", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostNetwork() {
        software.amazon.jsii.Kernel.call(this, "resetHostNetwork", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostPid() {
        software.amazon.jsii.Kernel.call(this, "resetHostPid", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImagePullSecrets() {
        software.amazon.jsii.Kernel.call(this, "resetImagePullSecrets", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitContainer() {
        software.amazon.jsii.Kernel.call(this, "resetInitContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeName() {
        software.amazon.jsii.Kernel.call(this, "resetNodeName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeSelector() {
        software.amazon.jsii.Kernel.call(this, "resetNodeSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPriorityClassName() {
        software.amazon.jsii.Kernel.call(this, "resetPriorityClassName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadinessGate() {
        software.amazon.jsii.Kernel.call(this, "resetReadinessGate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestartPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetRestartPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityContext() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityContext", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccountName() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccountName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareProcessNamespace() {
        software.amazon.jsii.Kernel.call(this, "resetShareProcessNamespace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubdomain() {
        software.amazon.jsii.Kernel.call(this, "resetSubdomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationGracePeriodSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationGracePeriodSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetToleration() {
        software.amazon.jsii.Kernel.call(this, "resetToleration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopologySpreadConstraint() {
        software.amazon.jsii.Kernel.call(this, "resetTopologySpreadConstraint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolume() {
        software.amazon.jsii.Kernel.call(this, "resetVolume", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecAffinityOutputReference getAffinity() {
        return software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecContainerList getContainer() {
        return software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecDnsConfigOutputReference getDnsConfig() {
        return software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecDnsConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecHostAliasesList getHostAliases() {
        return software.amazon.jsii.Kernel.get(this, "hostAliases", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecHostAliasesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecImagePullSecretsList getImagePullSecrets() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecImagePullSecretsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerList getInitContainer() {
        return software.amazon.jsii.Kernel.get(this, "initContainer", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecReadinessGateList getReadinessGate() {
        return software.amazon.jsii.Kernel.get(this, "readinessGate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecReadinessGateList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecSecurityContextOutputReference getSecurityContext() {
        return software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecSecurityContextOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecTolerationList getToleration() {
        return software.amazon.jsii.Kernel.get(this, "toleration", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecTolerationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecTopologySpreadConstraintList getTopologySpreadConstraint() {
        return software.amazon.jsii.Kernel.get(this, "topologySpreadConstraint", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecTopologySpreadConstraintList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecVolumeList getVolume() {
        return software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecVolumeList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecAffinity getAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "affinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutomountServiceAccountTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getContainerInput() {
        return software.amazon.jsii.Kernel.get(this, "containerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecDnsConfig getDnsConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsConfigInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecDnsConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDnsPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableServiceLinksInput() {
        return software.amazon.jsii.Kernel.get(this, "enableServiceLinksInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostAliasesInput() {
        return software.amazon.jsii.Kernel.get(this, "hostAliasesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostIpcInput() {
        return software.amazon.jsii.Kernel.get(this, "hostIpcInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostnameInput() {
        return software.amazon.jsii.Kernel.get(this, "hostnameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostNetworkInput() {
        return software.amazon.jsii.Kernel.get(this, "hostNetworkInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostPidInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPidInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getImagePullSecretsInput() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecretsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInitContainerInput() {
        return software.amazon.jsii.Kernel.get(this, "initContainerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNodeNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getNodeSelectorInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "nodeSelectorInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPriorityClassNameInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityClassNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadinessGateInput() {
        return software.amazon.jsii.Kernel.get(this, "readinessGateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestartPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "restartPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecSecurityContext getSecurityContextInput() {
        return software.amazon.jsii.Kernel.get(this, "securityContextInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecSecurityContext.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getShareProcessNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "shareProcessNamespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubdomainInput() {
        return software.amazon.jsii.Kernel.get(this, "subdomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTerminationGracePeriodSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTolerationInput() {
        return software.amazon.jsii.Kernel.get(this, "tolerationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTopologySpreadConstraintInput() {
        return software.amazon.jsii.Kernel.get(this, "topologySpreadConstraintInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getActiveDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setActiveDeadlineSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "activeDeadlineSeconds", java.util.Objects.requireNonNull(value, "activeDeadlineSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutomountServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutomountServiceAccountToken(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "automountServiceAccountToken", java.util.Objects.requireNonNull(value, "automountServiceAccountToken is required"));
    }

    public void setAutomountServiceAccountToken(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "automountServiceAccountToken", java.util.Objects.requireNonNull(value, "automountServiceAccountToken is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "dnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDnsPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dnsPolicy", java.util.Objects.requireNonNull(value, "dnsPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableServiceLinks() {
        return software.amazon.jsii.Kernel.get(this, "enableServiceLinks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableServiceLinks(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableServiceLinks", java.util.Objects.requireNonNull(value, "enableServiceLinks is required"));
    }

    public void setEnableServiceLinks(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableServiceLinks", java.util.Objects.requireNonNull(value, "enableServiceLinks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getHostIpc() {
        return software.amazon.jsii.Kernel.get(this, "hostIpc", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setHostIpc(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hostIpc", java.util.Objects.requireNonNull(value, "hostIpc is required"));
    }

    public void setHostIpc(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "hostIpc", java.util.Objects.requireNonNull(value, "hostIpc is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostname() {
        return software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostname(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostname", java.util.Objects.requireNonNull(value, "hostname is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getHostNetwork() {
        return software.amazon.jsii.Kernel.get(this, "hostNetwork", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setHostNetwork(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hostNetwork", java.util.Objects.requireNonNull(value, "hostNetwork is required"));
    }

    public void setHostNetwork(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "hostNetwork", java.util.Objects.requireNonNull(value, "hostNetwork is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getHostPid() {
        return software.amazon.jsii.Kernel.get(this, "hostPid", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setHostPid(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hostPid", java.util.Objects.requireNonNull(value, "hostPid is required"));
    }

    public void setHostPid(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "hostPid", java.util.Objects.requireNonNull(value, "hostPid is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeName() {
        return software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeName", java.util.Objects.requireNonNull(value, "nodeName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setNodeSelector(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "nodeSelector", java.util.Objects.requireNonNull(value, "nodeSelector is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPriorityClassName() {
        return software.amazon.jsii.Kernel.get(this, "priorityClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPriorityClassName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "priorityClassName", java.util.Objects.requireNonNull(value, "priorityClassName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestartPolicy() {
        return software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestartPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restartPolicy", java.util.Objects.requireNonNull(value, "restartPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccountName() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceAccountName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceAccountName", java.util.Objects.requireNonNull(value, "serviceAccountName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getShareProcessNamespace() {
        return software.amazon.jsii.Kernel.get(this, "shareProcessNamespace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setShareProcessNamespace(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "shareProcessNamespace", java.util.Objects.requireNonNull(value, "shareProcessNamespace is required"));
    }

    public void setShareProcessNamespace(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "shareProcessNamespace", java.util.Objects.requireNonNull(value, "shareProcessNamespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubdomain() {
        return software.amazon.jsii.Kernel.get(this, "subdomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubdomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subdomain", java.util.Objects.requireNonNull(value, "subdomain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTerminationGracePeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTerminationGracePeriodSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "terminationGracePeriodSeconds", java.util.Objects.requireNonNull(value, "terminationGracePeriodSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
