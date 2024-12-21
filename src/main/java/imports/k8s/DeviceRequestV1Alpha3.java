package imports.k8s;

/**
 * DeviceRequest is a request for devices required for a claim.
 * <p>
 * This is typically a request for a single resource like a device, but can also ask for several identical devices.
 * <p>
 * A DeviceClassName is currently required. Clients must check that it is indeed set. It's absence indicates that something changed in a way that is not supported by the client yet, in which case it must refuse to handle the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.485Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceRequestV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceRequestV1Alpha3.Jsii$Proxy.class)
public interface DeviceRequestV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.
     * <p>
     * A class is required. Which classes are available depends on the cluster.
     * <p>
     * Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDeviceClassName();

    /**
     * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.
     * <p>
     * Must be a DNS label.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * AdminAccess indicates that this is a claim for administrative access to the device(s).
     * <p>
     * Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAdminAccess() {
        return null;
    }

    /**
     * AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:.
     * <p>
     * <ul>
     * <li>ExactCount: This request is for a specific number of devices.
     * This is the default. The exact number is provided in the
     * count field.</li>
     * <li>All: This request is for all of the matching devices in a pool.
     * Allocation will fail if some devices are already allocated,
     * unless adminAccess is requested.</li>
     * </ul>
     * <p>
     * If AlloctionMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.
     * <p>
     * More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationMode() {
        return null;
    }

    /**
     * Count is used only when the count mode is "ExactCount".
     * <p>
     * Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request.
     * <p>
     * All selectors must be satisfied for a device to be considered.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceSelectorV1Alpha3> getSelectors() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceRequestV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceRequestV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceRequestV1Alpha3> {
        java.lang.String deviceClassName;
        java.lang.String name;
        java.lang.Boolean adminAccess;
        java.lang.String allocationMode;
        java.lang.Number count;
        java.util.List<imports.k8s.DeviceSelectorV1Alpha3> selectors;

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getDeviceClassName}
         * @param deviceClassName DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request. This parameter is required.
         *                        A class is required. Which classes are available depends on the cluster.
         *                        <p>
         *                        Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
         * @return {@code this}
         */
        public Builder deviceClassName(java.lang.String deviceClassName) {
            this.deviceClassName = deviceClassName;
            return this;
        }

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getName}
         * @param name Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim. This parameter is required.
         *             Must be a DNS label.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getAdminAccess}
         * @param adminAccess AdminAccess indicates that this is a claim for administrative access to the device(s).
         *                    Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.
         * @return {@code this}
         */
        public Builder adminAccess(java.lang.Boolean adminAccess) {
            this.adminAccess = adminAccess;
            return this;
        }

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getAllocationMode}
         * @param allocationMode AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:.
         *                       <ul>
         *                       <li>ExactCount: This request is for a specific number of devices.
         *                       This is the default. The exact number is provided in the
         *                       count field.</li>
         *                       <li>All: This request is for all of the matching devices in a pool.
         *                       Allocation will fail if some devices are already allocated,
         *                       unless adminAccess is requested.</li>
         *                       </ul>
         *                       <p>
         *                       If AlloctionMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.
         *                       <p>
         *                       More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
         * @return {@code this}
         */
        public Builder allocationMode(java.lang.String allocationMode) {
            this.allocationMode = allocationMode;
            return this;
        }

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getCount}
         * @param count Count is used only when the count mode is "ExactCount".
         *              Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DeviceRequestV1Alpha3#getSelectors}
         * @param selectors Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request.
         *                  All selectors must be satisfied for a device to be considered.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder selectors(java.util.List<? extends imports.k8s.DeviceSelectorV1Alpha3> selectors) {
            this.selectors = (java.util.List<imports.k8s.DeviceSelectorV1Alpha3>)selectors;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceRequestV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceRequestV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceRequestV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceRequestV1Alpha3 {
        private final java.lang.String deviceClassName;
        private final java.lang.String name;
        private final java.lang.Boolean adminAccess;
        private final java.lang.String allocationMode;
        private final java.lang.Number count;
        private final java.util.List<imports.k8s.DeviceSelectorV1Alpha3> selectors;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceClassName = software.amazon.jsii.Kernel.get(this, "deviceClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adminAccess = software.amazon.jsii.Kernel.get(this, "adminAccess", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.allocationMode = software.amazon.jsii.Kernel.get(this, "allocationMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.selectors = software.amazon.jsii.Kernel.get(this, "selectors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceSelectorV1Alpha3.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceClassName = java.util.Objects.requireNonNull(builder.deviceClassName, "deviceClassName is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.adminAccess = builder.adminAccess;
            this.allocationMode = builder.allocationMode;
            this.count = builder.count;
            this.selectors = (java.util.List<imports.k8s.DeviceSelectorV1Alpha3>)builder.selectors;
        }

        @Override
        public final java.lang.String getDeviceClassName() {
            return this.deviceClassName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getAdminAccess() {
            return this.adminAccess;
        }

        @Override
        public final java.lang.String getAllocationMode() {
            return this.allocationMode;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceSelectorV1Alpha3> getSelectors() {
            return this.selectors;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("deviceClassName", om.valueToTree(this.getDeviceClassName()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdminAccess() != null) {
                data.set("adminAccess", om.valueToTree(this.getAdminAccess()));
            }
            if (this.getAllocationMode() != null) {
                data.set("allocationMode", om.valueToTree(this.getAllocationMode()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getSelectors() != null) {
                data.set("selectors", om.valueToTree(this.getSelectors()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceRequestV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceRequestV1Alpha3.Jsii$Proxy that = (DeviceRequestV1Alpha3.Jsii$Proxy) o;

            if (!deviceClassName.equals(that.deviceClassName)) return false;
            if (!name.equals(that.name)) return false;
            if (this.adminAccess != null ? !this.adminAccess.equals(that.adminAccess) : that.adminAccess != null) return false;
            if (this.allocationMode != null ? !this.allocationMode.equals(that.allocationMode) : that.allocationMode != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            return this.selectors != null ? this.selectors.equals(that.selectors) : that.selectors == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deviceClassName.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.adminAccess != null ? this.adminAccess.hashCode() : 0);
            result = 31 * result + (this.allocationMode != null ? this.allocationMode.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.selectors != null ? this.selectors.hashCode() : 0);
            return result;
        }
    }
}
