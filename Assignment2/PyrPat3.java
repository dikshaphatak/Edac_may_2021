/*

		*
	   * *
	  * * * 
     * * * *
    * * * * * 
   * * * * * * 
  * * * * * * *
 * * * * * * * *        
* * * * * * * * *
*/
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows for triangle pattern: ");
		int rows = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= rows; i++)  	// i   j                    k            print
		{									// 1   5,4,3,2,1(false)     1,2 \n          ____*_
			for(int j = rows; j > i; j--)  //  2   5,4,3,2              1,2,3           ___*_*_
			{								// 3   5,4,3                1,2,3,4         __*_*_*_
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}