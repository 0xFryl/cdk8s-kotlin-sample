package imports.k8s;

/**
 * PriorityLevelConfiguration represents the configuration of a priority level.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.622Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityLevelConfiguration")
public class KubePriorityLevelConfiguration extends org.cdk8s.ApiObject {

    protected KubePriorityLevelConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubePriorityLevelConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubePriorityLevelConfiguration.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.flowcontrol.v1.PriorityLevelConfiguration" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public KubePriorityLevelConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.k8s.KubePriorityLevelConfigurationProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "io.k8s.api.flowcontrol.v1.PriorityLevelConfiguration" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public KubePriorityLevelConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.flowcontrol.v1.PriorityLevelConfiguration".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.k8s.KubePriorityLevelConfigurationProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubePriorityLevelConfiguration.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.flowcontrol.v1.PriorityLevelConfiguration".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubePriorityLevelConfiguration.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.flowcontrol.v1.PriorityLevelConfiguration".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubePriorityLevelConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubePriorityLevelConfiguration> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.k8s.KubePriorityLevelConfigurationProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * <code>metadata</code> is the standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata <code>metadata</code> is the standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * <code>spec</code> is the specification of the desired behavior of a "request-priority".
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * <p>
         * @return {@code this}
         * @param spec <code>spec</code> is the specification of the desired behavior of a "request-priority". This parameter is required.
         */
        public Builder spec(final imports.k8s.PriorityLevelConfigurationSpec spec) {
            this.props().spec(spec);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.k8s.KubePriorityLevelConfiguration}.
         */
        @Override
        public imports.k8s.KubePriorityLevelConfiguration build() {
            return new imports.k8s.KubePriorityLevelConfiguration(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.k8s.KubePriorityLevelConfigurationProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.k8s.KubePriorityLevelConfigurationProps.Builder();
            }
            return this.props;
        }
    }
}
