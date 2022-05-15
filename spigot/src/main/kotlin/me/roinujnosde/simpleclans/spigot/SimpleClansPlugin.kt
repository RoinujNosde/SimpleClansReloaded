package me.roinujnosde.simpleclans.spigot

import co.aikar.commands.*
import me.roinujnosde.simpleclans.SimpleClans
import org.bukkit.plugin.java.JavaPlugin

class SimpleClansPlugin : SimpleClans, JavaPlugin() {

    override fun getPlatform(): String {
        return "Spigot"
    }

    override fun <IT, I : CommandIssuer, FT, MF : MessageFormatter<FT>, CEC : CommandExecutionContext<CEC, I>, CC : ConditionContext<I>> getCommandManager(): CommandManager<IT, I, FT, MF, CEC, CC> {
        TODO("Not yet implemented")
    }

    override fun onEnable() {
        super<SimpleClans>.init()
    }

}