package me.roinujnosde.simpleclans.entity

import java.math.BigDecimal

interface Clan {

    fun getName(): String

    fun getTag(): String

    fun getDescription(): String

    fun getMembers(): Collection<ClanPlayer>

    fun getBalance(): BigDecimal

}