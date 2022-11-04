package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.031Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecVolumeGitRepoOutputReference")
public class StatefulSetSpecTemplateSpecVolumeGitRepoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StatefulSetSpecTemplateSpecVolumeGitRepoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSetSpecTemplateSpecVolumeGitRepoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StatefulSetSpecTemplateSpecVolumeGitRepoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDirectory() {
        software.amazon.jsii.Kernel.call(this, "resetDirectory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepository() {
        software.amazon.jsii.Kernel.call(this, "resetRepository", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRevision() {
        software.amazon.jsii.Kernel.call(this, "resetRevision", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectoryInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRevisionInput() {
        return software.amazon.jsii.Kernel.get(this, "revisionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectory() {
        return software.amazon.jsii.Kernel.get(this, "directory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirectory(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "directory", java.util.Objects.requireNonNull(value, "directory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepository() {
        return software.amazon.jsii.Kernel.get(this, "repository", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepository(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repository", java.util.Objects.requireNonNull(value, "repository is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRevision() {
        return software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRevision(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "revision", java.util.Objects.requireNonNull(value, "revision is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecVolumeGitRepo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecVolumeGitRepo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecVolumeGitRepo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
