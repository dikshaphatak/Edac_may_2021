/*
123456789   
    A    1
   A B   2
  A B C  3
 A B C D  4 
A B C D E 5

*/

class Main{
	public static void main(String args[])
	{
		int alpha = 64;
		
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 4; j>= i; j--)
				System.out.print(" ");
			for(int k = 1; k<= i; k++)
				System.out.print((char)(alpha+k)+" ");
			System.out.println();
		}
	
	}
}