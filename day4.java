package Java;

//- Task: Understand `if`, `else if`, and `else` statements.
//- Challenge: Create a program that checks if a number is even or odd.

public class day4 {
	public static void main(String[] args) {
		int num = 3;
		
		if (num % 2 ==  0) {
			System.out.println(num + " is even");
		} else if (num % 2 == 1) {
			System.out.println(num + " is odd");
		} else {
			System.out.println("Invalid Number!");
		}
	}
}
