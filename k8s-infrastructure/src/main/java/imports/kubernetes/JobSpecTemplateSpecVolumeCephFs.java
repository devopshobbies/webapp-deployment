package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.009Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeCephFs")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecVolumeCephFs.Jsii$Proxy.class)
public interface JobSpecTemplateSpecVolumeCephFs extends software.amazon.jsii.JsiiSerializable {

    /**
     * Monitors is a collection of Ceph monitors More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#monitors Job#monitors}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * Used as the mounted root, rather than the full Ceph tree, default is /.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#path Job#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#read_only Job#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * The path to key ring for User, default is /etc/ceph/user.secret More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret_file Job#secret_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretFile() {
        return null;
    }

    /**
     * secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret_ref Job#secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef getSecretRef() {
        return null;
    }

    /**
     * User is the rados user name, default is admin. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#user Job#user}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecVolumeCephFs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecVolumeCephFs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecVolumeCephFs> {
        java.util.List<java.lang.String> monitors;
        java.lang.String path;
        java.lang.Object readOnly;
        java.lang.String secretFile;
        imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef secretRef;
        java.lang.String user;

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getMonitors}
         * @param monitors Monitors is a collection of Ceph monitors More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#monitors Job#monitors}
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getPath}
         * @param path Used as the mounted root, rather than the full Ceph tree, default is /.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#path Job#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#read_only Job#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#read_only Job#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getSecretFile}
         * @param secretFile The path to key ring for User, default is /etc/ceph/user.secret More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret_file Job#secret_file}
         * @return {@code this}
         */
        public Builder secretFile(java.lang.String secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getSecretRef}
         * @param secretRef secret_ref block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#secret_ref Job#secret_ref}
         * @return {@code this}
         */
        public Builder secretRef(imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeCephFs#getUser}
         * @param user User is the rados user name, default is admin. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#user Job#user}
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecVolumeCephFs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecVolumeCephFs build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecVolumeCephFs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecVolumeCephFs {
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String path;
        private final java.lang.Object readOnly;
        private final java.lang.String secretFile;
        private final imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitors = software.amazon.jsii.Kernel.get(this, "monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.secretFile = software.amazon.jsii.Kernel.get(this, "secretFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitors = java.util.Objects.requireNonNull(builder.monitors, "monitors is required");
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.secretFile = builder.secretFile;
            this.secretRef = builder.secretRef;
            this.user = builder.user;
        }

        @Override
        public final java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getSecretFile() {
            return this.secretFile;
        }

        @Override
        public final imports.kubernetes.JobSpecTemplateSpecVolumeCephFsSecretRef getSecretRef() {
            return this.secretRef;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretFile() != null) {
                data.set("secretFile", om.valueToTree(this.getSecretFile()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecVolumeCephFs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecVolumeCephFs.Jsii$Proxy that = (JobSpecTemplateSpecVolumeCephFs.Jsii$Proxy) o;

            if (!monitors.equals(that.monitors)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretFile != null ? !this.secretFile.equals(that.secretFile) : that.secretFile != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.monitors.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretFile != null ? this.secretFile.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
