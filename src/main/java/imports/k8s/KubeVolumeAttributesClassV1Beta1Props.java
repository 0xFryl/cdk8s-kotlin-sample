package imports.k8s;

/**
 * VolumeAttributesClass represents a specification of mutable volume attributes defined by the CSI driver.
 * <p>
 * The class can be specified during dynamic provisioning of PersistentVolumeClaims, and changed in the PersistentVolumeClaim spec after provisioning.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.672Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeVolumeAttributesClassV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeVolumeAttributesClassV1Beta1Props.Jsii$Proxy.class)
public interface KubeVolumeAttributesClassV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the CSI driver This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriverName();

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * parameters hold volume attributes defined by the CSI driver.
     * <p>
     * These values are opaque to the Kubernetes and are passed directly to the CSI driver. The underlying storage provider supports changing these attributes on an existing volume, however the parameters field itself is immutable. To invoke a volume update, a new VolumeAttributesClass should be created with new parameters, and the PersistentVolumeClaim should be updated to reference the new VolumeAttributesClass.
     * <p>
     * This field is required and must contain at least one key/value pair. The keys cannot be empty, and the maximum number of parameters is 512, with a cumulative max size of 256K. If the CSI driver rejects invalid parameters, the target PersistentVolumeClaim will be set to an "Infeasible" state in the modifyVolumeStatus field.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeVolumeAttributesClassV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeVolumeAttributesClassV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeVolumeAttributesClassV1Beta1Props> {
        java.lang.String driverName;
        imports.k8s.ObjectMeta metadata;
        java.util.Map<java.lang.String, java.lang.String> parameters;

        /**
         * Sets the value of {@link KubeVolumeAttributesClassV1Beta1Props#getDriverName}
         * @param driverName Name of the CSI driver This field is immutable. This parameter is required.
         * @return {@code this}
         */
        public Builder driverName(java.lang.String driverName) {
            this.driverName = driverName;
            return this;
        }

        /**
         * Sets the value of {@link KubeVolumeAttributesClassV1Beta1Props#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeVolumeAttributesClassV1Beta1Props#getParameters}
         * @param parameters parameters hold volume attributes defined by the CSI driver.
         *                   These values are opaque to the Kubernetes and are passed directly to the CSI driver. The underlying storage provider supports changing these attributes on an existing volume, however the parameters field itself is immutable. To invoke a volume update, a new VolumeAttributesClass should be created with new parameters, and the PersistentVolumeClaim should be updated to reference the new VolumeAttributesClass.
         *                   <p>
         *                   This field is required and must contain at least one key/value pair. The keys cannot be empty, and the maximum number of parameters is 512, with a cumulative max size of 256K. If the CSI driver rejects invalid parameters, the target PersistentVolumeClaim will be set to an "Infeasible" state in the modifyVolumeStatus field.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeVolumeAttributesClassV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeVolumeAttributesClassV1Beta1Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeVolumeAttributesClassV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeVolumeAttributesClassV1Beta1Props {
        private final java.lang.String driverName;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driverName = software.amazon.jsii.Kernel.get(this, "driverName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driverName = java.util.Objects.requireNonNull(builder.driverName, "driverName is required");
            this.metadata = builder.metadata;
            this.parameters = builder.parameters;
        }

        @Override
        public final java.lang.String getDriverName() {
            return this.driverName;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driverName", om.valueToTree(this.getDriverName()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeVolumeAttributesClassV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeVolumeAttributesClassV1Beta1Props.Jsii$Proxy that = (KubeVolumeAttributesClassV1Beta1Props.Jsii$Proxy) o;

            if (!driverName.equals(that.driverName)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.parameters != null ? this.parameters.equals(that.parameters) : that.parameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driverName.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            return result;
        }
    }
}
