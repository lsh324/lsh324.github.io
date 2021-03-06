package com.gnt.service.search;

import com.gnt.domain.match.Info;
import com.gnt.domain.match.InfoRepository;
import com.gnt.domain.summoner.Summoner;
import com.gnt.domain.summoner.SummonerRepository;
import com.gnt.service.riot.RiotApiHandler;
import com.gnt.domain.match.Match;
import com.gnt.web.dto.match.MatchDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MatchService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final RiotApiHandler riotApiHandler;
    private final SummonerRepository summonerRepository;
    private final InfoRepository infoRepository;

    public List<MatchDto> getMatchListByName(String summonerName) {
        return null;
    }

    public Info getLastInfoByName(String summonerName) {
        Summoner summoner = summonerRepository.findByName(summonerName);
        String lastMatchId = infoRepository.findLastMatchIdByPuuid(summoner.getPuuid());
        return null;
    }

    public List<Match> getMatchListByName(String summonerName, int start, int count) {
        ArrayList<Match> matchList = new ArrayList<>();
        Summoner summoner = riotApiHandler.getSummonerByName(summonerName);
        List<String> idList = riotApiHandler.getMatchIdListByPuuid(summoner.getPuuid(), start, count);
        for (String id : idList)
            matchList.add(riotApiHandler.getMatchByMatchId(id));
        return matchList;
    }
}
