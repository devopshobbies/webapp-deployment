package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.957Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecContainerLifecycle")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecContainerLifecycle.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecContainerLifecycle extends software.amazon.jsii.JsiiSerializable {

    /**
     * post_start block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#post_start StatefulSet#post_start}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPostStart() {
        return null;
    }

    /**
     * pre_stop block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#pre_stop StatefulSet#pre_stop}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPreStop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecContainerLifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecContainerLifecycle}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecContainerLifecycle> {
        java.lang.Object postStart;
        java.lang.Object preStop;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecContainerLifecycle#getPostStart}
         * @param postStart post_start block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#post_start StatefulSet#post_start}
         * @return {@code this}
         */
        public Builder postStart(com.hashicorp.cdktf.IResolvable postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecContainerLifecycle#getPostStart}
         * @param postStart post_start block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#post_start StatefulSet#post_start}
         * @return {@code this}
         */
        public Builder postStart(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecContainerLifecyclePostStart> postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecContainerLifecycle#getPreStop}
         * @param preStop pre_stop block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#pre_stop StatefulSet#pre_stop}
         * @return {@code this}
         */
        public Builder preStop(com.hashicorp.cdktf.IResolvable preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecContainerLifecycle#getPreStop}
         * @param preStop pre_stop block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#pre_stop StatefulSet#pre_stop}
         * @return {@code this}
         */
        public Builder preStop(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecContainerLifecyclePreStop> preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecContainerLifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecContainerLifecycle build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecContainerLifecycle}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecContainerLifecycle {
        private final java.lang.Object postStart;
        private final java.lang.Object preStop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.postStart = software.amazon.jsii.Kernel.get(this, "postStart", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.preStop = software.amazon.jsii.Kernel.get(this, "preStop", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
        }

        @Override
        public final java.lang.Object getPostStart() {
            return this.postStart;
        }

        @Override
        public final java.lang.Object getPreStop() {
            return this.preStop;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPostStart() != null) {
                data.set("postStart", om.valueToTree(this.getPostStart()));
            }
            if (this.getPreStop() != null) {
                data.set("preStop", om.valueToTree(this.getPreStop()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecContainerLifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecContainerLifecycle.Jsii$Proxy that = (StatefulSetSpecTemplateSpecContainerLifecycle.Jsii$Proxy) o;

            if (this.postStart != null ? !this.postStart.equals(that.postStart) : that.postStart != null) return false;
            return this.preStop != null ? this.preStop.equals(that.preStop) : that.preStop == null;
        }

        @Override
        public final int hashCode() {
            int result = this.postStart != null ? this.postStart.hashCode() : 0;
            result = 31 * result + (this.preStop != null ? this.preStop.hashCode() : 0);
            return result;
        }
    }
}
