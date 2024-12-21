package imports.k8s;

/**
 * VolumeResourceRequirements describes the storage resource requirements for a volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.778Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeResourceRequirements")
@software.amazon.jsii.Jsii.Proxy(VolumeResourceRequirements.Jsii$Proxy.class)
public interface VolumeResourceRequirements extends software.amazon.jsii.JsiiSerializable {

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getLimits() {
        return null;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * <p>
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeResourceRequirements}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeResourceRequirements}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeResourceRequirements> {
        java.util.Map<java.lang.String, imports.k8s.Quantity> limits;
        java.util.Map<java.lang.String, imports.k8s.Quantity> requests;

        /**
         * Sets the value of {@link VolumeResourceRequirements#getLimits}
         * @param limits Limits describes the maximum amount of compute resources allowed.
         *               More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder limits(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> limits) {
            this.limits = (java.util.Map<java.lang.String, imports.k8s.Quantity>)limits;
            return this;
        }

        /**
         * Sets the value of {@link VolumeResourceRequirements#getRequests}
         * @param requests Requests describes the minimum amount of compute resources required.
         *                 If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requests(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> requests) {
            this.requests = (java.util.Map<java.lang.String, imports.k8s.Quantity>)requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeResourceRequirements}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeResourceRequirements build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeResourceRequirements}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeResourceRequirements {
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> limits;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limits = software.amazon.jsii.Kernel.get(this, "limits", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limits = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.limits;
            this.requests = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.requests;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getLimits() {
            return this.limits;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLimits() != null) {
                data.set("limits", om.valueToTree(this.getLimits()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeResourceRequirements"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeResourceRequirements.Jsii$Proxy that = (VolumeResourceRequirements.Jsii$Proxy) o;

            if (this.limits != null ? !this.limits.equals(that.limits) : that.limits != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limits != null ? this.limits.hashCode() : 0;
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
