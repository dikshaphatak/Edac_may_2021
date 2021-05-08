/*
    *
   ***
  ***** 
 *******
*********
 *******
  ***** 
   ***
    *
*/

class Main{
	public static void main(String args[]){
		
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 5; j > i; j--)   //Spaces
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++)  //2*1-1= 1<=1	     *
			{								//2*2-1= 3			***
				System.out.print("*");		// 2*3-1= 5		   *****
			}								//2*4-1= 7		  *******
			System.out.println();			//2*5-1= 9       *********
		}
		//lower part of diamond
		for(int i = 4; i > 0; i--)
		{
			for(int j = 1; j <= 5-i; j++) 
				System.out.print(" ");
				
			for(int k = 1; k <= 2*i-1; k++)
			    System.out.print("*");
			System.out.println();
			
		}
	}
}