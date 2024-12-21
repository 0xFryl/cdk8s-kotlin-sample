package com.mycompany.app

import org.cdk8s.Chart
import org.cdk8s.ChartProps
import software.constructs.Construct

class MyChart(
    scope: Construct,
    id: String,
    options: ChartProps?,
) : Chart(scope, id, options) {
    constructor(scope: Construct, id: String) : this(scope, id, null)

    init {
        // define resources here
    }
}