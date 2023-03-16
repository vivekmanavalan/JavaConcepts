package org.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StringProblems {

    public static void stringMethods(){
        String str = "Vivek";
        String[] strArr = str.split("");
        System.out.println("converted from string to array " + Arrays.toString(strArr) );
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArr));
        Collections.reverse(strList);


    }
    public static void main(String[] args) {
        stringMethods();
    }
}
