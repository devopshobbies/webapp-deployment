package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.270Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeV1SpecPersistentVolumeSourceCephFs.Jsii$Proxy.class)
public interface PersistentVolumeV1SpecPersistentVolumeSourceCephFs extends software.amazon.jsii.JsiiSerializable {

    /**
     * Monitors is a collection of Ceph monitors More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#monitors PersistentVolumeV1#monitors}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * Used as the mounted root, rather than the full Ceph tree, default is /.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#path PersistentVolumeV1#path}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * The path to key ring for User, default is /etc/ceph/user.secret More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#secret_file PersistentVolumeV1#secret_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretFile() {
        return null;
    }

    /**
     * secret_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#secret_ref PersistentVolumeV1#secret_ref}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef getSecretRef() {
        return null;
    }

    /**
     * User is the rados user name, default is admin. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#user PersistentVolumeV1#user}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeV1SpecPersistentVolumeSourceCephFs> {
        java.util.List<java.lang.String> monitors;
        java.lang.String path;
        java.lang.Object readOnly;
        java.lang.String secretFile;
        imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef secretRef;
        java.lang.String user;

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getMonitors}
         * @param monitors Monitors is a collection of Ceph monitors More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#monitors PersistentVolumeV1#monitors}
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getPath}
         * @param path Used as the mounted root, rather than the full Ceph tree, default is /.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#path PersistentVolumeV1#path}
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to `false` (read/write). More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#read_only PersistentVolumeV1#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getSecretFile}
         * @param secretFile The path to key ring for User, default is /etc/ceph/user.secret More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#secret_file PersistentVolumeV1#secret_file}
         * @return {@code this}
         */
        public Builder secretFile(java.lang.String secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getSecretRef}
         * @param secretRef secret_ref block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#secret_ref PersistentVolumeV1#secret_ref}
         * @return {@code this}
         */
        public Builder secretRef(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs#getUser}
         * @param user User is the rados user name, default is admin. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/persistent_volume_v1#user PersistentVolumeV1#user}
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeV1SpecPersistentVolumeSourceCephFs build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeV1SpecPersistentVolumeSourceCephFs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeV1SpecPersistentVolumeSourceCephFs {
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String path;
        private final java.lang.Object readOnly;
        private final java.lang.String secretFile;
        private final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef secretRef;
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
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef.class));
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
        public final imports.kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFsSecretRef getSecretRef() {
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
            struct.set("fqn", om.valueToTree("kubernetes.PersistentVolumeV1SpecPersistentVolumeSourceCephFs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeV1SpecPersistentVolumeSourceCephFs.Jsii$Proxy that = (PersistentVolumeV1SpecPersistentVolumeSourceCephFs.Jsii$Proxy) o;

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
