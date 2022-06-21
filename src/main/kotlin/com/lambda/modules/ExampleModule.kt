package com.lambda.modules

import com.lambda.ExamplePlugin
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule
import com.lambda.client.util.combat.CombatUtils
import com.lambda.client.util.items.*
import com.lambda.client.util.threads.safeListener
import net.minecraft.enchantment.Enchantment
import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.inventory.InventoryHelper
import net.minecraft.item.ItemPickaxe
import net.minecraftforge.event.entity.player.PlayerInteractEvent
import net.minecraftforge.fml.common.gameevent.TickEvent

/**
 * This is a module. First set properties then settings then add listener.
 * **/
internal object ExampleModule : PluginModule(
    name = "Better Farming",
    category = Category.MISC,
    description = "",
    pluginMain = ExamplePlugin
) {

    init {
        safeListener<TickEvent.ClientTickEvent> {
            for(slot in mc.player.hotbarSlots) {
                if(EnchantmentHelper.getEnchantments(slot.stack).contains(Enchantment.getEnchantmentByID(35))) {
                    swapToSlot(slot.hotbarSlot)
                }
            }
        }
    }
}