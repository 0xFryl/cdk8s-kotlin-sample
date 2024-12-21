package imports.k8s;

/**
 * SelectableField specifies the JSON path of a field that may be used with field selectors.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.737Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SelectableField")
@software.amazon.jsii.Jsii.Proxy(SelectableField.Jsii$Proxy.class)
public interface SelectableField extends software.amazon.jsii.JsiiSerializable {

    /**
     * jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value.
     * <p>
     * Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getJsonPath();

    /**
     * @return a {@link Builder} of {@link SelectableField}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SelectableField}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SelectableField> {
        java.lang.String jsonPath;

        /**
         * Sets the value of {@link SelectableField#getJsonPath}
         * @param jsonPath jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value. This parameter is required.
         *                 Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
         * @return {@code this}
         */
        public Builder jsonPath(java.lang.String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SelectableField}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SelectableField build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SelectableField}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SelectableField {
        private final java.lang.String jsonPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jsonPath = software.amazon.jsii.Kernel.get(this, "jsonPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jsonPath = java.util.Objects.requireNonNull(builder.jsonPath, "jsonPath is required");
        }

        @Override
        public final java.lang.String getJsonPath() {
            return this.jsonPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jsonPath", om.valueToTree(this.getJsonPath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SelectableField"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SelectableField.Jsii$Proxy that = (SelectableField.Jsii$Proxy) o;

            return this.jsonPath.equals(that.jsonPath);
        }

        @Override
        public final int hashCode() {
            int result = this.jsonPath.hashCode();
            return result;
        }
    }
}
