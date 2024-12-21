package imports.k8s;

/**
 * SuccessPolicyRule describes rule for declaring a Job as succeeded.
 * <p>
 * Each rule must have at least one of the "succeededIndexes" or "succeededCount" specified.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.749Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SuccessPolicyRule")
@software.amazon.jsii.Jsii.Proxy(SuccessPolicyRule.Jsii$Proxy.class)
public interface SuccessPolicyRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job.
     * <p>
     * When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is "1-4", succeededCount is "3", and completed indexes are "1", "3", and "5", the Job isn't declared as succeeded because only "1" and "3" indexes are considered in that rules. When this field is null, this doesn't default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSucceededCount() {
        return null;
    }

    /**
     * succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job.
     * <p>
     * The list of indexes must be within 0 to ".spec.completions-1" and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7". When this field is null, this field doesn't default to any value and is never evaluated at any time.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSucceededIndexes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SuccessPolicyRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SuccessPolicyRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SuccessPolicyRule> {
        java.lang.Number succeededCount;
        java.lang.String succeededIndexes;

        /**
         * Sets the value of {@link SuccessPolicyRule#getSucceededCount}
         * @param succeededCount succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job.
         *                       When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is "1-4", succeededCount is "3", and completed indexes are "1", "3", and "5", the Job isn't declared as succeeded because only "1" and "3" indexes are considered in that rules. When this field is null, this doesn't default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
         * @return {@code this}
         */
        public Builder succeededCount(java.lang.Number succeededCount) {
            this.succeededCount = succeededCount;
            return this;
        }

        /**
         * Sets the value of {@link SuccessPolicyRule#getSucceededIndexes}
         * @param succeededIndexes succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job.
         *                         The list of indexes must be within 0 to ".spec.completions-1" and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7". When this field is null, this field doesn't default to any value and is never evaluated at any time.
         * @return {@code this}
         */
        public Builder succeededIndexes(java.lang.String succeededIndexes) {
            this.succeededIndexes = succeededIndexes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SuccessPolicyRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SuccessPolicyRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SuccessPolicyRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SuccessPolicyRule {
        private final java.lang.Number succeededCount;
        private final java.lang.String succeededIndexes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.succeededCount = software.amazon.jsii.Kernel.get(this, "succeededCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.succeededIndexes = software.amazon.jsii.Kernel.get(this, "succeededIndexes", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.succeededCount = builder.succeededCount;
            this.succeededIndexes = builder.succeededIndexes;
        }

        @Override
        public final java.lang.Number getSucceededCount() {
            return this.succeededCount;
        }

        @Override
        public final java.lang.String getSucceededIndexes() {
            return this.succeededIndexes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSucceededCount() != null) {
                data.set("succeededCount", om.valueToTree(this.getSucceededCount()));
            }
            if (this.getSucceededIndexes() != null) {
                data.set("succeededIndexes", om.valueToTree(this.getSucceededIndexes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SuccessPolicyRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SuccessPolicyRule.Jsii$Proxy that = (SuccessPolicyRule.Jsii$Proxy) o;

            if (this.succeededCount != null ? !this.succeededCount.equals(that.succeededCount) : that.succeededCount != null) return false;
            return this.succeededIndexes != null ? this.succeededIndexes.equals(that.succeededIndexes) : that.succeededIndexes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.succeededCount != null ? this.succeededCount.hashCode() : 0;
            result = 31 * result + (this.succeededIndexes != null ? this.succeededIndexes.hashCode() : 0);
            return result;
        }
    }
}
