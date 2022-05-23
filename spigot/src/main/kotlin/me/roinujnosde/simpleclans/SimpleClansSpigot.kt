package me.roinujnosde.simpleclans

import co.aikar.commands.CommandManager
import co.aikar.commands.PaperCommandManager
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.annotation.plugin.Plugin

@Plugin(name = "SimpleClansReloaded", version = "@version@") //TODO Replace version
class SimpleClansSpigot : SimpleClansPlugin, JavaPlugin() {

    private lateinit var commandManager: CommandManager<*, *, *, *, *, *>

    override fun getPlatform(): String {
        return "Spigot"
    }

    override fun getCommandManager(): CommandManager<*, *, *, *, *, *> {
        return commandManager
    }

    override fun onEnable() {
        commandManager = PaperCommandManager(this)
        super<SimpleClansPlugin>.init()
    }

}