package org.concept;
import java.util.*;

public class MapInterface {

    public static void hashMap(){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "vivek");
        hmap.put(5, "Tharun");
        hmap.put(3, "Hashi");
        hmap.put(4, "Sora");
        System.out.println("hashmap" + hmap);
        System.out.println("getting specific key " + hmap.get(3));
        System.out.println("ENtryset" + hmap.entrySet());
        System.out.println("values" +  hmap.values());
        System.out.println("Keys" +  hmap.keySet());
        System.out.println("Contains certain value " +  hmap.containsValue("vivek"));
        hmap.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });

        //Loop using entry set
        System.out.println("Looping using Map.Entry");
        for(Map.Entry<Integer, String> item : hmap.entrySet() ){
            System.out.println("key: " + item.getKey() + " value: " + item.getValue());
        }

    }

    public void reverseHashMap(){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "vivek");
        hmap.put(5, "Tharun");
        hmap.put(3, "Hashi");
        hmap.put(4, "Sora");

        //reverse a hashmap
        List<Integer> aList = new ArrayList<>(hmap.keySet());
        Collections.reverse(aList);
        System.out.println("Reversing a HashMap");
        for(int item : aList){
            System.out.println("key: " + item + " value: " + hmap.get(item));
        }
    }

    public void copyMaps(){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(2, "vivek");
        hmap.put(5, "Tharun");
        hmap.put(3, "Hashi");
        hmap.put(4, "Sora");
        //When key already present is added again it return the old value here Sora returned
        //Dora will be replaced in the place of sora since both keys are equal
        System.out.println("return hash map " + hmap.put(4, "Dora"));

        LinkedHashMap<Integer, String> lMap = new LinkedHashMap<>();
        lMap.putAll(hmap);
        lMap.put(1, "anre");
        lMap.put(1, "virtus");
        System.out.println("");
        System.out.println("Copied Linkedhashmap" + lMap);

        //Cloning Maps
        System.out.println("");
        LinkedHashMap<Integer, String> cMap = (LinkedHashMap<Integer, String>)lMap.clone();
        System.out.println("Copied Linkedhashmap" + cMap);

    }
    public void enumMaps() {
        //Enum map are used when you have enum datatype
        enum Size {
            small,
            large,
            medium
        }
        EnumMap<Size, Integer> eMap = new EnumMap<Size, Integer>(Size.class);
        eMap.put(Size.small, 20);
        eMap.put(Size.medium, 30);
        eMap.put(Size.large, 50);
        System.out.println("");
        System.out.println("Enum map" + eMap);
    }

    public void treeMaps(){
        TreeMap<String, Integer> numbers = new TreeMap<>(Collections.reverseOrder());
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);
    }
    public static void main(String[] args) {
        MapInterface mp = new MapInterface();
        hashMap();
        mp.reverseHashMap();
        mp.copyMaps();
        mp.enumMaps();
        mp.treeMaps();
    }


}
