package imports.k8s;

/**
 * PodSchedulingContext objects hold information that is needed to schedule a Pod with ResourceClaims that use "WaitForFirstConsumer" allocation mode.
 * <p>
 * This is an alpha type and requires enabling the DRAControlPlaneController feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.619Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePodSchedulingContextV1Alpha3Props")
@software.amazon.jsii.Jsii.Proxy(KubePodSchedulingContextV1Alpha3Props.Jsii$Proxy.class)
public interface KubePodSchedulingContextV1Alpha3Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec describes where resources for the Pod are needed.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PodSchedulingContextSpecV1Alpha3 getSpec();

    /**
     * Standard object metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePodSchedulingContextV1Alpha3Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePodSchedulingContextV1Alpha3Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePodSchedulingContextV1Alpha3Props> {
        imports.k8s.PodSchedulingContextSpecV1Alpha3 spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubePodSchedulingContextV1Alpha3Props#getSpec}
         * @param spec Spec describes where resources for the Pod are needed. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.PodSchedulingContextSpecV1Alpha3 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link KubePodSchedulingContextV1Alpha3Props#getMetadata}
         * @param metadata Standard object metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePodSchedulingContextV1Alpha3Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePodSchedulingContextV1Alpha3Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubePodSchedulingContextV1Alpha3Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePodSchedulingContextV1Alpha3Props {
        private final imports.k8s.PodSchedulingContextSpecV1Alpha3 spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.PodSchedulingContextSpecV1Alpha3.class));
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
        public final imports.k8s.PodSchedulingContextSpecV1Alpha3 getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.KubePodSchedulingContextV1Alpha3Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePodSchedulingContextV1Alpha3Props.Jsii$Proxy that = (KubePodSchedulingContextV1Alpha3Props.Jsii$Proxy) o;

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
