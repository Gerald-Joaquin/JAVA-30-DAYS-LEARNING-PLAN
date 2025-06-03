package javaActivities;

import java.util.Scanner;

public class MidtermExamProgram1 {
	public static void main(String[] args) {
        final double GRAVITY = 32.2; // in feet/s²
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the distance to fall (in feet): ");
        double distance = scanner.nextDouble();
        
        double time = Math.sqrt((2 * distance) / GRAVITY);
        
        System.out.printf("Time to fall %.2f feet: %.3f seconds%n", distance, time);
        
        scanner.close();
    }
}
