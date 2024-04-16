package org.beginnertoexpert;

import java.util.ArrayList;
import java.util.List;

public class SubStringWithEqual012 {

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String string = "0102010";

        generateSubStrings(string);

        System.out.println(list);

        System.out.println(getSubstringWithEqual012(list));
    }

    private static int getSubstringWithEqual012(List<String> list) {

        List<String> list1 = new ArrayList<>();
        int count0,count1,count2;

        int count = 0;
        String temp = null;
        for(String s:list){
            count0 = 0;
            count1 = 0;
            count2 = 0;
            temp = s;
           for(int j=0;j<temp.length();j++){
               if(temp.charAt(j)== '0'){
                   count0++;
               }
               if(temp.charAt(j)== '1'){
                   count1++;
               }
               if(temp.charAt(j)== '2'){
                   count2++;
               }
           }
           if(count0 == count1 && count1 == count2){
               list1.add(temp);
               count++;
           }

        }
        System.out.println(list1);

        return count;
    }

    private static void generateSubStrings(String string) {

        for(int i=0;i<string.length();i++){
           for(int j=i+1;j<string.length()-1;j++){
               list.add(string.substring(i,j));
           }
        }

    }
}
