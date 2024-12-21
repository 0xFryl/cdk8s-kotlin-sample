package imports.k8s;

/**
 * ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.753Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidatingAdmissionPolicyBindingSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ValidatingAdmissionPolicyBindingSpecV1Alpha1.Jsii$Proxy.class)
public interface ValidatingAdmissionPolicyBindingSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * MatchResources declares what resources match this binding and will be validated by it.
     * <p>
     * Note that this is intersected with the policy's matchConstraints, so only requests that are matched by the policy can be selected by this. If this is unset, all resources matched by the policy are validated by this binding When resourceRules is unset, it does not constrain resource matching. If a resource is matched by the other fields of this object, it will be validated. Note that this is differs from ValidatingAdmissionPolicy matchConstraints, where resourceRules are required.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.MatchResourcesV1Alpha1 getMatchResources() {
        return null;
    }

    /**
     * paramRef specifies the parameter resource used to configure the admission control policy.
     * <p>
     * It should point to a resource of the type specified in ParamKind of the bound ValidatingAdmissionPolicy. If the policy specifies a ParamKind and the resource referred to by ParamRef does not exist, this binding is considered mis-configured and the FailurePolicy of the ValidatingAdmissionPolicy applied. If the policy does not specify a ParamKind then this field is ignored, and the rules are evaluated without a param.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ParamRefV1Alpha1 getParamRef() {
        return null;
    }

    /**
     * PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to.
     * <p>
     * If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyName() {
        return null;
    }

    /**
     * validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced.
     * <p>
     * If a validation evaluates to false it is always enforced according to these actions.
     * <p>
     * Failures defined by the ValidatingAdmissionPolicy's FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.
     * <p>
     * validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.
     * <p>
     * The supported actions values are:
     * <p>
     * "Deny" specifies that a validation failure results in a denied request.
     * <p>
     * "Warn" specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.
     * <p>
     * "Audit" specifies that a validation failure is included in the published audit event for the request. The audit event will contain a <code>validation.policy.admission.k8s.io/validation_failure</code> audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: <code>"validation.policy.admission.k8s.io/validation_failure": "[{"message": "Invalid value", {"policy": "policy.example.com", {"binding": "policybinding.example.com", {"expressionIndex": "1", {"validationActions": ["Audit"]}]"</code>
     * <p>
     * Clients should expect to handle additional values by ignoring any values not recognized.
     * <p>
     * "Deny" and "Warn" may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.
     * <p>
     * Required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValidationActions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingAdmissionPolicyBindingSpecV1Alpha1> {
        imports.k8s.MatchResourcesV1Alpha1 matchResources;
        imports.k8s.ParamRefV1Alpha1 paramRef;
        java.lang.String policyName;
        java.util.List<java.lang.String> validationActions;

        /**
         * Sets the value of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1#getMatchResources}
         * @param matchResources MatchResources declares what resources match this binding and will be validated by it.
         *                       Note that this is intersected with the policy's matchConstraints, so only requests that are matched by the policy can be selected by this. If this is unset, all resources matched by the policy are validated by this binding When resourceRules is unset, it does not constrain resource matching. If a resource is matched by the other fields of this object, it will be validated. Note that this is differs from ValidatingAdmissionPolicy matchConstraints, where resourceRules are required.
         * @return {@code this}
         */
        public Builder matchResources(imports.k8s.MatchResourcesV1Alpha1 matchResources) {
            this.matchResources = matchResources;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1#getParamRef}
         * @param paramRef paramRef specifies the parameter resource used to configure the admission control policy.
         *                 It should point to a resource of the type specified in ParamKind of the bound ValidatingAdmissionPolicy. If the policy specifies a ParamKind and the resource referred to by ParamRef does not exist, this binding is considered mis-configured and the FailurePolicy of the ValidatingAdmissionPolicy applied. If the policy does not specify a ParamKind then this field is ignored, and the rules are evaluated without a param.
         * @return {@code this}
         */
        public Builder paramRef(imports.k8s.ParamRefV1Alpha1 paramRef) {
            this.paramRef = paramRef;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1#getPolicyName}
         * @param policyName PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to.
         *                   If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
         * @return {@code this}
         */
        public Builder policyName(java.lang.String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1#getValidationActions}
         * @param validationActions validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced.
         *                          If a validation evaluates to false it is always enforced according to these actions.
         *                          <p>
         *                          Failures defined by the ValidatingAdmissionPolicy's FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.
         *                          <p>
         *                          validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.
         *                          <p>
         *                          The supported actions values are:
         *                          <p>
         *                          "Deny" specifies that a validation failure results in a denied request.
         *                          <p>
         *                          "Warn" specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.
         *                          <p>
         *                          "Audit" specifies that a validation failure is included in the published audit event for the request. The audit event will contain a <code>validation.policy.admission.k8s.io/validation_failure</code> audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: <code>"validation.policy.admission.k8s.io/validation_failure": "[{"message": "Invalid value", {"policy": "policy.example.com", {"binding": "policybinding.example.com", {"expressionIndex": "1", {"validationActions": ["Audit"]}]"</code>
         *                          <p>
         *                          Clients should expect to handle additional values by ignoring any values not recognized.
         *                          <p>
         *                          "Deny" and "Warn" may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.
         *                          <p>
         *                          Required.
         * @return {@code this}
         */
        public Builder validationActions(java.util.List<java.lang.String> validationActions) {
            this.validationActions = validationActions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingAdmissionPolicyBindingSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidatingAdmissionPolicyBindingSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingAdmissionPolicyBindingSpecV1Alpha1 {
        private final imports.k8s.MatchResourcesV1Alpha1 matchResources;
        private final imports.k8s.ParamRefV1Alpha1 paramRef;
        private final java.lang.String policyName;
        private final java.util.List<java.lang.String> validationActions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchResources = software.amazon.jsii.Kernel.get(this, "matchResources", software.amazon.jsii.NativeType.forClass(imports.k8s.MatchResourcesV1Alpha1.class));
            this.paramRef = software.amazon.jsii.Kernel.get(this, "paramRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ParamRefV1Alpha1.class));
            this.policyName = software.amazon.jsii.Kernel.get(this, "policyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validationActions = software.amazon.jsii.Kernel.get(this, "validationActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchResources = builder.matchResources;
            this.paramRef = builder.paramRef;
            this.policyName = builder.policyName;
            this.validationActions = builder.validationActions;
        }

        @Override
        public final imports.k8s.MatchResourcesV1Alpha1 getMatchResources() {
            return this.matchResources;
        }

        @Override
        public final imports.k8s.ParamRefV1Alpha1 getParamRef() {
            return this.paramRef;
        }

        @Override
        public final java.lang.String getPolicyName() {
            return this.policyName;
        }

        @Override
        public final java.util.List<java.lang.String> getValidationActions() {
            return this.validationActions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchResources() != null) {
                data.set("matchResources", om.valueToTree(this.getMatchResources()));
            }
            if (this.getParamRef() != null) {
                data.set("paramRef", om.valueToTree(this.getParamRef()));
            }
            if (this.getPolicyName() != null) {
                data.set("policyName", om.valueToTree(this.getPolicyName()));
            }
            if (this.getValidationActions() != null) {
                data.set("validationActions", om.valueToTree(this.getValidationActions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidatingAdmissionPolicyBindingSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingAdmissionPolicyBindingSpecV1Alpha1.Jsii$Proxy that = (ValidatingAdmissionPolicyBindingSpecV1Alpha1.Jsii$Proxy) o;

            if (this.matchResources != null ? !this.matchResources.equals(that.matchResources) : that.matchResources != null) return false;
            if (this.paramRef != null ? !this.paramRef.equals(that.paramRef) : that.paramRef != null) return false;
            if (this.policyName != null ? !this.policyName.equals(that.policyName) : that.policyName != null) return false;
            return this.validationActions != null ? this.validationActions.equals(that.validationActions) : that.validationActions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchResources != null ? this.matchResources.hashCode() : 0;
            result = 31 * result + (this.paramRef != null ? this.paramRef.hashCode() : 0);
            result = 31 * result + (this.policyName != null ? this.policyName.hashCode() : 0);
            result = 31 * result + (this.validationActions != null ? this.validationActions.hashCode() : 0);
            return result;
        }
    }
}
