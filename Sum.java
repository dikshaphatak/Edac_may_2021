/*Write a Java program to print the sum of two numbers.*/

import java.util.Scanner;

public class Sum{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("Sum of two number is :" +(num1+num2));
	}
}