package org.example.searchParametres;

/**
 * Информация которую мы хотим получить
 */
public interface SearchInfo {
    String getSteamID();

    /**
     * Результаты скольких матчей мы хотим посмотреть
     * @return
     */
    Integer getMatchCount();
}
