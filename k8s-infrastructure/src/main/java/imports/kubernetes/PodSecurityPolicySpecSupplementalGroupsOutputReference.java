package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.295Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicySpecSupplementalGroupsOutputReference")
public class PodSecurityPolicySpecSupplementalGroupsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected PodSecurityPolicySpecSupplementalGroupsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PodSecurityPolicySpecSupplementalGroupsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public PodSecurityPolicySpecSupplementalGroupsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRange(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRange() {
        software.amazon.jsii.Kernel.call(this, "resetRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.PodSecurityPolicySpecSupplementalGroupsRangeList getRange() {
        return software.amazon.jsii.Kernel.get(this, "range", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicySpecSupplementalGroupsRangeList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "rangeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rule", java.util.Objects.requireNonNull(value, "rule is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicySpecSupplementalGroups getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSecurityPolicySpecSupplementalGroups.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.PodSecurityPolicySpecSupplementalGroups value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
