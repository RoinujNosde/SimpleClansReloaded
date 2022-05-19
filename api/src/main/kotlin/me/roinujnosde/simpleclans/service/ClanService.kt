package me.roinujnosde.simpleclans.service

import me.roinujnosde.simpleclans.entity.Clan
import me.roinujnosde.simpleclans.entity.ClanPlayer
import java.util.*

interface ClanService {

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