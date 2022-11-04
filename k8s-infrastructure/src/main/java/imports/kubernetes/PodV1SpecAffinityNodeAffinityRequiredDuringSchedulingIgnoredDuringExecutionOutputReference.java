package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.458Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionOutputReference")
public class PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNodeSelectorTerm(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putNodeSelectorTerm", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetNodeSelectorTerm() {
        software.amazon.jsii.Kernel.call(this, "resetNodeSelectorTerm", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermList getNodeSelectorTerm() {
        return software.amazon.jsii.Kernel.get(this, "nodeSelectorTerm", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNodeSelectorTermInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeSelectorTermInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodV1SpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
