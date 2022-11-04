package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.611Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecAffinityOutputReference")
public class DeploymentSpecTemplateSpecAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DeploymentSpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentSpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DeploymentSpecTemplateSpecAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNodeAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityNodeAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putNodeAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAntiAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAntiAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAntiAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetNodeAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetNodeAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPodAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetPodAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPodAntiAffinity() {
        software.amazon.jsii.Kernel.call(this, "resetPodAntiAffinity", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityNodeAffinityOutputReference getNodeAffinity() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityNodeAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAffinityOutputReference getPodAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAntiAffinityOutputReference getPodAntiAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAntiAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecAffinityNodeAffinity getNodeAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityNodeAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAffinity getPodAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinityPodAntiAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DeploymentSpecTemplateSpecAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DeploymentSpecTemplateSpecAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
