package com.stasih;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/string-data-structure/  -  String Problems
public class String1 {

    public List<String> findSubsequences (String input) {

        List<String> subSequences = new ArrayList<>();
        int i,j,k;
        for (i=0; i<input.length(); i++){
            for (j=input.length(); j>i; j--){
                String subStr = input.substring(i, j);
                if (!subSequences.contains(subStr)){
                    subSequences.add(subStr);
                }
                for (k=1; k < subStr.length()-1; k++){
                    StringBuffer sb = new StringBuffer(subStr);
                    sb.deleteCharAt(k);
                    if (!subSequences.contains(sb)){
                        subSequences.add(sb.toString());
                    }

                }
            }
        }
        return subSequences;
    }
}
