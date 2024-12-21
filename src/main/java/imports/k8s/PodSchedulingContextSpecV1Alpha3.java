package imports.k8s;

/**
 * PodSchedulingContextSpec describes where resources for the Pod are needed.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.711Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodSchedulingContextSpecV1Alpha3")
@software.amazon.jsii.Jsii.Proxy(PodSchedulingContextSpecV1Alpha3.Jsii$Proxy.class)
public interface PodSchedulingContextSpecV1Alpha3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * PotentialNodes lists nodes where the Pod might be able to run.
     * <p>
     * The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPotentialNodes() {
        return null;
    }

    /**
     * SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use "WaitForFirstConsumer" allocation is to be attempted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelectedNode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSchedulingContextSpecV1Alpha3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSchedulingContextSpecV1Alpha3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSchedulingContextSpecV1Alpha3> {
        java.util.List<java.lang.String> potentialNodes;
        java.lang.String selectedNode;

        /**
         * Sets the value of {@link PodSchedulingContextSpecV1Alpha3#getPotentialNodes}
         * @param potentialNodes PotentialNodes lists nodes where the Pod might be able to run.
         *                       The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
         * @return {@code this}
         */
        public Builder potentialNodes(java.util.List<java.lang.String> potentialNodes) {
            this.potentialNodes = potentialNodes;
            return this;
        }

        /**
         * Sets the value of {@link PodSchedulingContextSpecV1Alpha3#getSelectedNode}
         * @param selectedNode SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use "WaitForFirstConsumer" allocation is to be attempted.
         * @return {@code this}
         */
        public Builder selectedNode(java.lang.String selectedNode) {
            this.selectedNode = selectedNode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSchedulingContextSpecV1Alpha3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSchedulingContextSpecV1Alpha3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSchedulingContextSpecV1Alpha3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSchedulingContextSpecV1Alpha3 {
        private final java.util.List<java.lang.String> potentialNodes;
        private final java.lang.String selectedNode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.potentialNodes = software.amazon.jsii.Kernel.get(this, "potentialNodes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selectedNode = software.amazon.jsii.Kernel.get(this, "selectedNode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.potentialNodes = builder.potentialNodes;
            this.selectedNode = builder.selectedNode;
        }

        @Override
        public final java.util.List<java.lang.String> getPotentialNodes() {
            return this.potentialNodes;
        }

        @Override
        public final java.lang.String getSelectedNode() {
            return this.selectedNode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPotentialNodes() != null) {
                data.set("potentialNodes", om.valueToTree(this.getPotentialNodes()));
            }
            if (this.getSelectedNode() != null) {
                data.set("selectedNode", om.valueToTree(this.getSelectedNode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodSchedulingContextSpecV1Alpha3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSchedulingContextSpecV1Alpha3.Jsii$Proxy that = (PodSchedulingContextSpecV1Alpha3.Jsii$Proxy) o;

            if (this.potentialNodes != null ? !this.potentialNodes.equals(that.potentialNodes) : that.potentialNodes != null) return false;
            return this.selectedNode != null ? this.selectedNode.equals(that.selectedNode) : that.selectedNode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.potentialNodes != null ? this.potentialNodes.hashCode() : 0;
            result = 31 * result + (this.selectedNode != null ? this.selectedNode.hashCode() : 0);
            return result;
        }
    }
}
