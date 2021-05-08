/*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
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
			for(int j = rows-1; j >= i; j--)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print(k+" ");
			
			System.out.println();
		}
	}

}