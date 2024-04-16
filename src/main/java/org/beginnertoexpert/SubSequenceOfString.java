package org.beginnertoexpert;

import java.util.*;

public class SubSequenceOfString {

    static List<String> list = new ArrayList<>();

    static Set<String> set = new LinkedHashSet<>();
    public static void main(String[] args) {
        String string = "abcd";

        findSubsequenceOfString(string,"");

        //distinctSubsequences(string," ");

        for (String s:list)
            set.add(s);

        System.out.println(set +" "+set.size());
    }

    private static void distinctSubsequences(String string, String s) {

        if(string.isEmpty()){
            set.add(s);
            return;
        }
        findSubsequenceOfString(String.valueOf(set.add(string.substring(1))),s+string.charAt(0));

        findSubsequenceOfString(String.valueOf(set.add(string.substring(1))),s);
    }

    private static void findSubsequenceOfString(String string, String s) {

        if(string.isEmpty()){
            list.add(s);
            return;
        }
        findSubsequenceOfString(string.substring(1),s+string.charAt(0));

        findSubsequenceOfString(string.substring(1),s);
    }

}
