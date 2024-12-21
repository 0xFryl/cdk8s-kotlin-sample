package imports.k8s;

/**
 * Device represents one individual hardware instance that can be selected based on its attributes.
 * <p>
 * Besides the name, exactly one field must be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.493Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceV1Alpha3.Jsii$Proxy.class)
public interface DeviceV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is unique identifier among all devices managed by the driver in the pool.
     * <p>
     * It must be a DNS label.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Basic defines one device instance.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.BasicDeviceV1Alpha3 getBasic() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceV1Alpha3> {
        java.lang.String name;
        imports.k8s.BasicDeviceV1Alpha3 basic;

        /**
         * Sets the value of {@link DeviceV1Alpha3#getName}
         * @param name Name is unique identifier among all devices managed by the driver in the pool. This parameter is required.
         *             It must be a DNS label.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DeviceV1Alpha3#getBasic}
         * @param basic Basic defines one device instance.
         * @return {@code this}
         */
        public Builder basic(imports.k8s.BasicDeviceV1Alpha3 basic) {
            this.basic = basic;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceV1Alpha3 {
        private final java.lang.String name;
        private final imports.k8s.BasicDeviceV1Alpha3 basic;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.basic = software.amazon.jsii.Kernel.get(this, "basic", software.amazon.jsii.NativeType.forClass(imports.k8s.BasicDeviceV1Alpha3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.basic = builder.basic;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.BasicDeviceV1Alpha3 getBasic() {
            return this.basic;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getBasic() != null) {
                data.set("basic", om.valueToTree(this.getBasic()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceV1Alpha3.Jsii$Proxy that = (DeviceV1Alpha3.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.basic != null ? this.basic.equals(that.basic) : that.basic == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.basic != null ? this.basic.hashCode() : 0);
            return result;
        }
    }
}
