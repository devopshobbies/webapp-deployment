package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.168Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StorageClassV1AllowedTopologiesOutputReference")
public class StorageClassV1AllowedTopologiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StorageClassV1AllowedTopologiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StorageClassV1AllowedTopologiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StorageClassV1AllowedTopologiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMatchLabelExpressions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMatchLabelExpressions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMatchLabelExpressions() {
        software.amazon.jsii.Kernel.call(this, "resetMatchLabelExpressions", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.StorageClassV1AllowedTopologiesMatchLabelExpressionsList getMatchLabelExpressions() {
        return software.amazon.jsii.Kernel.get(this, "matchLabelExpressions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassV1AllowedTopologiesMatchLabelExpressionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMatchLabelExpressionsInput() {
        return software.amazon.jsii.Kernel.get(this, "matchLabelExpressionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StorageClassV1AllowedTopologies getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StorageClassV1AllowedTopologies.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StorageClassV1AllowedTopologies value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
