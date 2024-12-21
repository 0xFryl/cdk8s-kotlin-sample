package imports.k8s;

/**
 * ResourceClaimSpec defines what is being requested in a ResourceClaim and how to configure it.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.729Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceClaimSpecV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(ResourceClaimSpecV1Alpha3.Jsii$Proxy.class)
public interface ResourceClaimSpecV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Controller is the name of the DRA driver that is meant to handle allocation of this claim.
     * <p>
     * If empty, allocation is handled by the scheduler while scheduling a pod.
     * <p>
     * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
     * <p>
     * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getController() {
        return null;
    }

    /**
     * Devices defines how to request devices.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DeviceClaimV1Alpha3 getDevices() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceClaimSpecV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceClaimSpecV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceClaimSpecV1Alpha3> {
        java.lang.String controller;
        imports.k8s.DeviceClaimV1Alpha3 devices;

        /**
         * Sets the value of {@link ResourceClaimSpecV1Alpha3#getController}
         * @param controller Controller is the name of the DRA driver that is meant to handle allocation of this claim.
         *                   If empty, allocation is handled by the scheduler while scheduling a pod.
         *                   <p>
         *                   Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
         *                   <p>
         *                   This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
         * @return {@code this}
         */
        public Builder controller(java.lang.String controller) {
            this.controller = controller;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClaimSpecV1Alpha3#getDevices}
         * @param devices Devices defines how to request devices.
         * @return {@code this}
         */
        public Builder devices(imports.k8s.DeviceClaimV1Alpha3 devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceClaimSpecV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceClaimSpecV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceClaimSpecV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceClaimSpecV1Alpha3 {
        private final java.lang.String controller;
        private final imports.k8s.DeviceClaimV1Alpha3 devices;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.controller = software.amazon.jsii.Kernel.get(this, "controller", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.devices = software.amazon.jsii.Kernel.get(this, "devices", software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceClaimV1Alpha3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.controller = builder.controller;
            this.devices = builder.devices;
        }

        @Override
        public final java.lang.String getController() {
            return this.controller;
        }

        @Override
        public final imports.k8s.DeviceClaimV1Alpha3 getDevices() {
            return this.devices;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getController() != null) {
                data.set("controller", om.valueToTree(this.getController()));
            }
            if (this.getDevices() != null) {
                data.set("devices", om.valueToTree(this.getDevices()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceClaimSpecV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceClaimSpecV1Alpha3.Jsii$Proxy that = (ResourceClaimSpecV1Alpha3.Jsii$Proxy) o;

            if (this.controller != null ? !this.controller.equals(that.controller) : that.controller != null) return false;
            return this.devices != null ? this.devices.equals(that.devices) : that.devices == null;
        }

        @Override
        public final int hashCode() {
            int result = this.controller != null ? this.controller.hashCode() : 0;
            result = 31 * result + (this.devices != null ? this.devices.hashCode() : 0);
            return result;
        }
    }
}
