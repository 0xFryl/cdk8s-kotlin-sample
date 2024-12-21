package imports.k8s;

/**
 * PodResourceClaim references exactly one ResourceClaim, either directly or by naming a ResourceClaimTemplate which is then turned into a ResourceClaim for the pod.
 * <p>
 * It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.711Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodResourceClaim")
@software.amazon.jsii.Jsii.Proxy(PodResourceClaim.Jsii$Proxy.class)
public interface PodResourceClaim extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name uniquely identifies this resource claim inside the pod.
     * <p>
     * This must be a DNS_LABEL.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * <p>
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceClaimName() {
        return null;
    }

    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * <p>
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
     * <p>
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * <p>
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceClaimTemplateName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodResourceClaim}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodResourceClaim}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodResourceClaim> {
        java.lang.String name;
        java.lang.String resourceClaimName;
        java.lang.String resourceClaimTemplateName;

        /**
         * Sets the value of {@link PodResourceClaim#getName}
         * @param name Name uniquely identifies this resource claim inside the pod. This parameter is required.
         *             This must be a DNS_LABEL.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link PodResourceClaim#getResourceClaimName}
         * @param resourceClaimName ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
         *                          Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * @return {@code this}
         */
        public Builder resourceClaimName(java.lang.String resourceClaimName) {
            this.resourceClaimName = resourceClaimName;
            return this;
        }

        /**
         * Sets the value of {@link PodResourceClaim#getResourceClaimTemplateName}
         * @param resourceClaimTemplateName ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
         *                                  The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
         *                                  <p>
         *                                  This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
         *                                  <p>
         *                                  Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * @return {@code this}
         */
        public Builder resourceClaimTemplateName(java.lang.String resourceClaimTemplateName) {
            this.resourceClaimTemplateName = resourceClaimTemplateName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodResourceClaim}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodResourceClaim build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodResourceClaim}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodResourceClaim {
        private final java.lang.String name;
        private final java.lang.String resourceClaimName;
        private final java.lang.String resourceClaimTemplateName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceClaimName = software.amazon.jsii.Kernel.get(this, "resourceClaimName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceClaimTemplateName = software.amazon.jsii.Kernel.get(this, "resourceClaimTemplateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.resourceClaimName = builder.resourceClaimName;
            this.resourceClaimTemplateName = builder.resourceClaimTemplateName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResourceClaimName() {
            return this.resourceClaimName;
        }

        @Override
        public final java.lang.String getResourceClaimTemplateName() {
            return this.resourceClaimTemplateName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getResourceClaimName() != null) {
                data.set("resourceClaimName", om.valueToTree(this.getResourceClaimName()));
            }
            if (this.getResourceClaimTemplateName() != null) {
                data.set("resourceClaimTemplateName", om.valueToTree(this.getResourceClaimTemplateName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodResourceClaim"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodResourceClaim.Jsii$Proxy that = (PodResourceClaim.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.resourceClaimName != null ? !this.resourceClaimName.equals(that.resourceClaimName) : that.resourceClaimName != null) return false;
            return this.resourceClaimTemplateName != null ? this.resourceClaimTemplateName.equals(that.resourceClaimTemplateName) : that.resourceClaimTemplateName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.resourceClaimName != null ? this.resourceClaimName.hashCode() : 0);
            result = 31 * result + (this.resourceClaimTemplateName != null ? this.resourceClaimTemplateName.hashCode() : 0);
            return result;
        }
    }
}
