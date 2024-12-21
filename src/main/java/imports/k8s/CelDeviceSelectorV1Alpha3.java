package imports.k8s;

/**
 * CELDeviceSelector contains a CEL expression for selecting a device.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.438Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CelDeviceSelectorV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(CelDeviceSelectorV1Alpha3.Jsii$Proxy.class)
public interface CelDeviceSelectorV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Expression is a CEL expression which evaluates a single device.
     * <p>
     * It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.
     * <p>
     * The expression's input is an object named "device", which carries the following properties:
     * <p>
     * <ul>
     * <li>driver (string): the name of the driver which defines this device.</li>
     * <li>attributes (map[string]object): the device's attributes, grouped by prefix
     * (e.g. device.attributes["dra.example.com"] evaluates to an object with all
     * of the attributes which were prefixed by "dra.example.com".</li>
     * <li>capacity (map[string]object): the device's capacities, grouped by prefix.</li>
     * </ul>
     * <p>
     * Example: Consider a device with driver="dra.example.com", which exposes two attributes named "model" and "ext.example.com/family" and which exposes one capacity named "modules". This input to this expression would have the following fields:
     * <p>
     * device.driver
     * device.attributes["dra.example.com"].model
     * device.attributes["ext.example.com"].family
     * device.capacity["dra.example.com"].modules
     * <p>
     * The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.
     * <p>
     * The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.
     * <p>
     * If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.
     * <p>
     * A robust expression should check for the existence of attributes before referencing them.
     * <p>
     * For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:
     * <p>
     * cel.bind(dra, device.attributes["dra.example.com"], dra.someBool &amp;&amp; dra.anotherBool)
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * @return a {@link Builder} of {@link CelDeviceSelectorV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CelDeviceSelectorV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CelDeviceSelectorV1Alpha3> {
        java.lang.String expression;

        /**
         * Sets the value of {@link CelDeviceSelectorV1Alpha3#getExpression}
         * @param expression Expression is a CEL expression which evaluates a single device. This parameter is required.
         *                   It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.
         *                   <p>
         *                   The expression's input is an object named "device", which carries the following properties:
         *                   <p>
         *                   <ul>
         *                   <li>driver (string): the name of the driver which defines this device.</li>
         *                   <li>attributes (map[string]object): the device's attributes, grouped by prefix
         *                   (e.g. device.attributes["dra.example.com"] evaluates to an object with all
         *                   of the attributes which were prefixed by "dra.example.com".</li>
         *                   <li>capacity (map[string]object): the device's capacities, grouped by prefix.</li>
         *                   </ul>
         *                   <p>
         *                   Example: Consider a device with driver="dra.example.com", which exposes two attributes named "model" and "ext.example.com/family" and which exposes one capacity named "modules". This input to this expression would have the following fields:
         *                   <p>
         *                   device.driver
         *                   device.attributes["dra.example.com"].model
         *                   device.attributes["ext.example.com"].family
         *                   device.capacity["dra.example.com"].modules
         *                   <p>
         *                   The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.
         *                   <p>
         *                   The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.
         *                   <p>
         *                   If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.
         *                   <p>
         *                   A robust expression should check for the existence of attributes before referencing them.
         *                   <p>
         *                   For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:
         *                   <p>
         *                   cel.bind(dra, device.attributes["dra.example.com"], dra.someBool &amp;&amp; dra.anotherBool)
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CelDeviceSelectorV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CelDeviceSelectorV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CelDeviceSelectorV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CelDeviceSelectorV1Alpha3 {
        private final java.lang.String expression;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.expression = java.util.Objects.requireNonNull(builder.expression, "expression is required");
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("expression", om.valueToTree(this.getExpression()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CelDeviceSelectorV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CelDeviceSelectorV1Alpha3.Jsii$Proxy that = (CelDeviceSelectorV1Alpha3.Jsii$Proxy) o;

            return this.expression.equals(that.expression);
        }

        @Override
        public final int hashCode() {
            int result = this.expression.hashCode();
            return result;
        }
    }
}
