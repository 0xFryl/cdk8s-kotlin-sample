package imports.k8s;

/**
 * AuditAnnotation describes how to produce an audit annotation for an API request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.430Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AuditAnnotation")
@software.amazon.jsii.Jsii.Proxy(AuditAnnotation.Jsii$Proxy.class)
public interface AuditAnnotation extends software.amazon.jsii.JsiiSerializable {

    /**
     * key specifies the audit annotation key.
     * <p>
     * The audit annotation keys of a ValidatingAdmissionPolicy must be unique. The key must be a qualified name ([A-Za-z0-9][-A-Za-z0-9_.]*) no more than 63 bytes in length.
     * <p>
     * The key is combined with the resource name of the ValidatingAdmissionPolicy to construct an audit annotation key: "{ValidatingAdmissionPolicy name}/{key}".
     * <p>
     * If an admission webhook uses the same resource name as this ValidatingAdmissionPolicy and the same audit annotation key, the annotation key will be identical. In this case, the first annotation written with the key will be included in the audit event and all subsequent annotations with the same key will be discarded.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * valueExpression represents the expression which is evaluated by CEL to produce an audit annotation value.
     * <p>
     * The expression must evaluate to either a string or null value. If the expression evaluates to a string, the audit annotation is included with the string value. If the expression evaluates to null or empty string the audit annotation will be omitted. The valueExpression may be no longer than 5kb in length. If the result of the valueExpression is more than 10kb in length, it will be truncated to 10kb.
     * <p>
     * If multiple ValidatingAdmissionPolicyBinding resources match an API request, then the valueExpression will be evaluated for each binding. All unique values produced by the valueExpressions will be joined together in a comma-separated list.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValueExpression();

    /**
     * @return a {@link Builder} of {@link AuditAnnotation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AuditAnnotation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AuditAnnotation> {
        java.lang.String key;
        java.lang.String valueExpression;

        /**
         * Sets the value of {@link AuditAnnotation#getKey}
         * @param key key specifies the audit annotation key. This parameter is required.
         *            The audit annotation keys of a ValidatingAdmissionPolicy must be unique. The key must be a qualified name ([A-Za-z0-9][-A-Za-z0-9_.]*) no more than 63 bytes in length.
         *            <p>
         *            The key is combined with the resource name of the ValidatingAdmissionPolicy to construct an audit annotation key: "{ValidatingAdmissionPolicy name}/{key}".
         *            <p>
         *            If an admission webhook uses the same resource name as this ValidatingAdmissionPolicy and the same audit annotation key, the annotation key will be identical. In this case, the first annotation written with the key will be included in the audit event and all subsequent annotations with the same key will be discarded.
         *            <p>
         *            Required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link AuditAnnotation#getValueExpression}
         * @param valueExpression valueExpression represents the expression which is evaluated by CEL to produce an audit annotation value. This parameter is required.
         *                        The expression must evaluate to either a string or null value. If the expression evaluates to a string, the audit annotation is included with the string value. If the expression evaluates to null or empty string the audit annotation will be omitted. The valueExpression may be no longer than 5kb in length. If the result of the valueExpression is more than 10kb in length, it will be truncated to 10kb.
         *                        <p>
         *                        If multiple ValidatingAdmissionPolicyBinding resources match an API request, then the valueExpression will be evaluated for each binding. All unique values produced by the valueExpressions will be joined together in a comma-separated list.
         *                        <p>
         *                        Required.
         * @return {@code this}
         */
        public Builder valueExpression(java.lang.String valueExpression) {
            this.valueExpression = valueExpression;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AuditAnnotation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AuditAnnotation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AuditAnnotation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AuditAnnotation {
        private final java.lang.String key;
        private final java.lang.String valueExpression;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.valueExpression = software.amazon.jsii.Kernel.get(this, "valueExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.valueExpression = java.util.Objects.requireNonNull(builder.valueExpression, "valueExpression is required");
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getValueExpression() {
            return this.valueExpression;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("valueExpression", om.valueToTree(this.getValueExpression()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AuditAnnotation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AuditAnnotation.Jsii$Proxy that = (AuditAnnotation.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.valueExpression.equals(that.valueExpression);
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.valueExpression.hashCode());
            return result;
        }
    }
}
