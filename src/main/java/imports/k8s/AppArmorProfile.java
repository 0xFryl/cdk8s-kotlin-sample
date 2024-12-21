package imports.k8s;

/**
 * AppArmorProfile defines a pod or container's AppArmor settings.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.428Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AppArmorProfile")
@software.amazon.jsii.Jsii.Proxy(AppArmorProfile.Jsii$Proxy.class)
public interface AppArmorProfile extends software.amazon.jsii.JsiiSerializable {

    /**
     * type indicates which kind of AppArmor profile will be applied.
     * <p>
     * Valid options are:
     * Localhost - a profile pre-loaded on the node.
     * RuntimeDefault - the container runtime's default profile.
     * Unconfined - no AppArmor enforcement.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * localhostProfile indicates a profile loaded on the node that should be used.
     * <p>
     * The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is "Localhost".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocalhostProfile() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppArmorProfile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppArmorProfile}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppArmorProfile> {
        java.lang.String type;
        java.lang.String localhostProfile;

        /**
         * Sets the value of {@link AppArmorProfile#getType}
         * @param type type indicates which kind of AppArmor profile will be applied. This parameter is required.
         *             Valid options are:
         *             Localhost - a profile pre-loaded on the node.
         *             RuntimeDefault - the container runtime's default profile.
         *             Unconfined - no AppArmor enforcement.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link AppArmorProfile#getLocalhostProfile}
         * @param localhostProfile localhostProfile indicates a profile loaded on the node that should be used.
         *                         The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is "Localhost".
         * @return {@code this}
         */
        public Builder localhostProfile(java.lang.String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppArmorProfile}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppArmorProfile build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppArmorProfile}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppArmorProfile {
        private final java.lang.String type;
        private final java.lang.String localhostProfile;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localhostProfile = software.amazon.jsii.Kernel.get(this, "localhostProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.localhostProfile = builder.localhostProfile;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getLocalhostProfile() {
            return this.localhostProfile;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getLocalhostProfile() != null) {
                data.set("localhostProfile", om.valueToTree(this.getLocalhostProfile()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AppArmorProfile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppArmorProfile.Jsii$Proxy that = (AppArmorProfile.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.localhostProfile != null ? this.localhostProfile.equals(that.localhostProfile) : that.localhostProfile == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.localhostProfile != null ? this.localhostProfile.hashCode() : 0);
            return result;
        }
    }
}
