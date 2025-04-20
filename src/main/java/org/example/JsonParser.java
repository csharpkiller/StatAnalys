package org.example;

import org.example.DTO.MatchDetalsDTO;
import org.example.DTO.MatchInfoDTO;

import java.util.List;

/**
 * Этот класс предназначен ТОЛЬКО для вычленения инфы из JSON
 * Никакой логики работы здесь быть НЕ ДОЛЖНО
 */
public class JsonParser {

    /**
     * Возвращает список всех матчей
     * @param logstfApiUrl
     * @return
     */
    public List<MatchInfoDTO> getMatchesInfo(String logstfApiUrl){
        //TODO
        return null;
    }

    /**
     * Возвращает список с результатами матча
     * @param logstfApiUrl
     * @return
     */
    public List<MatchDetalsDTO> getMatchResults(String logstfApiUrl){
        //TODO
        return null;
    }

}
