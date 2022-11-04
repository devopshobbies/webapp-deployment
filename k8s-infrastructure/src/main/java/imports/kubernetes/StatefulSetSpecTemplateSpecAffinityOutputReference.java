package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.934Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecAffinityOutputReference")
public class StatefulSetSpecTemplateSpecAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetSpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetSpecTemplateSpecAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetSpecTemplateSpecAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNodeAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putNodeAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAntiAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAntiAffinity value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityOutputReference getNodeAffinity() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityOutputReference getPodAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAntiAffinityOutputReference getPodAntiAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAntiAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinity getNodeAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityNodeAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinity getPodAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinityPodAntiAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
