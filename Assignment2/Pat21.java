/*
*****
****
***
**
*

*/
import java.util.Scanner;

class Main{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows for pattern: ");
		int rows = sc.nextInt();
		
		sc.close();
		for(int i = 1; i <= rows; i++)
		{
			for(int j = rows; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}