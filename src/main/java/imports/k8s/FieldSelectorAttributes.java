package imports.k8s;

/**
 * FieldSelectorAttributes indicates a field limited access.
 * <p>
 * Webhook authors are encouraged to * ensure rawSelector and requirements are not both set * consider the requirements field if set * not try to parse or consider the rawSelector field if set. This is to avoid another CVE-2022-2880 (i.e. getting different systems to agree on how exactly to parse a query is not something we want), see https://www.oxeye.io/resources/golang-parameter-smuggling-attack for more details. For the *SubjectAccessReview endpoints of the kube-apiserver: * If rawSelector is empty and requirements are empty, the request is not limited. * If rawSelector is present and requirements are empty, the rawSelector will be parsed and limited if the parsing succeeds. * If rawSelector is empty and requirements are present, the requirements should be honored * If rawSelector is present and requirements are present, the request is invalid.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.506Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.FieldSelectorAttributes")
@software.amazon.jsii.Jsii.Proxy(FieldSelectorAttributes.Jsii$Proxy.class)
public interface FieldSelectorAttributes extends software.amazon.jsii.JsiiSerializable {

    /**
     * rawSelector is the serialization of a field selector that would be included in a query parameter.
     * <p>
     * Webhook implementations are encouraged to ignore rawSelector. The kube-apiserver's *SubjectAccessReview will parse the rawSelector as long as the requirements are not present.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRawSelector() {
        return null;
    }

    /**
     * requirements is the parsed interpretation of a field selector.
     * <p>
     * All requirements must be met for a resource instance to match the selector. Webhook implementations should handle requirements, but how to handle them is up to the webhook. Since requirements can only limit the request, it is safe to authorize as unlimited request if the requirements are not understood.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.FieldSelectorRequirement> getRequirements() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FieldSelectorAttributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FieldSelectorAttributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FieldSelectorAttributes> {
        java.lang.String rawSelector;
        java.util.List<imports.k8s.FieldSelectorRequirement> requirements;

        /**
         * Sets the value of {@link FieldSelectorAttributes#getRawSelector}
         * @param rawSelector rawSelector is the serialization of a field selector that would be included in a query parameter.
         *                    Webhook implementations are encouraged to ignore rawSelector. The kube-apiserver's *SubjectAccessReview will parse the rawSelector as long as the requirements are not present.
         * @return {@code this}
         */
        public Builder rawSelector(java.lang.String rawSelector) {
            this.rawSelector = rawSelector;
            return this;
        }

        /**
         * Sets the value of {@link FieldSelectorAttributes#getRequirements}
         * @param requirements requirements is the parsed interpretation of a field selector.
         *                     All requirements must be met for a resource instance to match the selector. Webhook implementations should handle requirements, but how to handle them is up to the webhook. Since requirements can only limit the request, it is safe to authorize as unlimited request if the requirements are not understood.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requirements(java.util.List<? extends imports.k8s.FieldSelectorRequirement> requirements) {
            this.requirements = (java.util.List<imports.k8s.FieldSelectorRequirement>)requirements;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FieldSelectorAttributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FieldSelectorAttributes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FieldSelectorAttributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FieldSelectorAttributes {
        private final java.lang.String rawSelector;
        private final java.util.List<imports.k8s.FieldSelectorRequirement> requirements;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rawSelector = software.amazon.jsii.Kernel.get(this, "rawSelector", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requirements = software.amazon.jsii.Kernel.get(this, "requirements", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.FieldSelectorRequirement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rawSelector = builder.rawSelector;
            this.requirements = (java.util.List<imports.k8s.FieldSelectorRequirement>)builder.requirements;
        }

        @Override
        public final java.lang.String getRawSelector() {
            return this.rawSelector;
        }

        @Override
        public final java.util.List<imports.k8s.FieldSelectorRequirement> getRequirements() {
            return this.requirements;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRawSelector() != null) {
                data.set("rawSelector", om.valueToTree(this.getRawSelector()));
            }
            if (this.getRequirements() != null) {
                data.set("requirements", om.valueToTree(this.getRequirements()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FieldSelectorAttributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FieldSelectorAttributes.Jsii$Proxy that = (FieldSelectorAttributes.Jsii$Proxy) o;

            if (this.rawSelector != null ? !this.rawSelector.equals(that.rawSelector) : that.rawSelector != null) return false;
            return this.requirements != null ? this.requirements.equals(that.requirements) : that.requirements == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rawSelector != null ? this.rawSelector.hashCode() : 0;
            result = 31 * result + (this.requirements != null ? this.requirements.hashCode() : 0);
            return result;
        }
    }
}
