package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.315Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecAffinityOutputReference")
public class PodSpecAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodSpecAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodSpecAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodSpecAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNodeAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityNodeAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putNodeAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityPodAffinity value) {
        software.amazon.jsii.Kernel.call(this, "putPodAffinity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPodAntiAffinity(final @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityPodAntiAffinity value) {
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

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityNodeAffinityOutputReference getNodeAffinity() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityNodeAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityPodAffinityOutputReference getPodAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSpecAffinityPodAntiAffinityOutputReference getPodAntiAffinity() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAntiAffinityOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityNodeAffinity getNodeAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityNodeAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityPodAffinity getPodAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityPodAntiAffinity getPodAntiAffinityInput() {
        return software.amazon.jsii.Kernel.get(this, "podAntiAffinityInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAntiAffinity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
