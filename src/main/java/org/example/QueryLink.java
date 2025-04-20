package org.example;


/**
 * Log search API
 * Access JSON list of logs: http://logs.tf/api/v1/log?title=X&uploader=Y&player=Z&limit=N&offset=N
 *
 * Any of these fields can be combined together or omitted.
 *
 * Results are always ordered by log id descending.
 *
 * Example of comma-separated SteamIDs: 76561197987681768,76561197996199110
 *
 * title	Optional Title text search (min. 2 characters)
 * map	Optional Exact name of a map
 * uploader	Optional Uploader SteamID64
 * player	Optional One or more player SteamID64 values, comma-separated
 * limit	Optional Limit results (default 1000, maximum 10000)
 * offset	Optional Offset results (default 0)
 */

public class QueryLink {
    private String title ="";
    private String map="";
    private String uploader="";
    private String limit="";
    private String offset="";


    /**
     * Делаем полный запрос, пустые значения игнорируются запросом.
     * @return
     */
    private String createQuaryLink(String player, String title, String map, String uploader,String limit, String offset){
        StringBuffer stringBuffer = new StringBuffer("http://logs.tf/api/v1/log?");
        stringBuffer.append("title=");
        stringBuffer.append(title);
        stringBuffer.append("&");
        stringBuffer.append("map=");
        stringBuffer.append(map);
        stringBuffer.append("&");
        stringBuffer.append("uploader=");
        stringBuffer.append(uploader);
        stringBuffer.append("&");
        stringBuffer.append("player=");
        stringBuffer.append(player);
        stringBuffer.append("&");
        stringBuffer.append("limit=");
        stringBuffer.append(limit);
        stringBuffer.append("&");
        stringBuffer.append("offset=");
        stringBuffer.append(offset);
        return stringBuffer.toString();
    }

    public String createQuaryLink(String player){
        return createQuaryLink(player, title, map, uploader, limit, offset);
    }

    public String createQuaryLink(String player, Integer limit, Integer offset){
        return createQuaryLink(player, title, map, uploader, limit.toString(), offset.toString());
    }
}
