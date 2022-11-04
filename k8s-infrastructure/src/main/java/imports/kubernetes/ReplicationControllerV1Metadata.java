package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.771Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerV1Metadata")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerV1Metadata.Jsii$Proxy.class)
public interface ReplicationControllerV1Metadata extends software.amazon.jsii.JsiiSerializable {

    /**
     * An unstructured key value map stored with the replication controller that may be used to store arbitrary metadata.
     * <p>
     * More info: http://kubernetes.io/docs/user-guide/annotations
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#annotations ReplicationControllerV1#annotations}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * Prefix, used by the server, to generate a unique name ONLY IF the `name` field has not been provided.
     * <p>
     * This value will also be combined with a unique suffix. Read more: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#idempotency
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#generate_name ReplicationControllerV1#generate_name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGenerateName() {
        return null;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) the replication controller.
     * <p>
     * May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#labels ReplicationControllerV1#labels}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * Name of the replication controller, must be unique. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#name ReplicationControllerV1#name}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Namespace defines the space within which name of the replication controller must be unique.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#namespace ReplicationControllerV1#namespace}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerV1Metadata}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerV1Metadata}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerV1Metadata> {
        java.util.Map<java.lang.String, java.lang.String> annotations;
        java.lang.String generateName;
        java.util.Map<java.lang.String, java.lang.String> labels;
        java.lang.String name;
        java.lang.String namespace;

        /**
         * Sets the value of {@link ReplicationControllerV1Metadata#getAnnotations}
         * @param annotations An unstructured key value map stored with the replication controller that may be used to store arbitrary metadata.
         *                    More info: http://kubernetes.io/docs/user-guide/annotations
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#annotations ReplicationControllerV1#annotations}
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Metadata#getGenerateName}
         * @param generateName Prefix, used by the server, to generate a unique name ONLY IF the `name` field has not been provided.
         *                     This value will also be combined with a unique suffix. Read more: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#idempotency
         *                     <p>
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#generate_name ReplicationControllerV1#generate_name}
         * @return {@code this}
         */
        public Builder generateName(java.lang.String generateName) {
            this.generateName = generateName;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Metadata#getLabels}
         * @param labels Map of string keys and values that can be used to organize and categorize (scope and select) the replication controller.
         *               May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#labels ReplicationControllerV1#labels}
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Metadata#getName}
         * @param name Name of the replication controller, must be unique. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#name ReplicationControllerV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerV1Metadata#getNamespace}
         * @param namespace Namespace defines the space within which name of the replication controller must be unique.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller_v1#namespace ReplicationControllerV1#namespace}
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerV1Metadata}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerV1Metadata build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerV1Metadata}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerV1Metadata {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.lang.String generateName;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.lang.String name;
        private final java.lang.String namespace;

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
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.namespace = builder.namespace;
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
        public final java.lang.String getNamespace() {
            return this.namespace;
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
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerV1Metadata"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerV1Metadata.Jsii$Proxy that = (ReplicationControllerV1Metadata.Jsii$Proxy) o;

            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            if (this.generateName != null ? !this.generateName.equals(that.generateName) : that.generateName != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.namespace != null ? this.namespace.equals(that.namespace) : that.namespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            result = 31 * result + (this.generateName != null ? this.generateName.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            return result;
        }
    }
}
