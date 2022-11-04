package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.961Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartOutputReference")
public class JobSpecTemplateSpecContainerLifecyclePostStartOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobSpecTemplateSpecContainerLifecyclePostStartOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobSpecTemplateSpecContainerLifecyclePostStartOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public JobSpecTemplateSpecContainerLifecyclePostStartOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putExec(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartExec value) {
        software.amazon.jsii.Kernel.call(this, "putExec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpGet(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartHttpGet value) {
        software.amazon.jsii.Kernel.call(this, "putHttpGet", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTcpSocket(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTcpSocket", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExec() {
        software.amazon.jsii.Kernel.call(this, "resetExec", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpGet() {
        software.amazon.jsii.Kernel.call(this, "resetHttpGet", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTcpSocket() {
        software.amazon.jsii.Kernel.call(this, "resetTcpSocket", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartExecOutputReference getExec() {
        return software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartExecOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartHttpGetOutputReference getHttpGet() {
        return software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartHttpGetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartTcpSocketList getTcpSocket() {
        return software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartTcpSocketList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartExec getExecInput() {
        return software.amazon.jsii.Kernel.get(this, "execInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartExec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartHttpGet getHttpGetInput() {
        return software.amazon.jsii.Kernel.get(this, "httpGetInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartHttpGet.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTcpSocketInput() {
        return software.amazon.jsii.Kernel.get(this, "tcpSocketInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStart value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
