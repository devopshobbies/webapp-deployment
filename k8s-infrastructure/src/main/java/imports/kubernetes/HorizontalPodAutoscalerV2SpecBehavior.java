package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.887Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.HorizontalPodAutoscalerV2SpecBehavior")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerV2SpecBehavior.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerV2SpecBehavior extends software.amazon.jsii.JsiiSerializable {

    /**
     * scale_down block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_down HorizontalPodAutoscalerV2#scale_down}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getScaleDown() {
        return null;
    }

    /**
     * scale_up block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_up HorizontalPodAutoscalerV2#scale_up}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getScaleUp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerV2SpecBehavior}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerV2SpecBehavior}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerV2SpecBehavior> {
        java.lang.Object scaleDown;
        java.lang.Object scaleUp;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehavior#getScaleDown}
         * @param scaleDown scale_down block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_down HorizontalPodAutoscalerV2#scale_down}
         * @return {@code this}
         */
        public Builder scaleDown(com.hashicorp.cdktf.IResolvable scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehavior#getScaleDown}
         * @param scaleDown scale_down block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_down HorizontalPodAutoscalerV2#scale_down}
         * @return {@code this}
         */
        public Builder scaleDown(java.util.List<? extends imports.kubernetes.HorizontalPodAutoscalerV2SpecBehaviorScaleDown> scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehavior#getScaleUp}
         * @param scaleUp scale_up block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_up HorizontalPodAutoscalerV2#scale_up}
         * @return {@code this}
         */
        public Builder scaleUp(com.hashicorp.cdktf.IResolvable scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerV2SpecBehavior#getScaleUp}
         * @param scaleUp scale_up block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/horizontal_pod_autoscaler_v2#scale_up HorizontalPodAutoscalerV2#scale_up}
         * @return {@code this}
         */
        public Builder scaleUp(java.util.List<? extends imports.kubernetes.HorizontalPodAutoscalerV2SpecBehaviorScaleUp> scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerV2SpecBehavior}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerV2SpecBehavior build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerV2SpecBehavior}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerV2SpecBehavior {
        private final java.lang.Object scaleDown;
        private final java.lang.Object scaleUp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scaleDown = software.amazon.jsii.Kernel.get(this, "scaleDown", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.scaleUp = software.amazon.jsii.Kernel.get(this, "scaleUp", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scaleDown = builder.scaleDown;
            this.scaleUp = builder.scaleUp;
        }

        @Override
        public final java.lang.Object getScaleDown() {
            return this.scaleDown;
        }

        @Override
        public final java.lang.Object getScaleUp() {
            return this.scaleUp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getScaleDown() != null) {
                data.set("scaleDown", om.valueToTree(this.getScaleDown()));
            }
            if (this.getScaleUp() != null) {
                data.set("scaleUp", om.valueToTree(this.getScaleUp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.HorizontalPodAutoscalerV2SpecBehavior"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerV2SpecBehavior.Jsii$Proxy that = (HorizontalPodAutoscalerV2SpecBehavior.Jsii$Proxy) o;

            if (this.scaleDown != null ? !this.scaleDown.equals(that.scaleDown) : that.scaleDown != null) return false;
            return this.scaleUp != null ? this.scaleUp.equals(that.scaleUp) : that.scaleUp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.scaleDown != null ? this.scaleDown.hashCode() : 0;
            result = 31 * result + (this.scaleUp != null ? this.scaleUp.hashCode() : 0);
            return result;
        }
    }
}
