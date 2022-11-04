package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.278Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpec")
@software.amazon.jsii.Jsii.Proxy(DaemonsetSpec.Jsii$Proxy.class)
public interface DaemonsetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#template Daemonset#template}
     */
    @org.jetbrains.annotations.NotNull imports.kubernetes.DaemonsetSpecTemplate getTemplate();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready)
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#min_ready_seconds Daemonset#min_ready_seconds}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#revision_history_limit Daemonset#revision_history_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#selector Daemonset#selector}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecSelector getSelector() {
        return null;
    }

    /**
     * strategy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#strategy Daemonset#strategy}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.DaemonsetSpecStrategy getStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonsetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonsetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonsetSpec> {
        imports.kubernetes.DaemonsetSpecTemplate template;
        java.lang.Number minReadySeconds;
        java.lang.Number revisionHistoryLimit;
        imports.kubernetes.DaemonsetSpecSelector selector;
        imports.kubernetes.DaemonsetSpecStrategy strategy;

        /**
         * Sets the value of {@link DaemonsetSpec#getTemplate}
         * @param template template block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#template Daemonset#template}
         * @return {@code this}
         */
        public Builder template(imports.kubernetes.DaemonsetSpecTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         *                        <p>
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#min_ready_seconds Daemonset#min_ready_seconds}
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The number of old ReplicaSets to retain to allow rollback.
         *                             This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#revision_history_limit Daemonset#revision_history_limit}
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpec#getSelector}
         * @param selector selector block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#selector Daemonset#selector}
         * @return {@code this}
         */
        public Builder selector(imports.kubernetes.DaemonsetSpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpec#getStrategy}
         * @param strategy strategy block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#strategy Daemonset#strategy}
         * @return {@code this}
         */
        public Builder strategy(imports.kubernetes.DaemonsetSpecStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonsetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonsetSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonsetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonsetSpec {
        private final imports.kubernetes.DaemonsetSpecTemplate template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number revisionHistoryLimit;
        private final imports.kubernetes.DaemonsetSpecSelector selector;
        private final imports.kubernetes.DaemonsetSpecStrategy strategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecTemplate.class));
            this.minReadySeconds = software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecSelector.class));
            this.strategy = software.amazon.jsii.Kernel.get(this, "strategy", software.amazon.jsii.NativeType.forClass(imports.kubernetes.DaemonsetSpecStrategy.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.minReadySeconds = builder.minReadySeconds;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.selector = builder.selector;
            this.strategy = builder.strategy;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecTemplate getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public final java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecSelector getSelector() {
            return this.selector;
        }

        @Override
        public final imports.kubernetes.DaemonsetSpecStrategy getStrategy() {
            return this.strategy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getStrategy() != null) {
                data.set("strategy", om.valueToTree(this.getStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonsetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonsetSpec.Jsii$Proxy that = (DaemonsetSpec.Jsii$Proxy) o;

            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.strategy != null ? this.strategy.equals(that.strategy) : that.strategy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.template.hashCode();
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.strategy != null ? this.strategy.hashCode() : 0);
            return result;
        }
    }
}
