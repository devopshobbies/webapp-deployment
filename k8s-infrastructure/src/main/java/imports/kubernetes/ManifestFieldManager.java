package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.182Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ManifestFieldManager")
@software.amazon.jsii.Jsii.Proxy(ManifestFieldManager.Jsii$Proxy.class)
public interface ManifestFieldManager extends software.amazon.jsii.JsiiSerializable {

    /**
     * Force changes against conflicts.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#force_conflicts Manifest#force_conflicts}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceConflicts() {
        return null;
    }

    /**
     * The name to use for the field manager when creating and updating the resource.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#name Manifest#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManifestFieldManager}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManifestFieldManager}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManifestFieldManager> {
        java.lang.Object forceConflicts;
        java.lang.String name;

        /**
         * Sets the value of {@link ManifestFieldManager#getForceConflicts}
         * @param forceConflicts Force changes against conflicts.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#force_conflicts Manifest#force_conflicts}
         * @return {@code this}
         */
        public Builder forceConflicts(java.lang.Boolean forceConflicts) {
            this.forceConflicts = forceConflicts;
            return this;
        }

        /**
         * Sets the value of {@link ManifestFieldManager#getForceConflicts}
         * @param forceConflicts Force changes against conflicts.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#force_conflicts Manifest#force_conflicts}
         * @return {@code this}
         */
        public Builder forceConflicts(com.hashicorp.cdktf.IResolvable forceConflicts) {
            this.forceConflicts = forceConflicts;
            return this;
        }

        /**
         * Sets the value of {@link ManifestFieldManager#getName}
         * @param name The name to use for the field manager when creating and updating the resource.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/manifest#name Manifest#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManifestFieldManager}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManifestFieldManager build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ManifestFieldManager}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManifestFieldManager {
        private final java.lang.Object forceConflicts;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.forceConflicts = software.amazon.jsii.Kernel.get(this, "forceConflicts", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.forceConflicts = builder.forceConflicts;
            this.name = builder.name;
        }

        @Override
        public final java.lang.Object getForceConflicts() {
            return this.forceConflicts;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getForceConflicts() != null) {
                data.set("forceConflicts", om.valueToTree(this.getForceConflicts()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ManifestFieldManager"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManifestFieldManager.Jsii$Proxy that = (ManifestFieldManager.Jsii$Proxy) o;

            if (this.forceConflicts != null ? !this.forceConflicts.equals(that.forceConflicts) : that.forceConflicts != null) return false;
            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public final int hashCode() {
            int result = this.forceConflicts != null ? this.forceConflicts.hashCode() : 0;
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            return result;
        }
    }
}
