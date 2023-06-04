
import java.util.*;

public class seminar_5 {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 16; i++) {
//            list.add(new Random().nextInt());
//        }
//        list.forEach(n -> System.out.println(Math.abs(n%16)));
//
//        int[] ints = new int[16];

//        hashMap.put(1, "One");
//        hashMap.put(1, null);
//        hashMap.putIfAbsent(1, "?");
////        System.out.println(hashMap.get(1));
//        hashMap.get(1);
//        hashMap.getOrDefault(2, "Def");
//        hashMap.replace(1,"1");
//        hashMap.replace(1,"1",  "2");
//        if (hashMap.containsValue("1"));
//        if (hashMap.containsKey(1));

//        hashMap.compute(1, (k, v) -> v += k);
//        hashMap.computeIfPresent(1, (k, v) -> v = "!"+k);
//        hashMap.computeIfAbsent(2, v -> "Three");

//        System.out.println(hashMap.get(2));

//        for (int i = 0; i < 10; i++) {
//            hashMap.put(new Random().nextInt(), Character.getName(i));
//        }

//        for (int i = 0; i < hashMap.size(); i++) {
//            int index = (int) hashMap.keySet().toArray()[i];
//            System.out.println(hashMap.get(index));
//        }

//        hashMap.forEach( (k, v) -> System.out.println(k + " " + v) );

//        for (String s: hashMap.values()) {
//            System.out.println(s);
//        }

//        Iterator<String> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            iterator.remove();
//            System.out.println(s);
//        }

        ArrayList<String> list = new ArrayList<>(List.of("One", "Two", "One", "Three", "Two", "Two","Five", "Three"));

//        for (String s: list) {
//            if (!hashMap.containsKey(s)) hashMap.put(s, 1);
//            else hashMap.put(s, hashMap.get(s) + 1);
//            hashMap.merge(s, 1, (vO, vN) -> vO + vN);
//        }

        list.forEach(s -> hashMap.merge(s, 1, (vO, vN) -> vO + vN));

        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        treeMap.put(16, "Many");
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(0, "Many");
        treeMap.put(7, "One");
        treeMap.put(15, "Five");

        treeMap.headMap(12, true);
        treeMap.tailMap(12, true);
        treeMap.subMap(2, 12);




        System.out.println(treeMap.keySet());


    }

}