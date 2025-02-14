package imports.k8s;

/**
 * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.507Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.FlowDistinguisherMethod")
@software.amazon.jsii.Jsii.Proxy(FlowDistinguisherMethod.Jsii$Proxy.class)
public interface FlowDistinguisherMethod extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>type</code> is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace".
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link FlowDistinguisherMethod}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlowDistinguisherMethod}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FlowDistinguisherMethod> {
        java.lang.String type;

        /**
         * Sets the value of {@link FlowDistinguisherMethod#getType}
         * @param type <code>type</code> is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". This parameter is required.
         *             Required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FlowDistinguisherMethod}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FlowDistinguisherMethod build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FlowDistinguisherMethod}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlowDistinguisherMethod {
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
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

            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FlowDistinguisherMethod"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlowDistinguisherMethod.Jsii$Proxy that = (FlowDistinguisherMethod.Jsii$Proxy) o;

            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            return result;
        }
    }
}
