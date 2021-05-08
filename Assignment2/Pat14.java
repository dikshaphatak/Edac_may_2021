/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nuber of rows for pattern: ");
		int rows = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = rows; j >= i; j--)
				System.out.print((rows+1)-j+" ");
			System.out.println();
		}
	
	}

}