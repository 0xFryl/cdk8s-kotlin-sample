package imports.k8s;

/**
 * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:35.108Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityLevelConfigurationListV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubePriorityLevelConfigurationListV1Beta1Props.Jsii$Proxy.class)
public interface KubePriorityLevelConfigurationListV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>items</code> is a list of request-priorities.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props> getItems();

    /**
     * <code>metadata</code> is the standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePriorityLevelConfigurationListV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePriorityLevelConfigurationListV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePriorityLevelConfigurationListV1Beta1Props> {
        java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props> items;
        imports.k8s.ListMeta metadata;

        /**
         * Sets the value of {@link KubePriorityLevelConfigurationListV1Beta1Props#getItems}
         * @param items <code>items</code> is a list of request-priorities. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.KubePriorityLevelConfigurationV1Beta1Props> items) {
            this.items = (java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props>)items;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityLevelConfigurationListV1Beta1Props#getMetadata}
         * @param metadata <code>metadata</code> is the standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePriorityLevelConfigurationListV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePriorityLevelConfigurationListV1Beta1Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubePriorityLevelConfigurationListV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePriorityLevelConfigurationListV1Beta1Props {
        private final java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props> items;
        private final imports.k8s.ListMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.KubePriorityLevelConfigurationV1Beta1Props.class)));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ListMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props>)java.util.Objects.requireNonNull(builder.items, "items is required");
            this.metadata = builder.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.KubePriorityLevelConfigurationV1Beta1Props> getItems() {
            return this.items;
        }

        @Override
        public final imports.k8s.ListMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("items", om.valueToTree(this.getItems()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubePriorityLevelConfigurationListV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePriorityLevelConfigurationListV1Beta1Props.Jsii$Proxy that = (KubePriorityLevelConfigurationListV1Beta1Props.Jsii$Proxy) o;

            if (!items.equals(that.items)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
