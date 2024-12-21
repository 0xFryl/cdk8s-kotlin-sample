package imports.k8s;

/**
 * SuccessPolicy describes when a Job can be declared as succeeded based on the success of some indexes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.749Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SuccessPolicy")
@software.amazon.jsii.Jsii.Proxy(SuccessPolicy.Jsii$Proxy.class)
public interface SuccessPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * rules represents the list of alternative rules for the declaring the Jobs as successful before <code>.status.succeeded &gt;= .spec.completions</code>. Once any of the rules are met, the "SucceededCriteriaMet" condition is added, and the lingering pods are removed. The terminal state for such a Job has the "Complete" condition. Additionally, these rules are evaluated in order; Once the Job meets one of the rules, other rules are ignored. At most 20 elements are allowed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.SuccessPolicyRule> getRules();

    /**
     * @return a {@link Builder} of {@link SuccessPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SuccessPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SuccessPolicy> {
        java.util.List<imports.k8s.SuccessPolicyRule> rules;

        /**
         * Sets the value of {@link SuccessPolicy#getRules}
         * @param rules rules represents the list of alternative rules for the declaring the Jobs as successful before <code>.status.succeeded &gt;= .spec.completions</code>. Once any of the rules are met, the "SucceededCriteriaMet" condition is added, and the lingering pods are removed. The terminal state for such a Job has the "Complete" condition. Additionally, these rules are evaluated in order; Once the Job meets one of the rules, other rules are ignored. At most 20 elements are allowed. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.SuccessPolicyRule> rules) {
            this.rules = (java.util.List<imports.k8s.SuccessPolicyRule>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SuccessPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SuccessPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SuccessPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SuccessPolicy {
        private final java.util.List<imports.k8s.SuccessPolicyRule> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.SuccessPolicyRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rules = (java.util.List<imports.k8s.SuccessPolicyRule>)java.util.Objects.requireNonNull(builder.rules, "rules is required");
        }

        @Override
        public final java.util.List<imports.k8s.SuccessPolicyRule> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rules", om.valueToTree(this.getRules()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SuccessPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SuccessPolicy.Jsii$Proxy that = (SuccessPolicy.Jsii$Proxy) o;

            return this.rules.equals(that.rules);
        }

        @Override
        public final int hashCode() {
            int result = this.rules.hashCode();
            return result;
        }
    }
}
