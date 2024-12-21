package imports.k8s;

/**
 * ResourcePool describes the pool that ResourceSlices belong to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.730Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourcePoolV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(ResourcePoolV1Alpha3.Jsii$Proxy.class)
public interface ResourcePoolV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Generation tracks the change in a pool over time.
     * <p>
     * Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.
     * <p>
     * Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getGeneration();

    /**
     * Name is used to identify the pool.
     * <p>
     * For node-local devices, this is often the node name, but this is not required.
     * <p>
     * It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.
     * <p>
     * Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getResourceSliceCount();

    /**
     * @return a {@link Builder} of {@link ResourcePoolV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourcePoolV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourcePoolV1Alpha3> {
        java.lang.Number generation;
        java.lang.String name;
        java.lang.Number resourceSliceCount;

        /**
         * Sets the value of {@link ResourcePoolV1Alpha3#getGeneration}
         * @param generation Generation tracks the change in a pool over time. This parameter is required.
         *                   Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.
         *                   <p>
         *                   Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
         * @return {@code this}
         */
        public Builder generation(java.lang.Number generation) {
            this.generation = generation;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePoolV1Alpha3#getName}
         * @param name Name is used to identify the pool. This parameter is required.
         *             For node-local devices, this is often the node name, but this is not required.
         *             <p>
         *             It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePoolV1Alpha3#getResourceSliceCount}
         * @param resourceSliceCount ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero. This parameter is required.
         *                           Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
         * @return {@code this}
         */
        public Builder resourceSliceCount(java.lang.Number resourceSliceCount) {
            this.resourceSliceCount = resourceSliceCount;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourcePoolV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourcePoolV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourcePoolV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourcePoolV1Alpha3 {
        private final java.lang.Number generation;
        private final java.lang.String name;
        private final java.lang.Number resourceSliceCount;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.generation = software.amazon.jsii.Kernel.get(this, "generation", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceSliceCount = software.amazon.jsii.Kernel.get(this, "resourceSliceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.generation = java.util.Objects.requireNonNull(builder.generation, "generation is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.resourceSliceCount = java.util.Objects.requireNonNull(builder.resourceSliceCount, "resourceSliceCount is required");
        }

        @Override
        public final java.lang.Number getGeneration() {
            return this.generation;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getResourceSliceCount() {
            return this.resourceSliceCount;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("generation", om.valueToTree(this.getGeneration()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("resourceSliceCount", om.valueToTree(this.getResourceSliceCount()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourcePoolV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourcePoolV1Alpha3.Jsii$Proxy that = (ResourcePoolV1Alpha3.Jsii$Proxy) o;

            if (!generation.equals(that.generation)) return false;
            if (!name.equals(that.name)) return false;
            return this.resourceSliceCount.equals(that.resourceSliceCount);
        }

        @Override
        public final int hashCode() {
            int result = this.generation.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.resourceSliceCount.hashCode());
            return result;
        }
    }
}
