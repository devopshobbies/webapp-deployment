package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.992Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference")
public class CronJobSpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobSpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobSpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CronJobSpecJobTemplateSpecTemplateSpecVolumeFlockerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDatasetName() {
        software.amazon.jsii.Kernel.call(this, "resetDatasetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatasetUuid() {
        software.amazon.jsii.Kernel.call(this, "resetDatasetUuid", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatasetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "datasetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatasetUuidInput() {
        return software.amazon.jsii.Kernel.get(this, "datasetUuidInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatasetName() {
        return software.amazon.jsii.Kernel.get(this, "datasetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatasetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "datasetName", java.util.Objects.requireNonNull(value, "datasetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatasetUuid() {
        return software.amazon.jsii.Kernel.get(this, "datasetUuid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatasetUuid(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "datasetUuid", java.util.Objects.requireNonNull(value, "datasetUuid is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeFlocker getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeFlocker.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecVolumeFlocker value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
