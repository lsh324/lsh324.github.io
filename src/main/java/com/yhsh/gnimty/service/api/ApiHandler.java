package com.yhsh.gnimty.service.api;

import com.yhsh.gnimty.dto.League;
import com.yhsh.gnimty.dto.Match;
import com.yhsh.gnimty.dto.Summoner;

import java.util.List;

public interface ApiHandler {
    String krUri = "https://kr.api.riotgames.com";
    String asiaUri = "https://asia.api.riotgames.com";
    String apiKey = "RGAPI-739cdda4-63ee-42e0-8c5c-b83bdd96f335";

    Summoner getSummonerByName(String summonerName);
    List<League> getLeagueListBySummonerId(String id);
    List<String> getMatchIdListByPuuid(String puuid);
    Match getMatchByMatchId(String matchId);
}
