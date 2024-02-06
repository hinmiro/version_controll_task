package PalindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
    static Scanner scan = new Scanner(System.in);
    static String transformed;

    public static void main(String[] args) {

        System.out.print("Write word and we check if it is palindrome: ");
        String input = scan.nextLine();
        transformed = splice(input); //Splice , and ! from string
        checkPalindrome(transformed); //Check if string is palindrome

    }

    public static String splice(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static void checkPalindrome(String input) {
        String reversed = reverseString(input); //Reverse string to backwards
        if (input.equals(reversed)) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) { // Iterate word backwards
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}