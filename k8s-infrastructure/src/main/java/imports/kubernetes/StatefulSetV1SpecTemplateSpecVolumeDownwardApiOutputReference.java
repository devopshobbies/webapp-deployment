package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.139Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApiOutputReference")
public class StatefulSetV1SpecTemplateSpecVolumeDownwardApiOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetV1SpecTemplateSpecVolumeDownwardApiOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetV1SpecTemplateSpecVolumeDownwardApiOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetV1SpecTemplateSpecVolumeDownwardApiOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putItems(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putItems", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefaultMode() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApiItemsList getItems() {
        return software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApiItemsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultModeInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultMode() {
        return software.amazon.jsii.Kernel.get(this, "defaultMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultMode", java.util.Objects.requireNonNull(value, "defaultMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeDownwardApi value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
