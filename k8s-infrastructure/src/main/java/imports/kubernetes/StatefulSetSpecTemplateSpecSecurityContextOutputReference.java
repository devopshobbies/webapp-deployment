package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.016Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecSecurityContextOutputReference")
public class StatefulSetSpecTemplateSpecSecurityContextOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetSpecTemplateSpecSecurityContextOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetSpecTemplateSpecSecurityContextOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetSpecTemplateSpecSecurityContextOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSeccompProfile(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeccompProfile value) {
        software.amazon.jsii.Kernel.call(this, "putSeccompProfile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSeLinuxOptions(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions value) {
        software.amazon.jsii.Kernel.call(this, "putSeLinuxOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSysctl(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSysctl", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFsGroup() {
        software.amazon.jsii.Kernel.call(this, "resetFsGroup", software.amazon.jsii.NativeType.VOID);
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

    public void resetSupplementalGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSupplementalGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSysctl() {
        software.amazon.jsii.Kernel.call(this, "resetSysctl", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeccompProfileOutputReference getSeccompProfile() {
        return software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeccompProfileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptionsOutputReference getSeLinuxOptions() {
        return software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSysctlList getSysctl() {
        return software.amazon.jsii.Kernel.get(this, "sysctl", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSysctlList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFsGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "fsGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeccompProfile getSeccompProfileInput() {
        return software.amazon.jsii.Kernel.get(this, "seccompProfileInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeccompProfile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "seLinuxOptionsInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getSupplementalGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "supplementalGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSysctlInput() {
        return software.amazon.jsii.Kernel.get(this, "sysctlInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFsGroup() {
        return software.amazon.jsii.Kernel.get(this, "fsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFsGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fsGroup", java.util.Objects.requireNonNull(value, "fsGroup is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getSupplementalGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supplementalGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setSupplementalGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "supplementalGroups", java.util.Objects.requireNonNull(value, "supplementalGroups is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContext getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContext.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecSecurityContext value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
