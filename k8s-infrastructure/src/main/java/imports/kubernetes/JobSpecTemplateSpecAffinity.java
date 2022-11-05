package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.941Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecAffinity")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecAffinity.Jsii$Proxy.class)
public interface JobSpecTemplateSpecAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * node_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#node_affinity Job#node_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * pod_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#pod_affinity Job#pod_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return null;
    }

    /**
     * pod_anti_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#pod_anti_affinity Job#pod_anti_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecAffinity> {
        imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
        imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity podAffinity;
        imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinity#getNodeAffinity}
         * @param nodeAffinity node_affinity block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#node_affinity Job#node_affinity}
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinity#getPodAffinity}
         * @param podAffinity pod_affinity block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#pod_affinity Job#pod_affinity}
         * @return {@code this}
         */
        public Builder podAffinity(imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinity#getPodAntiAffinity}
         * @param podAntiAffinity pod_anti_affinity block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#pod_anti_affinity Job#pod_anti_affinity}
         * @return {@code this}
         */
        public Builder podAntiAffinity(imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecAffinity {
        private final imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
        private final imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity podAffinity;
        private final imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity.class));
            this.podAffinity = software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity.class));
            this.podAntiAffinity = software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeAffinity = builder.nodeAffinity;
            this.podAffinity = builder.podAffinity;
            this.podAntiAffinity = builder.podAntiAffinity;
        }

        @Override
        public final imports.kubernetes.JobSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public final imports.kubernetes.JobSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
            return this.podAntiAffinity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPodAffinity() != null) {
                data.set("podAffinity", om.valueToTree(this.getPodAffinity()));
            }
            if (this.getPodAntiAffinity() != null) {
                data.set("podAntiAffinity", om.valueToTree(this.getPodAntiAffinity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecAffinity.Jsii$Proxy that = (JobSpecTemplateSpecAffinity.Jsii$Proxy) o;

            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.podAffinity != null ? !this.podAffinity.equals(that.podAffinity) : that.podAffinity != null) return false;
            return this.podAntiAffinity != null ? this.podAntiAffinity.equals(that.podAntiAffinity) : that.podAntiAffinity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0;
            result = 31 * result + (this.podAffinity != null ? this.podAffinity.hashCode() : 0);
            result = 31 * result + (this.podAntiAffinity != null ? this.podAntiAffinity.hashCode() : 0);
            return result;
        }
    }
}