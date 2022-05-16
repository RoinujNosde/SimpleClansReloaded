package me.roinujnosde.simpleclans.spigot

import co.aikar.commands.*
import me.roinujnosde.simpleclans.core.SimpleClansPlugin
import org.bukkit.plugin.java.JavaPlugin

class SimpleClansSpigot : SimpleClansPlugin, JavaPlugin() {

    override fun getPlatform(): String {
        return "Spigot"
    }

    override fun <IT, I : CommandIssuer, FT, MF : MessageFormatter<FT>, CEC : CommandExecutionContext<CEC, I>, CC : ConditionContext<I>> getCommandManager(): CommandManager<IT, I, FT, MF, CEC, CC> {
        TODO("Not yet implemented")
    }

    override fun onEnable() {
        super<SimpleClansPlugin>.init()
    }

}