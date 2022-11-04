package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.149Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesOutputReference")
public class StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putConfigMap(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putConfigMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDownwardApi(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesDownwardApi value) {
        software.amazon.jsii.Kernel.call(this, "putDownwardApi", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecret(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecret", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceAccountToken(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesServiceAccountToken value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesConfigMapList getConfigMap() {
        return software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesConfigMapList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference getDownwardApi() {
        return software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesDownwardApiOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesSecretList getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesSecretList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference getServiceAccountToken() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getConfigMapInput() {
        return software.amazon.jsii.Kernel.get(this, "configMapInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesDownwardApi getDownwardApiInput() {
        return software.amazon.jsii.Kernel.get(this, "downwardApiInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesDownwardApi.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecretInput() {
        return software.amazon.jsii.Kernel.get(this, "secretInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getServiceAccountTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountTokenInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetV1SpecTemplateSpecVolumeProjectedSources value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
