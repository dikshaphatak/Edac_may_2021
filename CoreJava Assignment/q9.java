/*	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them
*/


import java.util.Scanner;
class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int years = 0, months =0, days;
		years =n/365;
		
		temp =n%365;
		months = temp/30;
		days = temp%30;
		System.out.print(n+" days converted into "+years+" years "+months+" months "+days+" days");
	}
}