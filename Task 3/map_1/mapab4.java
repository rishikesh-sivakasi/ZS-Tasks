import java.util.Map;

public class mapab4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b"))
        {
            if(map.get("a").length()>map.get("b").length())
            map.put("c",map.get("a"));
            else if(map.get("a").length()<map.get("b").length())
            map.put("c",map.get("b"));
            else if(map.get("a").length()==map.get("b").length())
            {
            map.put("a","");
            map.put("b","");
            }
        }
        return map;
    }
}
