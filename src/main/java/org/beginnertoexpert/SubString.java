package org.beginnertoexpert;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubString {

    /**
     * This methods prints substrings of a string.
     * Logic is to have two pointers i and i and j, pointer i pointing to the start of the string and j pointing to i+1
     * position. and We are getting substrings using substring method of string and storing it
     * to temp and then to a map with substring as key and its length as value.
     * @param word
     * @return
     */
    public Map<String,Integer> printSubStrings(String word){
        Map<String,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                String  temp = word.substring(i,j);
                map.put(temp,temp.length());
            }
        }
        return map;
    }

    /**
     * * This methods prints substrings of a string and checks for palindromic nature.
     * Logic is to have two pointers i and i and j, pointer i pointing to the start of the string and j pointing to i+1
     * position. and We are getting substrings using substring method of string and storing it
     * to temp and then we make use of methods written in StringPalindrome class in this package to check for palindrome.
     * @param word
     * @return
     */
    public Map<String,Integer> printSubStringsPalindromes(String word){
        Map<String,Integer> map = new LinkedHashMap<>();
        StringPalindrome stringPalindrome = new StringPalindrome();
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                String  temp = word.substring(i,j);
                boolean isPalindrome = stringPalindrome.isPalindromeUsingStringBuilderMethods(temp);
                if(isPalindrome)
                    map.put(temp,temp.length());
            }
        }
        return map;
    }
}
