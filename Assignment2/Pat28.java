/*				i		j
    *****		1		5-9
   *****		2		4-8
  *****			3		3-7
 *****	    	4		2-6
*****			5		1-5
*/

import java.util.Scanner;

class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows for pattern: ");
		int rows = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = rows-1; j >= i; j--)
				System.out.print(" ");
			
			for(int j = 1; j <= rows; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}