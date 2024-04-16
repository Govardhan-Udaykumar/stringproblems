package org.beginnertoexpert;

import java.util.Stack;

public class RemoveConsecutiveCharacters {

    public static void main(String[] args) {
        String string = "geeksforgeeks";
        int k = 2;

        removeConsecutiveCharacters(string,k);

    }
    //sample string = abb;
    private static void removeConsecutiveCharacters(String string, int k) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < string.length()){
            char ch = string.charAt(i++);
            stack.push(ch);
            int count = 0;
            while (stack.size() > 0 && stack.peek() == ch){
                count++;
                stack.pop();
            }
            if(count == k){
                continue;
            }else {
                while (count > 0){
                    stack.push(ch);
                    count--;
                }
            }

        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c:stack)
            stringBuilder.append(c);

        System.out.println(stringBuilder);
    }
}
