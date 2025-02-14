package imports.k8s;

/**
 * QueuingConfiguration holds the configuration parameters for queuing.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.719Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.QueuingConfiguration")
@software.amazon.jsii.Jsii.Proxy(QueuingConfiguration.Jsii$Proxy.class)
public interface QueuingConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * <code>handSize</code> is a small positive number that configures the shuffle sharding of requests into queues.
     * <p>
     * When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. <code>handSize</code> must be no larger than <code>queues</code>, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHandSize() {
        return null;
    }

    /**
     * <code>queueLengthLimit</code> is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time;
     * <p>
     * excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getQueueLengthLimit() {
        return null;
    }

    /**
     * <code>queues</code> is the number of queues for this priority level.
     * <p>
     * The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getQueues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link QueuingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QueuingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QueuingConfiguration> {
        java.lang.Number handSize;
        java.lang.Number queueLengthLimit;
        java.lang.Number queues;

        /**
         * Sets the value of {@link QueuingConfiguration#getHandSize}
         * @param handSize <code>handSize</code> is a small positive number that configures the shuffle sharding of requests into queues.
         *                 When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. <code>handSize</code> must be no larger than <code>queues</code>, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
         * @return {@code this}
         */
        public Builder handSize(java.lang.Number handSize) {
            this.handSize = handSize;
            return this;
        }

        /**
         * Sets the value of {@link QueuingConfiguration#getQueueLengthLimit}
         * @param queueLengthLimit <code>queueLengthLimit</code> is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time;.
         *                         excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
         * @return {@code this}
         */
        public Builder queueLengthLimit(java.lang.Number queueLengthLimit) {
            this.queueLengthLimit = queueLengthLimit;
            return this;
        }

        /**
         * Sets the value of {@link QueuingConfiguration#getQueues}
         * @param queues <code>queues</code> is the number of queues for this priority level.
         *               The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
         * @return {@code this}
         */
        public Builder queues(java.lang.Number queues) {
            this.queues = queues;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QueuingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QueuingConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link QueuingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QueuingConfiguration {
        private final java.lang.Number handSize;
        private final java.lang.Number queueLengthLimit;
        private final java.lang.Number queues;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.handSize = software.amazon.jsii.Kernel.get(this, "handSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.queueLengthLimit = software.amazon.jsii.Kernel.get(this, "queueLengthLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.queues = software.amazon.jsii.Kernel.get(this, "queues", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.handSize = builder.handSize;
            this.queueLengthLimit = builder.queueLengthLimit;
            this.queues = builder.queues;
        }

        @Override
        public final java.lang.Number getHandSize() {
            return this.handSize;
        }

        @Override
        public final java.lang.Number getQueueLengthLimit() {
            return this.queueLengthLimit;
        }

        @Override
        public final java.lang.Number getQueues() {
            return this.queues;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHandSize() != null) {
                data.set("handSize", om.valueToTree(this.getHandSize()));
            }
            if (this.getQueueLengthLimit() != null) {
                data.set("queueLengthLimit", om.valueToTree(this.getQueueLengthLimit()));
            }
            if (this.getQueues() != null) {
                data.set("queues", om.valueToTree(this.getQueues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.QueuingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QueuingConfiguration.Jsii$Proxy that = (QueuingConfiguration.Jsii$Proxy) o;

            if (this.handSize != null ? !this.handSize.equals(that.handSize) : that.handSize != null) return false;
            if (this.queueLengthLimit != null ? !this.queueLengthLimit.equals(that.queueLengthLimit) : that.queueLengthLimit != null) return false;
            return this.queues != null ? this.queues.equals(that.queues) : that.queues == null;
        }

        @Override
        public final int hashCode() {
            int result = this.handSize != null ? this.handSize.hashCode() : 0;
            result = 31 * result + (this.queueLengthLimit != null ? this.queueLengthLimit.hashCode() : 0);
            result = 31 * result + (this.queues != null ? this.queues.hashCode() : 0);
            return result;
        }
    }
}
