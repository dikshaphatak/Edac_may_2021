/*Write a Java program that takes two numbers as input and display the product of
two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;

public class Multiply{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("First number: " +num1);
	System.out.println("Second number: " +num2);
	sc.close();
	System.out.print("Result: " +(num1 * num2));
	}
}
	