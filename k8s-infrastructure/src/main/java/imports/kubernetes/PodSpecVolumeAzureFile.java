package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.380Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecVolumeAzureFile")
@software.amazon.jsii.Jsii.Proxy(PodSpecVolumeAzureFile.Jsii$Proxy.class)
public interface PodSpecVolumeAzureFile extends software.amazon.jsii.JsiiSerializable {

    /**
     * The name of secret that contains Azure Storage Account Name and Key.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#secret_name Pod#secret_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * Share Name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#share_name Pod#share_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getShareName();

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#read_only Pod#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnly() {
        return null;
    }

    /**
     * The namespace of the secret that contains Azure Storage Account Name and Key.
     * <p>
     * For Kubernetes up to 1.18.x the default is the same as the Pod. For Kubernetes 1.19.x and later the default is "default" namespace.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#secret_namespace Pod#secret_namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecVolumeAzureFile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecVolumeAzureFile}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecVolumeAzureFile> {
        java.lang.String secretName;
        java.lang.String shareName;
        java.lang.Object readOnly;
        java.lang.String secretNamespace;

        /**
         * Sets the value of {@link PodSpecVolumeAzureFile#getSecretName}
         * @param secretName The name of secret that contains Azure Storage Account Name and Key. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#secret_name Pod#secret_name}
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureFile#getShareName}
         * @param shareName Share Name. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#share_name Pod#share_name}
         * @return {@code this}
         */
        public Builder shareName(java.lang.String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureFile#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#read_only Pod#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureFile#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#read_only Pod#read_only}
         * @return {@code this}
         */
        public Builder readOnly(com.hashicorp.cdktf.IResolvable readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureFile#getSecretNamespace}
         * @param secretNamespace The namespace of the secret that contains Azure Storage Account Name and Key.
         *                        For Kubernetes up to 1.18.x the default is the same as the Pod. For Kubernetes 1.19.x and later the default is "default" namespace.
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#secret_namespace Pod#secret_namespace}
         * @return {@code this}
         */
        public Builder secretNamespace(java.lang.String secretNamespace) {
            this.secretNamespace = secretNamespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecVolumeAzureFile}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecVolumeAzureFile build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecVolumeAzureFile}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecVolumeAzureFile {
        private final java.lang.String secretName;
        private final java.lang.String shareName;
        private final java.lang.Object readOnly;
        private final java.lang.String secretNamespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareName = software.amazon.jsii.Kernel.get(this, "shareName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.secretNamespace = software.amazon.jsii.Kernel.get(this, "secretNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = java.util.Objects.requireNonNull(builder.secretName, "secretName is required");
            this.shareName = java.util.Objects.requireNonNull(builder.shareName, "shareName is required");
            this.readOnly = builder.readOnly;
            this.secretNamespace = builder.secretNamespace;
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public final java.lang.String getShareName() {
            return this.shareName;
        }

        @Override
        public final java.lang.Object getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getSecretNamespace() {
            return this.secretNamespace;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("secretName", om.valueToTree(this.getSecretName()));
            data.set("shareName", om.valueToTree(this.getShareName()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretNamespace() != null) {
                data.set("secretNamespace", om.valueToTree(this.getSecretNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecVolumeAzureFile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecVolumeAzureFile.Jsii$Proxy that = (PodSpecVolumeAzureFile.Jsii$Proxy) o;

            if (!secretName.equals(that.secretName)) return false;
            if (!shareName.equals(that.shareName)) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretNamespace != null ? this.secretNamespace.equals(that.secretNamespace) : that.secretNamespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.secretName.hashCode();
            result = 31 * result + (this.shareName.hashCode());
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretNamespace != null ? this.secretNamespace.hashCode() : 0);
            return result;
        }
    }
}
