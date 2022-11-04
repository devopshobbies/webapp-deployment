package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.653Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeOutputReference")
public class DeploymentSpecTemplateSpecContainerStartupProbeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentSpecTemplateSpecContainerStartupProbeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentSpecTemplateSpecContainerStartupProbeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentSpecTemplateSpecContainerStartupProbeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putExec(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeExec value) {
        software.amazon.jsii.Kernel.call(this, "putExec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpGet(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeHttpGet value) {
        software.amazon.jsii.Kernel.call(this, "putHttpGet", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTcpSocket(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTcpSocket", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExec() {
        software.amazon.jsii.Kernel.call(this, "resetExec", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailureThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetFailureThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpGet() {
        software.amazon.jsii.Kernel.call(this, "resetHttpGet", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitialDelaySeconds() {
        software.amazon.jsii.Kernel.call(this, "resetInitialDelaySeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeriodSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetPeriodSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuccessThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetSuccessThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTcpSocket() {
        software.amazon.jsii.Kernel.call(this, "resetTcpSocket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeExecOutputReference getExec() {
        return software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeExecOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeHttpGetOutputReference getHttpGet() {
        return software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeHttpGetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeTcpSocketList getTcpSocket() {
        return software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeTcpSocketList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeExec getExecInput() {
        return software.amazon.jsii.Kernel.get(this, "execInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeExec.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFailureThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "failureThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeHttpGet getHttpGetInput() {
        return software.amazon.jsii.Kernel.get(this, "httpGetInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbeHttpGet.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInitialDelaySecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "initialDelaySecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPeriodSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "periodSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSuccessThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "successThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTcpSocketInput() {
        return software.amazon.jsii.Kernel.get(this, "tcpSocketInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailureThreshold() {
        return software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFailureThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "failureThreshold", java.util.Objects.requireNonNull(value, "failureThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInitialDelaySeconds() {
        return software.amazon.jsii.Kernel.get(this, "initialDelaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInitialDelaySeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "initialDelaySeconds", java.util.Objects.requireNonNull(value, "initialDelaySeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "periodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPeriodSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "periodSeconds", java.util.Objects.requireNonNull(value, "periodSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSuccessThreshold() {
        return software.amazon.jsii.Kernel.get(this, "successThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSuccessThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "successThreshold", java.util.Objects.requireNonNull(value, "successThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutSeconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeoutSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeoutSeconds", java.util.Objects.requireNonNull(value, "timeoutSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbe getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbe.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecContainerStartupProbe value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
