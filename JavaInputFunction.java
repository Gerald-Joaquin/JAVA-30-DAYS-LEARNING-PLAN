package Java;
import java.util.Scanner;

public class JavaInputFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age = scanner.nextInt();
		
		if (age >= 60) {
			System.out.println("Too old to enter!");
		} else if (age >= 18) {
			System.out.println("You can enter!");
		} else if (age <= 17) {
			System.out.println("Minors are not allowed to enter!");
		} else {
			System.out.print("invalid input!");
		}
	}
}
