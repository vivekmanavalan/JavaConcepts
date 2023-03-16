package org.concept;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class ArrayProblems {

    public static void sortArray(int [] numArray){
        System.out.print("unsorted array");
        for(int i : numArray){
            System.out.print(i);
        }
        Arrays.sort(numArray);
        System.out.println("sorted Array" + Arrays.toString(numArray));
    }
    public static void main(String[] args) {
        //int[] numArray = new int[5];
        int[] numArray = {1,2,33,446,5};
        sortArray(numArray);
        int[] arr = Arrays.copyOf(numArray, numArray.length);
        arr[0] = 99;
        System.out.println("orignal arr" + Arrays.toString(numArray));
        System.out.print("arr" + Arrays.toString(arr));
        System.out.println("converting array to arraylist");
        //ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(numArray));
        //System.out.println(arrList);

    }
}
