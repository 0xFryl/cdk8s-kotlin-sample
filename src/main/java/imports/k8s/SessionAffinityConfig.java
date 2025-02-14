package imports.k8s;

/**
 * SessionAffinityConfig represents the configurations of session affinity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:35.198Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SessionAffinityConfig")
@software.amazon.jsii.Jsii.Proxy(SessionAffinityConfig.Jsii$Proxy.class)
public interface SessionAffinityConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * clientIP contains the configurations of Client IP based session affinity.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ClientIpConfig getClientIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SessionAffinityConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SessionAffinityConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SessionAffinityConfig> {
        imports.k8s.ClientIpConfig clientIp;

        /**
         * Sets the value of {@link SessionAffinityConfig#getClientIp}
         * @param clientIp clientIP contains the configurations of Client IP based session affinity.
         * @return {@code this}
         */
        public Builder clientIp(imports.k8s.ClientIpConfig clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SessionAffinityConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SessionAffinityConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SessionAffinityConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SessionAffinityConfig {
        private final imports.k8s.ClientIpConfig clientIp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientIp = software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.k8s.ClientIpConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIp = builder.clientIp;
        }

        @Override
        public final imports.k8s.ClientIpConfig getClientIp() {
            return this.clientIp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientIp() != null) {
                data.set("clientIp", om.valueToTree(this.getClientIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SessionAffinityConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SessionAffinityConfig.Jsii$Proxy that = (SessionAffinityConfig.Jsii$Proxy) o;

            return this.clientIp != null ? this.clientIp.equals(that.clientIp) : that.clientIp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIp != null ? this.clientIp.hashCode() : 0;
            return result;
        }
    }
}
