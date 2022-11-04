package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.157Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonSetV1SpecStrategy")
@software.amazon.jsii.Jsii.Proxy(DaemonSetV1SpecStrategy.Jsii$Proxy.class)
public interface DaemonSetV1SpecStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * rolling_update block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#rolling_update DaemonSetV1#rolling_update}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate getRollingUpdate() {
        return null;
    }

    /**
     * Type of deployment. Can be 'RollingUpdate' or 'OnDelete'. Default is RollingUpdate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#type DaemonSetV1#type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetV1SpecStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetV1SpecStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetV1SpecStrategy> {
        imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate rollingUpdate;
        java.lang.String type;

        /**
         * Sets the value of {@link DaemonSetV1SpecStrategy#getRollingUpdate}
         * @param rollingUpdate rolling_update block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#rolling_update DaemonSetV1#rolling_update}
         * @return {@code this}
         */
        public Builder rollingUpdate(imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetV1SpecStrategy#getType}
         * @param type Type of deployment. Can be 'RollingUpdate' or 'OnDelete'. Default is RollingUpdate.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemon_set_v1#type DaemonSetV1#type}
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetV1SpecStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetV1SpecStrategy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetV1SpecStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetV1SpecStrategy {
        private final imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate rollingUpdate;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rollingUpdate = software.amazon.jsii.Kernel.get(this, "rollingUpdate", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rollingUpdate = builder.rollingUpdate;
            this.type = builder.type;
        }

        @Override
        public final imports.kubernetes.DaemonSetV1SpecStrategyRollingUpdate getRollingUpdate() {
            return this.rollingUpdate;
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

            if (this.getRollingUpdate() != null) {
                data.set("rollingUpdate", om.valueToTree(this.getRollingUpdate()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonSetV1SpecStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetV1SpecStrategy.Jsii$Proxy that = (DaemonSetV1SpecStrategy.Jsii$Proxy) o;

            if (this.rollingUpdate != null ? !this.rollingUpdate.equals(that.rollingUpdate) : that.rollingUpdate != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rollingUpdate != null ? this.rollingUpdate.hashCode() : 0;
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
