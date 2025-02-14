package imports.k8s;

/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL.
 * <p>
 * A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:35.153Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NonResourcePolicyRuleV1Beta2")
@software.amazon.jsii.Jsii.Proxy(NonResourcePolicyRuleV1Beta2.Jsii$Proxy.class)
public interface NonResourcePolicyRuleV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>nonResourceURLs</code> is a set of url prefixes that a user should have access to and may not be empty.
     * <p>
     * For example:
     * <p>
     * <ul>
     * <li>"/healthz" is legal</li>
     * <li>"/hea*" is illegal</li>
     * <li>"/hea" is legal but matches nothing</li>
     * <li>"/hea/*" also matches nothing</li>
     * <li>"/healthz/<em>" matches all per-component health checks.
     * "</em>" matches all non-resource urls. if it is present, it must be the only entry. Required.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNonResourceUrLs();

    /**
     * <code>verbs</code> is a list of matching verbs and may not be empty.
     * <p>
     * "*" matches all verbs. If it is present, it must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * @return a {@link Builder} of {@link NonResourcePolicyRuleV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NonResourcePolicyRuleV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NonResourcePolicyRuleV1Beta2> {
        java.util.List<java.lang.String> nonResourceUrLs;
        java.util.List<java.lang.String> verbs;

        /**
         * Sets the value of {@link NonResourcePolicyRuleV1Beta2#getNonResourceUrLs}
         * @param nonResourceUrLs <code>nonResourceURLs</code> is a set of url prefixes that a user should have access to and may not be empty. This parameter is required.
         *                        For example:
         *                        <p>
         *                        <ul>
         *                        <li>"/healthz" is legal</li>
         *                        <li>"/hea*" is illegal</li>
         *                        <li>"/hea" is legal but matches nothing</li>
         *                        <li>"/hea/*" also matches nothing</li>
         *                        <li>"/healthz/<em>" matches all per-component health checks.
         *                        "</em>" matches all non-resource urls. if it is present, it must be the only entry. Required.</li>
         *                        </ul>
         * @return {@code this}
         */
        public Builder nonResourceUrLs(java.util.List<java.lang.String> nonResourceUrLs) {
            this.nonResourceUrLs = nonResourceUrLs;
            return this;
        }

        /**
         * Sets the value of {@link NonResourcePolicyRuleV1Beta2#getVerbs}
         * @param verbs <code>verbs</code> is a list of matching verbs and may not be empty. This parameter is required.
         *              "*" matches all verbs. If it is present, it must be the only entry. Required.
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NonResourcePolicyRuleV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NonResourcePolicyRuleV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NonResourcePolicyRuleV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NonResourcePolicyRuleV1Beta2 {
        private final java.util.List<java.lang.String> nonResourceUrLs;
        private final java.util.List<java.lang.String> verbs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nonResourceUrLs = software.amazon.jsii.Kernel.get(this, "nonResourceUrLs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.verbs = software.amazon.jsii.Kernel.get(this, "verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nonResourceUrLs = java.util.Objects.requireNonNull(builder.nonResourceUrLs, "nonResourceUrLs is required");
            this.verbs = java.util.Objects.requireNonNull(builder.verbs, "verbs is required");
        }

        @Override
        public final java.util.List<java.lang.String> getNonResourceUrLs() {
            return this.nonResourceUrLs;
        }

        @Override
        public final java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("nonResourceUrLs", om.valueToTree(this.getNonResourceUrLs()));
            data.set("verbs", om.valueToTree(this.getVerbs()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NonResourcePolicyRuleV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NonResourcePolicyRuleV1Beta2.Jsii$Proxy that = (NonResourcePolicyRuleV1Beta2.Jsii$Proxy) o;

            if (!nonResourceUrLs.equals(that.nonResourceUrLs)) return false;
            return this.verbs.equals(that.verbs);
        }

        @Override
        public final int hashCode() {
            int result = this.nonResourceUrLs.hashCode();
            result = 31 * result + (this.verbs.hashCode());
            return result;
        }
    }
}
