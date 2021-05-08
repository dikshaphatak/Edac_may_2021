/*
    *
   ***
  ***** 
 *******
*********
*/

class Main{
	public static void main(String args[]){
		
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 5; j > i; j--)   //Spaces
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) //Left triangle
			{
				System.out.print("*");
			}
			for(int l= 2; l <= i; l++)  //Right triangle
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}