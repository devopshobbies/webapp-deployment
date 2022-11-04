package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.2 (build a8a8833)", date = "2022-11-04T11:35:39.394Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir")
@software.amazon.jsii.Jsii.Proxy(DaemonsetSpecTemplateSpecVolumeEmptyDir.Jsii$Proxy.class)
public interface DaemonsetSpecTemplateSpecVolumeEmptyDir extends software.amazon.jsii.JsiiSerializable {

    /**
     * What type of storage medium should back this directory.
     * <p>
     * The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#medium Daemonset#medium}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMedium() {
        return null;
    }

    /**
     * Total amount of local storage required for this EmptyDir volume.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#size_limit Daemonset#size_limit}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSizeLimit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonsetSpecTemplateSpecVolumeEmptyDir}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonsetSpecTemplateSpecVolumeEmptyDir}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonsetSpecTemplateSpecVolumeEmptyDir> {
        java.lang.String medium;
        java.lang.String sizeLimit;

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolumeEmptyDir#getMedium}
         * @param medium What type of storage medium should back this directory.
         *               The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#medium Daemonset#medium}
         * @return {@code this}
         */
        public Builder medium(java.lang.String medium) {
            this.medium = medium;
            return this;
        }

        /**
         * Sets the value of {@link DaemonsetSpecTemplateSpecVolumeEmptyDir#getSizeLimit}
         * @param sizeLimit Total amount of local storage required for this EmptyDir volume.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/daemonset#size_limit Daemonset#size_limit}
         * @return {@code this}
         */
        public Builder sizeLimit(java.lang.String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonsetSpecTemplateSpecVolumeEmptyDir}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonsetSpecTemplateSpecVolumeEmptyDir build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonsetSpecTemplateSpecVolumeEmptyDir}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonsetSpecTemplateSpecVolumeEmptyDir {
        private final java.lang.String medium;
        private final java.lang.String sizeLimit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.medium = software.amazon.jsii.Kernel.get(this, "medium", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sizeLimit = software.amazon.jsii.Kernel.get(this, "sizeLimit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.medium = builder.medium;
            this.sizeLimit = builder.sizeLimit;
        }

        @Override
        public final java.lang.String getMedium() {
            return this.medium;
        }

        @Override
        public final java.lang.String getSizeLimit() {
            return this.sizeLimit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMedium() != null) {
                data.set("medium", om.valueToTree(this.getMedium()));
            }
            if (this.getSizeLimit() != null) {
                data.set("sizeLimit", om.valueToTree(this.getSizeLimit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DaemonsetSpecTemplateSpecVolumeEmptyDir"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonsetSpecTemplateSpecVolumeEmptyDir.Jsii$Proxy that = (DaemonsetSpecTemplateSpecVolumeEmptyDir.Jsii$Proxy) o;

            if (this.medium != null ? !this.medium.equals(that.medium) : that.medium != null) return false;
            return this.sizeLimit != null ? this.sizeLimit.equals(that.sizeLimit) : that.sizeLimit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.medium != null ? this.medium.hashCode() : 0;
            result = 31 * result + (this.sizeLimit != null ? this.sizeLimit.hashCode() : 0);
            return result;
        }
    }
}
