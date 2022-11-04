package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.070Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference")
public class JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetContainerName() {
        software.amazon.jsii.Kernel.call(this, "resetContainerName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDivisor() {
        software.amazon.jsii.Kernel.call(this, "resetDivisor", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContainerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "containerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDivisorInput() {
        return software.amazon.jsii.Kernel.get(this, "divisorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerName() {
        return software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContainerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "containerName", java.util.Objects.requireNonNull(value, "containerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDivisor() {
        return software.amazon.jsii.Kernel.get(this, "divisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDivisor(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "divisor", java.util.Objects.requireNonNull(value, "divisor is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResource() {
        return software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resource", java.util.Objects.requireNonNull(value, "resource is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
