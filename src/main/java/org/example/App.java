package org.example;

import org.example.searchParametres.SearchPlayerInfoData;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        PlayerStatistic playerStatistic = new PlayerStatistic();
        ConsoleReader consoleReader = new ConsoleReader();
        SearchPlayerInfoData searchPlayerInfoData = consoleReader.read();
        List<PlayerStatData> playerStatDataList = playerStatistic.getPlayerStats(searchPlayerInfoData);

        QueryLink queryLink = new QueryLink("76561198146466689");
        System.out.println(queryLink.createQuaryLink());
    }
}
