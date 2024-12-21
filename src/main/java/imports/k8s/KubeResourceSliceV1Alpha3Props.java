package imports.k8s;

/**
 * ResourceSlice represents one or more resources in a pool of similar resources, managed by a common driver.
 * <p>
 * A pool may span more than one ResourceSlice, and exactly how many ResourceSlices comprise a pool is determined by the driver.
 * <p>
 * At the moment, the only supported resources are devices with attributes and capacities. Each device in a given pool, regardless of how many ResourceSlices, must have a unique name. The ResourceSlice in which a device gets published may change over time. The unique identifier for a device is the tuple <driver name>, <pool name>, <device name>.
 * <p>
 * Whenever a driver needs to update a pool, it increments the pool.Spec.Pool.Generation number and updates all ResourceSlices with that new number and new resource definitions. A consumer must only use ResourceSlices with the highest generation number and ignore all others.
 * <p>
 * When allocating all resources in a pool matching certain criteria or when looking for the best solution among several different alternatives, a consumer should check the number of ResourceSlices in a pool (included in each ResourceSlice) to determine whether its view of a pool is complete and if not, should wait until the driver has completed updating the pool.
 * <p>
 * For resources that are not local to a node, the node name is not set. Instead, the driver may use a node selector to specify where the devices are available.
 * <p>
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.636Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeResourceSliceV1Alpha3Props")
@software.amazon.jsii.Jsii.Proxy(KubeResourceSliceV1Alpha3Props.Jsii$Proxy.class)
public interface KubeResourceSliceV1Alpha3Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Contains the information published by the driver.
     * <p>
     * Changing the spec automatically increments the metadata.generation number.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ResourceSliceSpecV1Alpha3 getSpec();

    /**
     * Standard object metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeResourceSliceV1Alpha3Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeResourceSliceV1Alpha3Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeResourceSliceV1Alpha3Props> {
        imports.k8s.ResourceSliceSpecV1Alpha3 spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeResourceSliceV1Alpha3Props#getSpec}
         * @param spec Contains the information published by the driver. This parameter is required.
         *             Changing the spec automatically increments the metadata.generation number.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.ResourceSliceSpecV1Alpha3 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link KubeResourceSliceV1Alpha3Props#getMetadata}
         * @param metadata Standard object metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeResourceSliceV1Alpha3Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeResourceSliceV1Alpha3Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeResourceSliceV1Alpha3Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeResourceSliceV1Alpha3Props {
        private final imports.k8s.ResourceSliceSpecV1Alpha3 spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceSliceSpecV1Alpha3.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(builder.spec, "spec is required");
            this.metadata = builder.metadata;
        }

        @Override
        public final imports.k8s.ResourceSliceSpecV1Alpha3 getSpec() {
            return this.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeResourceSliceV1Alpha3Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeResourceSliceV1Alpha3Props.Jsii$Proxy that = (KubeResourceSliceV1Alpha3Props.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
