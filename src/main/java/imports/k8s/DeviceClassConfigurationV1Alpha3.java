package imports.k8s;

/**
 * DeviceClassConfiguration is used in DeviceClass.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.483Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceClassConfigurationV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceClassConfigurationV1Alpha3.Jsii$Proxy.class)
public interface DeviceClassConfigurationV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Opaque provides driver-specific configuration parameters.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.OpaqueDeviceConfigurationV1Alpha3 getOpaque() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceClassConfigurationV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceClassConfigurationV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceClassConfigurationV1Alpha3> {
        imports.k8s.OpaqueDeviceConfigurationV1Alpha3 opaque;

        /**
         * Sets the value of {@link DeviceClassConfigurationV1Alpha3#getOpaque}
         * @param opaque Opaque provides driver-specific configuration parameters.
         * @return {@code this}
         */
        public Builder opaque(imports.k8s.OpaqueDeviceConfigurationV1Alpha3 opaque) {
            this.opaque = opaque;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceClassConfigurationV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceClassConfigurationV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceClassConfigurationV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceClassConfigurationV1Alpha3 {
        private final imports.k8s.OpaqueDeviceConfigurationV1Alpha3 opaque;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.opaque = software.amazon.jsii.Kernel.get(this, "opaque", software.amazon.jsii.NativeType.forClass(imports.k8s.OpaqueDeviceConfigurationV1Alpha3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.opaque = builder.opaque;
        }

        @Override
        public final imports.k8s.OpaqueDeviceConfigurationV1Alpha3 getOpaque() {
            return this.opaque;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOpaque() != null) {
                data.set("opaque", om.valueToTree(this.getOpaque()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceClassConfigurationV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceClassConfigurationV1Alpha3.Jsii$Proxy that = (DeviceClassConfigurationV1Alpha3.Jsii$Proxy) o;

            return this.opaque != null ? this.opaque.equals(that.opaque) : that.opaque == null;
        }

        @Override
        public final int hashCode() {
            int result = this.opaque != null ? this.opaque.hashCode() : 0;
            return result;
        }
    }
}
