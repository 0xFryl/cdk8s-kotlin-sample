package imports.k8s;

/**
 * ResourceClaim describes a request for access to resources in the cluster, for use by workloads.
 * <p>
 * For example, if a workload needs an accelerator device with specific properties, this is how that request is expressed. The status stanza tracks whether this claim has been satisfied and what specific resources have been allocated.
 * <p>
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.633Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeResourceClaimV1Alpha3")
public class KubeResourceClaimV1Alpha3 extends org.cdk8s.ApiObject {

    protected KubeResourceClaimV1Alpha3(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeResourceClaimV1Alpha3(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeResourceClaimV1Alpha3.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.resource.v1alpha3.ResourceClaim" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeResourceClaimV1Alpha3(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeResourceClaimV1Alpha3Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.resource.v1alpha3.ResourceClaim".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeResourceClaimV1Alpha3Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeResourceClaimV1Alpha3.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.resource.v1alpha3.ResourceClaim".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeResourceClaimV1Alpha3}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeResourceClaimV1Alpha3> {
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
        private final imports.k8s.KubeResourceClaimV1Alpha3Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeResourceClaimV1Alpha3Props.Builder();
        }

        /**
         * Spec describes what is being requested and how to configure it.
         * <p>
         * The spec is immutable.
         * <p>
         * @return {@code this}
         * @param spec Spec describes what is being requested and how to configure it. This parameter is required.
         */
        public Builder spec(final imports.k8s.ResourceClaimSpecV1Alpha3 spec) {
            this.props.spec(spec);
            return this;
        }

        /**
         * Standard object metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.k8s.KubeResourceClaimV1Alpha3}.
         */
        @Override
        public imports.k8s.KubeResourceClaimV1Alpha3 build() {
            return new imports.k8s.KubeResourceClaimV1Alpha3(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
