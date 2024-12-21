package imports.k8s;

/**
 * BasicDevice defines one device instance.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.437Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.BasicDeviceV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(BasicDeviceV1Alpha3.Jsii$Proxy.class)
public interface BasicDeviceV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Attributes defines the set of attributes for this device.
     * <p>
     * The name of each attribute must be unique in that set.
     * <p>
     * The maximum number of attributes and capacities combined is 32.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3> getAttributes() {
        return null;
    }

    /**
     * Capacity defines the set of capacities for this device.
     * <p>
     * The name of each capacity must be unique in that set.
     * <p>
     * The maximum number of attributes and capacities combined is 32.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BasicDeviceV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BasicDeviceV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BasicDeviceV1Alpha3> {
        java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3> attributes;
        java.util.Map<java.lang.String, imports.k8s.Quantity> capacity;

        /**
         * Sets the value of {@link BasicDeviceV1Alpha3#getAttributes}
         * @param attributes Attributes defines the set of attributes for this device.
         *                   The name of each attribute must be unique in that set.
         *                   <p>
         *                   The maximum number of attributes and capacities combined is 32.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder attributes(java.util.Map<java.lang.String, ? extends imports.k8s.DeviceAttributeV1Alpha3> attributes) {
            this.attributes = (java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3>)attributes;
            return this;
        }

        /**
         * Sets the value of {@link BasicDeviceV1Alpha3#getCapacity}
         * @param capacity Capacity defines the set of capacities for this device.
         *                 The name of each capacity must be unique in that set.
         *                 <p>
         *                 The maximum number of attributes and capacities combined is 32.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacity(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> capacity) {
            this.capacity = (java.util.Map<java.lang.String, imports.k8s.Quantity>)capacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BasicDeviceV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BasicDeviceV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BasicDeviceV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BasicDeviceV1Alpha3 {
        private final java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3> attributes;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> capacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attributes = software.amazon.jsii.Kernel.get(this, "attributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceAttributeV1Alpha3.class)));
            this.capacity = software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attributes = (java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3>)builder.attributes;
            this.capacity = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.capacity;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.DeviceAttributeV1Alpha3> getAttributes() {
            return this.attributes;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getCapacity() {
            return this.capacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttributes() != null) {
                data.set("attributes", om.valueToTree(this.getAttributes()));
            }
            if (this.getCapacity() != null) {
                data.set("capacity", om.valueToTree(this.getCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.BasicDeviceV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BasicDeviceV1Alpha3.Jsii$Proxy that = (BasicDeviceV1Alpha3.Jsii$Proxy) o;

            if (this.attributes != null ? !this.attributes.equals(that.attributes) : that.attributes != null) return false;
            return this.capacity != null ? this.capacity.equals(that.capacity) : that.capacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attributes != null ? this.attributes.hashCode() : 0;
            result = 31 * result + (this.capacity != null ? this.capacity.hashCode() : 0);
            return result;
        }
    }
}
