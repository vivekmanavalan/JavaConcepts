package org.concept;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(12);
        arrList.add(13);
        arrList.add(15);
        System.out.println("Getting first element from list " + arrList.get(0));
        arrList.remove(2);
        System.out.println("check if it containst 13 " + arrList.contains(13));
        System.out.println("Arraylist" + arrList.toString());
        arrList.clear();
        System.out.println("cleared the list" + arrList);

        LinkedList<String> lList = new LinkedList<String>();
        lList.add("vivek");
        lList.add("ram");
        lList.add("sora");
        System.out.println("Printing Linked list" + lList.toString());
        lList.set(1, "naruto");
        for(String s : lList){
            System.out.println(s);
        }
        System.out.println("check is empty "+ lList.isEmpty());

        String[] strArr = new String[lList.size()];
        lList.toArray(strArr);
        System.out.println("converted list to array" + Arrays.toString(strArr));
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArr));
        Collections.reverse(strList);
        System.out.println("converetd array to list" + strList.toString());


        System.out.println("Creating a stack");
        Stack<String> stacks = new Stack<String>();
        stacks.push("kakshi");
        stacks.push("tobi");
        stacks.push("hashi");
        System.out.println("Top element in stack " + stacks.peek());
        stacks.pop();
        System.out.println("Removed the recently added " + stacks);
        System.out.println("search " + stacks.search("tobi"));



    }
}
