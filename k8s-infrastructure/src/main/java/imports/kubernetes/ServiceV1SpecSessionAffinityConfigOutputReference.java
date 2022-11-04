package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ServiceV1SpecSessionAffinityConfigOutputReference")
public class ServiceV1SpecSessionAffinityConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ServiceV1SpecSessionAffinityConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceV1SpecSessionAffinityConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ServiceV1SpecSessionAffinityConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClientIp(final @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp value) {
        software.amazon.jsii.Kernel.call(this, "putClientIp", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClientIp() {
        software.amazon.jsii.Kernel.call(this, "resetClientIp", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIpOutputReference getClientIp() {
        return software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIpOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp getClientIpInput() {
        return software.amazon.jsii.Kernel.get(this, "clientIpInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceV1SpecSessionAffinityConfigClientIp.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceV1SpecSessionAffinityConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ServiceV1SpecSessionAffinityConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.ServiceV1SpecSessionAffinityConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
