package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.151Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CsiDriverMetadata")
@software.amazon.jsii.Jsii.Proxy(CsiDriverMetadata.Jsii$Proxy.class)
public interface CsiDriverMetadata extends software.amazon.jsii.JsiiSerializable {

    /**
     * An unstructured key value map stored with the csi driver that may be used to store arbitrary metadata.
     * <p>
     * More info: http://kubernetes.io/docs/user-guide/annotations
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#annotations CsiDriver#annotations}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * Prefix, used by the server, to generate a unique name ONLY IF the `name` field has not been provided.
     * <p>
     * This value will also be combined with a unique suffix. Read more: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#idempotency
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#generate_name CsiDriver#generate_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGenerateName() {
        return null;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) the csi driver.
     * <p>
     * May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#labels CsiDriver#labels}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * Name of the csi driver, must be unique. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#name CsiDriver#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiDriverMetadata}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiDriverMetadata}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiDriverMetadata> {
        java.util.Map<java.lang.String, java.lang.String> annotations;
        java.lang.String generateName;
        java.util.Map<java.lang.String, java.lang.String> labels;
        java.lang.String name;

        /**
         * Sets the value of {@link CsiDriverMetadata#getAnnotations}
         * @param annotations An unstructured key value map stored with the csi driver that may be used to store arbitrary metadata.
         *                    More info: http://kubernetes.io/docs/user-guide/annotations
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#annotations CsiDriver#annotations}
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverMetadata#getGenerateName}
         * @param generateName Prefix, used by the server, to generate a unique name ONLY IF the `name` field has not been provided.
         *                     This value will also be combined with a unique suffix. Read more: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#idempotency
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#generate_name CsiDriver#generate_name}
         * @return {@code this}
         */
        public Builder generateName(java.lang.String generateName) {
            this.generateName = generateName;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverMetadata#getLabels}
         * @param labels Map of string keys and values that can be used to organize and categorize (scope and select) the csi driver.
         *               May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#labels CsiDriver#labels}
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverMetadata#getName}
         * @param name Name of the csi driver, must be unique. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/csi_driver#name CsiDriver#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiDriverMetadata}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiDriverMetadata build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiDriverMetadata}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiDriverMetadata {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.lang.String generateName;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.annotations = software.amazon.jsii.Kernel.get(this, "annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.generateName = software.amazon.jsii.Kernel.get(this, "generateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.labels = software.amazon.jsii.Kernel.get(this, "labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.annotations = builder.annotations;
            this.generateName = builder.generateName;
            this.labels = builder.labels;
            this.name = builder.name;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public final java.lang.String getGenerateName() {
            return this.generateName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
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

            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }
            if (this.getGenerateName() != null) {
                data.set("generateName", om.valueToTree(this.getGenerateName()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CsiDriverMetadata"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiDriverMetadata.Jsii$Proxy that = (CsiDriverMetadata.Jsii$Proxy) o;

            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            if (this.generateName != null ? !this.generateName.equals(that.generateName) : that.generateName != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public final int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            result = 31 * result + (this.generateName != null ? this.generateName.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            return result;
        }
    }
}