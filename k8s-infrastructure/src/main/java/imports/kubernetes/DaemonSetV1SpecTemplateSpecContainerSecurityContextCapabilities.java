package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.204Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities.Jsii$Proxy.class)
public interface DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities extends software.amazon.jsii.JsiiSerializable {

    /**
     * Added capabilities.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#add DaemonSetV1#add}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdd() {
        return null;
    }

    /**
     * Removed capabilities.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#drop DaemonSetV1#drop}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDrop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities> {
        java.util.List<java.lang.String> add;
        java.util.List<java.lang.String> drop;

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities#getAdd}
         * @param add Added capabilities.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#add DaemonSetV1#add}
         * @return {@code this}
         */
        public Builder add(java.util.List<java.lang.String> add) {
            this.add = add;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities#getDrop}
         * @param drop Removed capabilities.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#drop DaemonSetV1#drop}
         * @return {@code this}
         */
        public Builder drop(java.util.List<java.lang.String> drop) {
            this.drop = drop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities {
        private final java.util.List<java.lang.String> add;
        private final java.util.List<java.lang.String> drop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.add = software.amazon.jsii.Kernel.get(this, "add", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.drop = software.amazon.jsii.Kernel.get(this, "drop", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.add = builder.add;
            this.drop = builder.drop;
        }

        @Override
        public final java.util.List<java.lang.String> getAdd() {
            return this.add;
        }

        @Override
        public final java.util.List<java.lang.String> getDrop() {
            return this.drop;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAdd() != null) {
                data.set("add", om.valueToTree(this.getAdd()));
            }
            if (this.getDrop() != null) {
                data.set("drop", om.valueToTree(this.getDrop()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities.Jsii$Proxy that = (DaemonSetV1SpecTemplateSpecContainerSecurityContextCapabilities.Jsii$Proxy) o;

            if (this.add != null ? !this.add.equals(that.add) : that.add != null) return false;
            return this.drop != null ? this.drop.equals(that.drop) : that.drop == null;
        }

        @Override
        public final int hashCode() {
            int result = this.add != null ? this.add.hashCode() : 0;
            result = 31 * result + (this.drop != null ? this.drop.hashCode() : 0);
            return result;
        }
    }
}