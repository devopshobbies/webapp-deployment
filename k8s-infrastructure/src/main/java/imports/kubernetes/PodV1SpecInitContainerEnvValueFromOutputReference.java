package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.550Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecInitContainerEnvValueFromOutputReference")
public class PodV1SpecInitContainerEnvValueFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodV1SpecInitContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodV1SpecInitContainerEnvValueFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodV1SpecInitContainerEnvValueFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConfigMapKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromConfigMapKeyRef value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMapKeyRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResourceFieldRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromResourceFieldRef value) {
        software.amazon.jsii.Kernel.call(this, "putResourceFieldRef", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecretKeyRef(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromSecretKeyRef value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromConfigMapKeyRefOutputReference getConfigMapKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromConfigMapKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromFieldRefOutputReference getFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromResourceFieldRefOutputReference getResourceFieldRef() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromResourceFieldRefOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecInitContainerEnvValueFromSecretKeyRefOutputReference getSecretKeyRef() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromSecretKeyRefOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFromConfigMapKeyRef getConfigMapKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromConfigMapKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFromFieldRef getFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFromResourceFieldRef getResourceFieldRefInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceFieldRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromResourceFieldRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFromSecretKeyRef getSecretKeyRefInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyRefInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFromSecretKeyRef.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFrom getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecInitContainerEnvValueFrom.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecInitContainerEnvValueFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
