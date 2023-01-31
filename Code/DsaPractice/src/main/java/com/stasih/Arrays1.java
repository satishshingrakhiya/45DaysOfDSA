package com.stasih;

import java.util.ArrayList;
import java.util.List;

public class Arrays1 <T> {

    // Iterative Program to reverse array - Time Complexity : O(n)
    public List<T> reverseArray(List<T> array) {
        int size = array.size();
        T temp;
        for (int i=0; i < (size+1)/2; i++){
            temp = array.get(i);
            array.set(i, array.get(size-1-i));
            array.set(size-1-i, temp);
        }
        return array;
    }

    // Rotate array
    public List<T> rotateArray(List<T> array, Integer d){
        int size = array.size();
        List<T> ans = new ArrayList<>();
        int i;
        for (i=d; i < size; i++){
            ans.add(array.get(i));
        }
        for (i=0; i < d; i++){
            ans.add(array.get(i));
        }
        return ans;
    }
}
