package me.roinujnosde.simpleclans

import co.aikar.commands.*
import java.util.logging.Logger

interface SimpleClansPlugin {

    fun init() {
        getLogger().info("Platform: %s".format(getPlatform()))
    }

    fun getPlatform(): String

    fun getCommandManager(): CommandManager<*, *, *, *, *, *>

    fun getLogger(): Logger

}