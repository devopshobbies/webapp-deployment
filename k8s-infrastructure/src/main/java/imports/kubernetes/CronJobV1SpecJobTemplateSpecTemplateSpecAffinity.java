package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.022Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinity")
@software.amazon.jsii.Jsii.Proxy(CronJobV1SpecJobTemplateSpecTemplateSpecAffinity.Jsii$Proxy.class)
public interface CronJobV1SpecJobTemplateSpecTemplateSpecAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * node_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#node_affinity CronJobV1#node_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * pod_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#pod_affinity CronJobV1#pod_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return null;
    }

    /**
     * pod_anti_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#pod_anti_affinity CronJobV1#pod_anti_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobV1SpecJobTemplateSpecTemplateSpecAffinity> {
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity;
        imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity#getNodeAffinity}
         * @param nodeAffinity node_affinity block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#node_affinity CronJobV1#node_affinity}
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity#getPodAffinity}
         * @param podAffinity pod_affinity block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#pod_affinity CronJobV1#pod_affinity}
         * @return {@code this}
         */
        public Builder podAffinity(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity#getPodAntiAffinity}
         * @param podAntiAffinity pod_anti_affinity block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job_v1#pod_anti_affinity CronJobV1#pod_anti_affinity}
         * @return {@code this}
         */
        public Builder podAntiAffinity(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobV1SpecJobTemplateSpecTemplateSpecAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobV1SpecJobTemplateSpecTemplateSpecAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobV1SpecJobTemplateSpecTemplateSpecAffinity {
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity;
        private final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity.class));
            this.podAffinity = software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity.class));
            this.podAntiAffinity = software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity.class));
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
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public final imports.kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
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
            struct.set("fqn", om.valueToTree("kubernetes.CronJobV1SpecJobTemplateSpecTemplateSpecAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobV1SpecJobTemplateSpecTemplateSpecAffinity.Jsii$Proxy that = (CronJobV1SpecJobTemplateSpecTemplateSpecAffinity.Jsii$Proxy) o;

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
