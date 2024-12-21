package imports.k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.678Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MatchConditionV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(MatchConditionV1Alpha1.Jsii$Proxy.class)
public interface MatchConditionV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Expression represents the expression which will be evaluated by CEL.
     * <p>
     * Must evaluate to bool. CEL expressions have access to the contents of the AdmissionRequest and Authorizer, organized into CEL variables:
     * <p>
     * 'object' - The object from the incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE requests. 'request' - Attributes of the admission request(/pkg/apis/admission/types.go#AdmissionRequest). 'authorizer' - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.
     * See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz
     * 'authorizer.requestResource' - A CEL ResourceCheck constructed from the 'authorizer' and configured with the
     * request resource.
     * Documentation on CEL: https://kubernetes.io/docs/reference/using-api/cel/
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * Name is an identifier for this match condition, used for strategic merging of MatchConditions, as well as providing an identifier for logging purposes.
     * <p>
     * A good name should be descriptive of the associated expression. Name must be a qualified name consisting of alphanumeric characters, '-', '<em>' or '.', and must start and end with an alphanumeric character (e.g. 'MyName',  or 'my.name',  or '123-abc', regex used for validation is '([A-Za-z0-9][-A-Za-z0-9</em>.]*)?[A-Za-z0-9]') with an optional DNS subdomain prefix and '/' (e.g. 'example.com/MyName')
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link MatchConditionV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MatchConditionV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MatchConditionV1Alpha1> {
        java.lang.String expression;
        java.lang.String name;

        /**
         * Sets the value of {@link MatchConditionV1Alpha1#getExpression}
         * @param expression Expression represents the expression which will be evaluated by CEL. This parameter is required.
         *                   Must evaluate to bool. CEL expressions have access to the contents of the AdmissionRequest and Authorizer, organized into CEL variables:
         *                   <p>
         *                   'object' - The object from the incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE requests. 'request' - Attributes of the admission request(/pkg/apis/admission/types.go#AdmissionRequest). 'authorizer' - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.
         *                   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz
         *                   'authorizer.requestResource' - A CEL ResourceCheck constructed from the 'authorizer' and configured with the
         *                   request resource.
         *                   Documentation on CEL: https://kubernetes.io/docs/reference/using-api/cel/
         *                   <p>
         *                   Required.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Sets the value of {@link MatchConditionV1Alpha1#getName}
         * @param name Name is an identifier for this match condition, used for strategic merging of MatchConditions, as well as providing an identifier for logging purposes. This parameter is required.
         *             A good name should be descriptive of the associated expression. Name must be a qualified name consisting of alphanumeric characters, '-', '<em>' or '.', and must start and end with an alphanumeric character (e.g. 'MyName',  or 'my.name',  or '123-abc', regex used for validation is '([A-Za-z0-9][-A-Za-z0-9</em>.]*)?[A-Za-z0-9]') with an optional DNS subdomain prefix and '/' (e.g. 'example.com/MyName')
         *             <p>
         *             Required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MatchConditionV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MatchConditionV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MatchConditionV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MatchConditionV1Alpha1 {
        private final java.lang.String expression;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.expression = java.util.Objects.requireNonNull(builder.expression, "expression is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
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

            data.set("expression", om.valueToTree(this.getExpression()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MatchConditionV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MatchConditionV1Alpha1.Jsii$Proxy that = (MatchConditionV1Alpha1.Jsii$Proxy) o;

            if (!expression.equals(that.expression)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.expression.hashCode();
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
