package org.beginnertoexpert;

public class BinaryNumberPalindrome {

    public static void main(String[] args) {
        long n = 9;
        long n1 = n;
        long rev = 0;

        System.out.println();

        while(n1 > 0){
            rev <<= 1;
            System.out.println(rev);
            if((n1 & 1) == 1)
                rev ^=1;
            System.out.println(rev);
            n1 >>= 1;

        }
        System.out.println(rev);
    }
}
