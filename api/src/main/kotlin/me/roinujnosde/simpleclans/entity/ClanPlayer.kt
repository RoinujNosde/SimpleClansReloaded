package me.roinujnosde.simpleclans.entity

import java.util.*

interface ClanPlayer {

    fun getName(): String

    fun getUUID(): UUID

    fun getClan(): Clan?

}