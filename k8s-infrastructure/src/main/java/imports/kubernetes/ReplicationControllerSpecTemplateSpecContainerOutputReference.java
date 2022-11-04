package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.687Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecContainerOutputReference")
public class ReplicationControllerSpecTemplateSpecContainerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ReplicationControllerSpecTemplateSpecContainerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ReplicationControllerSpecTemplateSpecContainerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public ReplicationControllerSpecTemplateSpecContainerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putEnv(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEnv", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEnvFrom(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEnvFrom", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLifecycle(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLifecycle value) {
        software.amazon.jsii.Kernel.call(this, "putLifecycle", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLivenessProbe(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLivenessProbe value) {
        software.amazon.jsii.Kernel.call(this, "putLivenessProbe", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPort(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPort", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putReadinessProbe(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerReadinessProbe value) {
        software.amazon.jsii.Kernel.call(this, "putReadinessProbe", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResources(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerResources value) {
        software.amazon.jsii.Kernel.call(this, "putResources", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecurityContext(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerSecurityContext value) {
        software.amazon.jsii.Kernel.call(this, "putSecurityContext", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStartupProbe(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerStartupProbe value) {
        software.amazon.jsii.Kernel.call(this, "putStartupProbe", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVolumeMount(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putVolumeMount", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetArgs() {
        software.amazon.jsii.Kernel.call(this, "resetArgs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCommand() {
        software.amazon.jsii.Kernel.call(this, "resetCommand", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnv() {
        software.amazon.jsii.Kernel.call(this, "resetEnv", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnvFrom() {
        software.amazon.jsii.Kernel.call(this, "resetEnvFrom", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImage() {
        software.amazon.jsii.Kernel.call(this, "resetImage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImagePullPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetImagePullPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLifecycle() {
        software.amazon.jsii.Kernel.call(this, "resetLifecycle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLivenessProbe() {
        software.amazon.jsii.Kernel.call(this, "resetLivenessProbe", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadinessProbe() {
        software.amazon.jsii.Kernel.call(this, "resetReadinessProbe", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResources() {
        software.amazon.jsii.Kernel.call(this, "resetResources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityContext() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityContext", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartupProbe() {
        software.amazon.jsii.Kernel.call(this, "resetStartupProbe", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStdin() {
        software.amazon.jsii.Kernel.call(this, "resetStdin", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStdinOnce() {
        software.amazon.jsii.Kernel.call(this, "resetStdinOnce", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationMessagePath() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationMessagePath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationMessagePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationMessagePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTty() {
        software.amazon.jsii.Kernel.call(this, "resetTty", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeMount() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeMount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkingDir() {
        software.amazon.jsii.Kernel.call(this, "resetWorkingDir", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvList getEnv() {
        return software.amazon.jsii.Kernel.get(this, "env", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvFromList getEnvFrom() {
        return software.amazon.jsii.Kernel.get(this, "envFrom", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvFromList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLifecycleOutputReference getLifecycle() {
        return software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLifecycleOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLivenessProbeOutputReference getLivenessProbe() {
        return software.amazon.jsii.Kernel.get(this, "livenessProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLivenessProbeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerPortList getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerPortList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerReadinessProbeOutputReference getReadinessProbe() {
        return software.amazon.jsii.Kernel.get(this, "readinessProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerReadinessProbeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerResourcesOutputReference getResources() {
        return software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerResourcesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerSecurityContextOutputReference getSecurityContext() {
        return software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerSecurityContextOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerStartupProbeOutputReference getStartupProbe() {
        return software.amazon.jsii.Kernel.get(this, "startupProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerStartupProbeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerVolumeMountList getVolumeMount() {
        return software.amazon.jsii.Kernel.get(this, "volumeMount", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerVolumeMountList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArgsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "argsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCommandInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "commandInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnvFromInput() {
        return software.amazon.jsii.Kernel.get(this, "envFromInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnvInput() {
        return software.amazon.jsii.Kernel.get(this, "envInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageInput() {
        return software.amazon.jsii.Kernel.get(this, "imageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImagePullPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "imagePullPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLifecycle getLifecycleInput() {
        return software.amazon.jsii.Kernel.get(this, "lifecycleInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLifecycle.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLivenessProbe getLivenessProbeInput() {
        return software.amazon.jsii.Kernel.get(this, "livenessProbeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerLivenessProbe.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerReadinessProbe getReadinessProbeInput() {
        return software.amazon.jsii.Kernel.get(this, "readinessProbeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerReadinessProbe.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerResources getResourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "resourcesInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerResources.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerSecurityContext getSecurityContextInput() {
        return software.amazon.jsii.Kernel.get(this, "securityContextInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerSecurityContext.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerStartupProbe getStartupProbeInput() {
        return software.amazon.jsii.Kernel.get(this, "startupProbeInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerStartupProbe.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStdinInput() {
        return software.amazon.jsii.Kernel.get(this, "stdinInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStdinOnceInput() {
        return software.amazon.jsii.Kernel.get(this, "stdinOnceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTerminationMessagePathInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTerminationMessagePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTtyInput() {
        return software.amazon.jsii.Kernel.get(this, "ttyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVolumeMountInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeMountInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkingDirInput() {
        return software.amazon.jsii.Kernel.get(this, "workingDirInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getArgs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setArgs(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "args", java.util.Objects.requireNonNull(value, "args is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCommand() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCommand(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "command", java.util.Objects.requireNonNull(value, "command is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImage() {
        return software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "image", java.util.Objects.requireNonNull(value, "image is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImagePullPolicy() {
        return software.amazon.jsii.Kernel.get(this, "imagePullPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImagePullPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imagePullPolicy", java.util.Objects.requireNonNull(value, "imagePullPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStdin() {
        return software.amazon.jsii.Kernel.get(this, "stdin", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStdin(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "stdin", java.util.Objects.requireNonNull(value, "stdin is required"));
    }

    public void setStdin(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "stdin", java.util.Objects.requireNonNull(value, "stdin is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStdinOnce() {
        return software.amazon.jsii.Kernel.get(this, "stdinOnce", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStdinOnce(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "stdinOnce", java.util.Objects.requireNonNull(value, "stdinOnce is required"));
    }

    public void setStdinOnce(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "stdinOnce", java.util.Objects.requireNonNull(value, "stdinOnce is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTerminationMessagePath() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTerminationMessagePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "terminationMessagePath", java.util.Objects.requireNonNull(value, "terminationMessagePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTerminationMessagePolicy() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTerminationMessagePolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "terminationMessagePolicy", java.util.Objects.requireNonNull(value, "terminationMessagePolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getTty() {
        return software.amazon.jsii.Kernel.get(this, "tty", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setTty(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "tty", java.util.Objects.requireNonNull(value, "tty is required"));
    }

    public void setTty(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "tty", java.util.Objects.requireNonNull(value, "tty is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkingDir() {
        return software.amazon.jsii.Kernel.get(this, "workingDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkingDir(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workingDir", java.util.Objects.requireNonNull(value, "workingDir is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerSpecTemplateSpecContainer value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
