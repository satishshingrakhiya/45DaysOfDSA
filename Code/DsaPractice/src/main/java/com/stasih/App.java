package com.stasih;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Reverse Integer Array
        Arrays1<Integer> intArray = new Arrays1<>();
        List<Integer> intList = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);
        intList = intArray.reverseArray(intList);
        System.out.println(intList);

        // Reverse String Array
        Arrays1<String> stringArray = new Arrays1<>();
        List<String> stringList = Arrays.asList("Satish", "Shingrakhiya", "is", "a", "Java", "Developer");
        stringList = stringArray.reverseArray(stringList);
        System.out.println(stringList);

        // Rotate Integer Array
        List<Integer> intList2 = Arrays.asList(1, 3, 4, 5, 6, 9, 2, 8, 7);
        intList2 = intArray.rotateArray(intList2, 4);
        System.out.println(intList2);

        // Largest Sum Contiguous Subarray (Kadane’s Algorithm)
        int sum = intArray.largestSumSubArray(intList);
        System.out.println("Largest Sum Subarray: " + sum);

        String1 string1 = new String1();
        List<String> list = string1.findSubsequences("aabc");
        System.out.println(list);

        // Stack methods
        Stack<Integer> stack = new Stack<>(new ArrayList<>(Arrays.asList(1, 3, 5, 2, 9, 6, 7)));
        stack.pop();
        stack.push(8);
        stack.peek();
        stack.isEmpty();
    }
}
