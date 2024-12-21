package imports.k8s;

/**
 * ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.738Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceCidrSpecV1Beta1")
@software.amazon.jsii.Jsii.Proxy(ServiceCidrSpecV1Beta1.Jsii$Proxy.class)
public interface ServiceCidrSpecV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * CIDRs defines the IP blocks in CIDR notation (e.g. "192.168.0.0/24" or "2001:db8::/64") from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCidrs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceCidrSpecV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceCidrSpecV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceCidrSpecV1Beta1> {
        java.util.List<java.lang.String> cidrs;

        /**
         * Sets the value of {@link ServiceCidrSpecV1Beta1#getCidrs}
         * @param cidrs CIDRs defines the IP blocks in CIDR notation (e.g. "192.168.0.0/24" or "2001:db8::/64") from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.
         * @return {@code this}
         */
        public Builder cidrs(java.util.List<java.lang.String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceCidrSpecV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceCidrSpecV1Beta1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceCidrSpecV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceCidrSpecV1Beta1 {
        private final java.util.List<java.lang.String> cidrs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidrs = software.amazon.jsii.Kernel.get(this, "cidrs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidrs = builder.cidrs;
        }

        @Override
        public final java.util.List<java.lang.String> getCidrs() {
            return this.cidrs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCidrs() != null) {
                data.set("cidrs", om.valueToTree(this.getCidrs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceCidrSpecV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceCidrSpecV1Beta1.Jsii$Proxy that = (ServiceCidrSpecV1Beta1.Jsii$Proxy) o;

            return this.cidrs != null ? this.cidrs.equals(that.cidrs) : that.cidrs == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidrs != null ? this.cidrs.hashCode() : 0;
            return result;
        }
    }
}
