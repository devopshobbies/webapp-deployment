package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.182Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ManifestConfig")
@software.amazon.jsii.Jsii.Proxy(ManifestConfig.Jsii$Proxy.class)
public interface ManifestConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * A Kubernetes manifest describing the desired state of the resource in HCL format.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#manifest Manifest#manifest}
     */
    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> getManifest();

    /**
     * List of manifest fields whose values can be altered by the API server during 'apply'. Defaults to: ["metadata.annotations", "metadata.labels"].
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#computed_fields Manifest#computed_fields}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getComputedFields() {
        return null;
    }

    /**
     * field_manager block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#field_manager Manifest#field_manager}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestFieldManager getFieldManager() {
        return null;
    }

    /**
     * The resulting resource state, as returned by the API server after applying the desired state from `manifest`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#object Manifest#object}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getObject() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#timeouts Manifest#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestTimeouts getTimeouts() {
        return null;
    }

    /**
     * wait block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait Manifest#wait}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.ManifestWait getWait() {
        return null;
    }

    /**
     * A map of attribute paths and desired patterns to be matched.
     * <p>
     * After each apply the provider will wait for all attributes listed here to reach a value that matches the desired pattern.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait_for Manifest#wait_for}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitFor() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManifestConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManifestConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManifestConfig> {
        java.util.Map<java.lang.String, java.lang.Object> manifest;
        java.util.List<java.lang.String> computedFields;
        imports.kubernetes.ManifestFieldManager fieldManager;
        java.util.Map<java.lang.String, java.lang.Object> object;
        imports.kubernetes.ManifestTimeouts timeouts;
        imports.kubernetes.ManifestWait wait;
        java.lang.Object waitFor;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ManifestConfig#getManifest}
         * @param manifest A Kubernetes manifest describing the desired state of the resource in HCL format. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#manifest Manifest#manifest}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder manifest(java.util.Map<java.lang.String, ? extends java.lang.Object> manifest) {
            this.manifest = (java.util.Map<java.lang.String, java.lang.Object>)manifest;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getComputedFields}
         * @param computedFields List of manifest fields whose values can be altered by the API server during 'apply'. Defaults to: ["metadata.annotations", "metadata.labels"].
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#computed_fields Manifest#computed_fields}
         * @return {@code this}
         */
        public Builder computedFields(java.util.List<java.lang.String> computedFields) {
            this.computedFields = computedFields;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getFieldManager}
         * @param fieldManager field_manager block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#field_manager Manifest#field_manager}
         * @return {@code this}
         */
        public Builder fieldManager(imports.kubernetes.ManifestFieldManager fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getObject}
         * @param object The resulting resource state, as returned by the API server after applying the desired state from `manifest`.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#object Manifest#object}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder object(java.util.Map<java.lang.String, ? extends java.lang.Object> object) {
            this.object = (java.util.Map<java.lang.String, java.lang.Object>)object;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#timeouts Manifest#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.kubernetes.ManifestTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getWait}
         * @param wait wait block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait Manifest#wait}
         * @return {@code this}
         */
        public Builder wait(imports.kubernetes.ManifestWait wait) {
            this.wait = wait;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getWaitFor}
         * @param waitFor A map of attribute paths and desired patterns to be matched.
         *                After each apply the provider will wait for all attributes listed here to reach a value that matches the desired pattern.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait_for Manifest#wait_for}
         * @return {@code this}
         */
        public Builder waitFor(com.hashicorp.cdktf.IResolvable waitFor) {
            this.waitFor = waitFor;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getWaitFor}
         * @param waitFor A map of attribute paths and desired patterns to be matched.
         *                After each apply the provider will wait for all attributes listed here to reach a value that matches the desired pattern.
         *                <p>
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#wait_for Manifest#wait_for}
         * @return {@code this}
         */
        public Builder waitFor(imports.kubernetes.ManifestWaitFor waitFor) {
            this.waitFor = waitFor;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ManifestConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManifestConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManifestConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ManifestConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManifestConfig {
        private final java.util.Map<java.lang.String, java.lang.Object> manifest;
        private final java.util.List<java.lang.String> computedFields;
        private final imports.kubernetes.ManifestFieldManager fieldManager;
        private final java.util.Map<java.lang.String, java.lang.Object> object;
        private final imports.kubernetes.ManifestTimeouts timeouts;
        private final imports.kubernetes.ManifestWait wait;
        private final java.lang.Object waitFor;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.manifest = software.amazon.jsii.Kernel.get(this, "manifest", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.computedFields = software.amazon.jsii.Kernel.get(this, "computedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.fieldManager = software.amazon.jsii.Kernel.get(this, "fieldManager", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestFieldManager.class));
            this.object = software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestTimeouts.class));
            this.wait = software.amazon.jsii.Kernel.get(this, "wait", software.amazon.jsii.NativeType.forClass(imports.kubernetes.ManifestWait.class));
            this.waitFor = software.amazon.jsii.Kernel.get(this, "waitFor", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.manifest = (java.util.Map<java.lang.String, java.lang.Object>)java.util.Objects.requireNonNull(builder.manifest, "manifest is required");
            this.computedFields = builder.computedFields;
            this.fieldManager = builder.fieldManager;
            this.object = (java.util.Map<java.lang.String, java.lang.Object>)builder.object;
            this.timeouts = builder.timeouts;
            this.wait = builder.wait;
            this.waitFor = builder.waitFor;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getManifest() {
            return this.manifest;
        }

        @Override
        public final java.util.List<java.lang.String> getComputedFields() {
            return this.computedFields;
        }

        @Override
        public final imports.kubernetes.ManifestFieldManager getFieldManager() {
            return this.fieldManager;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getObject() {
            return this.object;
        }

        @Override
        public final imports.kubernetes.ManifestTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final imports.kubernetes.ManifestWait getWait() {
            return this.wait;
        }

        @Override
        public final java.lang.Object getWaitFor() {
            return this.waitFor;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("manifest", om.valueToTree(this.getManifest()));
            if (this.getComputedFields() != null) {
                data.set("computedFields", om.valueToTree(this.getComputedFields()));
            }
            if (this.getFieldManager() != null) {
                data.set("fieldManager", om.valueToTree(this.getFieldManager()));
            }
            if (this.getObject() != null) {
                data.set("object", om.valueToTree(this.getObject()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getWait() != null) {
                data.set("wait", om.valueToTree(this.getWait()));
            }
            if (this.getWaitFor() != null) {
                data.set("waitFor", om.valueToTree(this.getWaitFor()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ManifestConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManifestConfig.Jsii$Proxy that = (ManifestConfig.Jsii$Proxy) o;

            if (!manifest.equals(that.manifest)) return false;
            if (this.computedFields != null ? !this.computedFields.equals(that.computedFields) : that.computedFields != null) return false;
            if (this.fieldManager != null ? !this.fieldManager.equals(that.fieldManager) : that.fieldManager != null) return false;
            if (this.object != null ? !this.object.equals(that.object) : that.object != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.wait != null ? !this.wait.equals(that.wait) : that.wait != null) return false;
            if (this.waitFor != null ? !this.waitFor.equals(that.waitFor) : that.waitFor != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.manifest.hashCode();
            result = 31 * result + (this.computedFields != null ? this.computedFields.hashCode() : 0);
            result = 31 * result + (this.fieldManager != null ? this.fieldManager.hashCode() : 0);
            result = 31 * result + (this.object != null ? this.object.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.wait != null ? this.wait.hashCode() : 0);
            result = 31 * result + (this.waitFor != null ? this.waitFor.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
