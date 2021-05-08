/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
*/


import java.util.Scanner;

public class Operators{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("First number: " +a);
		System.out.println("Second number: " +b);
		
		//Addition
		System.out.println("Addition: " +(a + b));
		
		//Subtraction
		System.out.println("Subtraction: " +(a - b));
		
		//Multiplication
		System.out.println("Multiplication: " +(a * b));
		
		//Division
		System.out.println("Division: " +(a / b));
		
		//MOD
		System.out.println("Modulo: " +(a % b));

		
	}
}