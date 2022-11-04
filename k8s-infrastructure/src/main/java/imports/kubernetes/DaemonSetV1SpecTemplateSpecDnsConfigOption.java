package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.208Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecDnsConfigOption")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecDnsConfigOption.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecDnsConfigOption extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the option.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#name DaemonSetV1#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Value of the option. Optional: Defaults to empty.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#value DaemonSetV1#value}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecDnsConfigOption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecDnsConfigOption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecDnsConfigOption> {
        java.lang.String name;
        java.lang.String value;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfigOption#getName}
         * @param name Name of the option. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#name DaemonSetV1#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecDnsConfigOption#getValue}
         * @param value Value of the option. Optional: Defaults to empty.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#value DaemonSetV1#value}
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecDnsConfigOption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecDnsConfigOption build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecDnsConfigOption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecDnsConfigOption {
        private final java.lang.String name;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.value = builder.value;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecDnsConfigOption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecDnsConfigOption.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecDnsConfigOption.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
