package org.beginnertoexpert;

/**
 * Implementing logics for verifying whether a given string is a palindrome or not.
 * Example : elle is a palindrome whereas ell is not.
 */
public class StringPalindrome {

    /**
     * Iterative method to check whether a given string is palindrome or not.
     * We are using String concatenation for simplicity. Remember that String Concatenation is
     * costly operation in terms of performance and memory.
     * * @return
     */
    public boolean isPalindromeUsingConcatinationIterative(String word){
       String tempWord = "";
        for(int i=word.length()-1;i>=0;i--){
             tempWord+= word.charAt(i);
       }
      return tempWord.equals(word);
    }

    /**
     * Iterative method to check whether a given string is palindrome or not.
     * We are using String builder to improve performance.
     * String builder append improves performance and memory usage.
     * * @return
     */
    public boolean isPalindromeUsingStringBuilderIterative(String word){
        StringBuilder tempWord = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            tempWord.append(word.charAt(i));
        }
        return tempWord.compareTo(new StringBuilder(word)) == 0;
    }
    /**
     * Iterative method to check whether a given string is palindrome or not.
     * We are using String builder to improve performance.
     * String builder append improves performance and memory usage.
     * * @return
     */
    public boolean isPalindromeUsingStringBuilderMethods(String word){
        StringBuilder tempWord = new StringBuilder(word);

        return tempWord.reverse().compareTo(new StringBuilder(word)) == 0;
    }
}
