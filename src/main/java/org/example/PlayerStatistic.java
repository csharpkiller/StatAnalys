package org.example;

import org.example.searchParametres.SearchPlayerInfoData;

import java.util.List;

/**
 *
 */
public class PlayerStatistic {

    /**
     * TODO
     * В чем трабл: при формировании запроса мы указываем limit - кол-во матчей,
     * казалось бы ну и передавать в запрос кол-во из searchPlayerInfoData, но:
     *  1) Нам нужно будет фильтровать матчи по тэгу (некоторые тэги будем игнорить) и тогда limit не будет содержать нужное кол-во матчей
     *  2) Если мы ищем по классу то допустим из 100 матчей (limit=100) может оказаться 5 с нужным классом, а хотелось бы 100 именно с нужным классом.
     *  (ага покс title=server.me работает нормально)
     *
     * Какие варики:
     *  1) ну можно тупа maxlimit искать и пох тогда, но это так себе
     *  2) использовать offset и если не набрали нужное кол-во, формулировать новый запрос с offset = limit, limit * 2
     *  второй варик норм теперь нужно думать как устроить логику...
     */

    /**
     * TODO на будущее
     * в чем прикол искать только serverme?
     * В логах на logs.tf выгружаются реультаты матчей, обычно с хоста server.me,
     * какие могут быть траблы?
     * 1) server.me выгружается совместно с сторонними сервисами, например tf2center. tf2center - сайт где можно
     *  зайти в лоббак и сыграть, но считается для новичков. Нежели если лог только с server.me - тогда это скорее всего результат
     *  праков(pcw(scrim)) - валидный потнявый матч. Как будто хотелось бы игнорить логи которые идут с tf2center.
     *  TODO Тогда нужно смотреть все матчи без поиска по тэгу, из этих матчей отсеивать парные с tf2center допустим по дате....
     * 2) Выгружать результаты могут с серваков не связанных с server.me, либо американский сервис, либо ланы с локальных серваков
     *  TODO Тогда хз, игнорить тэги?????
     *
     *  TODO сейчас:
     *  1) забиваем на все прочие проблемы, в рамках нашей задачи ищем только server.me, в целом это все равно хорошая база для аналитики
     *  2) устроить структуру так чтобы новые фичи легко добавлялись
     */

    private List<PlayerStatData> playerStatDataList = null;
    private QueryLink queryLink = null;

    /**
     * Возвращает список интересующей нас игровой статистики игрока
     * @param searchPlayerInfoData
     * @return
     */
    public List<PlayerStatData> getPlayerStats(SearchPlayerInfoData searchPlayerInfoData) {

       /* queryLink = new QueryLink(searchPlayerInfoData.getSteamID());

        if(searchPlayerInfoData.isClassSearch()){

        }else{
            if(searchPlayerInfoData.onlyServermeUpploadsMatches()){
                allHerosServerMeSearch(searchPlayerInfoData);
            }
            else {
                // TODO реализовывать сейчас не буду, в целом не нужно в 99% случаев МБ ПОТОМ)
            }
        }
        //TODO всю логику поиска результатов в этом классе нужно развернуть*/

        if(searchPlayerInfoData.haveIgnoreTags()){
            searchWithIgnoreTags(searchPlayerInfoData);
        }
        else{
            searchWithourIgnoreTags(searchPlayerInfoData);
        }

        return playerStatDataList;
    }

    private void searchWithIgnoreTags(SearchPlayerInfoData searchPlayerInfoData) {

    }


    private void allHerosServerMeSearch(SearchPlayerInfoData searchPlayerInfoData){
        queryLink.setTitle(BasicLogstfTitles.serverme_tag);
        queryLink.setLimit(searchPlayerInfoData.getMatchCount().toString());
        playerStatDataList = getPlayerStatsFromResponse(queryLink.createQuaryLink());
    }

    private List<PlayerStatData> getPlayerStatsFromResponse(String url){
        //TODO
        return null;
    }
}
