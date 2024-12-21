package imports.k8s;

/**
 * DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.484Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceClassSpecV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceClassSpecV1Alpha3.Jsii$Proxy.class)
public interface DeviceClassSpecV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Config defines configuration parameters that apply to each device that is claimed via this class.
     * <p>
     * Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.
     * <p>
     * They are passed to the driver, but are not considered while allocating the claim.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3> getConfig() {
        return null;
    }

    /**
     * Each selector must be satisfied by a device which is claimed via this class.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceSelectorV1Alpha3> getSelectors() {
        return null;
    }

    /**
     * Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a claim that has not been allocated yet <em>and</em> that claim gets allocated through a control plane controller.
     * <p>
     * It is ignored when the claim does not use a control plane controller for allocation.
     * <p>
     * Setting this field is optional. If unset, all Nodes are candidates.
     * <p>
     * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getSuitableNodes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceClassSpecV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceClassSpecV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceClassSpecV1Alpha3> {
        java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3> config;
        java.util.List<imports.k8s.DeviceSelectorV1Alpha3> selectors;
        imports.k8s.NodeSelector suitableNodes;

        /**
         * Sets the value of {@link DeviceClassSpecV1Alpha3#getConfig}
         * @param config Config defines configuration parameters that apply to each device that is claimed via this class.
         *               Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.
         *               <p>
         *               They are passed to the driver, but are not considered while allocating the claim.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder config(java.util.List<? extends imports.k8s.DeviceClassConfigurationV1Alpha3> config) {
            this.config = (java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3>)config;
            return this;
        }

        /**
         * Sets the value of {@link DeviceClassSpecV1Alpha3#getSelectors}
         * @param selectors Each selector must be satisfied by a device which is claimed via this class.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder selectors(java.util.List<? extends imports.k8s.DeviceSelectorV1Alpha3> selectors) {
            this.selectors = (java.util.List<imports.k8s.DeviceSelectorV1Alpha3>)selectors;
            return this;
        }

        /**
         * Sets the value of {@link DeviceClassSpecV1Alpha3#getSuitableNodes}
         * @param suitableNodes Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a claim that has not been allocated yet <em>and</em> that claim gets allocated through a control plane controller.
         *                      It is ignored when the claim does not use a control plane controller for allocation.
         *                      <p>
         *                      Setting this field is optional. If unset, all Nodes are candidates.
         *                      <p>
         *                      This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
         * @return {@code this}
         */
        public Builder suitableNodes(imports.k8s.NodeSelector suitableNodes) {
            this.suitableNodes = suitableNodes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceClassSpecV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceClassSpecV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceClassSpecV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceClassSpecV1Alpha3 {
        private final java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3> config;
        private final java.util.List<imports.k8s.DeviceSelectorV1Alpha3> selectors;
        private final imports.k8s.NodeSelector suitableNodes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.config = software.amazon.jsii.Kernel.get(this, "config", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceClassConfigurationV1Alpha3.class)));
            this.selectors = software.amazon.jsii.Kernel.get(this, "selectors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceSelectorV1Alpha3.class)));
            this.suitableNodes = software.amazon.jsii.Kernel.get(this, "suitableNodes", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.config = (java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3>)builder.config;
            this.selectors = (java.util.List<imports.k8s.DeviceSelectorV1Alpha3>)builder.selectors;
            this.suitableNodes = builder.suitableNodes;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceClassConfigurationV1Alpha3> getConfig() {
            return this.config;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceSelectorV1Alpha3> getSelectors() {
            return this.selectors;
        }

        @Override
        public final imports.k8s.NodeSelector getSuitableNodes() {
            return this.suitableNodes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfig() != null) {
                data.set("config", om.valueToTree(this.getConfig()));
            }
            if (this.getSelectors() != null) {
                data.set("selectors", om.valueToTree(this.getSelectors()));
            }
            if (this.getSuitableNodes() != null) {
                data.set("suitableNodes", om.valueToTree(this.getSuitableNodes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceClassSpecV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceClassSpecV1Alpha3.Jsii$Proxy that = (DeviceClassSpecV1Alpha3.Jsii$Proxy) o;

            if (this.config != null ? !this.config.equals(that.config) : that.config != null) return false;
            if (this.selectors != null ? !this.selectors.equals(that.selectors) : that.selectors != null) return false;
            return this.suitableNodes != null ? this.suitableNodes.equals(that.suitableNodes) : that.suitableNodes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.config != null ? this.config.hashCode() : 0;
            result = 31 * result + (this.selectors != null ? this.selectors.hashCode() : 0);
            result = 31 * result + (this.suitableNodes != null ? this.suitableNodes.hashCode() : 0);
            return result;
        }
    }
}
