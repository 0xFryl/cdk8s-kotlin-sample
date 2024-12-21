package imports.k8s;

/**
 * ContainerResizePolicy represents resource resize policy for the container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.464Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ContainerResizePolicy")
@software.amazon.jsii.Jsii.Proxy(ContainerResizePolicy.Jsii$Proxy.class)
public interface ContainerResizePolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the resource to which this resource resize policy applies.
     * <p>
     * Supported values: cpu, memory.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceName();

    /**
     * Restart policy to apply when specified resource is resized.
     * <p>
     * If not specified, it defaults to NotRequired.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRestartPolicy();

    /**
     * @return a {@link Builder} of {@link ContainerResizePolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ContainerResizePolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ContainerResizePolicy> {
        java.lang.String resourceName;
        java.lang.String restartPolicy;

        /**
         * Sets the value of {@link ContainerResizePolicy#getResourceName}
         * @param resourceName Name of the resource to which this resource resize policy applies. This parameter is required.
         *                     Supported values: cpu, memory.
         * @return {@code this}
         */
        public Builder resourceName(java.lang.String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Sets the value of {@link ContainerResizePolicy#getRestartPolicy}
         * @param restartPolicy Restart policy to apply when specified resource is resized. This parameter is required.
         *                      If not specified, it defaults to NotRequired.
         * @return {@code this}
         */
        public Builder restartPolicy(java.lang.String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ContainerResizePolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ContainerResizePolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ContainerResizePolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ContainerResizePolicy {
        private final java.lang.String resourceName;
        private final java.lang.String restartPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceName = software.amazon.jsii.Kernel.get(this, "resourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restartPolicy = software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceName = java.util.Objects.requireNonNull(builder.resourceName, "resourceName is required");
            this.restartPolicy = java.util.Objects.requireNonNull(builder.restartPolicy, "restartPolicy is required");
        }

        @Override
        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        @Override
        public final java.lang.String getRestartPolicy() {
            return this.restartPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resourceName", om.valueToTree(this.getResourceName()));
            data.set("restartPolicy", om.valueToTree(this.getRestartPolicy()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ContainerResizePolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ContainerResizePolicy.Jsii$Proxy that = (ContainerResizePolicy.Jsii$Proxy) o;

            if (!resourceName.equals(that.resourceName)) return false;
            return this.restartPolicy.equals(that.restartPolicy);
        }

        @Override
        public final int hashCode() {
            int result = this.resourceName.hashCode();
            result = 31 * result + (this.restartPolicy.hashCode());
            return result;
        }
    }
}
