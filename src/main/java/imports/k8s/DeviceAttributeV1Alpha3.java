package imports.k8s;

/**
 * DeviceAttribute must have exactly one field set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.482Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceAttributeV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceAttributeV1Alpha3.Jsii$Proxy.class)
public interface DeviceAttributeV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * BoolValue is a true/false value.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBool() {
        return null;
    }

    /**
     * IntValue is a number.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIntValue() {
        return null;
    }

    /**
     * StringValue is a string.
     * <p>
     * Must not be longer than 64 characters.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getString() {
        return null;
    }

    /**
     * VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceAttributeV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceAttributeV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceAttributeV1Alpha3> {
        java.lang.Boolean bool;
        java.lang.Number intValue;
        java.lang.String string;
        java.lang.String version;

        /**
         * Sets the value of {@link DeviceAttributeV1Alpha3#getBool}
         * @param bool BoolValue is a true/false value.
         * @return {@code this}
         */
        public Builder bool(java.lang.Boolean bool) {
            this.bool = bool;
            return this;
        }

        /**
         * Sets the value of {@link DeviceAttributeV1Alpha3#getIntValue}
         * @param intValue IntValue is a number.
         * @return {@code this}
         */
        public Builder intValue(java.lang.Number intValue) {
            this.intValue = intValue;
            return this;
        }

        /**
         * Sets the value of {@link DeviceAttributeV1Alpha3#getString}
         * @param string StringValue is a string.
         *               Must not be longer than 64 characters.
         * @return {@code this}
         */
        public Builder string(java.lang.String string) {
            this.string = string;
            return this;
        }

        /**
         * Sets the value of {@link DeviceAttributeV1Alpha3#getVersion}
         * @param version VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceAttributeV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceAttributeV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceAttributeV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceAttributeV1Alpha3 {
        private final java.lang.Boolean bool;
        private final java.lang.Number intValue;
        private final java.lang.String string;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bool = software.amazon.jsii.Kernel.get(this, "bool", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.intValue = software.amazon.jsii.Kernel.get(this, "int", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.string = software.amazon.jsii.Kernel.get(this, "string", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bool = builder.bool;
            this.intValue = builder.intValue;
            this.string = builder.string;
            this.version = builder.version;
        }

        @Override
        public final java.lang.Boolean getBool() {
            return this.bool;
        }

        @Override
        public final java.lang.Number getIntValue() {
            return this.intValue;
        }

        @Override
        public final java.lang.String getString() {
            return this.string;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBool() != null) {
                data.set("bool", om.valueToTree(this.getBool()));
            }
            if (this.getIntValue() != null) {
                data.set("int", om.valueToTree(this.getIntValue()));
            }
            if (this.getString() != null) {
                data.set("string", om.valueToTree(this.getString()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceAttributeV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceAttributeV1Alpha3.Jsii$Proxy that = (DeviceAttributeV1Alpha3.Jsii$Proxy) o;

            if (this.bool != null ? !this.bool.equals(that.bool) : that.bool != null) return false;
            if (this.intValue != null ? !this.intValue.equals(that.intValue) : that.intValue != null) return false;
            if (this.string != null ? !this.string.equals(that.string) : that.string != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bool != null ? this.bool.hashCode() : 0;
            result = 31 * result + (this.intValue != null ? this.intValue.hashCode() : 0);
            result = 31 * result + (this.string != null ? this.string.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
