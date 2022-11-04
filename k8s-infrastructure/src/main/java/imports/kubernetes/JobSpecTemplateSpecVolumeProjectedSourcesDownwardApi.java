package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:40.028Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.Jsii$Proxy.class)
public interface JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi extends software.amazon.jsii.JsiiSerializable {

    /**
     * items block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#items Job#items}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi> {
        java.lang.Object items;

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#items Job#items}
         * @return {@code this}
         */
        public Builder items(com.hashicorp.cdktf.IResolvable items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job#items Job#items}
         * @return {@code this}
         */
        public Builder items(java.util.List<? extends imports.kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApiItems> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi {
        private final java.lang.Object items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = builder.items;
        }

        @Override
        public final java.lang.Object getItems() {
            return this.items;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.Jsii$Proxy that = (JobSpecTemplateSpecVolumeProjectedSourcesDownwardApi.Jsii$Proxy) o;

            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            return result;
        }
    }
}
