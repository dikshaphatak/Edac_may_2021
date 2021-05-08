/*Write a Java program to print the area and perimeter of a circle.*/

import java.util.Scanner;

public class Circle{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the radius of circle: ");
	double r = sc.nextDouble();
	sc.close();
	
	System.out.println("Perimeter of circle: " +(2 * 3.14 * r));
	System.out.println("Area of circle: " +(3.14 * r * r));
	}
}