package org.beginnertoexpert;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // printSubStrings
         SubString subString = new SubString();
        Map<String,Integer> map = subString.printSubStringsPalindromes("elle");
        System.out.println(map);

    }
}