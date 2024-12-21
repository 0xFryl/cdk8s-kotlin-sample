package imports.k8s;

/**
 * LeaseCandidateSpec is a specification of a Lease.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T20:14:29.673Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LeaseCandidateSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(LeaseCandidateSpecV1Alpha1.Jsii$Proxy.class)
public interface LeaseCandidateSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * LeaseName is the name of the lease for which this candidate is contending.
     * <p>
     * This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLeaseName();

    /**
     * PreferredStrategies indicates the list of strategies for picking the leader for coordinated leader election.
     * <p>
     * The list is ordered, and the first strategy supersedes all other strategies. The list is used by coordinated leader election to make a decision about the final election strategy. This follows as - If all clients have strategy X as the first element in this list, strategy X will be used. - If a candidate has strategy [X] and another candidate has strategy [Y, X], Y supersedes X and strategy Y
     * will be used.
     * <p>
     * <ul>
     * <li>If a candidate has strategy [X, Y] and another candidate has strategy [Y, X], this is a user error and leader
     * election will not operate the Lease until resolved.
     * (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPreferredStrategies();

    /**
     * BinaryVersion is the binary version.
     * <p>
     * It must be in a semver format without leading <code>v</code>. This field is required when strategy is "OldestEmulationVersion"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBinaryVersion() {
        return null;
    }

    /**
     * EmulationVersion is the emulation version.
     * <p>
     * It must be in a semver format without leading <code>v</code>. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is "OldestEmulationVersion"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEmulationVersion() {
        return null;
    }

    /**
     * PingTime is the last time that the server has requested the LeaseCandidate to renew.
     * <p>
     * It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getPingTime() {
        return null;
    }

    /**
     * RenewTime is the time that the LeaseCandidate was last updated.
     * <p>
     * Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getRenewTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LeaseCandidateSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LeaseCandidateSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LeaseCandidateSpecV1Alpha1> {
        java.lang.String leaseName;
        java.util.List<java.lang.String> preferredStrategies;
        java.lang.String binaryVersion;
        java.lang.String emulationVersion;
        java.time.Instant pingTime;
        java.time.Instant renewTime;

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getLeaseName}
         * @param leaseName LeaseName is the name of the lease for which this candidate is contending. This parameter is required.
         *                  This field is immutable.
         * @return {@code this}
         */
        public Builder leaseName(java.lang.String leaseName) {
            this.leaseName = leaseName;
            return this;
        }

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getPreferredStrategies}
         * @param preferredStrategies PreferredStrategies indicates the list of strategies for picking the leader for coordinated leader election. This parameter is required.
         *                            The list is ordered, and the first strategy supersedes all other strategies. The list is used by coordinated leader election to make a decision about the final election strategy. This follows as - If all clients have strategy X as the first element in this list, strategy X will be used. - If a candidate has strategy [X] and another candidate has strategy [Y, X], Y supersedes X and strategy Y
         *                            will be used.
         *                            <p>
         *                            <ul>
         *                            <li>If a candidate has strategy [X, Y] and another candidate has strategy [Y, X], this is a user error and leader
         *                            election will not operate the Lease until resolved.
         *                            (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.</li>
         *                            </ul>
         * @return {@code this}
         */
        public Builder preferredStrategies(java.util.List<java.lang.String> preferredStrategies) {
            this.preferredStrategies = preferredStrategies;
            return this;
        }

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getBinaryVersion}
         * @param binaryVersion BinaryVersion is the binary version.
         *                      It must be in a semver format without leading <code>v</code>. This field is required when strategy is "OldestEmulationVersion"
         * @return {@code this}
         */
        public Builder binaryVersion(java.lang.String binaryVersion) {
            this.binaryVersion = binaryVersion;
            return this;
        }

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getEmulationVersion}
         * @param emulationVersion EmulationVersion is the emulation version.
         *                         It must be in a semver format without leading <code>v</code>. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is "OldestEmulationVersion"
         * @return {@code this}
         */
        public Builder emulationVersion(java.lang.String emulationVersion) {
            this.emulationVersion = emulationVersion;
            return this;
        }

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getPingTime}
         * @param pingTime PingTime is the last time that the server has requested the LeaseCandidate to renew.
         *                 It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime.
         * @return {@code this}
         */
        public Builder pingTime(java.time.Instant pingTime) {
            this.pingTime = pingTime;
            return this;
        }

        /**
         * Sets the value of {@link LeaseCandidateSpecV1Alpha1#getRenewTime}
         * @param renewTime RenewTime is the time that the LeaseCandidate was last updated.
         *                  Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates.
         * @return {@code this}
         */
        public Builder renewTime(java.time.Instant renewTime) {
            this.renewTime = renewTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LeaseCandidateSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LeaseCandidateSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LeaseCandidateSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LeaseCandidateSpecV1Alpha1 {
        private final java.lang.String leaseName;
        private final java.util.List<java.lang.String> preferredStrategies;
        private final java.lang.String binaryVersion;
        private final java.lang.String emulationVersion;
        private final java.time.Instant pingTime;
        private final java.time.Instant renewTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.leaseName = software.amazon.jsii.Kernel.get(this, "leaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preferredStrategies = software.amazon.jsii.Kernel.get(this, "preferredStrategies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.binaryVersion = software.amazon.jsii.Kernel.get(this, "binaryVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emulationVersion = software.amazon.jsii.Kernel.get(this, "emulationVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pingTime = software.amazon.jsii.Kernel.get(this, "pingTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.renewTime = software.amazon.jsii.Kernel.get(this, "renewTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.leaseName = java.util.Objects.requireNonNull(builder.leaseName, "leaseName is required");
            this.preferredStrategies = java.util.Objects.requireNonNull(builder.preferredStrategies, "preferredStrategies is required");
            this.binaryVersion = builder.binaryVersion;
            this.emulationVersion = builder.emulationVersion;
            this.pingTime = builder.pingTime;
            this.renewTime = builder.renewTime;
        }

        @Override
        public final java.lang.String getLeaseName() {
            return this.leaseName;
        }

        @Override
        public final java.util.List<java.lang.String> getPreferredStrategies() {
            return this.preferredStrategies;
        }

        @Override
        public final java.lang.String getBinaryVersion() {
            return this.binaryVersion;
        }

        @Override
        public final java.lang.String getEmulationVersion() {
            return this.emulationVersion;
        }

        @Override
        public final java.time.Instant getPingTime() {
            return this.pingTime;
        }

        @Override
        public final java.time.Instant getRenewTime() {
            return this.renewTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("leaseName", om.valueToTree(this.getLeaseName()));
            data.set("preferredStrategies", om.valueToTree(this.getPreferredStrategies()));
            if (this.getBinaryVersion() != null) {
                data.set("binaryVersion", om.valueToTree(this.getBinaryVersion()));
            }
            if (this.getEmulationVersion() != null) {
                data.set("emulationVersion", om.valueToTree(this.getEmulationVersion()));
            }
            if (this.getPingTime() != null) {
                data.set("pingTime", om.valueToTree(this.getPingTime()));
            }
            if (this.getRenewTime() != null) {
                data.set("renewTime", om.valueToTree(this.getRenewTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LeaseCandidateSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LeaseCandidateSpecV1Alpha1.Jsii$Proxy that = (LeaseCandidateSpecV1Alpha1.Jsii$Proxy) o;

            if (!leaseName.equals(that.leaseName)) return false;
            if (!preferredStrategies.equals(that.preferredStrategies)) return false;
            if (this.binaryVersion != null ? !this.binaryVersion.equals(that.binaryVersion) : that.binaryVersion != null) return false;
            if (this.emulationVersion != null ? !this.emulationVersion.equals(that.emulationVersion) : that.emulationVersion != null) return false;
            if (this.pingTime != null ? !this.pingTime.equals(that.pingTime) : that.pingTime != null) return false;
            return this.renewTime != null ? this.renewTime.equals(that.renewTime) : that.renewTime == null;
        }

        @Override
        public final int hashCode() {
            int result = this.leaseName.hashCode();
            result = 31 * result + (this.preferredStrategies.hashCode());
            result = 31 * result + (this.binaryVersion != null ? this.binaryVersion.hashCode() : 0);
            result = 31 * result + (this.emulationVersion != null ? this.emulationVersion.hashCode() : 0);
            result = 31 * result + (this.pingTime != null ? this.pingTime.hashCode() : 0);
            result = 31 * result + (this.renewTime != null ? this.renewTime.hashCode() : 0);
            return result;
        }
    }
}
