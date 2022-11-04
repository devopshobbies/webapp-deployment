package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.305Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes.Jsii$Proxy.class)
public interface PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes extends software.amazon.jsii.JsiiSerializable {

    /**
     * driver is the name of the Flexvolume driver.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#driver PodSecurityPolicyV1Beta1#driver}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes> {
        java.lang.String driver;

        /**
         * Sets the value of {@link PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes#getDriver}
         * @param driver driver is the name of the Flexvolume driver. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod_security_policy_v1beta1#driver PodSecurityPolicyV1Beta1#driver}
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes {
        private final java.lang.String driver;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes.Jsii$Proxy that = (PodSecurityPolicyV1Beta1SpecAllowedFlexVolumes.Jsii$Proxy) o;

            return this.driver.equals(that.driver);
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            return result;
        }
    }
}
