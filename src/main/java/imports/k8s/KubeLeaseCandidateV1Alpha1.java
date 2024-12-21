package imports.k8s;

/**
 * LeaseCandidate defines a candidate for a Lease object.
 * <p>
 * Candidates are created such that coordinated leader election will pick the best leader from the list of candidates.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.605Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeLeaseCandidateV1Alpha1")
public class KubeLeaseCandidateV1Alpha1 extends org.cdk8s.ApiObject {

    protected KubeLeaseCandidateV1Alpha1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeLeaseCandidateV1Alpha1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeLeaseCandidateV1Alpha1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.coordination.v1alpha1.LeaseCandidate" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public KubeLeaseCandidateV1Alpha1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.k8s.KubeLeaseCandidateV1Alpha1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "io.k8s.api.coordination.v1alpha1.LeaseCandidate" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public KubeLeaseCandidateV1Alpha1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.coordination.v1alpha1.LeaseCandidate".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.k8s.KubeLeaseCandidateV1Alpha1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeLeaseCandidateV1Alpha1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.coordination.v1alpha1.LeaseCandidate".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeLeaseCandidateV1Alpha1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.coordination.v1alpha1.LeaseCandidate".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeLeaseCandidateV1Alpha1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeLeaseCandidateV1Alpha1> {
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
        private imports.k8s.KubeLeaseCandidateV1Alpha1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * spec contains the specification of the Lease.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * <p>
         * @return {@code this}
         * @param spec spec contains the specification of the Lease. This parameter is required.
         */
        public Builder spec(final imports.k8s.LeaseCandidateSpecV1Alpha1 spec) {
            this.props().spec(spec);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.k8s.KubeLeaseCandidateV1Alpha1}.
         */
        @Override
        public imports.k8s.KubeLeaseCandidateV1Alpha1 build() {
            return new imports.k8s.KubeLeaseCandidateV1Alpha1(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.k8s.KubeLeaseCandidateV1Alpha1Props.Builder props() {
            if (this.props == null) {
                this.props = new imports.k8s.KubeLeaseCandidateV1Alpha1Props.Builder();
            }
            return this.props;
        }
    }
}
