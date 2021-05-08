/*Write a Java program that takes three numbers as input to calculate and print the average 
of the numbers*/

import java.util.Scanner;

public class Average{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	System.out.println("Number1: "+num1);
	System.out.println("Number2: "+num2);
	System.out.println("Number3: "+num3);
	sc.close();
	
	double avg = (num1 + num2 + num3)/3;
	System.out.println("Average of three number: " +avg);
	}
}