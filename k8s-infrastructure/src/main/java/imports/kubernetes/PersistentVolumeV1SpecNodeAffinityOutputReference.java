package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.265Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecNodeAffinityOutputReference")
public class PersistentVolumeV1SpecNodeAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PersistentVolumeV1SpecNodeAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolumeV1SpecNodeAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PersistentVolumeV1SpecNodeAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRequired(final @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired value) {
        software.amazon.jsii.Kernel.call(this, "putRequired", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRequired() {
        software.amazon.jsii.Kernel.call(this, "resetRequired", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredOutputReference getRequired() {
        return software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequiredOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired getRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "requiredInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecNodeAffinityRequired.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecNodeAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecNodeAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecNodeAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
