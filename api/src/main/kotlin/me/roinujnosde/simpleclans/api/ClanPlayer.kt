package me.roinujnosde.simpleclans.api

import java.util.UUID

interface ClanPlayer {

    fun getName(): String

    fun getUUID(): UUID

    fun getClan(): Clan?

}