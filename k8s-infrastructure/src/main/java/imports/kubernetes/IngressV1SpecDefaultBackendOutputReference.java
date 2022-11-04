package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.924Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.IngressV1SpecDefaultBackendOutputReference")
public class IngressV1SpecDefaultBackendOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IngressV1SpecDefaultBackendOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IngressV1SpecDefaultBackendOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IngressV1SpecDefaultBackendOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putResource(final @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackendResource value) {
        software.amazon.jsii.Kernel.call(this, "putResource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putService(final @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackendService value) {
        software.amazon.jsii.Kernel.call(this, "putService", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetResource() {
        software.amazon.jsii.Kernel.call(this, "resetResource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetService() {
        software.amazon.jsii.Kernel.call(this, "resetService", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackendResourceOutputReference getResource() {
        return software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendResourceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.kubernetes.IngressV1SpecDefaultBackendServiceOutputReference getService() {
        return software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendServiceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackendResource getResourceInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendResource.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackendService getServiceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceInput", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackendService.class));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackend getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.IngressV1SpecDefaultBackend.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.IngressV1SpecDefaultBackend value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
