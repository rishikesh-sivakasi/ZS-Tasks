import java.util.Map;

public class mapshare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if((map.containsKey("a") && map.containsKey("b"))||(map.containsKey("a") && !map.containsKey("b")))
            map.put("b",map.get("a"));
        if(map.containsKey("c"))
            map.remove("c");
        return map;
    }
}
