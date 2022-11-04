package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.552Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodV1SpecOutputReference")
public class DataKubernetesPodV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getActiveDeadlineSeconds() {
        return software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecAffinityList getAffinity() {
        return software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecAffinityList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAutomountServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecContainerList getContainer() {
        return software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecDnsConfigList getDnsConfig() {
        return software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecDnsConfigList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "dnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnableServiceLinks() {
        return software.amazon.jsii.Kernel.get(this, "enableServiceLinks", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecHostAliasesList getHostAliases() {
        return software.amazon.jsii.Kernel.get(this, "hostAliases", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecHostAliasesList.class));
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecImagePullSecretsList getImagePullSecrets() {
        return software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecImagePullSecretsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerList getInitContainer() {
        return software.amazon.jsii.Kernel.get(this, "initContainer", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerList.class));
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecReadinessGateList getReadinessGate() {
        return software.amazon.jsii.Kernel.get(this, "readinessGate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecReadinessGateList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestartPolicy() {
        return software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecSecurityContextList getSecurityContext() {
        return software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecSecurityContextList.class));
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecTolerationList getToleration() {
        return software.amazon.jsii.Kernel.get(this, "toleration", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecTolerationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecTopologySpreadConstraintList getTopologySpreadConstraint() {
        return software.amazon.jsii.Kernel.get(this, "topologySpreadConstraint", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecTopologySpreadConstraintList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecVolumeList getVolume() {
        return software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecVolumeList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
