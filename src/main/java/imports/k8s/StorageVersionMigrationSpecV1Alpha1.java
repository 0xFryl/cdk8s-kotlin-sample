package imports.k8s;

/**
 * Spec of the storage version migration.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.743Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StorageVersionMigrationSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(StorageVersionMigrationSpecV1Alpha1.Jsii$Proxy.class)
public interface StorageVersionMigrationSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * The resource that is being migrated.
     * <p>
     * The migrator sends requests to the endpoint serving the resource. Immutable.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.GroupVersionResourceV1Alpha1 getResource();

    /**
     * The token used in the list options to get the next chunk of objects to migrate.
     * <p>
     * When the .status.conditions indicates the migration is "Running", users can use this token to check the progress of the migration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContinueToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StorageVersionMigrationSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StorageVersionMigrationSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StorageVersionMigrationSpecV1Alpha1> {
        imports.k8s.GroupVersionResourceV1Alpha1 resource;
        java.lang.String continueToken;

        /**
         * Sets the value of {@link StorageVersionMigrationSpecV1Alpha1#getResource}
         * @param resource The resource that is being migrated. This parameter is required.
         *                 The migrator sends requests to the endpoint serving the resource. Immutable.
         * @return {@code this}
         */
        public Builder resource(imports.k8s.GroupVersionResourceV1Alpha1 resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link StorageVersionMigrationSpecV1Alpha1#getContinueToken}
         * @param continueToken The token used in the list options to get the next chunk of objects to migrate.
         *                      When the .status.conditions indicates the migration is "Running", users can use this token to check the progress of the migration.
         * @return {@code this}
         */
        public Builder continueToken(java.lang.String continueToken) {
            this.continueToken = continueToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StorageVersionMigrationSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StorageVersionMigrationSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StorageVersionMigrationSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StorageVersionMigrationSpecV1Alpha1 {
        private final imports.k8s.GroupVersionResourceV1Alpha1 resource;
        private final java.lang.String continueToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.k8s.GroupVersionResourceV1Alpha1.class));
            this.continueToken = software.amazon.jsii.Kernel.get(this, "continueToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = java.util.Objects.requireNonNull(builder.resource, "resource is required");
            this.continueToken = builder.continueToken;
        }

        @Override
        public final imports.k8s.GroupVersionResourceV1Alpha1 getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getContinueToken() {
            return this.continueToken;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getContinueToken() != null) {
                data.set("continueToken", om.valueToTree(this.getContinueToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StorageVersionMigrationSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StorageVersionMigrationSpecV1Alpha1.Jsii$Proxy that = (StorageVersionMigrationSpecV1Alpha1.Jsii$Proxy) o;

            if (!resource.equals(that.resource)) return false;
            return this.continueToken != null ? this.continueToken.equals(that.continueToken) : that.continueToken == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resource.hashCode();
            result = 31 * result + (this.continueToken != null ? this.continueToken.hashCode() : 0);
            return result;
        }
    }
}
