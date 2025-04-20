package org.example;

import org.example.searchParametres.GameHeroes;

/**
 * Информация которую мы хотим получить по итогу: K/D/A, Class?, Win/Lose
 */
public class PlayerStatData implements SearchInfo{
    @Override
    public String getPlayerId() {
        return "";
    }

    @Override
    public String getMap() {
        return "";
    }

    @Override
    public Boolean playerWin() {
        return null;
    }

    @Override
    public GameHeroes getHero() {
        return null;
    }

    @Override
    public Integer getKills() {
        return 0;
    }

    @Override
    public Integer getAssists() {
        return 0;
    }

    @Override
    public Integer getDeaths() {
        return 0;
    }
}
