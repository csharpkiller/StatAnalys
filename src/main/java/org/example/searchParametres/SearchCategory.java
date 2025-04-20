package org.example.searchParametres;


public interface SearchCategory {

    /**
     * Хотим ли мы искать стату по определенному классу(герою)
     * @return
     */
    boolean isClassSearch();

    /**
     * Будем ли мы искать матчи загруженные с serverme или учитываем кастомные (когда игроки сами загружают)
     * (Ну по идеи всегда хотим, но в дальнейшем может пригодиться.)
     * @return
     */
    boolean onlyServermeUpploadsMatches();

    /**
     * Есть ли тэги матчей, которые нужно игнорировать
     * @return
     */
    boolean haveIgnoreTags();

    /**
     * Игровой режим который мы хотим найти
     * @return
     */
    GameFormat getGameFormat();

    /**
     * Тип периода по которому мы будем искать (*сейчас будет реализована только по match_count*) TODO
     * @return
     */
    SearchPeriod getSearсhPeriod();
}
