package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.312Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecAffinity")
@software.amazon.jsii.Jsii.Proxy(PodSpecAffinity.Jsii$Proxy.class)
public interface PodSpecAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * node_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#node_affinity Pod#node_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * pod_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#pod_affinity Pod#pod_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityPodAffinity getPodAffinity() {
        return null;
    }

    /**
     * pod_anti_affinity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#pod_anti_affinity Pod#pod_anti_affinity}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.PodSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecAffinity> {
        imports.kubernetes.PodSpecAffinityNodeAffinity nodeAffinity;
        imports.kubernetes.PodSpecAffinityPodAffinity podAffinity;
        imports.kubernetes.PodSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link PodSpecAffinity#getNodeAffinity}
         * @param nodeAffinity node_affinity block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#node_affinity Pod#node_affinity}
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.kubernetes.PodSpecAffinityNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecAffinity#getPodAffinity}
         * @param podAffinity pod_affinity block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#pod_affinity Pod#pod_affinity}
         * @return {@code this}
         */
        public Builder podAffinity(imports.kubernetes.PodSpecAffinityPodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecAffinity#getPodAntiAffinity}
         * @param podAntiAffinity pod_anti_affinity block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod#pod_anti_affinity Pod#pod_anti_affinity}
         * @return {@code this}
         */
        public Builder podAntiAffinity(imports.kubernetes.PodSpecAffinityPodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSpecAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecAffinity {
        private final imports.kubernetes.PodSpecAffinityNodeAffinity nodeAffinity;
        private final imports.kubernetes.PodSpecAffinityPodAffinity podAffinity;
        private final imports.kubernetes.PodSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityNodeAffinity.class));
            this.podAffinity = software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAffinity.class));
            this.podAntiAffinity = software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAntiAffinity.class));
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
        public final imports.kubernetes.PodSpecAffinityNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final imports.kubernetes.PodSpecAffinityPodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public final imports.kubernetes.PodSpecAffinityPodAntiAffinity getPodAntiAffinity() {
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
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecAffinity.Jsii$Proxy that = (PodSpecAffinity.Jsii$Proxy) o;

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
