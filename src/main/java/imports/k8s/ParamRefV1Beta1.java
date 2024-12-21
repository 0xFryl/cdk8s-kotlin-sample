package imports.k8s;

/**
 * ParamRef describes how to locate the params to be used as input to expressions of rules applied by a policy binding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.704Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ParamRefV1Beta1")
@software.amazon.jsii.Jsii.Proxy(ParamRefV1Beta1.Jsii$Proxy.class)
public interface ParamRefV1Beta1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the name of the resource being referenced.
     * <p>
     * One of <code>name</code> or <code>selector</code> must be set, but <code>name</code> and <code>selector</code> are mutually exclusive properties. If one is set, the other must be unset.
     * <p>
     * A single parameter used for all admission requests can be configured by setting the <code>name</code> field, leaving <code>selector</code> blank, and setting namespace if <code>paramKind</code> is namespace-scoped.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * namespace is the namespace of the referenced resource.
     * <p>
     * Allows limiting the search for params to a specific namespace. Applies to both <code>name</code> and <code>selector</code> fields.
     * <p>
     * A per-namespace parameter may be used by specifying a namespace-scoped <code>paramKind</code> in the policy and leaving this field empty.
     * <p>
     * <ul>
     * <li>If <code>paramKind</code> is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.</li>
     * <li>If <code>paramKind</code> is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * <code>parameterNotFoundAction</code> controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding.
     * <p>
     * If the value is set to <code>Allow</code>, then no matched parameters will be treated as successful validation by the binding. If set to <code>Deny</code>, then no matched parameters will be subject to the <code>failurePolicy</code> of the policy.
     * <p>
     * Allowed values are <code>Allow</code> or <code>Deny</code>
     * <p>
     * Required
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParameterNotFoundAction() {
        return null;
    }

    /**
     * selector can be used to match multiple param objects based on their labels.
     * <p>
     * Supply selector: {} to match all resources of the ParamKind.
     * <p>
     * If multiple params are found, they are all evaluated with the policy expressions and the results are ANDed together.
     * <p>
     * One of <code>name</code> or <code>selector</code> must be set, but <code>name</code> and <code>selector</code> are mutually exclusive properties. If one is set, the other must be unset.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ParamRefV1Beta1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ParamRefV1Beta1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ParamRefV1Beta1> {
        java.lang.String name;
        java.lang.String namespace;
        java.lang.String parameterNotFoundAction;
        imports.k8s.LabelSelector selector;

        /**
         * Sets the value of {@link ParamRefV1Beta1#getName}
         * @param name name is the name of the resource being referenced.
         *             One of <code>name</code> or <code>selector</code> must be set, but <code>name</code> and <code>selector</code> are mutually exclusive properties. If one is set, the other must be unset.
         *             <p>
         *             A single parameter used for all admission requests can be configured by setting the <code>name</code> field, leaving <code>selector</code> blank, and setting namespace if <code>paramKind</code> is namespace-scoped.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ParamRefV1Beta1#getNamespace}
         * @param namespace namespace is the namespace of the referenced resource.
         *                  Allows limiting the search for params to a specific namespace. Applies to both <code>name</code> and <code>selector</code> fields.
         *                  <p>
         *                  A per-namespace parameter may be used by specifying a namespace-scoped <code>paramKind</code> in the policy and leaving this field empty.
         *                  <p>
         *                  <ul>
         *                  <li>If <code>paramKind</code> is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.</li>
         *                  <li>If <code>paramKind</code> is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.</li>
         *                  </ul>
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ParamRefV1Beta1#getParameterNotFoundAction}
         * @param parameterNotFoundAction <code>parameterNotFoundAction</code> controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding.
         *                                If the value is set to <code>Allow</code>, then no matched parameters will be treated as successful validation by the binding. If set to <code>Deny</code>, then no matched parameters will be subject to the <code>failurePolicy</code> of the policy.
         *                                <p>
         *                                Allowed values are <code>Allow</code> or <code>Deny</code>
         *                                <p>
         *                                Required
         * @return {@code this}
         */
        public Builder parameterNotFoundAction(java.lang.String parameterNotFoundAction) {
            this.parameterNotFoundAction = parameterNotFoundAction;
            return this;
        }

        /**
         * Sets the value of {@link ParamRefV1Beta1#getSelector}
         * @param selector selector can be used to match multiple param objects based on their labels.
         *                 Supply selector: {} to match all resources of the ParamKind.
         *                 <p>
         *                 If multiple params are found, they are all evaluated with the policy expressions and the results are ANDed together.
         *                 <p>
         *                 One of <code>name</code> or <code>selector</code> must be set, but <code>name</code> and <code>selector</code> are mutually exclusive properties. If one is set, the other must be unset.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ParamRefV1Beta1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ParamRefV1Beta1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ParamRefV1Beta1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ParamRefV1Beta1 {
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String parameterNotFoundAction;
        private final imports.k8s.LabelSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameterNotFoundAction = software.amazon.jsii.Kernel.get(this, "parameterNotFoundAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.parameterNotFoundAction = builder.parameterNotFoundAction;
            this.selector = builder.selector;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getParameterNotFoundAction() {
            return this.parameterNotFoundAction;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getParameterNotFoundAction() != null) {
                data.set("parameterNotFoundAction", om.valueToTree(this.getParameterNotFoundAction()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ParamRefV1Beta1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParamRefV1Beta1.Jsii$Proxy that = (ParamRefV1Beta1.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.parameterNotFoundAction != null ? !this.parameterNotFoundAction.equals(that.parameterNotFoundAction) : that.parameterNotFoundAction != null) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.parameterNotFoundAction != null ? this.parameterNotFoundAction.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
