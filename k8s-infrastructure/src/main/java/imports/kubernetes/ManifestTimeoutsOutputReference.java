package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.183Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ManifestTimeoutsOutputReference")
public class ManifestTimeoutsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ManifestTimeoutsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ManifestTimeoutsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ManifestTimeoutsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCreate() {
        software.amazon.jsii.Kernel.call(this, "resetCreate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDelete() {
        software.amazon.jsii.Kernel.call(this, "resetDelete", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUpdate() {
        software.amazon.jsii.Kernel.call(this, "resetUpdate", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCreateInput() {
        return software.amazon.jsii.Kernel.get(this, "createInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUpdateInput() {
        return software.amazon.jsii.Kernel.get(this, "updateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCreate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "create", java.util.Objects.requireNonNull(value, "create is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDelete() {
        return software.amazon.jsii.Kernel.get(this, "delete", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDelete(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "delete", java.util.Objects.requireNonNull(value, "delete is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUpdate() {
        return software.amazon.jsii.Kernel.get(this, "update", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUpdate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "update", java.util.Objects.requireNonNull(value, "update is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestTimeouts getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestTimeouts.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
