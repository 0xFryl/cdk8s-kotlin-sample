package com.mycompany.app

import org.cdk8s.App

fun main(args: Array<String>) {
    val app = App()
    MyChart(app, "my-app")
    app.synth()
}