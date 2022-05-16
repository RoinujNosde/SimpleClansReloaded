package me.roinujnosde.simpleclans.api

import java.util.*

interface SimpleClansAPI {

    fun getClans(): Collection<Clan>

    fun getClan(tag: String): Clan? {
        for (clan in getClans()) {
            if (clan.getTag() == tag) {
                return clan
            }
        }
        return null
    }

    fun getClanPlayers(): Collection<ClanPlayer>

    fun getClanPlayer(uuid: UUID): ClanPlayer? {
        for (clanPlayer in getClanPlayers()) {
            if (clanPlayer.getUUID() == uuid) {
                return clanPlayer
            }
        }
        return null
    }

    fun getClanPlayer(name: String): ClanPlayer? {
        for (clanPlayer in getClanPlayers()) {
            if (clanPlayer.getName() == name) {
                return clanPlayer
            }
        }
        return null
    }
}