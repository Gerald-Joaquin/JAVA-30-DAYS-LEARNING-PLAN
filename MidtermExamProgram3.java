package javaActivities;

import java.util.Scanner;

public class MidtermExamProgram3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayA = new int[5];
        
        System.out.println("Enter 5 integer numbers for Array A:");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arrayA[i] = scanner.nextInt();
        }
        
        int[] arrayB = new int[5];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = arrayA[i] * arrayA[i];  
        }
        
        System.out.println("\nArray A (Original Values):");
        printArray(arrayA);
        
        System.out.println("\nArray B (Squared Values):");
        printArray(arrayB);
        
        scanner.close();
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
