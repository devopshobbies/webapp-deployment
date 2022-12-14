package imports.helm;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:36:25.058Z")
@software.amazon.jsii.Jsii(module = imports.helm.$Module.class, fqn = "hashicorp_helm.ReleaseSetSensitive")
@software.amazon.jsii.Jsii.Proxy(ReleaseSetSensitive.Jsii$Proxy.class)
public interface ReleaseSetSensitive extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#name Release#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#value Release#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#type Release#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReleaseSetSensitive}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReleaseSetSensitive}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReleaseSetSensitive> {
        java.lang.String name;
        java.lang.String value;
        java.lang.String type;

        /**
         * Sets the value of {@link ReleaseSetSensitive#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#name Release#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseSetSensitive#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#value Release#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link ReleaseSetSensitive#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/helm/r/release#type Release#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReleaseSetSensitive}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReleaseSetSensitive build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ReleaseSetSensitive}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReleaseSetSensitive {
        private final java.lang.String name;
        private final java.lang.String value;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
            this.type = builder.type;
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
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_helm.ReleaseSetSensitive"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReleaseSetSensitive.Jsii$Proxy that = (ReleaseSetSensitive.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!value.equals(that.value)) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
