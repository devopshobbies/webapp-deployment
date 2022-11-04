package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.960Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecContainerLifecycleOutputReference")
public class JobSpecTemplateSpecContainerLifecycleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobSpecTemplateSpecContainerLifecycleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobSpecTemplateSpecContainerLifecycleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobSpecTemplateSpecContainerLifecycleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPostStart(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPostStart", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPreStop(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPreStop", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPostStart() {
        software.amazon.jsii.Kernel.call(this, "resetPostStart", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreStop() {
        software.amazon.jsii.Kernel.call(this, "resetPreStop", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartList getPostStart() {
        return software.amazon.jsii.Kernel.get(this, "postStart", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePostStartList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePreStopList getPreStop() {
        return software.amazon.jsii.Kernel.get(this, "preStop", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecyclePreStopList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPostStartInput() {
        return software.amazon.jsii.Kernel.get(this, "postStartInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPreStopInput() {
        return software.amazon.jsii.Kernel.get(this, "preStopInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecContainerLifecycle getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecContainerLifecycle.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecContainerLifecycle value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
