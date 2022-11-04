package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.650Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextOutputReference")
public class DeploymentSpecTemplateSpecContainerSecurityContextOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentSpecTemplateSpecContainerSecurityContextOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentSpecTemplateSpecContainerSecurityContextOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentSpecTemplateSpecContainerSecurityContextOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCapabilities(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextCapabilities value) {
        software.amazon.jsii.Kernel.call(this, "putCapabilities", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSeccompProfile(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeccompProfile value) {
        software.amazon.jsii.Kernel.call(this, "putSeccompProfile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSeLinuxOptions(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeLinuxOptions value) {
        software.amazon.jsii.Kernel.call(this, "putSeLinuxOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowPrivilegeEscalation() {
        software.amazon.jsii.Kernel.call(this, "resetAllowPrivilegeEscalation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCapabilities() {
        software.amazon.jsii.Kernel.call(this, "resetCapabilities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivileged() {
        software.amazon.jsii.Kernel.call(this, "resetPrivileged", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadOnlyRootFilesystem() {
        software.amazon.jsii.Kernel.call(this, "resetReadOnlyRootFilesystem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunAsGroup() {
        software.amazon.jsii.Kernel.call(this, "resetRunAsGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunAsNonRoot() {
        software.amazon.jsii.Kernel.call(this, "resetRunAsNonRoot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunAsUser() {
        software.amazon.jsii.Kernel.call(this, "resetRunAsUser", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSeccompProfile() {
        software.amazon.jsii.Kernel.call(this, "resetSeccompProfile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSeLinuxOptions() {
        software.amazon.jsii.Kernel.call(this, "resetSeLinuxOptions", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextCapabilitiesOutputReference getCapabilities() {
        return software.amazon.jsii.Kernel.get(this, "capabilities", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextCapabilitiesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeccompProfileOutputReference getSeccompProfile() {
        return software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeccompProfileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeLinuxOptionsOutputReference getSeLinuxOptions() {
        return software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeLinuxOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowPrivilegeEscalationInput() {
        return software.amazon.jsii.Kernel.get(this, "allowPrivilegeEscalationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextCapabilities getCapabilitiesInput() {
        return software.amazon.jsii.Kernel.get(this, "capabilitiesInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextCapabilities.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPrivilegedInput() {
        return software.amazon.jsii.Kernel.get(this, "privilegedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyRootFilesystemInput() {
        return software.amazon.jsii.Kernel.get(this, "readOnlyRootFilesystemInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRunAsGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "runAsGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRunAsNonRootInput() {
        return software.amazon.jsii.Kernel.get(this, "runAsNonRootInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRunAsUserInput() {
        return software.amazon.jsii.Kernel.get(this, "runAsUserInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeccompProfile getSeccompProfileInput() {
        return software.amazon.jsii.Kernel.get(this, "seccompProfileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeccompProfile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeLinuxOptions getSeLinuxOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "seLinuxOptionsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContextSeLinuxOptions.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRunAsGroup() {
        return software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRunAsGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "runAsGroup", java.util.Objects.requireNonNull(value, "runAsGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRunAsNonRoot() {
        return software.amazon.jsii.Kernel.get(this, "runAsNonRoot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRunAsNonRoot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "runAsNonRoot", java.util.Objects.requireNonNull(value, "runAsNonRoot is required"));
    }

    public void setRunAsNonRoot(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "runAsNonRoot", java.util.Objects.requireNonNull(value, "runAsNonRoot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRunAsUser() {
        return software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRunAsUser(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "runAsUser", java.util.Objects.requireNonNull(value, "runAsUser is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContext getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContext.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerSecurityContext value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
