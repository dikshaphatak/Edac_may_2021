/*Write a Java program to divide two numbers and print on the screen*/

import java.util.Scanner;

public class Divide{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	if(num1 > num2)
		System.out.println("Division of two number is :" +(num1/num2));
	else
		System.out.println("Division of two number is :" +(num2/num1));
	}
}