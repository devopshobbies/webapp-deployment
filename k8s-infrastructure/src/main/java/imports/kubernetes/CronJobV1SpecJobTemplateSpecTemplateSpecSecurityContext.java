package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.110Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext")
@software.amazon.jsii.Jsii.Proxy(CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext.Jsii$Proxy.class)
public interface CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * A special supplemental group that applies to all containers in a pod.
     * <p>
     * Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw---- If unset, the Kubelet will not modify the ownership and permissions of any volume.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#fs_group CronJobV1#fs_group}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsGroup() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_group CronJobV1#run_as_group}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_non_root CronJobV1#run_as_non_root}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_user CronJobV1#run_as_user}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsUser() {
        return null;
    }

    /**
     * seccomp_profile block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#seccomp_profile CronJobV1#seccomp_profile}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile getSeccompProfile() {
        return null;
    }

    /**
     * se_linux_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#se_linux_options CronJobV1#se_linux_options}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID.
     * <p>
     * If unspecified, no groups will be added to any container.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#supplemental_groups CronJobV1#supplemental_groups}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getSupplementalGroups() {
        return null;
    }

    /**
     * sysctl block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#sysctl CronJobV1#sysctl}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSysctl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext> {
        java.lang.String fsGroup;
        java.lang.String runAsGroup;
        java.lang.Object runAsNonRoot;
        java.lang.String runAsUser;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
        java.util.List<java.lang.Number> supplementalGroups;
        java.lang.Object sysctl;

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getFsGroup}
         * @param fsGroup A special supplemental group that applies to all containers in a pod.
         *                Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw---- If unset, the Kubelet will not modify the ownership and permissions of any volume.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#fs_group CronJobV1#fs_group}
         * @return {@code this}
         */
        public Builder fsGroup(java.lang.String fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_group CronJobV1#run_as_group}
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.String runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_non_root CronJobV1#run_as_non_root}
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_non_root CronJobV1#run_as_non_root}
         * @return {@code this}
         */
        public Builder runAsNonRoot(com.hashicorp.cdktf.IResolvable runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#run_as_user CronJobV1#run_as_user}
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.String runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getSeccompProfile}
         * @param seccompProfile seccomp_profile block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#seccomp_profile CronJobV1#seccomp_profile}
         * @return {@code this}
         */
        public Builder seccompProfile(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions se_linux_options block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#se_linux_options CronJobV1#se_linux_options}
         * @return {@code this}
         */
        public Builder seLinuxOptions(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getSupplementalGroups}
         * @param supplementalGroups A list of groups applied to the first process run in each container, in addition to the container's primary GID.
         *                           If unspecified, no groups will be added to any container.
         *                           <p>
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#supplemental_groups CronJobV1#supplemental_groups}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder supplementalGroups(java.util.List<? extends java.lang.Number> supplementalGroups) {
            this.supplementalGroups = (java.util.List<java.lang.Number>)supplementalGroups;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getSysctl}
         * @param sysctl sysctl block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#sysctl CronJobV1#sysctl}
         * @return {@code this}
         */
        public Builder sysctl(com.hashicorp.cdktf.IResolvable sysctl) {
            this.sysctl = sysctl;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext#getSysctl}
         * @param sysctl sysctl block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#sysctl CronJobV1#sysctl}
         * @return {@code this}
         */
        public Builder sysctl(java.util.List<? extends imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSysctl> sysctl) {
            this.sysctl = sysctl;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext {
        private final java.lang.String fsGroup;
        private final java.lang.String runAsGroup;
        private final java.lang.Object runAsNonRoot;
        private final java.lang.String runAsUser;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
        private final java.util.List<java.lang.Number> supplementalGroups;
        private final java.lang.Object sysctl;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsGroup = software.amazon.jsii.Kernel.get(this, "fsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runAsGroup = software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runAsNonRoot = software.amazon.jsii.Kernel.get(this, "runAsNonRoot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.runAsUser = software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.seccompProfile = software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions.class));
            this.supplementalGroups = software.amazon.jsii.Kernel.get(this, "supplementalGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class)));
            this.sysctl = software.amazon.jsii.Kernel.get(this, "sysctl", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsGroup = builder.fsGroup;
            this.runAsGroup = builder.runAsGroup;
            this.runAsNonRoot = builder.runAsNonRoot;
            this.runAsUser = builder.runAsUser;
            this.seccompProfile = builder.seccompProfile;
            this.seLinuxOptions = builder.seLinuxOptions;
            this.supplementalGroups = (java.util.List<java.lang.Number>)builder.supplementalGroups;
            this.sysctl = builder.sysctl;
        }

        @Override
        public final java.lang.String getFsGroup() {
            return this.fsGroup;
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
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile getSeccompProfile() {
            return this.seccompProfile;
        }

        @Override
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        public final java.util.List<java.lang.Number> getSupplementalGroups() {
            return this.supplementalGroups;
        }

        @Override
        public final java.lang.Object getSysctl() {
            return this.sysctl;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFsGroup() != null) {
                data.set("fsGroup", om.valueToTree(this.getFsGroup()));
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
            if (this.getSupplementalGroups() != null) {
                data.set("supplementalGroups", om.valueToTree(this.getSupplementalGroups()));
            }
            if (this.getSysctl() != null) {
                data.set("sysctl", om.valueToTree(this.getSysctl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext.Jsii$Proxy that = (CronJobV1SpecJobTemplateSpecTemplateSpecSecurityContext.Jsii$Proxy) o;

            if (this.fsGroup != null ? !this.fsGroup.equals(that.fsGroup) : that.fsGroup != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seccompProfile != null ? !this.seccompProfile.equals(that.seccompProfile) : that.seccompProfile != null) return false;
            if (this.seLinuxOptions != null ? !this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions != null) return false;
            if (this.supplementalGroups != null ? !this.supplementalGroups.equals(that.supplementalGroups) : that.supplementalGroups != null) return false;
            return this.sysctl != null ? this.sysctl.equals(that.sysctl) : that.sysctl == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fsGroup != null ? this.fsGroup.hashCode() : 0;
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seccompProfile != null ? this.seccompProfile.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            result = 31 * result + (this.supplementalGroups != null ? this.supplementalGroups.hashCode() : 0);
            result = 31 * result + (this.sysctl != null ? this.sysctl.hashCode() : 0);
            return result;
        }
    }
}
