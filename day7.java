package Java;

//- Task: Understand `while` and `do-while` loops.
//- Challenge: Write a program to print numbers 1 to 10 using both types of loops.

public class day7 {
	public static void main(String[] args) {
		int num1 = 1;
		
		System.out.println("USING WHILE LOOP");
		while (num1 <= 10) {
			System.out.println("Number: " + num1);
			++num1;
		}
		
		System.out.println("USING DO-WHILE LOOP");
		
		int num2 = 1;
		
		do {
			System.out.println("Number: " + num2);
			++num2;
		} while (num2 <= 10);
	}
}
