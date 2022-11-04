package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.183Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ManifestWait")
@software.amazon.jsii.Jsii.Proxy(ManifestWait.Jsii$Proxy.class)
public interface ManifestWait extends software.amazon.jsii.JsiiSerializable {

    /**
     * condition block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#condition Manifest#condition}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCondition() {
        return null;
    }

    /**
     * A map of paths to fields to wait for a specific field value.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#fields Manifest#fields}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFields() {
        return null;
    }

    /**
     * Wait for rollout to complete on resources that support `kubectl rollout status`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#rollout Manifest#rollout}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRollout() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManifestWait}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManifestWait}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManifestWait> {
        java.lang.Object condition;
        java.util.Map<java.lang.String, java.lang.String> fields;
        java.lang.Object rollout;

        /**
         * Sets the value of {@link ManifestWait#getCondition}
         * @param condition condition block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#condition Manifest#condition}
         * @return {@code this}
         */
        public Builder condition(com.hashicorp.cdktf.IResolvable condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Sets the value of {@link ManifestWait#getCondition}
         * @param condition condition block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#condition Manifest#condition}
         * @return {@code this}
         */
        public Builder condition(java.util.List<? extends imports.kubernetes.ManifestWaitCondition> condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Sets the value of {@link ManifestWait#getFields}
         * @param fields A map of paths to fields to wait for a specific field value.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#fields Manifest#fields}
         * @return {@code this}
         */
        public Builder fields(java.util.Map<java.lang.String, java.lang.String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link ManifestWait#getRollout}
         * @param rollout Wait for rollout to complete on resources that support `kubectl rollout status`.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#rollout Manifest#rollout}
         * @return {@code this}
         */
        public Builder rollout(java.lang.Boolean rollout) {
            this.rollout = rollout;
            return this;
        }

        /**
         * Sets the value of {@link ManifestWait#getRollout}
         * @param rollout Wait for rollout to complete on resources that support `kubectl rollout status`.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#rollout Manifest#rollout}
         * @return {@code this}
         */
        public Builder rollout(com.hashicorp.cdktf.IResolvable rollout) {
            this.rollout = rollout;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManifestWait}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManifestWait build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ManifestWait}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManifestWait {
        private final java.lang.Object condition;
        private final java.util.Map<java.lang.String, java.lang.String> fields;
        private final java.lang.Object rollout;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.condition = software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.rollout = software.amazon.jsii.Kernel.get(this, "rollout", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.condition = builder.condition;
            this.fields = builder.fields;
            this.rollout = builder.rollout;
        }

        @Override
        public final java.lang.Object getCondition() {
            return this.condition;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getFields() {
            return this.fields;
        }

        @Override
        public final java.lang.Object getRollout() {
            return this.rollout;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCondition() != null) {
                data.set("condition", om.valueToTree(this.getCondition()));
            }
            if (this.getFields() != null) {
                data.set("fields", om.valueToTree(this.getFields()));
            }
            if (this.getRollout() != null) {
                data.set("rollout", om.valueToTree(this.getRollout()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ManifestWait"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManifestWait.Jsii$Proxy that = (ManifestWait.Jsii$Proxy) o;

            if (this.condition != null ? !this.condition.equals(that.condition) : that.condition != null) return false;
            if (this.fields != null ? !this.fields.equals(that.fields) : that.fields != null) return false;
            return this.rollout != null ? this.rollout.equals(that.rollout) : that.rollout == null;
        }

        @Override
        public final int hashCode() {
            int result = this.condition != null ? this.condition.hashCode() : 0;
            result = 31 * result + (this.fields != null ? this.fields.hashCode() : 0);
            result = 31 * result + (this.rollout != null ? this.rollout.hashCode() : 0);
            return result;
        }
    }
}
