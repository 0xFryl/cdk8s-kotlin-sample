package imports.k8s;

/**
 * VolumeAttributesClass represents a specification of mutable volume attributes defined by the CSI driver.
 * <p>
 * The class can be specified during dynamic provisioning of PersistentVolumeClaims, and changed in the PersistentVolumeClaim spec after provisioning.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.671Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeVolumeAttributesClassV1Alpha1")
public class KubeVolumeAttributesClassV1Alpha1 extends org.cdk8s.ApiObject {

    protected KubeVolumeAttributesClassV1Alpha1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeVolumeAttributesClassV1Alpha1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeVolumeAttributesClassV1Alpha1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.storage.v1alpha1.VolumeAttributesClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeVolumeAttributesClassV1Alpha1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeVolumeAttributesClassV1Alpha1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.storage.v1alpha1.VolumeAttributesClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeVolumeAttributesClassV1Alpha1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeVolumeAttributesClassV1Alpha1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.storage.v1alpha1.VolumeAttributesClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeVolumeAttributesClassV1Alpha1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeVolumeAttributesClassV1Alpha1> {
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
        private final imports.k8s.KubeVolumeAttributesClassV1Alpha1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeVolumeAttributesClassV1Alpha1Props.Builder();
        }

        /**
         * Name of the CSI driver This field is immutable.
         * <p>
         * @return {@code this}
         * @param driverName Name of the CSI driver This field is immutable. This parameter is required.
         */
        public Builder driverName(final java.lang.String driverName) {
            this.props.driverName(driverName);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * parameters hold volume attributes defined by the CSI driver.
         * <p>
         * These values are opaque to the Kubernetes and are passed directly to the CSI driver. The underlying storage provider supports changing these attributes on an existing volume, however the parameters field itself is immutable. To invoke a volume update, a new VolumeAttributesClass should be created with new parameters, and the PersistentVolumeClaim should be updated to reference the new VolumeAttributesClass.
         * <p>
         * This field is required and must contain at least one key/value pair. The keys cannot be empty, and the maximum number of parameters is 512, with a cumulative max size of 256K. If the CSI driver rejects invalid parameters, the target PersistentVolumeClaim will be set to an "Infeasible" state in the modifyVolumeStatus field.
         * <p>
         * @return {@code this}
         * @param parameters parameters hold volume attributes defined by the CSI driver. This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.props.parameters(parameters);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.k8s.KubeVolumeAttributesClassV1Alpha1}.
         */
        @Override
        public imports.k8s.KubeVolumeAttributesClassV1Alpha1 build() {
            return new imports.k8s.KubeVolumeAttributesClassV1Alpha1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
