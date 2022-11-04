package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.446Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodSpecAffinityNodeAffinityOutputReference")
public class DataKubernetesPodSpecAffinityNodeAffinityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataKubernetesPodSpecAffinityNodeAffinityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodSpecAffinityNodeAffinityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataKubernetesPodSpecAffinityNodeAffinityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionList getPreferredDuringSchedulingIgnoredDuringExecution() {
        return software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionList getRequiredDuringSchedulingIgnoredDuringExecution() {
        return software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.DataKubernetesPodSpecAffinityNodeAffinity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
