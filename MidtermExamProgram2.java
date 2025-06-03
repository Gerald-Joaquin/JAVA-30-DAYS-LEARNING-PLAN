package javaActivities;

import java.util.Scanner;

public class MidtermExamProgram2 {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a word or phrase to check if it's a palindrome: ");
	        String input = scanner.nextLine();
	        
	        String processedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        boolean isPalindrome = true;
	        int left = 0;
	        int right = processedInput.length() - 1;
	        
	        while (left < right) {
	            if (processedInput.charAt(left) != processedInput.charAt(right)) {
	                isPalindrome = false;
	                break;
	            }
	            left++;
	            right--;
	        }
	        
	        if (isPalindrome) {
	            System.out.println("\"" + input + "\" is a palindrome!");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
}
