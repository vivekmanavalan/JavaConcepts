package org.concept;

import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("vivek");
        hset.add("Sora");
        hset.add("Sora");
        hset.add("Kaksho");
        hset.add("Naruto");
        System.out.println("Printing hash set" + hset.toString());
        HashSet<String> hset1 = new HashSet<>();
        hset1.add("ace");
        hset1.add("garnet");
        hset1.add("kobe");
        hset1.add("Kaksho");
        hset1.add("tobi");
        hset.addAll(hset1);
        System.out.println("Union of two hash set" + hset);
        //Takes common values from two sets
        hset.retainAll(hset1);
        System.out.println("Intersection of two hash set" + hset);
        hset.removeAll(hset1);
        System.out.println("Difference of two hash set" + hset);
        for(String s : hset){
            System.out.println("Hset " + s);
        }

    }
}
