package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.824Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateOutputReference")
public class CronJobSpecJobTemplateSpecTemplateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobSpecJobTemplateSpecTemplateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobSpecJobTemplateSpecTemplateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CronJobSpecJobTemplateSpecTemplateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplateSpecTemplateMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSpec() {
        software.amazon.jsii.Kernel.call(this, "resetSpec", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplateSpecTemplateMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobSpecJobTemplateSpecTemplate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobSpecJobTemplateSpecTemplate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
