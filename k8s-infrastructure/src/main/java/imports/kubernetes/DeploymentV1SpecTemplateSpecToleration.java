package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.804Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentV1SpecTemplateSpecToleration")
@software.amazon.jsii.Jsii.Proxy(DeploymentV1SpecTemplateSpecToleration.Jsii$Proxy.class)
public interface DeploymentV1SpecTemplateSpecToleration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Effect indicates the taint effect to match.
     * <p>
     * Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#effect DeploymentV1#effect}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEffect() {
        return null;
    }

    /**
     * Key is the taint key that the toleration applies to.
     * <p>
     * Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#key DeploymentV1#key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * Operator represents a key's relationship to the value.
     * <p>
     * Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#operator DeploymentV1#operator}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperator() {
        return null;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
     * <p>
     * By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#toleration_seconds DeploymentV1#toleration_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTolerationSeconds() {
        return null;
    }

    /**
     * Value is the taint value the toleration matches to.
     * <p>
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#value DeploymentV1#value}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentV1SpecTemplateSpecToleration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentV1SpecTemplateSpecToleration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentV1SpecTemplateSpecToleration> {
        java.lang.String effect;
        java.lang.String key;
        java.lang.String operator;
        java.lang.String tolerationSeconds;
        java.lang.String value;

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecToleration#getEffect}
         * @param effect Effect indicates the taint effect to match.
         *               Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#effect DeploymentV1#effect}
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecToleration#getKey}
         * @param key Key is the taint key that the toleration applies to.
         *            Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
         *            <p>
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#key DeploymentV1#key}
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecToleration#getOperator}
         * @param operator Operator represents a key's relationship to the value.
         *                 Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
         *                 <p>
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#operator DeploymentV1#operator}
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecToleration#getTolerationSeconds}
         * @param tolerationSeconds TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
         *                          By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
         *                          <p>
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#toleration_seconds DeploymentV1#toleration_seconds}
         * @return {@code this}
         */
        public Builder tolerationSeconds(java.lang.String tolerationSeconds) {
            this.tolerationSeconds = tolerationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentV1SpecTemplateSpecToleration#getValue}
         * @param value Value is the taint value the toleration matches to.
         *              If the operator is Exists, the value should be empty, otherwise just a regular string.
         *              <p>
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/deployment_v1#value DeploymentV1#value}
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentV1SpecTemplateSpecToleration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentV1SpecTemplateSpecToleration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeploymentV1SpecTemplateSpecToleration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentV1SpecTemplateSpecToleration {
        private final java.lang.String effect;
        private final java.lang.String key;
        private final java.lang.String operator;
        private final java.lang.String tolerationSeconds;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.effect = software.amazon.jsii.Kernel.get(this, "effect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tolerationSeconds = software.amazon.jsii.Kernel.get(this, "tolerationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.effect = builder.effect;
            this.key = builder.key;
            this.operator = builder.operator;
            this.tolerationSeconds = builder.tolerationSeconds;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getEffect() {
            return this.effect;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.lang.String getTolerationSeconds() {
            return this.tolerationSeconds;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEffect() != null) {
                data.set("effect", om.valueToTree(this.getEffect()));
            }
            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getOperator() != null) {
                data.set("operator", om.valueToTree(this.getOperator()));
            }
            if (this.getTolerationSeconds() != null) {
                data.set("tolerationSeconds", om.valueToTree(this.getTolerationSeconds()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentV1SpecTemplateSpecToleration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentV1SpecTemplateSpecToleration.Jsii$Proxy that = (DeploymentV1SpecTemplateSpecToleration.Jsii$Proxy) o;

            if (this.effect != null ? !this.effect.equals(that.effect) : that.effect != null) return false;
            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.operator != null ? !this.operator.equals(that.operator) : that.operator != null) return false;
            if (this.tolerationSeconds != null ? !this.tolerationSeconds.equals(that.tolerationSeconds) : that.tolerationSeconds != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.effect != null ? this.effect.hashCode() : 0;
            result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
            result = 31 * result + (this.operator != null ? this.operator.hashCode() : 0);
            result = 31 * result + (this.tolerationSeconds != null ? this.tolerationSeconds.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
