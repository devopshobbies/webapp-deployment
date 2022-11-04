package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.917Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressSpecBackendOutputReference")
public class IngressSpecBackendOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IngressSpecBackendOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IngressSpecBackendOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IngressSpecBackendOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetServiceName() {
        software.amazon.jsii.Kernel.call(this, "resetServiceName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServicePort() {
        software.amazon.jsii.Kernel.call(this, "resetServicePort", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServicePortInput() {
        return software.amazon.jsii.Kernel.get(this, "servicePortInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceName", java.util.Objects.requireNonNull(value, "serviceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServicePort() {
        return software.amazon.jsii.Kernel.get(this, "servicePort", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServicePort(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "servicePort", java.util.Objects.requireNonNull(value, "servicePort is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpecBackend getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressSpecBackend.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.IngressSpecBackend value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
