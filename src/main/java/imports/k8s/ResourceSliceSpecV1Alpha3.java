package imports.k8s;

/**
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.731Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceSliceSpecV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(ResourceSliceSpecV1Alpha3.Jsii$Proxy.class)
public interface ResourceSliceSpecV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Driver identifies the DRA driver providing the capacity information.
     * <p>
     * A field selector can be used to list only ResourceSlice objects with a certain driver name.
     * <p>
     * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * Pool describes the pool that this ResourceSlice belongs to.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ResourcePoolV1Alpha3 getPool();

    /**
     * AllNodes indicates that all nodes have access to the resources in the pool.
     * <p>
     * Exactly one of NodeName, NodeSelector and AllNodes must be set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllNodes() {
        return null;
    }

    /**
     * Devices lists some or all of the devices in this pool.
     * <p>
     * Must not have more than 128 entries.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceV1Alpha3> getDevices() {
        return null;
    }

    /**
     * NodeName identifies the node which provides the resources in this pool.
     * <p>
     * A field selector can be used to list only ResourceSlice objects belonging to a certain node.
     * <p>
     * This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.
     * <p>
     * Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * NodeSelector defines which nodes have access to the resources in the pool, when that pool is not limited to a single node.
     * <p>
     * Must use exactly one term.
     * <p>
     * Exactly one of NodeName, NodeSelector and AllNodes must be set.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getNodeSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceSliceSpecV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceSliceSpecV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceSliceSpecV1Alpha3> {
        java.lang.String driver;
        imports.k8s.ResourcePoolV1Alpha3 pool;
        java.lang.Boolean allNodes;
        java.util.List<imports.k8s.DeviceV1Alpha3> devices;
        java.lang.String nodeName;
        imports.k8s.NodeSelector nodeSelector;

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getDriver}
         * @param driver Driver identifies the DRA driver providing the capacity information. This parameter is required.
         *               A field selector can be used to list only ResourceSlice objects with a certain driver name.
         *               <p>
         *               Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getPool}
         * @param pool Pool describes the pool that this ResourceSlice belongs to. This parameter is required.
         * @return {@code this}
         */
        public Builder pool(imports.k8s.ResourcePoolV1Alpha3 pool) {
            this.pool = pool;
            return this;
        }

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getAllNodes}
         * @param allNodes AllNodes indicates that all nodes have access to the resources in the pool.
         *                 Exactly one of NodeName, NodeSelector and AllNodes must be set.
         * @return {@code this}
         */
        public Builder allNodes(java.lang.Boolean allNodes) {
            this.allNodes = allNodes;
            return this;
        }

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getDevices}
         * @param devices Devices lists some or all of the devices in this pool.
         *                Must not have more than 128 entries.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder devices(java.util.List<? extends imports.k8s.DeviceV1Alpha3> devices) {
            this.devices = (java.util.List<imports.k8s.DeviceV1Alpha3>)devices;
            return this;
        }

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getNodeName}
         * @param nodeName NodeName identifies the node which provides the resources in this pool.
         *                 A field selector can be used to list only ResourceSlice objects belonging to a certain node.
         *                 <p>
         *                 This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.
         *                 <p>
         *                 Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link ResourceSliceSpecV1Alpha3#getNodeSelector}
         * @param nodeSelector NodeSelector defines which nodes have access to the resources in the pool, when that pool is not limited to a single node.
         *                     Must use exactly one term.
         *                     <p>
         *                     Exactly one of NodeName, NodeSelector and AllNodes must be set.
         * @return {@code this}
         */
        public Builder nodeSelector(imports.k8s.NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceSliceSpecV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceSliceSpecV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceSliceSpecV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceSliceSpecV1Alpha3 {
        private final java.lang.String driver;
        private final imports.k8s.ResourcePoolV1Alpha3 pool;
        private final java.lang.Boolean allNodes;
        private final java.util.List<imports.k8s.DeviceV1Alpha3> devices;
        private final java.lang.String nodeName;
        private final imports.k8s.NodeSelector nodeSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pool = software.amazon.jsii.Kernel.get(this, "pool", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourcePoolV1Alpha3.class));
            this.allNodes = software.amazon.jsii.Kernel.get(this, "allNodes", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.devices = software.amazon.jsii.Kernel.get(this, "devices", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceV1Alpha3.class)));
            this.nodeName = software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeSelector = software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.pool = java.util.Objects.requireNonNull(builder.pool, "pool is required");
            this.allNodes = builder.allNodes;
            this.devices = (java.util.List<imports.k8s.DeviceV1Alpha3>)builder.devices;
            this.nodeName = builder.nodeName;
            this.nodeSelector = builder.nodeSelector;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final imports.k8s.ResourcePoolV1Alpha3 getPool() {
            return this.pool;
        }

        @Override
        public final java.lang.Boolean getAllNodes() {
            return this.allNodes;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceV1Alpha3> getDevices() {
            return this.devices;
        }

        @Override
        public final java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public final imports.k8s.NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            data.set("pool", om.valueToTree(this.getPool()));
            if (this.getAllNodes() != null) {
                data.set("allNodes", om.valueToTree(this.getAllNodes()));
            }
            if (this.getDevices() != null) {
                data.set("devices", om.valueToTree(this.getDevices()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceSliceSpecV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceSliceSpecV1Alpha3.Jsii$Proxy that = (ResourceSliceSpecV1Alpha3.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (!pool.equals(that.pool)) return false;
            if (this.allNodes != null ? !this.allNodes.equals(that.allNodes) : that.allNodes != null) return false;
            if (this.devices != null ? !this.devices.equals(that.devices) : that.devices != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            return this.nodeSelector != null ? this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.pool.hashCode());
            result = 31 * result + (this.allNodes != null ? this.allNodes.hashCode() : 0);
            result = 31 * result + (this.devices != null ? this.devices.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            return result;
        }
    }
}
