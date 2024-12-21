package imports.k8s;

/**
 * ParentReference describes a reference to a parent object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.704Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ParentReferenceV1Beta1")
@software.amazon.jsii.Jsii.Proxy(ParentReferenceV1Beta1.Jsii$Proxy.class)
public interface ParentReferenceV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the name of the object being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Resource is the resource of the object being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    /**
     * Group is the group of the object being referenced.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * Namespace is the namespace of the object being referenced.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ParentReferenceV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ParentReferenceV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ParentReferenceV1Beta1> {
        java.lang.String name;
        java.lang.String resource;
        java.lang.String group;
        java.lang.String namespace;

        /**
         * Sets the value of {@link ParentReferenceV1Beta1#getName}
         * @param name Name is the name of the object being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ParentReferenceV1Beta1#getResource}
         * @param resource Resource is the resource of the object being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link ParentReferenceV1Beta1#getGroup}
         * @param group Group is the group of the object being referenced.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link ParentReferenceV1Beta1#getNamespace}
         * @param namespace Namespace is the namespace of the object being referenced.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ParentReferenceV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ParentReferenceV1Beta1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ParentReferenceV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ParentReferenceV1Beta1 {
        private final java.lang.String name;
        private final java.lang.String resource;
        private final java.lang.String group;
        private final java.lang.String namespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.resource = java.util.Objects.requireNonNull(builder.resource, "resource is required");
            this.group = builder.group;
            this.namespace = builder.namespace;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ParentReferenceV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParentReferenceV1Beta1.Jsii$Proxy that = (ParentReferenceV1Beta1.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!resource.equals(that.resource)) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            return this.namespace != null ? this.namespace.equals(that.namespace) : that.namespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.resource.hashCode());
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            return result;
        }
    }
}
