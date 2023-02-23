import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> crew = new HashMap<>();
        crew.put("ルフィ", "身長172cm 懸賞金3億ベリー");
        crew.put("ゾロ", "身長178cm 懸賞金1億2000万ベリー");
        crew.put("サンジ", "身長177cm 懸賞金7700万ベリー");
        crew.put("ブルック", "身長266cm 懸賞金3300万ベリー");

        System.out.println(crew.get("ルフィ"));
        System.out.println(crew.get("ブルック"));
    }
}
