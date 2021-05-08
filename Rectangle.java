/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.util.Scanner;

public class Rectangle{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length of rectangle: ");
	double l = sc.nextDouble();
	
	System.out.print("Enter breath of rectangle: ");
	double b = sc.nextDouble();
	
	sc.close();
	
	System.out.println("Area of rectangle: " +(l * b));
	System.out.println("perimeter of rectangle: " +(2 * (l + b)));
	}
}