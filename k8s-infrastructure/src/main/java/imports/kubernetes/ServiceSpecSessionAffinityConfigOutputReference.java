package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.912Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceSpecSessionAffinityConfigOutputReference")
public class ServiceSpecSessionAffinityConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ServiceSpecSessionAffinityConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceSpecSessionAffinityConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ServiceSpecSessionAffinityConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClientIp(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecSessionAffinityConfigClientIp value) {
        software.amazon.jsii.Kernel.call(this, "putClientIp", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClientIp() {
        software.amazon.jsii.Kernel.call(this, "resetClientIp", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceSpecSessionAffinityConfigClientIpOutputReference getClientIp() {
        return software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfigClientIpOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpecSessionAffinityConfigClientIp getClientIpInput() {
        return software.amazon.jsii.Kernel.get(this, "clientIpInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfigClientIp.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpecSessionAffinityConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceSpecSessionAffinityConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceSpecSessionAffinityConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
