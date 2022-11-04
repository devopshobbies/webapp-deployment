package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.779Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ClusterRoleV1AggregationRuleOutputReference")
public class ClusterRoleV1AggregationRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ClusterRoleV1AggregationRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterRoleV1AggregationRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ClusterRoleV1AggregationRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClusterRoleSelectors(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putClusterRoleSelectors", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClusterRoleSelectors() {
        software.amazon.jsii.Kernel.call(this, "resetClusterRoleSelectors", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ClusterRoleV1AggregationRuleClusterRoleSelectorsList getClusterRoleSelectors() {
        return software.amazon.jsii.Kernel.get(this, "clusterRoleSelectors", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ClusterRoleV1AggregationRuleClusterRoleSelectorsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getClusterRoleSelectorsInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterRoleSelectorsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ClusterRoleV1AggregationRule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ClusterRoleV1AggregationRule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ClusterRoleV1AggregationRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
