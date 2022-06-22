package com.example.demo.learningstrings;

import java.sql.SQLOutput;

public class StringPractice {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    // 1) Using the string "Learn string handling": what index is the last letter in the string?
    private static void ex1() {
        String str = "Learn string handling";
        int lastLetter = str.length() -1;
        System.out.println("The last letter in the string is at index: " + lastLetter);
    }

    // 2) Using the same string as above, what character is located at the 10th index?
    private static void ex2() {
        String str = "Learn string handling";
        char ch1 = str.charAt(10);
        System.out.println("Character at the 10th index is: " + ch1);
    }

    // 3)Do a check to see if the character at index 10 and 15 are the same?
    private static void ex3() {
        String str = "Learn string handling";
        char ch1 = str.charAt(10);
        char ch2 = str.charAt(15);
        System.out.println("Character at the 10th index is: " + ch1);
        System.out.println("Character at the 15th index is: " + ch2);
        System.out.println("Character at index 10 and 15 are the same.");
    }

    // 4) Create a scenario that returns false if the character at the 0 index equals the 5th index
    private static void ex4() {
        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(5);
        boolean isTrue = false;
        if(str.equalsIgnoreCase(allUpper)) {
            isTrue = true;
        }else {
            isTrue = false;
        }

        if(ch1 == ch2) {
            isTrue = true;
        }else {
            isTrue = false;
        }
        System.out.println("Are str and allUpper equal: " + isTrue);
    }

    //length()
    //equals()
    //equalsIgnoreCase()
    //charAt()
    //contains()
    //substring()
    //startsWith
    //endsWith
    //toLowerCase()
    //toUpperCase()

}

