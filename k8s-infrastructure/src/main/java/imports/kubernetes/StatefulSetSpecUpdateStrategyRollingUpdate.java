package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:41.042Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecUpdateStrategyRollingUpdate")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecUpdateStrategyRollingUpdate.Jsii$Proxy.class)
public interface StatefulSetSpecUpdateStrategyRollingUpdate extends software.amazon.jsii.JsiiSerializable {

    /**
     * Indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#partition StatefulSet#partition}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPartition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecUpdateStrategyRollingUpdate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecUpdateStrategyRollingUpdate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecUpdateStrategyRollingUpdate> {
        java.lang.Number partition;

        /**
         * Sets the value of {@link StatefulSetSpecUpdateStrategyRollingUpdate#getPartition}
         * @param partition Indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set#partition StatefulSet#partition}
         * @return {@code this}
         */
        public Builder partition(java.lang.Number partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecUpdateStrategyRollingUpdate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecUpdateStrategyRollingUpdate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecUpdateStrategyRollingUpdate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecUpdateStrategyRollingUpdate {
        private final java.lang.Number partition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.partition = software.amazon.jsii.Kernel.get(this, "partition", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.partition = builder.partition;
        }

        @Override
        public final java.lang.Number getPartition() {
            return this.partition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPartition() != null) {
                data.set("partition", om.valueToTree(this.getPartition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecUpdateStrategyRollingUpdate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecUpdateStrategyRollingUpdate.Jsii$Proxy that = (StatefulSetSpecUpdateStrategyRollingUpdate.Jsii$Proxy) o;

            return this.partition != null ? this.partition.equals(that.partition) : that.partition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.partition != null ? this.partition.hashCode() : 0;
            return result;
        }
    }
}
