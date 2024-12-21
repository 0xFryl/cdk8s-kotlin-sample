package imports.k8s;

/**
 * IPAddressSpec describe the attributes in an IP Address.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.521Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IpAddressSpecV1Beta1")
@software.amazon.jsii.Jsii.Proxy(IpAddressSpecV1Beta1.Jsii$Proxy.class)
public interface IpAddressSpecV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * ParentRef references the resource that an IPAddress is attached to.
     * <p>
     * An IPAddress must reference a parent object.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ParentReferenceV1Beta1 getParentRef();

    /**
     * @return a {@link Builder} of {@link IpAddressSpecV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IpAddressSpecV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IpAddressSpecV1Beta1> {
        imports.k8s.ParentReferenceV1Beta1 parentRef;

        /**
         * Sets the value of {@link IpAddressSpecV1Beta1#getParentRef}
         * @param parentRef ParentRef references the resource that an IPAddress is attached to. This parameter is required.
         *                  An IPAddress must reference a parent object.
         * @return {@code this}
         */
        public Builder parentRef(imports.k8s.ParentReferenceV1Beta1 parentRef) {
            this.parentRef = parentRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IpAddressSpecV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IpAddressSpecV1Beta1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IpAddressSpecV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IpAddressSpecV1Beta1 {
        private final imports.k8s.ParentReferenceV1Beta1 parentRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.parentRef = software.amazon.jsii.Kernel.get(this, "parentRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ParentReferenceV1Beta1.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.parentRef = java.util.Objects.requireNonNull(builder.parentRef, "parentRef is required");
        }

        @Override
        public final imports.k8s.ParentReferenceV1Beta1 getParentRef() {
            return this.parentRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("parentRef", om.valueToTree(this.getParentRef()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IpAddressSpecV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IpAddressSpecV1Beta1.Jsii$Proxy that = (IpAddressSpecV1Beta1.Jsii$Proxy) o;

            return this.parentRef.equals(that.parentRef);
        }

        @Override
        public final int hashCode() {
            int result = this.parentRef.hashCode();
            return result;
        }
    }
}
