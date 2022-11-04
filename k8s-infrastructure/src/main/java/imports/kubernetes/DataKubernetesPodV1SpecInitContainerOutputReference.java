package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.548Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodV1SpecInitContainerOutputReference")
public class DataKubernetesPodV1SpecInitContainerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodV1SpecInitContainerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodV1SpecInitContainerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodV1SpecInitContainerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getArgs() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCommand() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerEnvList getEnv() {
        return software.amazon.jsii.Kernel.get(this, "env", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerEnvList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerEnvFromList getEnvFrom() {
        return software.amazon.jsii.Kernel.get(this, "envFrom", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerEnvFromList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImage() {
        return software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImagePullPolicy() {
        return software.amazon.jsii.Kernel.get(this, "imagePullPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerLifecycleList getLifecycle() {
        return software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerLifecycleList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerLivenessProbeList getLivenessProbe() {
        return software.amazon.jsii.Kernel.get(this, "livenessProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerLivenessProbeList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerPortList getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerPortList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeList getReadinessProbe() {
        return software.amazon.jsii.Kernel.get(this, "readinessProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerResourcesList getResources() {
        return software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerResourcesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerSecurityContextList getSecurityContext() {
        return software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerSecurityContextList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerStartupProbeList getStartupProbe() {
        return software.amazon.jsii.Kernel.get(this, "startupProbe", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerStartupProbeList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getStdin() {
        return software.amazon.jsii.Kernel.get(this, "stdin", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getStdinOnce() {
        return software.amazon.jsii.Kernel.get(this, "stdinOnce", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTerminationMessagePath() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTerminationMessagePolicy() {
        return software.amazon.jsii.Kernel.get(this, "terminationMessagePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getTty() {
        return software.amazon.jsii.Kernel.get(this, "tty", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerVolumeMountList getVolumeMount() {
        return software.amazon.jsii.Kernel.get(this, "volumeMount", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerVolumeMountList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkingDir() {
        return software.amazon.jsii.Kernel.get(this, "workingDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecInitContainer getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainer.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecInitContainer value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
