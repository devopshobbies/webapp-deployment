package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.154Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CsiDriverV1SpecOutputReference")
public class CsiDriverV1SpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CsiDriverV1SpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CsiDriverV1SpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CsiDriverV1SpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetPodInfoOnMount() {
        software.amazon.jsii.Kernel.call(this, "resetPodInfoOnMount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeLifecycleModes() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeLifecycleModes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAttachRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "attachRequiredInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPodInfoOnMountInput() {
        return software.amazon.jsii.Kernel.get(this, "podInfoOnMountInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumeLifecycleModesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "volumeLifecycleModesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAttachRequired() {
        return software.amazon.jsii.Kernel.get(this, "attachRequired", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAttachRequired(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachRequired", java.util.Objects.requireNonNull(value, "attachRequired is required"));
    }

    public void setAttachRequired(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "attachRequired", java.util.Objects.requireNonNull(value, "attachRequired is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPodInfoOnMount() {
        return software.amazon.jsii.Kernel.get(this, "podInfoOnMount", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPodInfoOnMount(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "podInfoOnMount", java.util.Objects.requireNonNull(value, "podInfoOnMount is required"));
    }

    public void setPodInfoOnMount(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "podInfoOnMount", java.util.Objects.requireNonNull(value, "podInfoOnMount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVolumeLifecycleModes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "volumeLifecycleModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVolumeLifecycleModes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "volumeLifecycleModes", java.util.Objects.requireNonNull(value, "volumeLifecycleModes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CsiDriverV1Spec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CsiDriverV1Spec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CsiDriverV1Spec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
