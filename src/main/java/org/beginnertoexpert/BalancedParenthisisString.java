package org.beginnertoexpert;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthisisString {

    public static void main(String[] args) {

        String string = "[()]{}{[()()]()}" ;

        System.out.println(balancedParanthesis(string));
    }

    private static boolean balancedParanthesis(String string) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            if(ch =='{' || ch == '[' || ch == '('){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check;

            switch (ch){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '(')
                        return false;
                    break;
            }
        }
        return true;
    }
}
