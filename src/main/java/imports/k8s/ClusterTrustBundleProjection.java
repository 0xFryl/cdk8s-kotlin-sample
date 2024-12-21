package imports.k8s;

/**
 * ClusterTrustBundleProjection describes how to select a set of ClusterTrustBundle objects and project their contents into the pod filesystem.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.450Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClusterTrustBundleProjection")
@software.amazon.jsii.Jsii.Proxy(ClusterTrustBundleProjection.Jsii$Proxy.class)
public interface ClusterTrustBundleProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * Relative path from the volume root to write the bundle.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Select all ClusterTrustBundles that match this label selector.
     * <p>
     * Only has effect if signerName is set.  Mutually-exclusive with name.  If unset, interpreted as "match nothing".  If set but empty, interpreted as "match everything".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getLabelSelector() {
        return null;
    }

    /**
     * Select a single ClusterTrustBundle by object name.
     * <p>
     * Mutually-exclusive with signerName and labelSelector.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * If true, don't block pod startup if the referenced ClusterTrustBundle(s) aren't available.
     * <p>
     * If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOptional() {
        return null;
    }

    /**
     * Select all ClusterTrustBundles that match this signer name.
     * <p>
     * Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSignerName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterTrustBundleProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterTrustBundleProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterTrustBundleProjection> {
        java.lang.String path;
        imports.k8s.LabelSelector labelSelector;
        java.lang.String name;
        java.lang.Boolean optional;
        java.lang.String signerName;

        /**
         * Sets the value of {@link ClusterTrustBundleProjection#getPath}
         * @param path Relative path from the volume root to write the bundle. This parameter is required.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link ClusterTrustBundleProjection#getLabelSelector}
         * @param labelSelector Select all ClusterTrustBundles that match this label selector.
         *                      Only has effect if signerName is set.  Mutually-exclusive with name.  If unset, interpreted as "match nothing".  If set but empty, interpreted as "match everything".
         * @return {@code this}
         */
        public Builder labelSelector(imports.k8s.LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link ClusterTrustBundleProjection#getName}
         * @param name Select a single ClusterTrustBundle by object name.
         *             Mutually-exclusive with signerName and labelSelector.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ClusterTrustBundleProjection#getOptional}
         * @param optional If true, don't block pod startup if the referenced ClusterTrustBundle(s) aren't available.
         *                 If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Sets the value of {@link ClusterTrustBundleProjection#getSignerName}
         * @param signerName Select all ClusterTrustBundles that match this signer name.
         *                   Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.
         * @return {@code this}
         */
        public Builder signerName(java.lang.String signerName) {
            this.signerName = signerName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterTrustBundleProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterTrustBundleProjection build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterTrustBundleProjection}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterTrustBundleProjection {
        private final java.lang.String path;
        private final imports.k8s.LabelSelector labelSelector;
        private final java.lang.String name;
        private final java.lang.Boolean optional;
        private final java.lang.String signerName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.signerName = software.amazon.jsii.Kernel.get(this, "signerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.labelSelector = builder.labelSelector;
            this.name = builder.name;
            this.optional = builder.optional;
            this.signerName = builder.signerName;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final imports.k8s.LabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getOptional() {
            return this.optional;
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

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }
            if (this.getSignerName() != null) {
                data.set("signerName", om.valueToTree(this.getSignerName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterTrustBundleProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterTrustBundleProjection.Jsii$Proxy that = (ClusterTrustBundleProjection.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.optional != null ? !this.optional.equals(that.optional) : that.optional != null) return false;
            return this.signerName != null ? this.signerName.equals(that.signerName) : that.signerName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            result = 31 * result + (this.signerName != null ? this.signerName.hashCode() : 0);
            return result;
        }
    }
}
