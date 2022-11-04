package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.894Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.SecretConfig")
@software.amazon.jsii.Jsii.Proxy(SecretConfig.Jsii$Proxy.class)
public interface SecretConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * metadata block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#metadata Secret#metadata}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.SecretMetadata getMetadata();

    /**
     * A map of the secret data in base64 encoding. Use this for binary data.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#binary_data Secret#binary_data}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
        return null;
    }

    /**
     * A map of the secret data.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#data Secret#data}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/secret#id Secret#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#immutable Secret#immutable}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getImmutable() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#timeouts Secret#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.SecretTimeouts getTimeouts() {
        return null;
    }

    /**
     * Type of secret.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#type Secret#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * Terraform will wait for the service account token to be created.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#wait_for_service_account_token Secret#wait_for_service_account_token}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitForServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretConfig> {
        imports.kubernetes.SecretMetadata metadata;
        java.util.Map<java.lang.String, java.lang.String> binaryData;
        java.util.Map<java.lang.String, java.lang.String> data;
        java.lang.String id;
        java.lang.Object immutable;
        imports.kubernetes.SecretTimeouts timeouts;
        java.lang.String type;
        java.lang.Object waitForServiceAccountToken;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link SecretConfig#getMetadata}
         * @param metadata metadata block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#metadata Secret#metadata}
         * @return {@code this}
         */
        public Builder metadata(imports.kubernetes.SecretMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getBinaryData}
         * @param binaryData A map of the secret data in base64 encoding. Use this for binary data.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#binary_data Secret#binary_data}
         * @return {@code this}
         */
        public Builder binaryData(java.util.Map<java.lang.String, java.lang.String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getData}
         * @param data A map of the secret data.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#data Secret#data}
         * @return {@code this}
         */
        public Builder data(java.util.Map<java.lang.String, java.lang.String> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/secret#id Secret#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getImmutable}
         * @param immutable Ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#immutable Secret#immutable}
         * @return {@code this}
         */
        public Builder immutable(java.lang.Boolean immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getImmutable}
         * @param immutable Ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#immutable Secret#immutable}
         * @return {@code this}
         */
        public Builder immutable(com.hashicorp.cdktf.IResolvable immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#timeouts Secret#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.kubernetes.SecretTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getType}
         * @param type Type of secret.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#type Secret#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getWaitForServiceAccountToken}
         * @param waitForServiceAccountToken Terraform will wait for the service account token to be created.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#wait_for_service_account_token Secret#wait_for_service_account_token}
         * @return {@code this}
         */
        public Builder waitForServiceAccountToken(java.lang.Boolean waitForServiceAccountToken) {
            this.waitForServiceAccountToken = waitForServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getWaitForServiceAccountToken}
         * @param waitForServiceAccountToken Terraform will wait for the service account token to be created.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/secret#wait_for_service_account_token Secret#wait_for_service_account_token}
         * @return {@code this}
         */
        public Builder waitForServiceAccountToken(com.hashicorp.cdktf.IResolvable waitForServiceAccountToken) {
            this.waitForServiceAccountToken = waitForServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getDependsOn}
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
         * Sets the value of {@link SecretConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link SecretConfig#getProvisioners}
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
         * @return a new instance of {@link SecretConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecretConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretConfig {
        private final imports.kubernetes.SecretMetadata metadata;
        private final java.util.Map<java.lang.String, java.lang.String> binaryData;
        private final java.util.Map<java.lang.String, java.lang.String> data;
        private final java.lang.String id;
        private final java.lang.Object immutable;
        private final imports.kubernetes.SecretTimeouts timeouts;
        private final java.lang.String type;
        private final java.lang.Object waitForServiceAccountToken;
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
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.kubernetes.SecretMetadata.class));
            this.binaryData = software.amazon.jsii.Kernel.get(this, "binaryData", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.data = software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.immutable = software.amazon.jsii.Kernel.get(this, "immutable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.SecretTimeouts.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.waitForServiceAccountToken = software.amazon.jsii.Kernel.get(this, "waitForServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.metadata = java.util.Objects.requireNonNull(builder.metadata, "metadata is required");
            this.binaryData = builder.binaryData;
            this.data = builder.data;
            this.id = builder.id;
            this.immutable = builder.immutable;
            this.timeouts = builder.timeouts;
            this.type = builder.type;
            this.waitForServiceAccountToken = builder.waitForServiceAccountToken;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final imports.kubernetes.SecretMetadata getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
            return this.binaryData;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getData() {
            return this.data;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getImmutable() {
            return this.immutable;
        }

        @Override
        public final imports.kubernetes.SecretTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Object getWaitForServiceAccountToken() {
            return this.waitForServiceAccountToken;
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

            data.set("metadata", om.valueToTree(this.getMetadata()));
            if (this.getBinaryData() != null) {
                data.set("binaryData", om.valueToTree(this.getBinaryData()));
            }
            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getImmutable() != null) {
                data.set("immutable", om.valueToTree(this.getImmutable()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getWaitForServiceAccountToken() != null) {
                data.set("waitForServiceAccountToken", om.valueToTree(this.getWaitForServiceAccountToken()));
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
            struct.set("fqn", om.valueToTree("kubernetes.SecretConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretConfig.Jsii$Proxy that = (SecretConfig.Jsii$Proxy) o;

            if (!metadata.equals(that.metadata)) return false;
            if (this.binaryData != null ? !this.binaryData.equals(that.binaryData) : that.binaryData != null) return false;
            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.immutable != null ? !this.immutable.equals(that.immutable) : that.immutable != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.waitForServiceAccountToken != null ? !this.waitForServiceAccountToken.equals(that.waitForServiceAccountToken) : that.waitForServiceAccountToken != null) return false;
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
            int result = this.metadata.hashCode();
            result = 31 * result + (this.binaryData != null ? this.binaryData.hashCode() : 0);
            result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.immutable != null ? this.immutable.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.waitForServiceAccountToken != null ? this.waitForServiceAccountToken.hashCode() : 0);
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
