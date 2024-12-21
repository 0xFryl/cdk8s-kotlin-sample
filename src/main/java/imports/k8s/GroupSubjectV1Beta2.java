package imports.k8s;

/**
 * GroupSubject holds detailed information for group-kind subject.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:34.996Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.GroupSubjectV1Beta2")
@software.amazon.jsii.Jsii.Proxy(GroupSubjectV1Beta2.Jsii$Proxy.class)
public interface GroupSubjectV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the user group that matches, or "*" to match all user groups.
     * <p>
     * See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link GroupSubjectV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GroupSubjectV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GroupSubjectV1Beta2> {
        java.lang.String name;

        /**
         * Sets the value of {@link GroupSubjectV1Beta2#getName}
         * @param name name is the user group that matches, or "*" to match all user groups. This parameter is required.
         *             See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GroupSubjectV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GroupSubjectV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GroupSubjectV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GroupSubjectV1Beta2 {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GroupSubjectV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GroupSubjectV1Beta2.Jsii$Proxy that = (GroupSubjectV1Beta2.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
