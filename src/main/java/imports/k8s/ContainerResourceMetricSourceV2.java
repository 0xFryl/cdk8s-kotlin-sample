package imports.k8s;

/**
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:34.955Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ContainerResourceMetricSourceV2")
@software.amazon.jsii.Jsii.Proxy(ContainerResourceMetricSourceV2.Jsii$Proxy.class)
public interface ContainerResourceMetricSourceV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * container is the name of the container in the pods of the scaling target.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContainer();

    /**
     * name is the name of the resource in question.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * target specifies the target value for the given metric.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.MetricTargetV2 getTarget();

    /**
     * @return a {@link Builder} of {@link ContainerResourceMetricSourceV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ContainerResourceMetricSourceV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ContainerResourceMetricSourceV2> {
        java.lang.String container;
        java.lang.String name;
        imports.k8s.MetricTargetV2 target;

        /**
         * Sets the value of {@link ContainerResourceMetricSourceV2#getContainer}
         * @param container container is the name of the container in the pods of the scaling target. This parameter is required.
         * @return {@code this}
         */
        public Builder container(java.lang.String container) {
            this.container = container;
            return this;
        }

        /**
         * Sets the value of {@link ContainerResourceMetricSourceV2#getName}
         * @param name name is the name of the resource in question. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ContainerResourceMetricSourceV2#getTarget}
         * @param target target specifies the target value for the given metric. This parameter is required.
         * @return {@code this}
         */
        public Builder target(imports.k8s.MetricTargetV2 target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ContainerResourceMetricSourceV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ContainerResourceMetricSourceV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ContainerResourceMetricSourceV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ContainerResourceMetricSourceV2 {
        private final java.lang.String container;
        private final java.lang.String name;
        private final imports.k8s.MetricTargetV2 target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.container = software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.k8s.MetricTargetV2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.container = java.util.Objects.requireNonNull(builder.container, "container is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
        }

        @Override
        public final java.lang.String getContainer() {
            return this.container;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.MetricTargetV2 getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("container", om.valueToTree(this.getContainer()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("target", om.valueToTree(this.getTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ContainerResourceMetricSourceV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ContainerResourceMetricSourceV2.Jsii$Proxy that = (ContainerResourceMetricSourceV2.Jsii$Proxy) o;

            if (!container.equals(that.container)) return false;
            if (!name.equals(that.name)) return false;
            return this.target.equals(that.target);
        }

        @Override
        public final int hashCode() {
            int result = this.container.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.target.hashCode());
            return result;
        }
    }
}
