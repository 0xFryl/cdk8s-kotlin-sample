package imports.k8s;

/**
 * The names of the group, the version, and the resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.511Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.GroupVersionResourceV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(GroupVersionResourceV1Alpha1.Jsii$Proxy.class)
public interface GroupVersionResourceV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * The name of the group.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * The name of the resource.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResource() {
        return null;
    }

    /**
     * The name of the version.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GroupVersionResourceV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GroupVersionResourceV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GroupVersionResourceV1Alpha1> {
        java.lang.String group;
        java.lang.String resource;
        java.lang.String version;

        /**
         * Sets the value of {@link GroupVersionResourceV1Alpha1#getGroup}
         * @param group The name of the group.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link GroupVersionResourceV1Alpha1#getResource}
         * @param resource The name of the resource.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link GroupVersionResourceV1Alpha1#getVersion}
         * @param version The name of the version.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GroupVersionResourceV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GroupVersionResourceV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GroupVersionResourceV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GroupVersionResourceV1Alpha1 {
        private final java.lang.String group;
        private final java.lang.String resource;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.group = builder.group;
            this.resource = builder.resource;
            this.version = builder.version;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GroupVersionResourceV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GroupVersionResourceV1Alpha1.Jsii$Proxy that = (GroupVersionResourceV1Alpha1.Jsii$Proxy) o;

            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.resource != null ? !this.resource.equals(that.resource) : that.resource != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.group != null ? this.group.hashCode() : 0;
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
