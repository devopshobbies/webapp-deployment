package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.307Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRefOutputReference")
public class DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRefOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRefOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRefOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRefOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetApiVersion() {
        software.amazon.jsii.Kernel.call(this, "resetApiVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFieldPath() {
        software.amazon.jsii.Kernel.call(this, "resetFieldPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApiVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "apiVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFieldPathInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiVersion() {
        return software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiVersion", java.util.Objects.requireNonNull(value, "apiVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFieldPath() {
        return software.amazon.jsii.Kernel.get(this, "fieldPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFieldPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fieldPath", java.util.Objects.requireNonNull(value, "fieldPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRef getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRef.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecTemplateSpecContainerEnvValueFromFieldRef value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
