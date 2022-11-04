package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:38.969Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint")
@software.amazon.jsii.Jsii.Proxy(CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint.Jsii$Proxy.class)
public interface CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint extends software.amazon.jsii.JsiiSerializable {

    /**
     * label_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#label_selector CronJob#label_selector}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLabelSelector() {
        return null;
    }

    /**
     * describes the degree to which pods may be unevenly distributed.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#max_skew CronJob#max_skew}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxSkew() {
        return null;
    }

    /**
     * the key of node labels.
     * <p>
     * Nodes that have a label with this key and identical values are considered to be in the same topology.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#topology_key CronJob#topology_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTopologyKey() {
        return null;
    }

    /**
     * indicates how to deal with a pod if it doesn't satisfy the spread constraint.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#when_unsatisfiable CronJob#when_unsatisfiable}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWhenUnsatisfiable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint> {
        java.lang.Object labelSelector;
        java.lang.Number maxSkew;
        java.lang.String topologyKey;
        java.lang.String whenUnsatisfiable;

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint#getLabelSelector}
         * @param labelSelector label_selector block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#label_selector CronJob#label_selector}
         * @return {@code this}
         */
        public Builder labelSelector(com.hashicorp.cdktf.IResolvable labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint#getLabelSelector}
         * @param labelSelector label_selector block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#label_selector CronJob#label_selector}
         * @return {@code this}
         */
        public Builder labelSelector(java.util.List<? extends imports.kubernetes.CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintLabelSelector> labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint#getMaxSkew}
         * @param maxSkew describes the degree to which pods may be unevenly distributed.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#max_skew CronJob#max_skew}
         * @return {@code this}
         */
        public Builder maxSkew(java.lang.Number maxSkew) {
            this.maxSkew = maxSkew;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint#getTopologyKey}
         * @param topologyKey the key of node labels.
         *                    Nodes that have a label with this key and identical values are considered to be in the same topology.
         *                    <p>
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#topology_key CronJob#topology_key}
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint#getWhenUnsatisfiable}
         * @param whenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/cron_job#when_unsatisfiable CronJob#when_unsatisfiable}
         * @return {@code this}
         */
        public Builder whenUnsatisfiable(java.lang.String whenUnsatisfiable) {
            this.whenUnsatisfiable = whenUnsatisfiable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint {
        private final java.lang.Object labelSelector;
        private final java.lang.Number maxSkew;
        private final java.lang.String topologyKey;
        private final java.lang.String whenUnsatisfiable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxSkew = software.amazon.jsii.Kernel.get(this, "maxSkew", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.topologyKey = software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.whenUnsatisfiable = software.amazon.jsii.Kernel.get(this, "whenUnsatisfiable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.labelSelector = builder.labelSelector;
            this.maxSkew = builder.maxSkew;
            this.topologyKey = builder.topologyKey;
            this.whenUnsatisfiable = builder.whenUnsatisfiable;
        }

        @Override
        public final java.lang.Object getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public final java.lang.Number getMaxSkew() {
            return this.maxSkew;
        }

        @Override
        public final java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public final java.lang.String getWhenUnsatisfiable() {
            return this.whenUnsatisfiable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getMaxSkew() != null) {
                data.set("maxSkew", om.valueToTree(this.getMaxSkew()));
            }
            if (this.getTopologyKey() != null) {
                data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            }
            if (this.getWhenUnsatisfiable() != null) {
                data.set("whenUnsatisfiable", om.valueToTree(this.getWhenUnsatisfiable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint.Jsii$Proxy that = (CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraint.Jsii$Proxy) o;

            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            if (this.maxSkew != null ? !this.maxSkew.equals(that.maxSkew) : that.maxSkew != null) return false;
            if (this.topologyKey != null ? !this.topologyKey.equals(that.topologyKey) : that.topologyKey != null) return false;
            return this.whenUnsatisfiable != null ? this.whenUnsatisfiable.equals(that.whenUnsatisfiable) : that.whenUnsatisfiable == null;
        }

        @Override
        public final int hashCode() {
            int result = this.labelSelector != null ? this.labelSelector.hashCode() : 0;
            result = 31 * result + (this.maxSkew != null ? this.maxSkew.hashCode() : 0);
            result = 31 * result + (this.topologyKey != null ? this.topologyKey.hashCode() : 0);
            result = 31 * result + (this.whenUnsatisfiable != null ? this.whenUnsatisfiable.hashCode() : 0);
            return result;
        }
    }
}
