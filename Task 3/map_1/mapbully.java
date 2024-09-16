import java.util.Map;

public class mapbully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if((map.containsKey("a") && map.containsKey("b"))||(map.containsKey("a") && !map.containsKey("b")))
        {
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }

}
