package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.736Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecStrategyRollingUpdateOutputReference")
public class DeploymentV1SpecStrategyRollingUpdateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentV1SpecStrategyRollingUpdateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentV1SpecStrategyRollingUpdateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentV1SpecStrategyRollingUpdateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMaxSurge() {
        software.amazon.jsii.Kernel.call(this, "resetMaxSurge", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxUnavailable() {
        software.amazon.jsii.Kernel.call(this, "resetMaxUnavailable", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxSurgeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxSurgeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxUnavailableInput() {
        return software.amazon.jsii.Kernel.get(this, "maxUnavailableInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxSurge() {
        return software.amazon.jsii.Kernel.get(this, "maxSurge", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxSurge(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxSurge", java.util.Objects.requireNonNull(value, "maxSurge is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxUnavailable() {
        return software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxUnavailable(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxUnavailable", java.util.Objects.requireNonNull(value, "maxUnavailable is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecStrategyRollingUpdate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecStrategyRollingUpdate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecStrategyRollingUpdate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
