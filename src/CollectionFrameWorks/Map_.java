package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Map_ {
    public static void main(String[] args) {
/*        Map<String, Object> map = new HashMap<>();
        map.put("Subhan","Valili");
        map.put("City", "Baku");
        map.put("Age", 17);
        map.put("University", "ASOIU");
        */

/*        System.out.println(map.get("Subhan"));
        System.out.println(map.get("City"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        */

 /*       String[] arr = map.keySet().toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Key: %s, Value: %s\n", arr[i], map.get(arr[i]));
        }
        */
/*        for (Map.Entry<String, Object> entry: map.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        */

/*        Map<String, Map<String, Object>> map = new HashMap<>();
        map.put("Subhan",new HashMap<>());
        map.get("Subhan").put("Age",18);
        System.out.println(map.entrySet());*/

        Map<Integer, Integer> play = new HashMap<>(Map.of(
                1,0,
                2,0,
                3,0,
                4,0,
                5,0,
                6,0
        ));
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(1,7);
            play.put(num, play.getOrDefault(num,0) + 1);
        }
        for (Map.Entry<Integer, Integer> i : play.entrySet()) {
            System.out.println(i.getKey() + ":" + (double) i.getValue() / 100);
        }

    }
}
