package imports.k8s;

/**
 * ClusterTrustBundleSpec contains the signer and trust anchors.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.451Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClusterTrustBundleSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ClusterTrustBundleSpecV1Alpha1.Jsii$Proxy.class)
public interface ClusterTrustBundleSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.
     * <p>
     * The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
     * <p>
     * Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTrustBundle();

    /**
     * signerName indicates the associated signer, if any.
     * <p>
     * In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=<the signer name> verb=attest.
     * <p>
     * If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name <code>example.com/foo</code>, valid ClusterTrustBundle object names include <code>example.com:foo:abc</code> and <code>example.com:foo:v1</code>.
     * <p>
     * If signerName is empty, then the ClusterTrustBundle object's name must not have such a prefix.
     * <p>
     * List/watch requests for ClusterTrustBundles can filter on this field using a <code>spec.signerName=NAME</code> field selector.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSignerName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterTrustBundleSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterTrustBundleSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterTrustBundleSpecV1Alpha1> {
        java.lang.String trustBundle;
        java.lang.String signerName;

        /**
         * Sets the value of {@link ClusterTrustBundleSpecV1Alpha1#getTrustBundle}
         * @param trustBundle trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates. This parameter is required.
         *                    The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
         *                    <p>
         *                    Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
         * @return {@code this}
         */
        public Builder trustBundle(java.lang.String trustBundle) {
            this.trustBundle = trustBundle;
            return this;
        }

        /**
         * Sets the value of {@link ClusterTrustBundleSpecV1Alpha1#getSignerName}
         * @param signerName signerName indicates the associated signer, if any.
         *                   In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=<the signer name> verb=attest.
         *                   <p>
         *                   If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name <code>example.com/foo</code>, valid ClusterTrustBundle object names include <code>example.com:foo:abc</code> and <code>example.com:foo:v1</code>.
         *                   <p>
         *                   If signerName is empty, then the ClusterTrustBundle object's name must not have such a prefix.
         *                   <p>
         *                   List/watch requests for ClusterTrustBundles can filter on this field using a <code>spec.signerName=NAME</code> field selector.
         * @return {@code this}
         */
        public Builder signerName(java.lang.String signerName) {
            this.signerName = signerName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterTrustBundleSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterTrustBundleSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterTrustBundleSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterTrustBundleSpecV1Alpha1 {
        private final java.lang.String trustBundle;
        private final java.lang.String signerName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.trustBundle = software.amazon.jsii.Kernel.get(this, "trustBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signerName = software.amazon.jsii.Kernel.get(this, "signerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.trustBundle = java.util.Objects.requireNonNull(builder.trustBundle, "trustBundle is required");
            this.signerName = builder.signerName;
        }

        @Override
        public final java.lang.String getTrustBundle() {
            return this.trustBundle;
        }

        @Override
        public final java.lang.String getSignerName() {
            return this.signerName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("trustBundle", om.valueToTree(this.getTrustBundle()));
            if (this.getSignerName() != null) {
                data.set("signerName", om.valueToTree(this.getSignerName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterTrustBundleSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterTrustBundleSpecV1Alpha1.Jsii$Proxy that = (ClusterTrustBundleSpecV1Alpha1.Jsii$Proxy) o;

            if (!trustBundle.equals(that.trustBundle)) return false;
            return this.signerName != null ? this.signerName.equals(that.signerName) : that.signerName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.trustBundle.hashCode();
            result = 31 * result + (this.signerName != null ? this.signerName.hashCode() : 0);
            return result;
        }
    }
}
