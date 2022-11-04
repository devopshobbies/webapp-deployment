package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.605Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecStrategyOutputReference")
public class DeploymentSpecStrategyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentSpecStrategyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentSpecStrategyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentSpecStrategyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRollingUpdate(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecStrategyRollingUpdate value) {
        software.amazon.jsii.Kernel.call(this, "putRollingUpdate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRollingUpdate() {
        software.amazon.jsii.Kernel.call(this, "resetRollingUpdate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecStrategyRollingUpdateOutputReference getRollingUpdate() {
        return software.amazon.jsii.Kernel.get(this, "rollingUpdate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecStrategyRollingUpdateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecStrategyRollingUpdate getRollingUpdateInput() {
        return software.amazon.jsii.Kernel.get(this, "rollingUpdateInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecStrategyRollingUpdate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecStrategy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecStrategy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecStrategy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
