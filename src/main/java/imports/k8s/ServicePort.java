package imports.k8s;

/**
 * ServicePort contains information on service's port.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.106.0 (build e852934)", date = "2024-12-21T15:07:35.188Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServicePort")
@software.amazon.jsii.Jsii.Proxy(ServicePort.Jsii$Proxy.class)
public interface ServicePort extends software.amazon.jsii.JsiiSerializable {

    /**
     * The port that will be exposed by this service.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    /**
     * The application protocol for this port.
     * <p>
     * This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAppProtocol() {
        return null;
    }

    /**
     * The name of this port within the service.
     * <p>
     * This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.
     * <p>
     * Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNodePort() {
        return null;
    }

    /**
     * The IP protocol for this port.
     * <p>
     * Supports "TCP", "UDP", and "SCTP". Default is TCP.
     * <p>
     * Default: TCP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * Number or name of the port to access on the pods targeted by the service.
     * <p>
     * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getTargetPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServicePort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServicePort}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServicePort> {
        java.lang.Number port;
        java.lang.String appProtocol;
        java.lang.String name;
        java.lang.Number nodePort;
        java.lang.String protocol;
        imports.k8s.IntOrString targetPort;

        /**
         * Sets the value of {@link ServicePort#getPort}
         * @param port The port that will be exposed by this service. This parameter is required.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link ServicePort#getAppProtocol}
         * @param appProtocol The application protocol for this port.
         *                    This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
         * @return {@code this}
         */
        public Builder appProtocol(java.lang.String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        /**
         * Sets the value of {@link ServicePort#getName}
         * @param name The name of this port within the service.
         *             This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ServicePort#getNodePort}
         * @param nodePort The port on each node on which this service is exposed when type is NodePort or LoadBalancer.
         *                 Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
         * @return {@code this}
         */
        public Builder nodePort(java.lang.Number nodePort) {
            this.nodePort = nodePort;
            return this;
        }

        /**
         * Sets the value of {@link ServicePort#getProtocol}
         * @param protocol The IP protocol for this port.
         *                 Supports "TCP", "UDP", and "SCTP". Default is TCP.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link ServicePort#getTargetPort}
         * @param targetPort Number or name of the port to access on the pods targeted by the service.
         *                   Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
         * @return {@code this}
         */
        public Builder targetPort(imports.k8s.IntOrString targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServicePort}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServicePort build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServicePort}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServicePort {
        private final java.lang.Number port;
        private final java.lang.String appProtocol;
        private final java.lang.String name;
        private final java.lang.Number nodePort;
        private final java.lang.String protocol;
        private final imports.k8s.IntOrString targetPort;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.appProtocol = software.amazon.jsii.Kernel.get(this, "appProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodePort = software.amazon.jsii.Kernel.get(this, "nodePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetPort = software.amazon.jsii.Kernel.get(this, "targetPort", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(builder.port, "port is required");
            this.appProtocol = builder.appProtocol;
            this.name = builder.name;
            this.nodePort = builder.nodePort;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getAppProtocol() {
            return this.appProtocol;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getNodePort() {
            return this.nodePort;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final imports.k8s.IntOrString getTargetPort() {
            return this.targetPort;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getAppProtocol() != null) {
                data.set("appProtocol", om.valueToTree(this.getAppProtocol()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNodePort() != null) {
                data.set("nodePort", om.valueToTree(this.getNodePort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getTargetPort() != null) {
                data.set("targetPort", om.valueToTree(this.getTargetPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServicePort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServicePort.Jsii$Proxy that = (ServicePort.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            if (this.appProtocol != null ? !this.appProtocol.equals(that.appProtocol) : that.appProtocol != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.nodePort != null ? !this.nodePort.equals(that.nodePort) : that.nodePort != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            return this.targetPort != null ? this.targetPort.equals(that.targetPort) : that.targetPort == null;
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.appProtocol != null ? this.appProtocol.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.nodePort != null ? this.nodePort.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.targetPort != null ? this.targetPort.hashCode() : 0);
            return result;
        }
    }
}
