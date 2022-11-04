package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.187Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromOutputReference")
public class DaemonSetV1SpecTemplateSpecContainerEnvValueFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DaemonSetV1SpecTemplateSpecContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DaemonSetV1SpecTemplateSpecContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DaemonSetV1SpecTemplateSpecContainerEnvValueFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConfigMapKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromConfigMapKeyRef value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMapKeyRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResourceFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putResourceFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecretKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromSecretKeyRef value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromConfigMapKeyRefOutputReference getConfigMapKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromConfigMapKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromFieldRefOutputReference getFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference getResourceFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromResourceFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromSecretKeyRefOutputReference getSecretKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromSecretKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromConfigMapKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromFieldRef getFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef getResourceFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromResourceFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromSecretKeyRef getSecretKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFromSecretKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFrom getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFrom.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecTemplateSpecContainerEnvValueFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
