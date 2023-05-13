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
        
        String[] reverseArray = strList.toArray(new String[strList.size()]);
        StringBuilder sb = new StringBuilder();
        for(String rev : reverseArray) {
            sb.append(rev);
        }
        System.out.println("str reversed "+  sb);

        String s1 = new String("Tharun");
        //String s2 = s1;//true
        String s2 =  new String("Tharun");//false
        String str1 = "Vivek";
        System.out.println(s1 == s2); //false seperate object in heap
        System.out.println(str == str1); //true shares constant pool
    }

    public void conversionMethods(){
        //String to stringBuilder conversion
        String s1 = "Vivek";
        StringBuilder sb = new StringBuilder(s1);
        //String to StringBuffer Conversion
        StringBuffer sbuf = new StringBuffer(s1);

        //StringBuffer to String
        String s2 = sbuf.toString();
        //StringBuilder to String
        String s3 = sb.toString();

        //StringBuffer to StringBuilder
        //There is no direct way to convert
        //convert buffer to string and then to builder
        StringBuilder sb1 = new StringBuilder(s2);

    }
    
    
    public void fizzbuzz(int count){
        for(int i = 1; i<count; i++){
            String result = "";
            if(i%3 == 0){
                result+="fizz";
            } if(i%5== 0){
                result+="buzz";
            } if(i%3 !=0 && i%5 !=0){
                result+=i;
            }
            System.out.println("result" + result);
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    
    public static void main(String[] args) {
        stringMethods();
        StringProblems obj = new StringProblems();
        obj.conversionMethods();
        obj.fizzbuzz(16);


    }
}
