package imports.k8s;

/**
 * DeviceConstraint must have exactly one field set besides Requests.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.484Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceConstraintV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceConstraintV1Alpha3.Jsii$Proxy.class)
public interface DeviceConstraintV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.
     * <p>
     * For example, if you specified "dra.example.com/numa" (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn't, then it also will not be chosen.
     * <p>
     * Must include the domain qualifier.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMatchAttribute() {
        return null;
    }

    /**
     * Requests is a list of the one or more requests in this claim which must co-satisfy this constraint.
     * <p>
     * If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceConstraintV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceConstraintV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceConstraintV1Alpha3> {
        java.lang.String matchAttribute;
        java.util.List<java.lang.String> requests;

        /**
         * Sets the value of {@link DeviceConstraintV1Alpha3#getMatchAttribute}
         * @param matchAttribute MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.
         *                       For example, if you specified "dra.example.com/numa" (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn't, then it also will not be chosen.
         *                       <p>
         *                       Must include the domain qualifier.
         * @return {@code this}
         */
        public Builder matchAttribute(java.lang.String matchAttribute) {
            this.matchAttribute = matchAttribute;
            return this;
        }

        /**
         * Sets the value of {@link DeviceConstraintV1Alpha3#getRequests}
         * @param requests Requests is a list of the one or more requests in this claim which must co-satisfy this constraint.
         *                 If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.
         * @return {@code this}
         */
        public Builder requests(java.util.List<java.lang.String> requests) {
            this.requests = requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceConstraintV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceConstraintV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceConstraintV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceConstraintV1Alpha3 {
        private final java.lang.String matchAttribute;
        private final java.util.List<java.lang.String> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchAttribute = software.amazon.jsii.Kernel.get(this, "matchAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchAttribute = builder.matchAttribute;
            this.requests = builder.requests;
        }

        @Override
        public final java.lang.String getMatchAttribute() {
            return this.matchAttribute;
        }

        @Override
        public final java.util.List<java.lang.String> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchAttribute() != null) {
                data.set("matchAttribute", om.valueToTree(this.getMatchAttribute()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceConstraintV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceConstraintV1Alpha3.Jsii$Proxy that = (DeviceConstraintV1Alpha3.Jsii$Proxy) o;

            if (this.matchAttribute != null ? !this.matchAttribute.equals(that.matchAttribute) : that.matchAttribute != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchAttribute != null ? this.matchAttribute.hashCode() : 0;
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
