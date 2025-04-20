package org.example.searchParametres;

/**
 * Информация по которой будем искать: ID, Class?, Сколько Матчей
 */
public class SearchPlayerInfoData implements SearchCategory, SearchInfo {
    @Override
    public boolean isClassSearch() {
        return false;
    }

    @Override
    public boolean onlyServermeUpploadsMatches() {
        return false;
    }

    @Override
    public boolean haveIgnoreTags() {
        return false;
    }

    @Override
    public String getSteamID() {
        return null;
    }

    @Override
    public Integer getMatchCount() {
        return 0;
    }
}
