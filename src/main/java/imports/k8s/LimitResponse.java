package imports.k8s;

/**
 * LimitResponse defines how to handle requests that can not be executed right now.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.675Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LimitResponse")
@software.amazon.jsii.Jsii.Proxy(LimitResponse.Jsii$Proxy.class)
public interface LimitResponse extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>type</code> is "Queue" or "Reject".
     * <p>
     * "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * <code>queuing</code> holds the configuration parameters for queuing.
     * <p>
     * This field may be non-empty only if <code>type</code> is <code>"Queue"</code>.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.QueuingConfiguration getQueuing() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LimitResponse}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitResponse}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LimitResponse> {
        java.lang.String type;
        imports.k8s.QueuingConfiguration queuing;

        /**
         * Sets the value of {@link LimitResponse#getType}
         * @param type <code>type</code> is "Queue" or "Reject". This parameter is required.
         *             "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link LimitResponse#getQueuing}
         * @param queuing <code>queuing</code> holds the configuration parameters for queuing.
         *                This field may be non-empty only if <code>type</code> is <code>"Queue"</code>.
         * @return {@code this}
         */
        public Builder queuing(imports.k8s.QueuingConfiguration queuing) {
            this.queuing = queuing;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitResponse}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LimitResponse build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LimitResponse}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitResponse {
        private final java.lang.String type;
        private final imports.k8s.QueuingConfiguration queuing;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.queuing = software.amazon.jsii.Kernel.get(this, "queuing", software.amazon.jsii.NativeType.forClass(imports.k8s.QueuingConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.queuing = builder.queuing;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.k8s.QueuingConfiguration getQueuing() {
            return this.queuing;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getQueuing() != null) {
                data.set("queuing", om.valueToTree(this.getQueuing()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LimitResponse"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitResponse.Jsii$Proxy that = (LimitResponse.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.queuing != null ? this.queuing.equals(that.queuing) : that.queuing == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.queuing != null ? this.queuing.hashCode() : 0);
            return result;
        }
    }
}
