package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.549Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeOutputReference")
public class DataKubernetesPodV1SpecInitContainerReadinessProbeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodV1SpecInitContainerReadinessProbeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodV1SpecInitContainerReadinessProbeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodV1SpecInitContainerReadinessProbeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeExecList getExec() {
        return software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeExecList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailureThreshold() {
        return software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeHttpGetList getHttpGet() {
        return software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeHttpGetList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInitialDelaySeconds() {
        return software.amazon.jsii.Kernel.get(this, "initialDelaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "periodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSuccessThreshold() {
        return software.amazon.jsii.Kernel.get(this, "successThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeTcpSocketList getTcpSocket() {
        return software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbeTcpSocketList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutSeconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbe getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbe.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodV1SpecInitContainerReadinessProbe value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
