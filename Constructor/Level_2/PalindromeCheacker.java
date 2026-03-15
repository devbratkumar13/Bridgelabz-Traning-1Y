package com.gla.Constructor.Level_2;

import java.util.Scanner;
class PalindromeCheacker {
    String text;
    boolean isPalindrome() {
        String rev = "";
        for(int i = text.length()-1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        return text.equals(rev);
    }
    void displayResult() {
        if(isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PalindromeCheacker p = new PalindromeCheacker();
        p.text = in.nextLine();
        p.displayResult();
    }
}
