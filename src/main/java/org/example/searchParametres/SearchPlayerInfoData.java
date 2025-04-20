package org.example.searchParametres;

import java.util.List;

/**
 * Информация по которой будем искать: ID, Class?, Сколько Матчей
 */
public class SearchPlayerInfoData implements SearchCategory {
    private String steamId;
    private GameFormat gameFormat;
    private SearchPeriod searchPeriod;
    private GameHeroes gameHeroes;
    private Integer matchCount;
    private List<String> ignoreTags;
    private Boolean isServerMeSearch;

    public SearchPlayerInfoData(String steamId, GameFormat gameFormat, SearchPeriod searchPeriod, GameHeroes gameHeroes, Integer matchCount, List<String> ignoreTags, Boolean isServerMeSearch) {
        this.steamId = steamId;
        this.gameFormat = gameFormat;
        this.searchPeriod = searchPeriod;
        this.gameHeroes = gameHeroes;
        this.matchCount = matchCount;
        this.ignoreTags = ignoreTags;
        this.isServerMeSearch = isServerMeSearch;
    }

    @Override
    public boolean isClassSearch() {
        return !gameHeroes.equals(GameHeroes.ALL);
    }

    @Override
    public boolean onlyServermeUpploadsMatches() {
        return isServerMeSearch;
    }

    @Override
    public boolean haveIgnoreTags() {
        return !ignoreTags.isEmpty();
    }

    @Override
    public GameFormat getGameFormat() {
        return gameFormat;
    }

    @Override
    public SearchPeriod getSearсhPeriod() {
        return searchPeriod;
    }

    @Override
    public String getSteamID() {
        return steamId;
    }

    @Override
    public Integer getMatchCount() {
        return matchCount;
    }
}
