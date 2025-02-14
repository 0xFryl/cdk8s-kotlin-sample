package imports.k8s;

/**
 * ResourceClaim references one entry in PodSpec.ResourceClaims.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.729Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceClaim")
@software.amazon.jsii.Jsii.Proxy(ResourceClaim.Jsii$Proxy.class)
public interface ResourceClaim extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Request is the name chosen for a request in the referenced claim.
     * <p>
     * If empty, everything from the claim is made available, otherwise only the result of this request.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRequest() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceClaim}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceClaim}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceClaim> {
        java.lang.String name;
        java.lang.String request;

        /**
         * Sets the value of {@link ResourceClaim#getName}
         * @param name Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClaim#getRequest}
         * @param request Request is the name chosen for a request in the referenced claim.
         *                If empty, everything from the claim is made available, otherwise only the result of this request.
         * @return {@code this}
         */
        public Builder request(java.lang.String request) {
            this.request = request;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceClaim}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceClaim build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceClaim}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceClaim {
        private final java.lang.String name;
        private final java.lang.String request;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.request = software.amazon.jsii.Kernel.get(this, "request", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.request = builder.request;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRequest() {
            return this.request;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getRequest() != null) {
                data.set("request", om.valueToTree(this.getRequest()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceClaim"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceClaim.Jsii$Proxy that = (ResourceClaim.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.request != null ? this.request.equals(that.request) : that.request == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.request != null ? this.request.hashCode() : 0);
            return result;
        }
    }
}
