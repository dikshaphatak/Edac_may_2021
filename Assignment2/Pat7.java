/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 4; j >= i; j--)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print(k+" ");
			
			System.out.println();
		}
	}

}