package imports.k8s;

/**
 * OpaqueDeviceConfiguration contains configuration parameters for a driver in a format defined by the driver vendor.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.697Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.OpaqueDeviceConfigurationV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(OpaqueDeviceConfigurationV1Alpha3.Jsii$Proxy.class)
public interface OpaqueDeviceConfigurationV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
     * <p>
     * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
     * <p>
     * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * Parameters can contain arbitrary data.
     * <p>
     * It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version ("kind" + "apiVersion" for Kubernetes types), with conversion between different versions.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getParameters();

    /**
     * @return a {@link Builder} of {@link OpaqueDeviceConfigurationV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpaqueDeviceConfigurationV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpaqueDeviceConfigurationV1Alpha3> {
        java.lang.String driver;
        java.lang.Object parameters;

        /**
         * Sets the value of {@link OpaqueDeviceConfigurationV1Alpha3#getDriver}
         * @param driver Driver is used to determine which kubelet plugin needs to be passed these configuration parameters. This parameter is required.
         *               An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
         *               <p>
         *               Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link OpaqueDeviceConfigurationV1Alpha3#getParameters}
         * @param parameters Parameters can contain arbitrary data. This parameter is required.
         *                   It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version ("kind" + "apiVersion" for Kubernetes types), with conversion between different versions.
         * @return {@code this}
         */
        public Builder parameters(java.lang.Object parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpaqueDeviceConfigurationV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpaqueDeviceConfigurationV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpaqueDeviceConfigurationV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpaqueDeviceConfigurationV1Alpha3 {
        private final java.lang.String driver;
        private final java.lang.Object parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.parameters = java.util.Objects.requireNonNull(builder.parameters, "parameters is required");
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.lang.Object getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            data.set("parameters", om.valueToTree(this.getParameters()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.OpaqueDeviceConfigurationV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpaqueDeviceConfigurationV1Alpha3.Jsii$Proxy that = (OpaqueDeviceConfigurationV1Alpha3.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            return this.parameters.equals(that.parameters);
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.parameters.hashCode());
            return result;
        }
    }
}
