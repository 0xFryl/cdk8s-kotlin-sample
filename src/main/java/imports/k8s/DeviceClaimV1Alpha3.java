package imports.k8s;

/**
 * DeviceClaim defines how to request devices with a ResourceClaim.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.483Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeviceClaimV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(DeviceClaimV1Alpha3.Jsii$Proxy.class)
public interface DeviceClaimV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * This field holds configuration for multiple potential drivers which could satisfy requests in this claim.
     * <p>
     * It is ignored while allocating the claim.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3> getConfig() {
        return null;
    }

    /**
     * These constraints must be satisfied by the set of devices that get allocated for the claim.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceConstraintV1Alpha3> getConstraints() {
        return null;
    }

    /**
     * Requests represent individual requests for distinct devices which must all be satisfied.
     * <p>
     * If empty, nothing needs to be allocated.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DeviceRequestV1Alpha3> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeviceClaimV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeviceClaimV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeviceClaimV1Alpha3> {
        java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3> config;
        java.util.List<imports.k8s.DeviceConstraintV1Alpha3> constraints;
        java.util.List<imports.k8s.DeviceRequestV1Alpha3> requests;

        /**
         * Sets the value of {@link DeviceClaimV1Alpha3#getConfig}
         * @param config This field holds configuration for multiple potential drivers which could satisfy requests in this claim.
         *               It is ignored while allocating the claim.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder config(java.util.List<? extends imports.k8s.DeviceClaimConfigurationV1Alpha3> config) {
            this.config = (java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3>)config;
            return this;
        }

        /**
         * Sets the value of {@link DeviceClaimV1Alpha3#getConstraints}
         * @param constraints These constraints must be satisfied by the set of devices that get allocated for the claim.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder constraints(java.util.List<? extends imports.k8s.DeviceConstraintV1Alpha3> constraints) {
            this.constraints = (java.util.List<imports.k8s.DeviceConstraintV1Alpha3>)constraints;
            return this;
        }

        /**
         * Sets the value of {@link DeviceClaimV1Alpha3#getRequests}
         * @param requests Requests represent individual requests for distinct devices which must all be satisfied.
         *                 If empty, nothing needs to be allocated.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requests(java.util.List<? extends imports.k8s.DeviceRequestV1Alpha3> requests) {
            this.requests = (java.util.List<imports.k8s.DeviceRequestV1Alpha3>)requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeviceClaimV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeviceClaimV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DeviceClaimV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeviceClaimV1Alpha3 {
        private final java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3> config;
        private final java.util.List<imports.k8s.DeviceConstraintV1Alpha3> constraints;
        private final java.util.List<imports.k8s.DeviceRequestV1Alpha3> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.config = software.amazon.jsii.Kernel.get(this, "config", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceClaimConfigurationV1Alpha3.class)));
            this.constraints = software.amazon.jsii.Kernel.get(this, "constraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceConstraintV1Alpha3.class)));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DeviceRequestV1Alpha3.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.config = (java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3>)builder.config;
            this.constraints = (java.util.List<imports.k8s.DeviceConstraintV1Alpha3>)builder.constraints;
            this.requests = (java.util.List<imports.k8s.DeviceRequestV1Alpha3>)builder.requests;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceClaimConfigurationV1Alpha3> getConfig() {
            return this.config;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceConstraintV1Alpha3> getConstraints() {
            return this.constraints;
        }

        @Override
        public final java.util.List<imports.k8s.DeviceRequestV1Alpha3> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfig() != null) {
                data.set("config", om.valueToTree(this.getConfig()));
            }
            if (this.getConstraints() != null) {
                data.set("constraints", om.valueToTree(this.getConstraints()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeviceClaimV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeviceClaimV1Alpha3.Jsii$Proxy that = (DeviceClaimV1Alpha3.Jsii$Proxy) o;

            if (this.config != null ? !this.config.equals(that.config) : that.config != null) return false;
            if (this.constraints != null ? !this.constraints.equals(that.constraints) : that.constraints != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.config != null ? this.config.hashCode() : 0;
            result = 31 * result + (this.constraints != null ? this.constraints.hashCode() : 0);
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
