/*
 * Create a Program that has the following features. 
	Function that takes an int Array as arg and return the max value in the array. 
	Function that takes an int Array as arg and return the min value in the array.
	Function that takes an int array as arg and return the avg value in the array. 
	Function that takes an Array(of any kind) as arg and return an Array object which contain the elements in the reverse order.
	Let the name of the function be called Reverse. 
 * 
 * */
 
import java.util.Scanner;
 
class Program{
	public static void main(String[] args){
		//Program obj = new Program();
		Calculation obj1 = new Calculation();
		
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] A1 = new int[n];
		
		for(int i = 0; i<A1.length; i++)
		{
			A1[i]=sc.nextInt();
			System.out.print(A1[i]+" ");
		}
		int min1 = obj1.min(A1);
		System.out.println("minimum: "+min1);
		
		int max1 = obj1.max(A1);
		System.out.println("max: "+max1);
	
		
		System.out.println("AVG "+obj1.avg(A1));
		
		obj1.reverse(A1, n);
	}
	
	
}

class Calculation{
	
	protected int min(int[] A1){
		int min = A1[0];
		
		for(int i=1; i<A1.length; i++)
		{
			if(min>A1[i])
			{
				min= A1[i];
			}
		}
		return min;
	}	
	
	int max(int[] A1){
		int max = A1[0];
		
		for(int i=1; i<A1.length; i++)
		{
			if(max<A1[i])
			{
				max= A1[i];
			}
		}
		
		return max;
	}
	
	public double avg(int[] A1){
		double sum = 0.0;
		int n = A1.length;
		for(int i = 0; i<A1.length;i++){
			
			sum = sum +A1[i];
		}
		double avgg = (double)(sum / n);
		return avgg;
	}
	
	
	void reverse(int[] A1,int n){
		
		int[] temp = new int[n];   //5----> 0 1 2 3 4
		
		for(int i=0; i<A1.length; i++)
		{							// 4	3 		2		1		0
			temp[i] = A1[n-1-i]; 	//5-1-0; 5-1-1; 5-1-2;	5-1-3;	5-1-4
			
		}
		
		for(int i = 0; i<temp.length; i++)
		{
			System.out.print(temp[i]+ " ");
		}
		
	}
}
 
 
 