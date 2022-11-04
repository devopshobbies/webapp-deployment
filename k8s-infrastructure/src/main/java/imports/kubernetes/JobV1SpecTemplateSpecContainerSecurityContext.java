package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.093Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobV1SpecTemplateSpecContainerSecurityContext")
@software.amazon.jsii.Jsii.Proxy(JobV1SpecTemplateSpecContainerSecurityContext.Jsii$Proxy.class)
public interface JobV1SpecTemplateSpecContainerSecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
     * <p>
     * This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#allow_privilege_escalation JobV1#allow_privilege_escalation}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowPrivilegeEscalation() {
        return null;
    }

    /**
     * capabilities block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#capabilities JobV1#capabilities}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities getCapabilities() {
        return null;
    }

    /**
     * Run container in privileged mode.
     * <p>
     * Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#privileged JobV1#privileged}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPrivileged() {
        return null;
    }

    /**
     * Whether this container has a read-only root filesystem. Default is false.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#read_only_root_filesystem JobV1#read_only_root_filesystem}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReadOnlyRootFilesystem() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_group JobV1#run_as_group}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_non_root JobV1#run_as_non_root}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_user JobV1#run_as_user}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsUser() {
        return null;
    }

    /**
     * seccomp_profile block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#seccomp_profile JobV1#seccomp_profile}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile getSeccompProfile() {
        return null;
    }

    /**
     * se_linux_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#se_linux_options JobV1#se_linux_options}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobV1SpecTemplateSpecContainerSecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobV1SpecTemplateSpecContainerSecurityContext}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobV1SpecTemplateSpecContainerSecurityContext> {
        java.lang.Object allowPrivilegeEscalation;
        imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities capabilities;
        java.lang.Object privileged;
        java.lang.Object readOnlyRootFilesystem;
        java.lang.String runAsGroup;
        java.lang.Object runAsNonRoot;
        java.lang.String runAsUser;
        imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile seccompProfile;
        imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions seLinuxOptions;

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getAllowPrivilegeEscalation}
         * @param allowPrivilegeEscalation AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
         *                                 This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
         *                                 <p>
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#allow_privilege_escalation JobV1#allow_privilege_escalation}
         * @return {@code this}
         */
        public Builder allowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getAllowPrivilegeEscalation}
         * @param allowPrivilegeEscalation AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
         *                                 This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
         *                                 <p>
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#allow_privilege_escalation JobV1#allow_privilege_escalation}
         * @return {@code this}
         */
        public Builder allowPrivilegeEscalation(com.hashicorp.cdktf.IResolvable allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getCapabilities}
         * @param capabilities capabilities block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#capabilities JobV1#capabilities}
         * @return {@code this}
         */
        public Builder capabilities(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getPrivileged}
         * @param privileged Run container in privileged mode.
         *                   Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#privileged JobV1#privileged}
         * @return {@code this}
         */
        public Builder privileged(java.lang.Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getPrivileged}
         * @param privileged Run container in privileged mode.
         *                   Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#privileged JobV1#privileged}
         * @return {@code this}
         */
        public Builder privileged(com.hashicorp.cdktf.IResolvable privileged) {
            this.privileged = privileged;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getReadOnlyRootFilesystem}
         * @param readOnlyRootFilesystem Whether this container has a read-only root filesystem. Default is false.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#read_only_root_filesystem JobV1#read_only_root_filesystem}
         * @return {@code this}
         */
        public Builder readOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getReadOnlyRootFilesystem}
         * @param readOnlyRootFilesystem Whether this container has a read-only root filesystem. Default is false.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#read_only_root_filesystem JobV1#read_only_root_filesystem}
         * @return {@code this}
         */
        public Builder readOnlyRootFilesystem(com.hashicorp.cdktf.IResolvable readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_group JobV1#run_as_group}
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.String runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_non_root JobV1#run_as_non_root}
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_non_root JobV1#run_as_non_root}
         * @return {@code this}
         */
        public Builder runAsNonRoot(com.hashicorp.cdktf.IResolvable runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#run_as_user JobV1#run_as_user}
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.String runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getSeccompProfile}
         * @param seccompProfile seccomp_profile block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#seccomp_profile JobV1#seccomp_profile}
         * @return {@code this}
         */
        public Builder seccompProfile(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        /**
         * Sets the value of {@link JobV1SpecTemplateSpecContainerSecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions se_linux_options block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job_v1#se_linux_options JobV1#se_linux_options}
         * @return {@code this}
         */
        public Builder seLinuxOptions(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobV1SpecTemplateSpecContainerSecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobV1SpecTemplateSpecContainerSecurityContext build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobV1SpecTemplateSpecContainerSecurityContext}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobV1SpecTemplateSpecContainerSecurityContext {
        private final java.lang.Object allowPrivilegeEscalation;
        private final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities capabilities;
        private final java.lang.Object privileged;
        private final java.lang.Object readOnlyRootFilesystem;
        private final java.lang.String runAsGroup;
        private final java.lang.Object runAsNonRoot;
        private final java.lang.String runAsUser;
        private final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile seccompProfile;
        private final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions seLinuxOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowPrivilegeEscalation = software.amazon.jsii.Kernel.get(this, "allowPrivilegeEscalation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.capabilities = software.amazon.jsii.Kernel.get(this, "capabilities", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities.class));
            this.privileged = software.amazon.jsii.Kernel.get(this, "privileged", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.readOnlyRootFilesystem = software.amazon.jsii.Kernel.get(this, "readOnlyRootFilesystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.runAsGroup = software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runAsNonRoot = software.amazon.jsii.Kernel.get(this, "runAsNonRoot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.runAsUser = software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.seccompProfile = software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowPrivilegeEscalation = builder.allowPrivilegeEscalation;
            this.capabilities = builder.capabilities;
            this.privileged = builder.privileged;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsGroup = builder.runAsGroup;
            this.runAsNonRoot = builder.runAsNonRoot;
            this.runAsUser = builder.runAsUser;
            this.seccompProfile = builder.seccompProfile;
            this.seLinuxOptions = builder.seLinuxOptions;
        }

        @Override
        public final java.lang.Object getAllowPrivilegeEscalation() {
            return this.allowPrivilegeEscalation;
        }

        @Override
        public final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextCapabilities getCapabilities() {
            return this.capabilities;
        }

        @Override
        public final java.lang.Object getPrivileged() {
            return this.privileged;
        }

        @Override
        public final java.lang.Object getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        @Override
        public final java.lang.String getRunAsGroup() {
            return this.runAsGroup;
        }

        @Override
        public final java.lang.Object getRunAsNonRoot() {
            return this.runAsNonRoot;
        }

        @Override
        public final java.lang.String getRunAsUser() {
            return this.runAsUser;
        }

        @Override
        public final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeccompProfile getSeccompProfile() {
            return this.seccompProfile;
        }

        @Override
        public final imports.kubernetes.JobV1SpecTemplateSpecContainerSecurityContextSeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowPrivilegeEscalation() != null) {
                data.set("allowPrivilegeEscalation", om.valueToTree(this.getAllowPrivilegeEscalation()));
            }
            if (this.getCapabilities() != null) {
                data.set("capabilities", om.valueToTree(this.getCapabilities()));
            }
            if (this.getPrivileged() != null) {
                data.set("privileged", om.valueToTree(this.getPrivileged()));
            }
            if (this.getReadOnlyRootFilesystem() != null) {
                data.set("readOnlyRootFilesystem", om.valueToTree(this.getReadOnlyRootFilesystem()));
            }
            if (this.getRunAsGroup() != null) {
                data.set("runAsGroup", om.valueToTree(this.getRunAsGroup()));
            }
            if (this.getRunAsNonRoot() != null) {
                data.set("runAsNonRoot", om.valueToTree(this.getRunAsNonRoot()));
            }
            if (this.getRunAsUser() != null) {
                data.set("runAsUser", om.valueToTree(this.getRunAsUser()));
            }
            if (this.getSeccompProfile() != null) {
                data.set("seccompProfile", om.valueToTree(this.getSeccompProfile()));
            }
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobV1SpecTemplateSpecContainerSecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobV1SpecTemplateSpecContainerSecurityContext.Jsii$Proxy that = (JobV1SpecTemplateSpecContainerSecurityContext.Jsii$Proxy) o;

            if (this.allowPrivilegeEscalation != null ? !this.allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) : that.allowPrivilegeEscalation != null) return false;
            if (this.capabilities != null ? !this.capabilities.equals(that.capabilities) : that.capabilities != null) return false;
            if (this.privileged != null ? !this.privileged.equals(that.privileged) : that.privileged != null) return false;
            if (this.readOnlyRootFilesystem != null ? !this.readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) : that.readOnlyRootFilesystem != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seccompProfile != null ? !this.seccompProfile.equals(that.seccompProfile) : that.seccompProfile != null) return false;
            return this.seLinuxOptions != null ? this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowPrivilegeEscalation != null ? this.allowPrivilegeEscalation.hashCode() : 0;
            result = 31 * result + (this.capabilities != null ? this.capabilities.hashCode() : 0);
            result = 31 * result + (this.privileged != null ? this.privileged.hashCode() : 0);
            result = 31 * result + (this.readOnlyRootFilesystem != null ? this.readOnlyRootFilesystem.hashCode() : 0);
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seccompProfile != null ? this.seccompProfile.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            return result;
        }
    }
}
