package org.beginnertoexpert;

import java.util.HashMap;
import java.util.Map;

public class LexiographicallyFirstPalindrome {

    public static void main(String[] args) {
        String input = "ababccc";
        String left = "";
        String right = "";
        Map<Character,Integer> map = new HashMap<>();

        char[] array = input.toCharArray();

        //count occurences of each character.
        for(Character c: array){
            if(!(map.containsKey(c))){
                map.put(c,1);
            }else{
                map.put(c, map.get(c)+1);
            }

        }
        // Iterate through the keys and if the occurance is even, add half to the left and half to the right.
        // else add half -1 to left and remaining to right.
        // reverse right string and append it to left to form palindrome..
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() % 2 == 0){
                int count = entry.getValue()/2;
                for(int i=0;i<count;i++){
                    left += entry.getKey().toString();
                }
                for(int i=0;i<count;i++){
                    right += entry.getKey().toString();
                }
            }else{
                    int start = entry.getValue()/2;
                    int end = entry.getValue() - start;
                    for(int i=0;i<start;i++){
                        left += entry.getKey().toString();
                    }
                    for(int i=0;i<end;i++){
                        right += entry.getKey().toString();
                    }
            }
        }
        //reverse right....
        String reverseRight = "";
        for(int i = right.length()-1;i>=0;i--){
            reverseRight += right.charAt(i);
        }
        System.out.println(left+reverseRight);
        //System.out.println(map);
    }
}
