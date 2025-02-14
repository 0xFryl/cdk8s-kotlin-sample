package imports.k8s;

/**
 * PriorityLevelConfiguration represents the configuration of a priority level.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.625Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityLevelConfigurationV1Beta3Props")
@software.amazon.jsii.Jsii.Proxy(KubePriorityLevelConfigurationV1Beta3Props.Jsii$Proxy.class)
public interface KubePriorityLevelConfigurationV1Beta3Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>metadata</code> is the standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * <code>spec</code> is the specification of the desired behavior of a "request-priority".
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PriorityLevelConfigurationSpecV1Beta3 getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePriorityLevelConfigurationV1Beta3Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePriorityLevelConfigurationV1Beta3Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePriorityLevelConfigurationV1Beta3Props> {
        imports.k8s.ObjectMeta metadata;
        imports.k8s.PriorityLevelConfigurationSpecV1Beta3 spec;

        /**
         * Sets the value of {@link KubePriorityLevelConfigurationV1Beta3Props#getMetadata}
         * @param metadata <code>metadata</code> is the standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityLevelConfigurationV1Beta3Props#getSpec}
         * @param spec <code>spec</code> is the specification of the desired behavior of a "request-priority".
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(imports.k8s.PriorityLevelConfigurationSpecV1Beta3 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePriorityLevelConfigurationV1Beta3Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePriorityLevelConfigurationV1Beta3Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubePriorityLevelConfigurationV1Beta3Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePriorityLevelConfigurationV1Beta3Props {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.PriorityLevelConfigurationSpecV1Beta3 spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.PriorityLevelConfigurationSpecV1Beta3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.PriorityLevelConfigurationSpecV1Beta3 getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubePriorityLevelConfigurationV1Beta3Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePriorityLevelConfigurationV1Beta3Props.Jsii$Proxy that = (KubePriorityLevelConfigurationV1Beta3Props.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
