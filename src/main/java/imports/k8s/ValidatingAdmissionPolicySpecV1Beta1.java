package imports.k8s;

/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.755Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidatingAdmissionPolicySpecV1Beta1")
@software.amazon.jsii.Jsii.Proxy(ValidatingAdmissionPolicySpecV1Beta1.Jsii$Proxy.class)
public interface ValidatingAdmissionPolicySpecV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request.
     * <p>
     * validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.AuditAnnotationV1Beta1> getAuditAnnotations() {
        return null;
    }

    /**
     * failurePolicy defines how to handle failures for the admission policy.
     * <p>
     * Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
     * <p>
     * A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
     * <p>
     * failurePolicy does not define how validations that evaluate to false are handled.
     * <p>
     * When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
     * <p>
     * Allowed values are Ignore or Fail. Defaults to Fail.
     * <p>
     * Default: Fail.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicy() {
        return null;
    }

    /**
     * MatchConditions is a list of conditions that must be met for a request to be validated.
     * <p>
     * Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
     * <p>
     * If a parameter object is provided, it can be accessed via the <code>params</code> handle in the same manner as validation expressions.
     * <p>
     * The exact matching logic is (in order):
     * <p>
     * <ol>
     * <li>If ANY matchCondition evaluates to FALSE, the policy is skipped.</li>
     * <li>If ALL matchConditions evaluate to TRUE, the policy is evaluated.</li>
     * <li>If any matchCondition evaluates to an error (but none are FALSE):</li>
     * </ol>
     * <p>
     * <ul>
     * <li>If failurePolicy=Fail, reject the request</li>
     * <li>If failurePolicy=Ignore, the policy is skipped</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.MatchConditionV1Beta1> getMatchConditions() {
        return null;
    }

    /**
     * MatchConstraints specifies what resources this policy is designed to validate.
     * <p>
     * The AdmissionPolicy cares about a request if it matches <em>all</em> Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.MatchResourcesV1Beta1 getMatchConstraints() {
        return null;
    }

    /**
     * ParamKind specifies the kind of resources used to parameterize this policy.
     * <p>
     * If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ParamKindV1Beta1 getParamKind() {
        return null;
    }

    /**
     * Validations contain CEL expressions which is used to apply the validation.
     * <p>
     * Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ValidationV1Beta1> getValidations() {
        return null;
    }

    /**
     * Variables contain definitions of variables that can be used in composition of other expressions.
     * <p>
     * Each variable is defined as a named CEL expression. The variables defined here will be available under <code>variables</code> in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
     * <p>
     * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.VariableV1Beta1> getVariables() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingAdmissionPolicySpecV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingAdmissionPolicySpecV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingAdmissionPolicySpecV1Beta1> {
        java.util.List<imports.k8s.AuditAnnotationV1Beta1> auditAnnotations;
        java.lang.String failurePolicy;
        java.util.List<imports.k8s.MatchConditionV1Beta1> matchConditions;
        imports.k8s.MatchResourcesV1Beta1 matchConstraints;
        imports.k8s.ParamKindV1Beta1 paramKind;
        java.util.List<imports.k8s.ValidationV1Beta1> validations;
        java.util.List<imports.k8s.VariableV1Beta1> variables;

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getAuditAnnotations}
         * @param auditAnnotations auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request.
         *                         validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder auditAnnotations(java.util.List<? extends imports.k8s.AuditAnnotationV1Beta1> auditAnnotations) {
            this.auditAnnotations = (java.util.List<imports.k8s.AuditAnnotationV1Beta1>)auditAnnotations;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getFailurePolicy}
         * @param failurePolicy failurePolicy defines how to handle failures for the admission policy.
         *                      Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
         *                      <p>
         *                      A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
         *                      <p>
         *                      failurePolicy does not define how validations that evaluate to false are handled.
         *                      <p>
         *                      When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
         *                      <p>
         *                      Allowed values are Ignore or Fail. Defaults to Fail.
         * @return {@code this}
         */
        public Builder failurePolicy(java.lang.String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getMatchConditions}
         * @param matchConditions MatchConditions is a list of conditions that must be met for a request to be validated.
         *                        Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
         *                        <p>
         *                        If a parameter object is provided, it can be accessed via the <code>params</code> handle in the same manner as validation expressions.
         *                        <p>
         *                        The exact matching logic is (in order):
         *                        <p>
         *                        <ol>
         *                        <li>If ANY matchCondition evaluates to FALSE, the policy is skipped.</li>
         *                        <li>If ALL matchConditions evaluate to TRUE, the policy is evaluated.</li>
         *                        <li>If any matchCondition evaluates to an error (but none are FALSE):</li>
         *                        </ol>
         *                        <p>
         *                        <ul>
         *                        <li>If failurePolicy=Fail, reject the request</li>
         *                        <li>If failurePolicy=Ignore, the policy is skipped</li>
         *                        </ul>
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchConditions(java.util.List<? extends imports.k8s.MatchConditionV1Beta1> matchConditions) {
            this.matchConditions = (java.util.List<imports.k8s.MatchConditionV1Beta1>)matchConditions;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getMatchConstraints}
         * @param matchConstraints MatchConstraints specifies what resources this policy is designed to validate.
         *                         The AdmissionPolicy cares about a request if it matches <em>all</em> Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
         * @return {@code this}
         */
        public Builder matchConstraints(imports.k8s.MatchResourcesV1Beta1 matchConstraints) {
            this.matchConstraints = matchConstraints;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getParamKind}
         * @param paramKind ParamKind specifies the kind of resources used to parameterize this policy.
         *                  If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
         * @return {@code this}
         */
        public Builder paramKind(imports.k8s.ParamKindV1Beta1 paramKind) {
            this.paramKind = paramKind;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getValidations}
         * @param validations Validations contain CEL expressions which is used to apply the validation.
         *                    Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder validations(java.util.List<? extends imports.k8s.ValidationV1Beta1> validations) {
            this.validations = (java.util.List<imports.k8s.ValidationV1Beta1>)validations;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Beta1#getVariables}
         * @param variables Variables contain definitions of variables that can be used in composition of other expressions.
         *                  Each variable is defined as a named CEL expression. The variables defined here will be available under <code>variables</code> in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
         *                  <p>
         *                  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder variables(java.util.List<? extends imports.k8s.VariableV1Beta1> variables) {
            this.variables = (java.util.List<imports.k8s.VariableV1Beta1>)variables;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingAdmissionPolicySpecV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingAdmissionPolicySpecV1Beta1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidatingAdmissionPolicySpecV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingAdmissionPolicySpecV1Beta1 {
        private final java.util.List<imports.k8s.AuditAnnotationV1Beta1> auditAnnotations;
        private final java.lang.String failurePolicy;
        private final java.util.List<imports.k8s.MatchConditionV1Beta1> matchConditions;
        private final imports.k8s.MatchResourcesV1Beta1 matchConstraints;
        private final imports.k8s.ParamKindV1Beta1 paramKind;
        private final java.util.List<imports.k8s.ValidationV1Beta1> validations;
        private final java.util.List<imports.k8s.VariableV1Beta1> variables;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.auditAnnotations = software.amazon.jsii.Kernel.get(this, "auditAnnotations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.AuditAnnotationV1Beta1.class)));
            this.failurePolicy = software.amazon.jsii.Kernel.get(this, "failurePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchConditions = software.amazon.jsii.Kernel.get(this, "matchConditions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.MatchConditionV1Beta1.class)));
            this.matchConstraints = software.amazon.jsii.Kernel.get(this, "matchConstraints", software.amazon.jsii.NativeType.forClass(imports.k8s.MatchResourcesV1Beta1.class));
            this.paramKind = software.amazon.jsii.Kernel.get(this, "paramKind", software.amazon.jsii.NativeType.forClass(imports.k8s.ParamKindV1Beta1.class));
            this.validations = software.amazon.jsii.Kernel.get(this, "validations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ValidationV1Beta1.class)));
            this.variables = software.amazon.jsii.Kernel.get(this, "variables", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.VariableV1Beta1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.auditAnnotations = (java.util.List<imports.k8s.AuditAnnotationV1Beta1>)builder.auditAnnotations;
            this.failurePolicy = builder.failurePolicy;
            this.matchConditions = (java.util.List<imports.k8s.MatchConditionV1Beta1>)builder.matchConditions;
            this.matchConstraints = builder.matchConstraints;
            this.paramKind = builder.paramKind;
            this.validations = (java.util.List<imports.k8s.ValidationV1Beta1>)builder.validations;
            this.variables = (java.util.List<imports.k8s.VariableV1Beta1>)builder.variables;
        }

        @Override
        public final java.util.List<imports.k8s.AuditAnnotationV1Beta1> getAuditAnnotations() {
            return this.auditAnnotations;
        }

        @Override
        public final java.lang.String getFailurePolicy() {
            return this.failurePolicy;
        }

        @Override
        public final java.util.List<imports.k8s.MatchConditionV1Beta1> getMatchConditions() {
            return this.matchConditions;
        }

        @Override
        public final imports.k8s.MatchResourcesV1Beta1 getMatchConstraints() {
            return this.matchConstraints;
        }

        @Override
        public final imports.k8s.ParamKindV1Beta1 getParamKind() {
            return this.paramKind;
        }

        @Override
        public final java.util.List<imports.k8s.ValidationV1Beta1> getValidations() {
            return this.validations;
        }

        @Override
        public final java.util.List<imports.k8s.VariableV1Beta1> getVariables() {
            return this.variables;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAuditAnnotations() != null) {
                data.set("auditAnnotations", om.valueToTree(this.getAuditAnnotations()));
            }
            if (this.getFailurePolicy() != null) {
                data.set("failurePolicy", om.valueToTree(this.getFailurePolicy()));
            }
            if (this.getMatchConditions() != null) {
                data.set("matchConditions", om.valueToTree(this.getMatchConditions()));
            }
            if (this.getMatchConstraints() != null) {
                data.set("matchConstraints", om.valueToTree(this.getMatchConstraints()));
            }
            if (this.getParamKind() != null) {
                data.set("paramKind", om.valueToTree(this.getParamKind()));
            }
            if (this.getValidations() != null) {
                data.set("validations", om.valueToTree(this.getValidations()));
            }
            if (this.getVariables() != null) {
                data.set("variables", om.valueToTree(this.getVariables()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidatingAdmissionPolicySpecV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingAdmissionPolicySpecV1Beta1.Jsii$Proxy that = (ValidatingAdmissionPolicySpecV1Beta1.Jsii$Proxy) o;

            if (this.auditAnnotations != null ? !this.auditAnnotations.equals(that.auditAnnotations) : that.auditAnnotations != null) return false;
            if (this.failurePolicy != null ? !this.failurePolicy.equals(that.failurePolicy) : that.failurePolicy != null) return false;
            if (this.matchConditions != null ? !this.matchConditions.equals(that.matchConditions) : that.matchConditions != null) return false;
            if (this.matchConstraints != null ? !this.matchConstraints.equals(that.matchConstraints) : that.matchConstraints != null) return false;
            if (this.paramKind != null ? !this.paramKind.equals(that.paramKind) : that.paramKind != null) return false;
            if (this.validations != null ? !this.validations.equals(that.validations) : that.validations != null) return false;
            return this.variables != null ? this.variables.equals(that.variables) : that.variables == null;
        }

        @Override
        public final int hashCode() {
            int result = this.auditAnnotations != null ? this.auditAnnotations.hashCode() : 0;
            result = 31 * result + (this.failurePolicy != null ? this.failurePolicy.hashCode() : 0);
            result = 31 * result + (this.matchConditions != null ? this.matchConditions.hashCode() : 0);
            result = 31 * result + (this.matchConstraints != null ? this.matchConstraints.hashCode() : 0);
            result = 31 * result + (this.paramKind != null ? this.paramKind.hashCode() : 0);
            result = 31 * result + (this.validations != null ? this.validations.hashCode() : 0);
            result = 31 * result + (this.variables != null ? this.variables.hashCode() : 0);
            return result;
        }
    }
}
