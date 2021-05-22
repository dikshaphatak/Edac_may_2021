/*
Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		//Calculate obj = new Calculate();
		Scanner sc = new Scanner(System.in);
		
		int[] subMarks = new int[5];	
		int sum= 0;
		double percentage = 0F;
		
		System.out.println("Enter marks of each subject out of 100 ");
		for(int i= 0; i<5; i++)
		{
			subMarks[i] = sc.nextInt();
			sum = sum+subMarks[i];
		}
		System.out.println	(sum);
		percentage = (sum / 5);
		
		
		System.out.println("percentage marks = "+percentage+"%");
	}
	
}
