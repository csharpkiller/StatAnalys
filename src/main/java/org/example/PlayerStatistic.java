package org.example;

import java.util.List;

/**
 *
 */
public class PlayerStatistic {

    /**
     * Передаем категорию по которой будем искать и хотим получить список результатов игрока
     * @param searchPlayerInfoData
     * @return
     */

    /**
     * TODO
     * В чем трабл: при формировании запроса мы указываем limit - кол-во матчей,
     * казалось бы ну и передавать в запрос кол-во из searchPlayerInfoData, но:
     *  1) Нам нужно будет фильтровать матчи по тэгу (некоторые тэги будем игнорить) и тогда limit не будет содержать нужное кол-во матчей
     *  2) Если мы ищем по классу то допустим из 100 матчей (limit=100) может оказаться 5 с нужным классом, а хотелось бы 100 именно с нужным классом.
     *
     * Какие варики:
     *  1) ну можно тупа maxlimit искать и пох тогда, но это так себе
     *  2) использовать offset и если не набрали нужное кол-во, формулировать новый запрос с offset = limit, limit * 2
     *  второй варик норм теперь нужно думать как устроить логику...
     */
    public List<PlayerStatData> getPlayerStats(SearchPlayerInfoData searchPlayerInfoData) {
        if(searchPlayerInfoData.isClassSearch()){

        }else{

        }
        //TODO всю логику поиска результатов в этом классе нужно развернуть
        return null;
    }
}
