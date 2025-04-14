package org.example;

/**
 * Информация по которой будем искать: ID, Class?, Сколько Матчей
 */
public class SearchPlayerInfoData implements SearchCategory {
    @Override
    public boolean isClassSearch() {
        return false;
    }
}
