package org.example;

import org.example.searchParametres.GameFormat;
import org.example.searchParametres.GameHeroes;
import org.example.searchParametres.SearchPeriod;
import org.example.searchParametres.SearchPlayerInfoData;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerStatisticTest {
    PlayerStatistic playerStatistic;
    SearchPlayerInfoData sixesFilter;
    SearchPlayerInfoData hlFilter;
    @Before
    public void setup(){
        playerStatistic = new PlayerStatistic();
        sixesFilter =
                new SearchPlayerInfoData(
                        "76561197987681768",
                        GameFormat.SIXES,
                        SearchPeriod.MATCH_COUNT,
                        GameHeroes.ALL,
                        5,
                        null,
                        false
                );
        hlFilter =
                new SearchPlayerInfoData(
                        "76561197987681768",
                        GameFormat.HIGHLANDER,
                        SearchPeriod.MATCH_COUNT,
                        GameHeroes.ALL,
                        1,
                        null,
                        false
                );
    }

    @Test
    public void resposnseSizeTest() {
        List<PlayerStatData> result = playerStatistic.getPlayerStats(sixesFilter);
        assertEquals(result.size(), 5);
    }

    @Test
    public void gameformatFilterSixesTest() {
        List<PlayerStatData> result = playerStatistic.getPlayerStats(sixesFilter);
        assertEquals(result.get(0).getKills(), 16);
        assertEquals(result.get(4).getKills(), 24);
    }

    @Test
    public void gameformatFilterHLTest(){
        List<PlayerStatData> result = playerStatistic.getPlayerStats(hlFilter);
        assertEquals(result.get(0).getKills(), 21);
    }
}