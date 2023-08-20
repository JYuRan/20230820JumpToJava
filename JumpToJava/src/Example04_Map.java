import java.util.HashMap;

public class Example04_Map {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("1번", "사람");
        map.put("2번", "야구");
        map.put("3번", "축구");
        
        System.out.println(map.get("1번"));

        System.out.println(map.getOrDefault("4번", "없엉"));
        System.out.println(map.keySet());





    }
}
