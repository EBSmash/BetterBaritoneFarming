package com.lambda.huds

import com.lambda.ExamplePlugin
import com.lambda.client.event.SafeClientEvent
import com.lambda.client.plugin.api.PluginLabelHud

internal object ExampleLabelHud : PluginLabelHud(
    name = "FarmingHud",
    category = Category.MISC,
    description = "Simple hud to show what the farm bot is doing",
    pluginMain = ExamplePlugin
) {

    override fun SafeClientEvent.updateText() {

    }
}