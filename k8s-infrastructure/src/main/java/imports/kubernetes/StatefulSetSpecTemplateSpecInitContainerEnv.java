package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.981Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecInitContainerEnv")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecInitContainerEnv.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecInitContainerEnv extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#name StatefulSet#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
     * <p>
     * If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#value StatefulSet#value}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * value_from block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#value_from StatefulSet#value_from}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom getValueFrom() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecInitContainerEnv}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecInitContainerEnv}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecInitContainerEnv> {
        java.lang.String name;
        java.lang.String value;
        imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom valueFrom;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnv#getName}
         * @param name Name of the environment variable. Must be a C_IDENTIFIER. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#name StatefulSet#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnv#getValue}
         * @param value Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
         *              If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
         *              <p>
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#value StatefulSet#value}
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnv#getValueFrom}
         * @param valueFrom value_from block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#value_from StatefulSet#value_from}
         * @return {@code this}
         */
        public Builder valueFrom(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecInitContainerEnv}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecInitContainerEnv build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecInitContainerEnv}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecInitContainerEnv {
        private final java.lang.String name;
        private final java.lang.String value;
        private final imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom valueFrom;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.valueFrom = software.amazon.jsii.Kernel.get(this, "valueFrom", software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.value = builder.value;
            this.valueFrom = builder.valueFrom;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom getValueFrom() {
            return this.valueFrom;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }
            if (this.getValueFrom() != null) {
                data.set("valueFrom", om.valueToTree(this.getValueFrom()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecInitContainerEnv"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecInitContainerEnv.Jsii$Proxy that = (StatefulSetSpecTemplateSpecInitContainerEnv.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.value != null ? !this.value.equals(that.value) : that.value != null) return false;
            return this.valueFrom != null ? this.valueFrom.equals(that.valueFrom) : that.valueFrom == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            result = 31 * result + (this.valueFrom != null ? this.valueFrom.hashCode() : 0);
            return result;
        }
    }
}
