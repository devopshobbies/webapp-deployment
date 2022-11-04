package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.490Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodSpecOutputReference")
public class DataKubernetesPodSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getActiveDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecAffinityList getAffinity() {
        return software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecAffinityList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAutomountServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecContainerList getContainer() {
        return software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecDnsConfigList getDnsConfig() {
        return software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecDnsConfigList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "dnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnableServiceLinks() {
        return software.amazon.jsii.Kernel.get(this, "enableServiceLinks", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecHostAliasesList getHostAliases() {
        return software.amazon.jsii.Kernel.get(this, "hostAliases", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecHostAliasesList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getHostIpc() {
        return software.amazon.jsii.Kernel.get(this, "hostIpc", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostname() {
        return software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getHostNetwork() {
        return software.amazon.jsii.Kernel.get(this, "hostNetwork", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getHostPid() {
        return software.amazon.jsii.Kernel.get(this, "hostPid", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecImagePullSecretsList getImagePullSecrets() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecImagePullSecretsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecInitContainerList getInitContainer() {
        return software.amazon.jsii.Kernel.get(this, "initContainer", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecInitContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeName() {
        return software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getNodeSelector() {
        return software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPriorityClassName() {
        return software.amazon.jsii.Kernel.get(this, "priorityClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecReadinessGateList getReadinessGate() {
        return software.amazon.jsii.Kernel.get(this, "readinessGate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecReadinessGateList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestartPolicy() {
        return software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecSecurityContextList getSecurityContext() {
        return software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecSecurityContextList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccountName() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getShareProcessNamespace() {
        return software.amazon.jsii.Kernel.get(this, "shareProcessNamespace", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubdomain() {
        return software.amazon.jsii.Kernel.get(this, "subdomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTerminationGracePeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecTolerationList getToleration() {
        return software.amazon.jsii.Kernel.get(this, "toleration", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecTolerationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecTopologySpreadConstraintList getTopologySpreadConstraint() {
        return software.amazon.jsii.Kernel.get(this, "topologySpreadConstraint", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecTopologySpreadConstraintList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecVolumeList getVolume() {
        return software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecVolumeList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
