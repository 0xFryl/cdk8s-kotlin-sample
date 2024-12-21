package imports.k8s;

/**
 * SleepAction describes a "sleep" action.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.741Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SleepAction")
@software.amazon.jsii.Jsii.Proxy(SleepAction.Jsii$Proxy.class)
public interface SleepAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Seconds is the number of seconds to sleep.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getSeconds();

    /**
     * @return a {@link Builder} of {@link SleepAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SleepAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SleepAction> {
        java.lang.Number seconds;

        /**
         * Sets the value of {@link SleepAction#getSeconds}
         * @param seconds Seconds is the number of seconds to sleep. This parameter is required.
         * @return {@code this}
         */
        public Builder seconds(java.lang.Number seconds) {
            this.seconds = seconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SleepAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SleepAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SleepAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SleepAction {
        private final java.lang.Number seconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.seconds = software.amazon.jsii.Kernel.get(this, "seconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.seconds = java.util.Objects.requireNonNull(builder.seconds, "seconds is required");
        }

        @Override
        public final java.lang.Number getSeconds() {
            return this.seconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("seconds", om.valueToTree(this.getSeconds()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SleepAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SleepAction.Jsii$Proxy that = (SleepAction.Jsii$Proxy) o;

            return this.seconds.equals(that.seconds);
        }

        @Override
        public final int hashCode() {
            int result = this.seconds.hashCode();
            return result;
        }
    }
}
