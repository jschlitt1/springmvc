package edu.wctc.travel;

import java.util.Map;
import java.util.LinkedHashMap;

public class CountryOptions {
    private Map<String, String> map;

    public CountryOptions(){
        map = new LinkedHashMap<>();
        map.put("BR", "Brazil");
        map.put("FR", "France");
        map.put("JP", "Japan");
        map.put("IN", "India");
        map.put("US", "United States");
        map.put("CA", "Canada");
    }

    public Map<String, String> getMap() {
        return map;
    }
}
