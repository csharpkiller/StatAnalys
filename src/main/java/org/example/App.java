package org.example;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        PlayerStatistic playerStatistic = new PlayerStatistic();
        ConsoleReader consoleReader = new ConsoleReader();
        SearchPlayerInfoData searchPlayerInfoData = consoleReader.read();
        List<PlayerStatData> playerStatDataList = playerStatistic.getPlayerStats(searchPlayerInfoData);
    }
}
