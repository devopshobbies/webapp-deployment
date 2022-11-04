package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.029Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference")
public class JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putItems(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putItems", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsList getItems() {
        return software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiItemsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
