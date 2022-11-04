package imports.helm;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/helm/r/release helm_release}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.029Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.Release")
public class Release extends com.hashicorp.cdktf.TerraformResource {

    protected Release(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Release(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.helm.Release.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/helm/r/release helm_release} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Release(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.helm.ReleaseConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putPostrender(final @org.jetbrains.annotations.NotNull imports.helm.ReleasePostrender value) {
        software.amazon.jsii.Kernel.call(this, "putPostrender", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSet(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSet", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSetSensitive(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSetSensitive", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAtomic() {
        software.amazon.jsii.Kernel.call(this, "resetAtomic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCleanupOnFail() {
        software.amazon.jsii.Kernel.call(this, "resetCleanupOnFail", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreateNamespace() {
        software.amazon.jsii.Kernel.call(this, "resetCreateNamespace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDependencyUpdate() {
        software.amazon.jsii.Kernel.call(this, "resetDependencyUpdate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDevel() {
        software.amazon.jsii.Kernel.call(this, "resetDevel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableCrdHooks() {
        software.amazon.jsii.Kernel.call(this, "resetDisableCrdHooks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableOpenapiValidation() {
        software.amazon.jsii.Kernel.call(this, "resetDisableOpenapiValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableWebhooks() {
        software.amazon.jsii.Kernel.call(this, "resetDisableWebhooks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceUpdate() {
        software.amazon.jsii.Kernel.call(this, "resetForceUpdate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeyring() {
        software.amazon.jsii.Kernel.call(this, "resetKeyring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLint() {
        software.amazon.jsii.Kernel.call(this, "resetLint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxHistory() {
        software.amazon.jsii.Kernel.call(this, "resetMaxHistory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamespace() {
        software.amazon.jsii.Kernel.call(this, "resetNamespace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPostrender() {
        software.amazon.jsii.Kernel.call(this, "resetPostrender", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecreatePods() {
        software.amazon.jsii.Kernel.call(this, "resetRecreatePods", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRenderSubchartNotes() {
        software.amazon.jsii.Kernel.call(this, "resetRenderSubchartNotes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplace() {
        software.amazon.jsii.Kernel.call(this, "resetReplace", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepository() {
        software.amazon.jsii.Kernel.call(this, "resetRepository", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryCaFile() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryCaFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryCertFile() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryCertFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryKeyFile() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryKeyFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryPassword() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepositoryUsername() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryUsername", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResetValues() {
        software.amazon.jsii.Kernel.call(this, "resetResetValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReuseValues() {
        software.amazon.jsii.Kernel.call(this, "resetReuseValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSet() {
        software.amazon.jsii.Kernel.call(this, "resetSet", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSetSensitive() {
        software.amazon.jsii.Kernel.call(this, "resetSetSensitive", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipCrds() {
        software.amazon.jsii.Kernel.call(this, "resetSkipCrds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTfValues() {
        software.amazon.jsii.Kernel.call(this, "resetTfValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVerify() {
        software.amazon.jsii.Kernel.call(this, "resetVerify", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWait() {
        software.amazon.jsii.Kernel.call(this, "resetWait", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForJobs() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForJobs", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getManifest() {
        return software.amazon.jsii.Kernel.get(this, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.helm.ReleaseMetadataList getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.helm.ReleaseMetadataList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.helm.ReleasePostrenderOutputReference getPostrender() {
        return software.amazon.jsii.Kernel.get(this, "postrender", software.amazon.jsii.NativeType.forClass(imports.helm.ReleasePostrenderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.helm.ReleaseSetList getSet() {
        return software.amazon.jsii.Kernel.get(this, "set", software.amazon.jsii.NativeType.forClass(imports.helm.ReleaseSetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.helm.ReleaseSetSensitiveList getSetSensitive() {
        return software.amazon.jsii.Kernel.get(this, "setSensitive", software.amazon.jsii.NativeType.forClass(imports.helm.ReleaseSetSensitiveList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAtomicInput() {
        return software.amazon.jsii.Kernel.get(this, "atomicInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getChartInput() {
        return software.amazon.jsii.Kernel.get(this, "chartInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCleanupOnFailInput() {
        return software.amazon.jsii.Kernel.get(this, "cleanupOnFailInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCreateNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "createNamespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDependencyUpdateInput() {
        return software.amazon.jsii.Kernel.get(this, "dependencyUpdateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDevelInput() {
        return software.amazon.jsii.Kernel.get(this, "develInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableCrdHooksInput() {
        return software.amazon.jsii.Kernel.get(this, "disableCrdHooksInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableOpenapiValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "disableOpenapiValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableWebhooksInput() {
        return software.amazon.jsii.Kernel.get(this, "disableWebhooksInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceUpdateInput() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyringInput() {
        return software.amazon.jsii.Kernel.get(this, "keyringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLintInput() {
        return software.amazon.jsii.Kernel.get(this, "lintInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxHistoryInput() {
        return software.amazon.jsii.Kernel.get(this, "maxHistoryInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.helm.ReleasePostrender getPostrenderInput() {
        return software.amazon.jsii.Kernel.get(this, "postrenderInput", software.amazon.jsii.NativeType.forClass(imports.helm.ReleasePostrender.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRecreatePodsInput() {
        return software.amazon.jsii.Kernel.get(this, "recreatePodsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRenderSubchartNotesInput() {
        return software.amazon.jsii.Kernel.get(this, "renderSubchartNotesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReplaceInput() {
        return software.amazon.jsii.Kernel.get(this, "replaceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCaFileInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCaFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCertFileInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCertFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryKeyFileInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryKeyFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryUsernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getResetValuesInput() {
        return software.amazon.jsii.Kernel.get(this, "resetValuesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReuseValuesInput() {
        return software.amazon.jsii.Kernel.get(this, "reuseValuesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSetInput() {
        return software.amazon.jsii.Kernel.get(this, "setInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSetSensitiveInput() {
        return software.amazon.jsii.Kernel.get(this, "setSensitiveInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipCrdsInput() {
        return software.amazon.jsii.Kernel.get(this, "skipCrdsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "valuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVerifyInput() {
        return software.amazon.jsii.Kernel.get(this, "verifyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitForJobsInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForJobsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitInput() {
        return software.amazon.jsii.Kernel.get(this, "waitInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAtomic() {
        return software.amazon.jsii.Kernel.get(this, "atomic", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAtomic(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "atomic", java.util.Objects.requireNonNull(value, "atomic is required"));
    }

    public void setAtomic(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "atomic", java.util.Objects.requireNonNull(value, "atomic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getChart() {
        return software.amazon.jsii.Kernel.get(this, "chart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setChart(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "chart", java.util.Objects.requireNonNull(value, "chart is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCleanupOnFail() {
        return software.amazon.jsii.Kernel.get(this, "cleanupOnFail", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCleanupOnFail(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "cleanupOnFail", java.util.Objects.requireNonNull(value, "cleanupOnFail is required"));
    }

    public void setCleanupOnFail(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "cleanupOnFail", java.util.Objects.requireNonNull(value, "cleanupOnFail is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCreateNamespace() {
        return software.amazon.jsii.Kernel.get(this, "createNamespace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCreateNamespace(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createNamespace", java.util.Objects.requireNonNull(value, "createNamespace is required"));
    }

    public void setCreateNamespace(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "createNamespace", java.util.Objects.requireNonNull(value, "createNamespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDependencyUpdate() {
        return software.amazon.jsii.Kernel.get(this, "dependencyUpdate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDependencyUpdate(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dependencyUpdate", java.util.Objects.requireNonNull(value, "dependencyUpdate is required"));
    }

    public void setDependencyUpdate(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "dependencyUpdate", java.util.Objects.requireNonNull(value, "dependencyUpdate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDevel() {
        return software.amazon.jsii.Kernel.get(this, "devel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDevel(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "devel", java.util.Objects.requireNonNull(value, "devel is required"));
    }

    public void setDevel(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "devel", java.util.Objects.requireNonNull(value, "devel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableCrdHooks() {
        return software.amazon.jsii.Kernel.get(this, "disableCrdHooks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableCrdHooks(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableCrdHooks", java.util.Objects.requireNonNull(value, "disableCrdHooks is required"));
    }

    public void setDisableCrdHooks(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableCrdHooks", java.util.Objects.requireNonNull(value, "disableCrdHooks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableOpenapiValidation() {
        return software.amazon.jsii.Kernel.get(this, "disableOpenapiValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableOpenapiValidation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableOpenapiValidation", java.util.Objects.requireNonNull(value, "disableOpenapiValidation is required"));
    }

    public void setDisableOpenapiValidation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableOpenapiValidation", java.util.Objects.requireNonNull(value, "disableOpenapiValidation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableWebhooks() {
        return software.amazon.jsii.Kernel.get(this, "disableWebhooks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableWebhooks(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableWebhooks", java.util.Objects.requireNonNull(value, "disableWebhooks is required"));
    }

    public void setDisableWebhooks(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableWebhooks", java.util.Objects.requireNonNull(value, "disableWebhooks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceUpdate() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceUpdate(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceUpdate", java.util.Objects.requireNonNull(value, "forceUpdate is required"));
    }

    public void setForceUpdate(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceUpdate", java.util.Objects.requireNonNull(value, "forceUpdate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyring() {
        return software.amazon.jsii.Kernel.get(this, "keyring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyring(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyring", java.util.Objects.requireNonNull(value, "keyring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getLint() {
        return software.amazon.jsii.Kernel.get(this, "lint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setLint(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "lint", java.util.Objects.requireNonNull(value, "lint is required"));
    }

    public void setLint(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "lint", java.util.Objects.requireNonNull(value, "lint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxHistory() {
        return software.amazon.jsii.Kernel.get(this, "maxHistory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxHistory(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxHistory", java.util.Objects.requireNonNull(value, "maxHistory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamespace() {
        return software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespace", java.util.Objects.requireNonNull(value, "namespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRecreatePods() {
        return software.amazon.jsii.Kernel.get(this, "recreatePods", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRecreatePods(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "recreatePods", java.util.Objects.requireNonNull(value, "recreatePods is required"));
    }

    public void setRecreatePods(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "recreatePods", java.util.Objects.requireNonNull(value, "recreatePods is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRenderSubchartNotes() {
        return software.amazon.jsii.Kernel.get(this, "renderSubchartNotes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRenderSubchartNotes(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "renderSubchartNotes", java.util.Objects.requireNonNull(value, "renderSubchartNotes is required"));
    }

    public void setRenderSubchartNotes(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "renderSubchartNotes", java.util.Objects.requireNonNull(value, "renderSubchartNotes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReplace() {
        return software.amazon.jsii.Kernel.get(this, "replace", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReplace(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "replace", java.util.Objects.requireNonNull(value, "replace is required"));
    }

    public void setReplace(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "replace", java.util.Objects.requireNonNull(value, "replace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepository() {
        return software.amazon.jsii.Kernel.get(this, "repository", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepository(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repository", java.util.Objects.requireNonNull(value, "repository is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryCaFile() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCaFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryCaFile(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryCaFile", java.util.Objects.requireNonNull(value, "repositoryCaFile is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryCertFile() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryCertFile(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryCertFile", java.util.Objects.requireNonNull(value, "repositoryCertFile is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryKeyFile() {
        return software.amazon.jsii.Kernel.get(this, "repositoryKeyFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryKeyFile(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryKeyFile", java.util.Objects.requireNonNull(value, "repositoryKeyFile is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryPassword() {
        return software.amazon.jsii.Kernel.get(this, "repositoryPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryPassword", java.util.Objects.requireNonNull(value, "repositoryPassword is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryUsername() {
        return software.amazon.jsii.Kernel.get(this, "repositoryUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryUsername", java.util.Objects.requireNonNull(value, "repositoryUsername is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getResetValues() {
        return software.amazon.jsii.Kernel.get(this, "resetValues", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setResetValues(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "resetValues", java.util.Objects.requireNonNull(value, "resetValues is required"));
    }

    public void setResetValues(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "resetValues", java.util.Objects.requireNonNull(value, "resetValues is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReuseValues() {
        return software.amazon.jsii.Kernel.get(this, "reuseValues", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReuseValues(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "reuseValues", java.util.Objects.requireNonNull(value, "reuseValues is required"));
    }

    public void setReuseValues(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "reuseValues", java.util.Objects.requireNonNull(value, "reuseValues is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSkipCrds() {
        return software.amazon.jsii.Kernel.get(this, "skipCrds", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipCrds(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipCrds", java.util.Objects.requireNonNull(value, "skipCrds is required"));
    }

    public void setSkipCrds(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipCrds", java.util.Objects.requireNonNull(value, "skipCrds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeout() {
        return software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeout", java.util.Objects.requireNonNull(value, "timeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setValues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "values", java.util.Objects.requireNonNull(value, "values is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getVerify() {
        return software.amazon.jsii.Kernel.get(this, "verify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setVerify(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "verify", java.util.Objects.requireNonNull(value, "verify is required"));
    }

    public void setVerify(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "verify", java.util.Objects.requireNonNull(value, "verify is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWait() {
        return software.amazon.jsii.Kernel.get(this, "wait", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWait(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "wait", java.util.Objects.requireNonNull(value, "wait is required"));
    }

    public void setWait(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "wait", java.util.Objects.requireNonNull(value, "wait is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWaitForJobs() {
        return software.amazon.jsii.Kernel.get(this, "waitForJobs", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWaitForJobs(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForJobs", java.util.Objects.requireNonNull(value, "waitForJobs is required"));
    }

    public void setWaitForJobs(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "waitForJobs", java.util.Objects.requireNonNull(value, "waitForJobs is required"));
    }

    /**
     * A fluent builder for {@link imports.helm.Release}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.helm.Release> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.helm.ReleaseConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.helm.ReleaseConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Chart name to be installed. A path may be used.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#chart Release#chart}
         * <p>
         * @return {@code this}
         * @param chart Chart name to be installed. A path may be used. This parameter is required.
         */
        public Builder chart(final java.lang.String chart) {
            this.config.chart(chart);
            return this;
        }

        /**
         * Release name.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#name Release#name}
         * <p>
         * @return {@code this}
         * @param name Release name. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#atomic Release#atomic}
         * <p>
         * @return {@code this}
         * @param atomic If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used. This parameter is required.
         */
        public Builder atomic(final java.lang.Boolean atomic) {
            this.config.atomic(atomic);
            return this;
        }
        /**
         * If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#atomic Release#atomic}
         * <p>
         * @return {@code this}
         * @param atomic If set, installation process purges chart on fail. The wait flag will be set automatically if atomic is used. This parameter is required.
         */
        public Builder atomic(final com.hashicorp.cdktf.IResolvable atomic) {
            this.config.atomic(atomic);
            return this;
        }

        /**
         * Allow deletion of new resources created in this upgrade when upgrade fails.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#cleanup_on_fail Release#cleanup_on_fail}
         * <p>
         * @return {@code this}
         * @param cleanupOnFail Allow deletion of new resources created in this upgrade when upgrade fails. This parameter is required.
         */
        public Builder cleanupOnFail(final java.lang.Boolean cleanupOnFail) {
            this.config.cleanupOnFail(cleanupOnFail);
            return this;
        }
        /**
         * Allow deletion of new resources created in this upgrade when upgrade fails.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#cleanup_on_fail Release#cleanup_on_fail}
         * <p>
         * @return {@code this}
         * @param cleanupOnFail Allow deletion of new resources created in this upgrade when upgrade fails. This parameter is required.
         */
        public Builder cleanupOnFail(final com.hashicorp.cdktf.IResolvable cleanupOnFail) {
            this.config.cleanupOnFail(cleanupOnFail);
            return this;
        }

        /**
         * Create the namespace if it does not exist.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#create_namespace Release#create_namespace}
         * <p>
         * @return {@code this}
         * @param createNamespace Create the namespace if it does not exist. This parameter is required.
         */
        public Builder createNamespace(final java.lang.Boolean createNamespace) {
            this.config.createNamespace(createNamespace);
            return this;
        }
        /**
         * Create the namespace if it does not exist.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#create_namespace Release#create_namespace}
         * <p>
         * @return {@code this}
         * @param createNamespace Create the namespace if it does not exist. This parameter is required.
         */
        public Builder createNamespace(final com.hashicorp.cdktf.IResolvable createNamespace) {
            this.config.createNamespace(createNamespace);
            return this;
        }

        /**
         * Run helm dependency update before installing the chart.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#dependency_update Release#dependency_update}
         * <p>
         * @return {@code this}
         * @param dependencyUpdate Run helm dependency update before installing the chart. This parameter is required.
         */
        public Builder dependencyUpdate(final java.lang.Boolean dependencyUpdate) {
            this.config.dependencyUpdate(dependencyUpdate);
            return this;
        }
        /**
         * Run helm dependency update before installing the chart.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#dependency_update Release#dependency_update}
         * <p>
         * @return {@code this}
         * @param dependencyUpdate Run helm dependency update before installing the chart. This parameter is required.
         */
        public Builder dependencyUpdate(final com.hashicorp.cdktf.IResolvable dependencyUpdate) {
            this.config.dependencyUpdate(dependencyUpdate);
            return this;
        }

        /**
         * Add a custom description.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#description Release#description}
         * <p>
         * @return {@code this}
         * @param description Add a custom description. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#devel Release#devel}
         * <p>
         * @return {@code this}
         * @param devel Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored. This parameter is required.
         */
        public Builder devel(final java.lang.Boolean devel) {
            this.config.devel(devel);
            return this;
        }
        /**
         * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#devel Release#devel}
         * <p>
         * @return {@code this}
         * @param devel Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored. This parameter is required.
         */
        public Builder devel(final com.hashicorp.cdktf.IResolvable devel) {
            this.config.devel(devel);
            return this;
        }

        /**
         * Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_crd_hooks Release#disable_crd_hooks}
         * <p>
         * @return {@code this}
         * @param disableCrdHooks Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook. This parameter is required.
         */
        public Builder disableCrdHooks(final java.lang.Boolean disableCrdHooks) {
            this.config.disableCrdHooks(disableCrdHooks);
            return this;
        }
        /**
         * Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_crd_hooks Release#disable_crd_hooks}
         * <p>
         * @return {@code this}
         * @param disableCrdHooks Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook. This parameter is required.
         */
        public Builder disableCrdHooks(final com.hashicorp.cdktf.IResolvable disableCrdHooks) {
            this.config.disableCrdHooks(disableCrdHooks);
            return this;
        }

        /**
         * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_openapi_validation Release#disable_openapi_validation}
         * <p>
         * @return {@code this}
         * @param disableOpenapiValidation If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema. This parameter is required.
         */
        public Builder disableOpenapiValidation(final java.lang.Boolean disableOpenapiValidation) {
            this.config.disableOpenapiValidation(disableOpenapiValidation);
            return this;
        }
        /**
         * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_openapi_validation Release#disable_openapi_validation}
         * <p>
         * @return {@code this}
         * @param disableOpenapiValidation If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema. This parameter is required.
         */
        public Builder disableOpenapiValidation(final com.hashicorp.cdktf.IResolvable disableOpenapiValidation) {
            this.config.disableOpenapiValidation(disableOpenapiValidation);
            return this;
        }

        /**
         * Prevent hooks from running.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_webhooks Release#disable_webhooks}
         * <p>
         * @return {@code this}
         * @param disableWebhooks Prevent hooks from running. This parameter is required.
         */
        public Builder disableWebhooks(final java.lang.Boolean disableWebhooks) {
            this.config.disableWebhooks(disableWebhooks);
            return this;
        }
        /**
         * Prevent hooks from running.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#disable_webhooks Release#disable_webhooks}
         * <p>
         * @return {@code this}
         * @param disableWebhooks Prevent hooks from running. This parameter is required.
         */
        public Builder disableWebhooks(final com.hashicorp.cdktf.IResolvable disableWebhooks) {
            this.config.disableWebhooks(disableWebhooks);
            return this;
        }

        /**
         * Force resource update through delete/recreate if needed.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#force_update Release#force_update}
         * <p>
         * @return {@code this}
         * @param forceUpdate Force resource update through delete/recreate if needed. This parameter is required.
         */
        public Builder forceUpdate(final java.lang.Boolean forceUpdate) {
            this.config.forceUpdate(forceUpdate);
            return this;
        }
        /**
         * Force resource update through delete/recreate if needed.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#force_update Release#force_update}
         * <p>
         * @return {@code this}
         * @param forceUpdate Force resource update through delete/recreate if needed. This parameter is required.
         */
        public Builder forceUpdate(final com.hashicorp.cdktf.IResolvable forceUpdate) {
            this.config.forceUpdate(forceUpdate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#id Release#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#id Release#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Location of public keys used for verification. Used only if `verify` is true.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#keyring Release#keyring}
         * <p>
         * @return {@code this}
         * @param keyring Location of public keys used for verification. Used only if `verify` is true. This parameter is required.
         */
        public Builder keyring(final java.lang.String keyring) {
            this.config.keyring(keyring);
            return this;
        }

        /**
         * Run helm lint when planning.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#lint Release#lint}
         * <p>
         * @return {@code this}
         * @param lint Run helm lint when planning. This parameter is required.
         */
        public Builder lint(final java.lang.Boolean lint) {
            this.config.lint(lint);
            return this;
        }
        /**
         * Run helm lint when planning.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#lint Release#lint}
         * <p>
         * @return {@code this}
         * @param lint Run helm lint when planning. This parameter is required.
         */
        public Builder lint(final com.hashicorp.cdktf.IResolvable lint) {
            this.config.lint(lint);
            return this;
        }

        /**
         * Limit the maximum number of revisions saved per release. Use 0 for no limit.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#max_history Release#max_history}
         * <p>
         * @return {@code this}
         * @param maxHistory Limit the maximum number of revisions saved per release. Use 0 for no limit. This parameter is required.
         */
        public Builder maxHistory(final java.lang.Number maxHistory) {
            this.config.maxHistory(maxHistory);
            return this;
        }

        /**
         * Namespace to install the release into.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#namespace Release#namespace}
         * <p>
         * @return {@code this}
         * @param namespace Namespace to install the release into. This parameter is required.
         */
        public Builder namespace(final java.lang.String namespace) {
            this.config.namespace(namespace);
            return this;
        }

        /**
         * postrender block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#postrender Release#postrender}
         * <p>
         * @return {@code this}
         * @param postrender postrender block. This parameter is required.
         */
        public Builder postrender(final imports.helm.ReleasePostrender postrender) {
            this.config.postrender(postrender);
            return this;
        }

        /**
         * Perform pods restart during upgrade/rollback.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#recreate_pods Release#recreate_pods}
         * <p>
         * @return {@code this}
         * @param recreatePods Perform pods restart during upgrade/rollback. This parameter is required.
         */
        public Builder recreatePods(final java.lang.Boolean recreatePods) {
            this.config.recreatePods(recreatePods);
            return this;
        }
        /**
         * Perform pods restart during upgrade/rollback.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#recreate_pods Release#recreate_pods}
         * <p>
         * @return {@code this}
         * @param recreatePods Perform pods restart during upgrade/rollback. This parameter is required.
         */
        public Builder recreatePods(final com.hashicorp.cdktf.IResolvable recreatePods) {
            this.config.recreatePods(recreatePods);
            return this;
        }

        /**
         * If set, render subchart notes along with the parent.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#render_subchart_notes Release#render_subchart_notes}
         * <p>
         * @return {@code this}
         * @param renderSubchartNotes If set, render subchart notes along with the parent. This parameter is required.
         */
        public Builder renderSubchartNotes(final java.lang.Boolean renderSubchartNotes) {
            this.config.renderSubchartNotes(renderSubchartNotes);
            return this;
        }
        /**
         * If set, render subchart notes along with the parent.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#render_subchart_notes Release#render_subchart_notes}
         * <p>
         * @return {@code this}
         * @param renderSubchartNotes If set, render subchart notes along with the parent. This parameter is required.
         */
        public Builder renderSubchartNotes(final com.hashicorp.cdktf.IResolvable renderSubchartNotes) {
            this.config.renderSubchartNotes(renderSubchartNotes);
            return this;
        }

        /**
         * Re-use the given name, even if that name is already used. This is unsafe in production.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#replace Release#replace}
         * <p>
         * @return {@code this}
         * @param replace Re-use the given name, even if that name is already used. This is unsafe in production. This parameter is required.
         */
        public Builder replace(final java.lang.Boolean replace) {
            this.config.replace(replace);
            return this;
        }
        /**
         * Re-use the given name, even if that name is already used. This is unsafe in production.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#replace Release#replace}
         * <p>
         * @return {@code this}
         * @param replace Re-use the given name, even if that name is already used. This is unsafe in production. This parameter is required.
         */
        public Builder replace(final com.hashicorp.cdktf.IResolvable replace) {
            this.config.replace(replace);
            return this;
        }

        /**
         * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository Release#repository}
         * <p>
         * @return {@code this}
         * @param repository Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository. This parameter is required.
         */
        public Builder repository(final java.lang.String repository) {
            this.config.repository(repository);
            return this;
        }

        /**
         * The Repositories CA File.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_ca_file Release#repository_ca_file}
         * <p>
         * @return {@code this}
         * @param repositoryCaFile The Repositories CA File. This parameter is required.
         */
        public Builder repositoryCaFile(final java.lang.String repositoryCaFile) {
            this.config.repositoryCaFile(repositoryCaFile);
            return this;
        }

        /**
         * The repositories cert file.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_cert_file Release#repository_cert_file}
         * <p>
         * @return {@code this}
         * @param repositoryCertFile The repositories cert file. This parameter is required.
         */
        public Builder repositoryCertFile(final java.lang.String repositoryCertFile) {
            this.config.repositoryCertFile(repositoryCertFile);
            return this;
        }

        /**
         * The repositories cert key file.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_key_file Release#repository_key_file}
         * <p>
         * @return {@code this}
         * @param repositoryKeyFile The repositories cert key file. This parameter is required.
         */
        public Builder repositoryKeyFile(final java.lang.String repositoryKeyFile) {
            this.config.repositoryKeyFile(repositoryKeyFile);
            return this;
        }

        /**
         * Password for HTTP basic authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_password Release#repository_password}
         * <p>
         * @return {@code this}
         * @param repositoryPassword Password for HTTP basic authentication. This parameter is required.
         */
        public Builder repositoryPassword(final java.lang.String repositoryPassword) {
            this.config.repositoryPassword(repositoryPassword);
            return this;
        }

        /**
         * Username for HTTP basic authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#repository_username Release#repository_username}
         * <p>
         * @return {@code this}
         * @param repositoryUsername Username for HTTP basic authentication. This parameter is required.
         */
        public Builder repositoryUsername(final java.lang.String repositoryUsername) {
            this.config.repositoryUsername(repositoryUsername);
            return this;
        }

        /**
         * When upgrading, reset the values to the ones built into the chart.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reset_values Release#reset_values}
         * <p>
         * @return {@code this}
         * @param resetValues When upgrading, reset the values to the ones built into the chart. This parameter is required.
         */
        public Builder resetValues(final java.lang.Boolean resetValues) {
            this.config.resetValues(resetValues);
            return this;
        }
        /**
         * When upgrading, reset the values to the ones built into the chart.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reset_values Release#reset_values}
         * <p>
         * @return {@code this}
         * @param resetValues When upgrading, reset the values to the ones built into the chart. This parameter is required.
         */
        public Builder resetValues(final com.hashicorp.cdktf.IResolvable resetValues) {
            this.config.resetValues(resetValues);
            return this;
        }

        /**
         * When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reuse_values Release#reuse_values}
         * <p>
         * @return {@code this}
         * @param reuseValues When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored. This parameter is required.
         */
        public Builder reuseValues(final java.lang.Boolean reuseValues) {
            this.config.reuseValues(reuseValues);
            return this;
        }
        /**
         * When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#reuse_values Release#reuse_values}
         * <p>
         * @return {@code this}
         * @param reuseValues When upgrading, reuse the last release's values and merge in any overrides. If 'reset_values' is specified, this is ignored. This parameter is required.
         */
        public Builder reuseValues(final com.hashicorp.cdktf.IResolvable reuseValues) {
            this.config.reuseValues(reuseValues);
            return this;
        }

        /**
         * set block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set Release#set}
         * <p>
         * @return {@code this}
         * @param set set block. This parameter is required.
         */
        public Builder set(final com.hashicorp.cdktf.IResolvable set) {
            this.config.set(set);
            return this;
        }
        /**
         * set block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set Release#set}
         * <p>
         * @return {@code this}
         * @param set set block. This parameter is required.
         */
        public Builder set(final java.util.List<? extends imports.helm.ReleaseSet> set) {
            this.config.set(set);
            return this;
        }

        /**
         * set_sensitive block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set_sensitive Release#set_sensitive}
         * <p>
         * @return {@code this}
         * @param setSensitive set_sensitive block. This parameter is required.
         */
        public Builder setSensitive(final com.hashicorp.cdktf.IResolvable setSensitive) {
            this.config.setSensitive(setSensitive);
            return this;
        }
        /**
         * set_sensitive block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#set_sensitive Release#set_sensitive}
         * <p>
         * @return {@code this}
         * @param setSensitive set_sensitive block. This parameter is required.
         */
        public Builder setSensitive(final java.util.List<? extends imports.helm.ReleaseSetSensitive> setSensitive) {
            this.config.setSensitive(setSensitive);
            return this;
        }

        /**
         * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#skip_crds Release#skip_crds}
         * <p>
         * @return {@code this}
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present. This parameter is required.
         */
        public Builder skipCrds(final java.lang.Boolean skipCrds) {
            this.config.skipCrds(skipCrds);
            return this;
        }
        /**
         * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#skip_crds Release#skip_crds}
         * <p>
         * @return {@code this}
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present. This parameter is required.
         */
        public Builder skipCrds(final com.hashicorp.cdktf.IResolvable skipCrds) {
            this.config.skipCrds(skipCrds);
            return this;
        }

        /**
         * Time in seconds to wait for any individual kubernetes operation.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#timeout Release#timeout}
         * <p>
         * @return {@code this}
         * @param timeout Time in seconds to wait for any individual kubernetes operation. This parameter is required.
         */
        public Builder timeout(final java.lang.Number timeout) {
            this.config.timeout(timeout);
            return this;
        }

        /**
         * List of values in raw yaml format to pass to helm.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#values Release#values}
         * <p>
         * @return {@code this}
         * @param values List of values in raw yaml format to pass to helm. This parameter is required.
         */
        public Builder values(final java.util.List<java.lang.String> values) {
            this.config.values(values);
            return this;
        }

        /**
         * Verify the package before installing it.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#verify Release#verify}
         * <p>
         * @return {@code this}
         * @param verify Verify the package before installing it. This parameter is required.
         */
        public Builder verify(final java.lang.Boolean verify) {
            this.config.verify(verify);
            return this;
        }
        /**
         * Verify the package before installing it.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#verify Release#verify}
         * <p>
         * @return {@code this}
         * @param verify Verify the package before installing it. This parameter is required.
         */
        public Builder verify(final com.hashicorp.cdktf.IResolvable verify) {
            this.config.verify(verify);
            return this;
        }

        /**
         * Specify the exact chart version to install. If this is not specified, the latest version is installed.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#version Release#version}
         * <p>
         * @return {@code this}
         * @param version Specify the exact chart version to install. If this is not specified, the latest version is installed. This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config.version(version);
            return this;
        }

        /**
         * Will wait until all resources are in a ready state before marking the release as successful.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait Release#wait}
         * <p>
         * @return {@code this}
         * @param wait Will wait until all resources are in a ready state before marking the release as successful. This parameter is required.
         */
        public Builder wait(final java.lang.Boolean wait) {
            this.config.wait(wait);
            return this;
        }
        /**
         * Will wait until all resources are in a ready state before marking the release as successful.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait Release#wait}
         * <p>
         * @return {@code this}
         * @param wait Will wait until all resources are in a ready state before marking the release as successful. This parameter is required.
         */
        public Builder wait(final com.hashicorp.cdktf.IResolvable wait) {
            this.config.wait(wait);
            return this;
        }

        /**
         * If wait is enabled, will wait until all Jobs have been completed before marking the release as successful.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait_for_jobs Release#wait_for_jobs}
         * <p>
         * @return {@code this}
         * @param waitForJobs If wait is enabled, will wait until all Jobs have been completed before marking the release as successful. This parameter is required.
         */
        public Builder waitForJobs(final java.lang.Boolean waitForJobs) {
            this.config.waitForJobs(waitForJobs);
            return this;
        }
        /**
         * If wait is enabled, will wait until all Jobs have been completed before marking the release as successful.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/helm/r/release#wait_for_jobs Release#wait_for_jobs}
         * <p>
         * @return {@code this}
         * @param waitForJobs If wait is enabled, will wait until all Jobs have been completed before marking the release as successful. This parameter is required.
         */
        public Builder waitForJobs(final com.hashicorp.cdktf.IResolvable waitForJobs) {
            this.config.waitForJobs(waitForJobs);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.helm.Release}.
         */
        @Override
        public imports.helm.Release build() {
            return new imports.helm.Release(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
