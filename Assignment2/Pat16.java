/*				i 		j
5               1		1
5 4 			2		1 to 2
5 4 3			3		1 to 3
5 4 3 2			4		1 to 4
5 4 3 2 1		5		1 to 5

*/

import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows for the pattern: ");
		int rows = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j<= i; j++)
				System.out.print((rows+1)-j+" ");
			System.out.println();
		}
	}
}