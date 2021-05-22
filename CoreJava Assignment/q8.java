/*
Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class
*/


import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args)
	{
		InOut input = new InOut();
		float principle  = input.getValue("Enter the amount: ");
		float rate  = input.getValue("Enter the rate: ");
		float years  = input.getValue("Enter no of years: ");
		float result = InOut.getInterest(principle, rate, years);
		System.out.print("Simple Interest = "+result);
		
		
		
	}
	
}


class InOut{
	Scanner sc = new Scanner(System.in);
	
	public float getValue(String Enter){
		System.out.println(Enter);
		float value = sc.nextFloat(); 
		return value;
		
	}
	static float getInterest(float principle, float rate, float years){
			float interest = (principle*rate*years)/100;
			return interest;
			
		}
	
	
}