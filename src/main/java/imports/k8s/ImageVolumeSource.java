package imports.k8s;

/**
 * ImageVolumeSource represents a image volume resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.516Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ImageVolumeSource")
@software.amazon.jsii.Jsii.Proxy(ImageVolumeSource.Jsii$Proxy.class)
public interface ImageVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Policy for pulling OCI objects.
     * <p>
     * Possible values are: Always: the kubelet always attempts to pull the reference. Container creation will fail If the pull fails. Never: the kubelet never pulls the reference and only uses a local image or artifact. Container creation will fail if the reference isn't present. IfNotPresent: the kubelet pulls if the reference isn't already present on disk. Container creation will fail if the reference isn't present and the pull fails. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
     * <p>
     * Default: Always if :latest tag is specified, or IfNotPresent otherwise.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPullPolicy() {
        return null;
    }

    /**
     * Required: Image or artifact reference to be used.
     * <p>
     * Behaves in the same way as pod.spec.containers[*].image. Pull secrets will be assembled in the same way as for the container image by looking up node credentials, SA image pull secrets, and pod spec image pull secrets. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReference() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ImageVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ImageVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ImageVolumeSource> {
        java.lang.String pullPolicy;
        java.lang.String reference;

        /**
         * Sets the value of {@link ImageVolumeSource#getPullPolicy}
         * @param pullPolicy Policy for pulling OCI objects.
         *                   Possible values are: Always: the kubelet always attempts to pull the reference. Container creation will fail If the pull fails. Never: the kubelet never pulls the reference and only uses a local image or artifact. Container creation will fail if the reference isn't present. IfNotPresent: the kubelet pulls if the reference isn't already present on disk. Container creation will fail if the reference isn't present and the pull fails. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
         * @return {@code this}
         */
        public Builder pullPolicy(java.lang.String pullPolicy) {
            this.pullPolicy = pullPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ImageVolumeSource#getReference}
         * @param reference Required: Image or artifact reference to be used.
         *                  Behaves in the same way as pod.spec.containers[*].image. Pull secrets will be assembled in the same way as for the container image by looking up node credentials, SA image pull secrets, and pod spec image pull secrets. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
         * @return {@code this}
         */
        public Builder reference(java.lang.String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ImageVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ImageVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ImageVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ImageVolumeSource {
        private final java.lang.String pullPolicy;
        private final java.lang.String reference;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pullPolicy = software.amazon.jsii.Kernel.get(this, "pullPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reference = software.amazon.jsii.Kernel.get(this, "reference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pullPolicy = builder.pullPolicy;
            this.reference = builder.reference;
        }

        @Override
        public final java.lang.String getPullPolicy() {
            return this.pullPolicy;
        }

        @Override
        public final java.lang.String getReference() {
            return this.reference;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPullPolicy() != null) {
                data.set("pullPolicy", om.valueToTree(this.getPullPolicy()));
            }
            if (this.getReference() != null) {
                data.set("reference", om.valueToTree(this.getReference()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ImageVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ImageVolumeSource.Jsii$Proxy that = (ImageVolumeSource.Jsii$Proxy) o;

            if (this.pullPolicy != null ? !this.pullPolicy.equals(that.pullPolicy) : that.pullPolicy != null) return false;
            return this.reference != null ? this.reference.equals(that.reference) : that.reference == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pullPolicy != null ? this.pullPolicy.hashCode() : 0;
            result = 31 * result + (this.reference != null ? this.reference.hashCode() : 0);
            return result;
        }
    }
}
