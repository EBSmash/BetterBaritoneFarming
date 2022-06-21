package com.lambda

import com.lambda.client.LambdaMod
import com.lambda.client.plugin.api.Plugin
import com.lambda.client.util.threads.BackgroundJob
import com.lambda.huds.ExampleLabelHud
import com.lambda.modules.ExampleModule

internal object ExamplePlugin : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(ExampleModule)
        hudElements.add(ExampleLabelHud)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}