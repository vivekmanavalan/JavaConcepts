package org.concept;

import java.util.HashMap;

public class MapInterface {

    public static void hashMap(){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "vivek");
        hmap.put(2, "Tharun");
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

    }
    public static void main(String[] args) {
        hashMap();
    }
}
