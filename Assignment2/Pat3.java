/*

1 2 3 4 5
*					
* *
* * *
* * * *
* * * * *
*/

import java.util.Scanner;
class Main{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
			}
		
	}

}