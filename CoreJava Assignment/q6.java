/*Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/


import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		float pi = 3.14F;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius: ");
		float radius = sc.nextFloat();
		
		System.out.println("Area "+(double)(pi*radius*radius));
		System.out.println("Circumference "+(2* pi*radius)); //double = 15.700000762939453, float=15.700001
		
		
		
	}
}