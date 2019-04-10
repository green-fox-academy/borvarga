import java.util.HashMap;
import java.util.Iterator;

public class MapIntro1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> firstHashMap = new HashMap<Integer, Character>();
        firstHashMap.put(97, 'a');
        firstHashMap.put(98, 'b');
        firstHashMap.put(99, 'c');
        firstHashMap.put(65, 'A');
        firstHashMap.put(66, 'B');
        firstHashMap.put(67, 'C');
        System.out.println(firstHashMap.keySet());
        System.out.println(firstHashMap.values());
        firstHashMap.put(68, 'D');
        System.out.println(firstHashMap.size());

        firstHashMap.forEach((k,v) -> System.out.println("key: "+ k +" value: " + v));

        firstHashMap.remove(97);
        System.out.println(firstHashMap.keySet());
        System.out.println(firstHashMap.containsKey(97));
        firstHashMap.clear();
        System.out.println(firstHashMap.keySet());
        }
    }
