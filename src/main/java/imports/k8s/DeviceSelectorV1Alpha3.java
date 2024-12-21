package imports.k8s;

/**
 * DeviceSelector must have exactly one field set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.493Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceSelectorV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceSelectorV1Alpha3.Jsii$Proxy.class)
public interface DeviceSelectorV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * CEL contains a CEL expression for selecting a device.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CelDeviceSelectorV1Alpha3 getCel() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceSelectorV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceSelectorV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceSelectorV1Alpha3> {
        imports.k8s.CelDeviceSelectorV1Alpha3 cel;

        /**
         * Sets the value of {@link DeviceSelectorV1Alpha3#getCel}
         * @param cel CEL contains a CEL expression for selecting a device.
         * @return {@code this}
         */
        public Builder cel(imports.k8s.CelDeviceSelectorV1Alpha3 cel) {
            this.cel = cel;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceSelectorV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceSelectorV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceSelectorV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceSelectorV1Alpha3 {
        private final imports.k8s.CelDeviceSelectorV1Alpha3 cel;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cel = software.amazon.jsii.Kernel.get(this, "cel", software.amazon.jsii.NativeType.forClass(imports.k8s.CelDeviceSelectorV1Alpha3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cel = builder.cel;
        }

        @Override
        public final imports.k8s.CelDeviceSelectorV1Alpha3 getCel() {
            return this.cel;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCel() != null) {
                data.set("cel", om.valueToTree(this.getCel()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceSelectorV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceSelectorV1Alpha3.Jsii$Proxy that = (DeviceSelectorV1Alpha3.Jsii$Proxy) o;

            return this.cel != null ? this.cel.equals(that.cel) : that.cel == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cel != null ? this.cel.hashCode() : 0;
            return result;
        }
    }
}
