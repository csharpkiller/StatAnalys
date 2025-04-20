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
    private String player="";
    private String limit="";
    private String offset="";

    /**
     * Нам сто проц нужен id игрока в качестве запроса
     * @param player
     */
    public QueryLink(String player) {
        this.player = player;
    }

    public QueryLink(Long player){
        this.player = player.toString();
    }

    /**
     * Делаем полный запрос, пустые значения игнорируются запросом.
     * @return
     */
    public String createQuaryLink(){
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
