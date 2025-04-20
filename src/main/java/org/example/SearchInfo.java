package org.example;

import org.example.searchParametres.GameHeroes;

/**
 * Информация которую мы хотим получить
 */
public interface SearchInfo {
    String getPlayerId();

    String getMap();
    Boolean playerWin();

    GameHeroes getHero();
    Integer getKills();
    Integer getAssists();
    Integer getDeaths();


}
