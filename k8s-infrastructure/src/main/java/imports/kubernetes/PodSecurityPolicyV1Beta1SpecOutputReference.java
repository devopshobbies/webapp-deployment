package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.307Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecOutputReference")
public class PodSecurityPolicyV1Beta1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodSecurityPolicyV1Beta1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodSecurityPolicyV1Beta1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodSecurityPolicyV1Beta1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAllowedFlexVolumes(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAllowedFlexVolumes", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAllowedHostPaths(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAllowedHostPaths", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFsGroup(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecFsGroup value) {
        software.amazon.jsii.Kernel.call(this, "putFsGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHostPorts(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putHostPorts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRunAsGroup(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsGroup value) {
        software.amazon.jsii.Kernel.call(this, "putRunAsGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRunAsUser(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsUser value) {
        software.amazon.jsii.Kernel.call(this, "putRunAsUser", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSeLinux(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinux value) {
        software.amazon.jsii.Kernel.call(this, "putSeLinux", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSupplementalGroups(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecSupplementalGroups value) {
        software.amazon.jsii.Kernel.call(this, "putSupplementalGroups", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowedCapabilities() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedCapabilities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedFlexVolumes() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedFlexVolumes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedHostPaths() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedHostPaths", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedProcMountTypes() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedProcMountTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedUnsafeSysctls() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedUnsafeSysctls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowPrivilegeEscalation() {
        software.amazon.jsii.Kernel.call(this, "resetAllowPrivilegeEscalation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultAddCapabilities() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultAddCapabilities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultAllowPrivilegeEscalation() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultAllowPrivilegeEscalation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForbiddenSysctls() {
        software.amazon.jsii.Kernel.call(this, "resetForbiddenSysctls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostIpc() {
        software.amazon.jsii.Kernel.call(this, "resetHostIpc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostNetwork() {
        software.amazon.jsii.Kernel.call(this, "resetHostNetwork", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostPid() {
        software.amazon.jsii.Kernel.call(this, "resetHostPid", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostPorts() {
        software.amazon.jsii.Kernel.call(this, "resetHostPorts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivileged() {
        software.amazon.jsii.Kernel.call(this, "resetPrivileged", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnlyRootFilesystem() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnlyRootFilesystem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequiredDropCapabilities() {
        software.amazon.jsii.Kernel.call(this, "resetRequiredDropCapabilities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunAsGroup() {
        software.amazon.jsii.Kernel.call(this, "resetRunAsGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSeLinux() {
        software.amazon.jsii.Kernel.call(this, "resetSeLinux", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumes() {
        software.amazon.jsii.Kernel.call(this, "resetVolumes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecAllowedFlexVolumesList getAllowedFlexVolumes() {
        return software.amazon.jsii.Kernel.get(this, "allowedFlexVolumes", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecAllowedFlexVolumesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPathsList getAllowedHostPaths() {
        return software.amazon.jsii.Kernel.get(this, "allowedHostPaths", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecAllowedHostPathsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecFsGroupOutputReference getFsGroup() {
        return software.amazon.jsii.Kernel.get(this, "fsGroup", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecFsGroupOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecHostPortsList getHostPorts() {
        return software.amazon.jsii.Kernel.get(this, "hostPorts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecHostPortsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsGroupOutputReference getRunAsGroup() {
        return software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsGroupOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsUserOutputReference getRunAsUser() {
        return software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsUserOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinuxOutputReference getSeLinux() {
        return software.amazon.jsii.Kernel.get(this, "seLinux", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinuxOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicyV1Beta1SpecSupplementalGroupsOutputReference getSupplementalGroups() {
        return software.amazon.jsii.Kernel.get(this, "supplementalGroups", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecSupplementalGroupsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedCapabilitiesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedCapabilitiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowedFlexVolumesInput() {
        return software.amazon.jsii.Kernel.get(this, "allowedFlexVolumesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowedHostPathsInput() {
        return software.amazon.jsii.Kernel.get(this, "allowedHostPathsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedProcMountTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedProcMountTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedUnsafeSysctlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedUnsafeSysctlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowPrivilegeEscalationInput() {
        return software.amazon.jsii.Kernel.get(this, "allowPrivilegeEscalationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDefaultAddCapabilitiesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "defaultAddCapabilitiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDefaultAllowPrivilegeEscalationInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultAllowPrivilegeEscalationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenSysctlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "forbiddenSysctlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecFsGroup getFsGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "fsGroupInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecFsGroup.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostIpcInput() {
        return software.amazon.jsii.Kernel.get(this, "hostIpcInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostNetworkInput() {
        return software.amazon.jsii.Kernel.get(this, "hostNetworkInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostPidInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPidInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHostPortsInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPortsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPrivilegedInput() {
        return software.amazon.jsii.Kernel.get(this, "privilegedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyRootFilesystemInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyRootFilesystemInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequiredDropCapabilitiesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "requiredDropCapabilitiesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsGroup getRunAsGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "runAsGroupInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsGroup.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsUser getRunAsUserInput() {
        return software.amazon.jsii.Kernel.get(this, "runAsUserInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecRunAsUser.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinux getSeLinuxInput() {
        return software.amazon.jsii.Kernel.get(this, "seLinuxInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecSeLinux.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1SpecSupplementalGroups getSupplementalGroupsInput() {
        return software.amazon.jsii.Kernel.get(this, "supplementalGroupsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1SpecSupplementalGroups.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "volumesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedCapabilities() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedCapabilities(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedCapabilities", java.util.Objects.requireNonNull(value, "allowedCapabilities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedProcMountTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedProcMountTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedProcMountTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedProcMountTypes", java.util.Objects.requireNonNull(value, "allowedProcMountTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedUnsafeSysctls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedUnsafeSysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedUnsafeSysctls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedUnsafeSysctls", java.util.Objects.requireNonNull(value, "allowedUnsafeSysctls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowPrivilegeEscalation() {
        return software.amazon.jsii.Kernel.get(this, "allowPrivilegeEscalation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowPrivilegeEscalation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowPrivilegeEscalation", java.util.Objects.requireNonNull(value, "allowPrivilegeEscalation is required"));
    }

    public void setAllowPrivilegeEscalation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowPrivilegeEscalation", java.util.Objects.requireNonNull(value, "allowPrivilegeEscalation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDefaultAddCapabilities() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "defaultAddCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDefaultAddCapabilities(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "defaultAddCapabilities", java.util.Objects.requireNonNull(value, "defaultAddCapabilities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDefaultAllowPrivilegeEscalation() {
        return software.amazon.jsii.Kernel.get(this, "defaultAllowPrivilegeEscalation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDefaultAllowPrivilegeEscalation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "defaultAllowPrivilegeEscalation", java.util.Objects.requireNonNull(value, "defaultAllowPrivilegeEscalation is required"));
    }

    public void setDefaultAllowPrivilegeEscalation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "defaultAllowPrivilegeEscalation", java.util.Objects.requireNonNull(value, "defaultAllowPrivilegeEscalation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getForbiddenSysctls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "forbiddenSysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setForbiddenSysctls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "forbiddenSysctls", java.util.Objects.requireNonNull(value, "forbiddenSysctls is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getPrivileged() {
        return software.amazon.jsii.Kernel.get(this, "privileged", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPrivileged(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "privileged", java.util.Objects.requireNonNull(value, "privileged is required"));
    }

    public void setPrivileged(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "privileged", java.util.Objects.requireNonNull(value, "privileged is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReadOnlyRootFilesystem() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyRootFilesystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReadOnlyRootFilesystem(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "readOnlyRootFilesystem", java.util.Objects.requireNonNull(value, "readOnlyRootFilesystem is required"));
    }

    public void setReadOnlyRootFilesystem(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "readOnlyRootFilesystem", java.util.Objects.requireNonNull(value, "readOnlyRootFilesystem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRequiredDropCapabilities() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "requiredDropCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRequiredDropCapabilities(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "requiredDropCapabilities", java.util.Objects.requireNonNull(value, "requiredDropCapabilities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVolumes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVolumes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "volumes", java.util.Objects.requireNonNull(value, "volumes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicyV1Beta1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicyV1Beta1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
