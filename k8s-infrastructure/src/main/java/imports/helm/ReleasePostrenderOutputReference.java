package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.057Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.ReleasePostrenderOutputReference")
public class ReleasePostrenderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ReleasePostrenderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ReleasePostrenderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ReleasePostrenderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBinaryPathInput() {
        return software.amazon.jsii.Kernel.get(this, "binaryPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBinaryPath() {
        return software.amazon.jsii.Kernel.get(this, "binaryPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBinaryPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "binaryPath", java.util.Objects.requireNonNull(value, "binaryPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.helm.ReleasePostrender getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.helm.ReleasePostrender.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.helm.ReleasePostrender value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
