package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.039Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference")
public class StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountTokenOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAudience() {
        software.amazon.jsii.Kernel.call(this, "resetAudience", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExpirationSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetExpirationSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAudienceInput() {
        return software.amazon.jsii.Kernel.get(this, "audienceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "expirationSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAudience() {
        return software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAudience(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "audience", java.util.Objects.requireNonNull(value, "audience is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getExpirationSeconds() {
        return software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setExpirationSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "expirationSeconds", java.util.Objects.requireNonNull(value, "expirationSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "path", java.util.Objects.requireNonNull(value, "path is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecVolumeProjectedSourcesServiceAccountToken value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
