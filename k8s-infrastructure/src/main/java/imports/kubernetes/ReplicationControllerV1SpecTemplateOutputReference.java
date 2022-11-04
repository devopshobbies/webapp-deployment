package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.772Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1SpecTemplateOutputReference")
public class ReplicationControllerV1SpecTemplateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ReplicationControllerV1SpecTemplateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ReplicationControllerV1SpecTemplateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ReplicationControllerV1SpecTemplateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMetadata(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateSpec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateMetadataOutputReference getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ReplicationControllerV1SpecTemplateSpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata getMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerV1SpecTemplateSpec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplateSpec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerV1SpecTemplate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerV1SpecTemplate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ReplicationControllerV1SpecTemplate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
