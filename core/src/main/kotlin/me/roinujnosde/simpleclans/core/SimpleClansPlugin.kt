package me.roinujnosde.simpleclans.core

import co.aikar.commands.*
import java.util.logging.Logger

interface SimpleClansPlugin {

    fun init() {
        getLogger().info("Platform: %s".format(getPlatform()))
    }

    fun getPlatform(): String

    fun <IT, I : CommandIssuer, FT, MF : MessageFormatter<FT>, CEC : CommandExecutionContext<CEC, I>, CC : ConditionContext<I>> getCommandManager(): CommandManager<IT, I, FT, MF, CEC, CC>

    fun getLogger(): Logger

}