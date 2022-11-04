package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.018Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateOutputReference")
public class CronJobV1SpecJobTemplateSpecTemplateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CronJobV1SpecJobTemplateSpecTemplateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CronJobV1SpecJobTemplateSpecTemplateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CronJobV1SpecJobTemplateSpecTemplateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSpec() {
        software.amazon.jsii.Kernel.call(this, "resetSpec", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
