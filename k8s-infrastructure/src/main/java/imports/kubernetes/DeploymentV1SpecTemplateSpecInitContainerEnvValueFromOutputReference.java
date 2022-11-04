package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.782Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromOutputReference")
public class DeploymentV1SpecTemplateSpecInitContainerEnvValueFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentV1SpecTemplateSpecInitContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentV1SpecTemplateSpecInitContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentV1SpecTemplateSpecInitContainerEnvValueFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConfigMapKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMapKeyRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResourceFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromResourceFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putResourceFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecretKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromSecretKeyRef value) {
        software.amazon.jsii.Kernel.call(this, "putSecretKeyRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConfigMapKeyRef() {
        software.amazon.jsii.Kernel.call(this, "resetConfigMapKeyRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFieldRef() {
        software.amazon.jsii.Kernel.call(this, "resetFieldRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceFieldRef() {
        software.amazon.jsii.Kernel.call(this, "resetResourceFieldRef", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretKeyRef() {
        software.amazon.jsii.Kernel.call(this, "resetSecretKeyRef", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRefOutputReference getConfigMapKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromFieldRefOutputReference getFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromResourceFieldRefOutputReference getResourceFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromResourceFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromSecretKeyRefOutputReference getSecretKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromSecretKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromFieldRef getFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromResourceFieldRef getResourceFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromResourceFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromSecretKeyRef getSecretKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFromSecretKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFrom getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFrom.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentV1SpecTemplateSpecInitContainerEnvValueFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
