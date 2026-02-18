package com.gla.String.Level1;
import java.util.Scanner;

class CharacterArrayComparison {

    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = sc.next();

        char[] userDefinedArray = getCharacters(input);
        char[] builtInArray = input.toCharArray();

        boolean result = compareArrays(userDefinedArray, builtInArray);

        System.out.println("User-defined method result:");
        for (int i = 0; i < userDefinedArray.length; i++) {
            System.out.print(userDefinedArray[i] + " ");
        }

        System.out.println("\nBuilt-in toCharArray() result:");
        for (int i = 0; i < builtInArray.length; i++) {
            System.out.print(builtInArray[i] + " ");
        }

        System.out.println("\nAre both arrays equal? " + result);
    }
}
