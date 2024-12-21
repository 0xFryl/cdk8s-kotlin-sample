package imports.k8s;

/**
 * ExemptPriorityLevelConfiguration describes the configurable aspects of the handling of exempt requests.
 * <p>
 * In the mandatory exempt configuration object the values in the fields here can be modified by authorized users, unlike the rest of the <code>spec</code>.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.504Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ExemptPriorityLevelConfigurationV1Beta3")
@software.amazon.jsii.Jsii.Proxy(ExemptPriorityLevelConfigurationV1Beta3.Jsii$Proxy.class)
public interface ExemptPriorityLevelConfigurationV1Beta3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>lendablePercent</code> prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels.
     * <p>
     * This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.
     * <p>
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLendablePercent() {
        return null;
    }

    /**
     * <code>nominalConcurrencyShares</code> (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level.
     * <p>
     * This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server's concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
     * <p>
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
     * <p>
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNominalConcurrencyShares() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ExemptPriorityLevelConfigurationV1Beta3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ExemptPriorityLevelConfigurationV1Beta3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ExemptPriorityLevelConfigurationV1Beta3> {
        java.lang.Number lendablePercent;
        java.lang.Number nominalConcurrencyShares;

        /**
         * Sets the value of {@link ExemptPriorityLevelConfigurationV1Beta3#getLendablePercent}
         * @param lendablePercent <code>lendablePercent</code> prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels.
         *                        This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.
         *                        <p>
         *                        LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
         * @return {@code this}
         */
        public Builder lendablePercent(java.lang.Number lendablePercent) {
            this.lendablePercent = lendablePercent;
            return this;
        }

        /**
         * Sets the value of {@link ExemptPriorityLevelConfigurationV1Beta3#getNominalConcurrencyShares}
         * @param nominalConcurrencyShares <code>nominalConcurrencyShares</code> (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level.
         *                                 This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server's concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
         *                                 <p>
         *                                 NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
         *                                 <p>
         *                                 Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
         * @return {@code this}
         */
        public Builder nominalConcurrencyShares(java.lang.Number nominalConcurrencyShares) {
            this.nominalConcurrencyShares = nominalConcurrencyShares;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ExemptPriorityLevelConfigurationV1Beta3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ExemptPriorityLevelConfigurationV1Beta3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ExemptPriorityLevelConfigurationV1Beta3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ExemptPriorityLevelConfigurationV1Beta3 {
        private final java.lang.Number lendablePercent;
        private final java.lang.Number nominalConcurrencyShares;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.lendablePercent = software.amazon.jsii.Kernel.get(this, "lendablePercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.nominalConcurrencyShares = software.amazon.jsii.Kernel.get(this, "nominalConcurrencyShares", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.lendablePercent = builder.lendablePercent;
            this.nominalConcurrencyShares = builder.nominalConcurrencyShares;
        }

        @Override
        public final java.lang.Number getLendablePercent() {
            return this.lendablePercent;
        }

        @Override
        public final java.lang.Number getNominalConcurrencyShares() {
            return this.nominalConcurrencyShares;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLendablePercent() != null) {
                data.set("lendablePercent", om.valueToTree(this.getLendablePercent()));
            }
            if (this.getNominalConcurrencyShares() != null) {
                data.set("nominalConcurrencyShares", om.valueToTree(this.getNominalConcurrencyShares()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ExemptPriorityLevelConfigurationV1Beta3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ExemptPriorityLevelConfigurationV1Beta3.Jsii$Proxy that = (ExemptPriorityLevelConfigurationV1Beta3.Jsii$Proxy) o;

            if (this.lendablePercent != null ? !this.lendablePercent.equals(that.lendablePercent) : that.lendablePercent != null) return false;
            return this.nominalConcurrencyShares != null ? this.nominalConcurrencyShares.equals(that.nominalConcurrencyShares) : that.nominalConcurrencyShares == null;
        }

        @Override
        public final int hashCode() {
            int result = this.lendablePercent != null ? this.lendablePercent.hashCode() : 0;
            result = 31 * result + (this.nominalConcurrencyShares != null ? this.nominalConcurrencyShares.hashCode() : 0);
            return result;
        }
    }
}
