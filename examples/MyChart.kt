package com.mycompany.app

import imports.k8s.Container
import imports.k8s.ContainerPort
import imports.k8s.DeploymentSpec
import imports.k8s.KubeDeployment
import imports.k8s.KubeDeploymentProps
import imports.k8s.LabelSelector
import imports.k8s.ObjectMeta
import imports.k8s.PodSpec
import imports.k8s.PodTemplateSpec
import org.cdk8s.Chart
import org.cdk8s.ChartProps
import software.constructs.Construct

class MyChart(
    scope: Construct,
    id: String,
    props: ChartProps?,
    appLabel: String,
) : Chart(scope, id, props) {
    constructor(scope: Construct, id: String, appLabel: String) : this(scope, id, null, appLabel)

    init {
        val label: Map<String, String> = mapOf("app" to appLabel)

        KubeDeployment(this, "my-deployment", KubeDeploymentProps.builder()
                .spec(DeploymentSpec.builder()
                        .replicas(3)
                        .selector(LabelSelector.builder()
                                .matchLabels(label)
                                .build())
                        .template(PodTemplateSpec.builder()
                                .metadata(ObjectMeta.builder().labels(label)
                                        .build())
                                .spec(PodSpec.builder()
                                        .containers(listOf(Container.builder()
                                                .name("app-container-test")
                                                .image("nginx:1.19.10")
                                                .ports(listOf(ContainerPort.builder()
                                                        .containerPort(80)
                                                        .build()))
                                                .build()))
                                        .build())
                                .build())
                        .build())
                .build())
    }
}