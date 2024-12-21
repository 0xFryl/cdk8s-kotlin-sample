package imports.k8s;

/**
 * Variable is the definition of a variable that is used for composition.
 * <p>
 * A variable is defined as a named expression.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.773Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Variable")
@software.amazon.jsii.Jsii.Proxy(Variable.Jsii$Proxy.class)
public interface Variable extends software.amazon.jsii.JsiiSerializable {

    /**
     * Expression is the expression that will be evaluated as the value of the variable.
     * <p>
     * The CEL expression has access to the same identifiers as the CEL expressions in Validation.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * Name is the name of the variable.
     * <p>
     * The name must be a valid CEL identifier and unique among all variables. The variable can be accessed in other expressions through <code>variables</code> For example, if name is "foo", the variable will be available as <code>variables.foo</code>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link Variable}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Variable}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Variable> {
        java.lang.String expression;
        java.lang.String name;

        /**
         * Sets the value of {@link Variable#getExpression}
         * @param expression Expression is the expression that will be evaluated as the value of the variable. This parameter is required.
         *                   The CEL expression has access to the same identifiers as the CEL expressions in Validation.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Sets the value of {@link Variable#getName}
         * @param name Name is the name of the variable. This parameter is required.
         *             The name must be a valid CEL identifier and unique among all variables. The variable can be accessed in other expressions through <code>variables</code> For example, if name is "foo", the variable will be available as <code>variables.foo</code>
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Variable}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Variable build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Variable}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Variable {
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
            struct.set("fqn", om.valueToTree("k8s.Variable"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Variable.Jsii$Proxy that = (Variable.Jsii$Proxy) o;

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
