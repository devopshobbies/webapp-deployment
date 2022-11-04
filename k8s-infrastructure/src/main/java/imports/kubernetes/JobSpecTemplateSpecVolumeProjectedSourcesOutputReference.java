package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.030Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesOutputReference")
public class JobSpecTemplateSpecVolumeProjectedSourcesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected JobSpecTemplateSpecVolumeProjectedSourcesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JobSpecTemplateSpecVolumeProjectedSourcesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public JobSpecTemplateSpecVolumeProjectedSourcesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putConfigMap(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDownwardApi(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi value) {
        software.amazon.jsii.Kernel.call(this, "putDownwardApi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceAccountToken(final @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken value) {
        software.amazon.jsii.Kernel.call(this, "putServiceAccountToken", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConfigMap() {
        software.amazon.jsii.Kernel.call(this, "resetConfigMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDownwardApi() {
        software.amazon.jsii.Kernel.call(this, "resetDownwardApi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecret() {
        software.amazon.jsii.Kernel.call(this, "resetSecret", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccountToken() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccountToken", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesConfigMapList getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesConfigMapList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesSecretList getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesSecretList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference getServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getConfigMapInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApiInput() {
        return software.amazon.jsii.Kernel.get(this, "downwardApiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountTokenInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSources value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
