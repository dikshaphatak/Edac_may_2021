/*
    E
   D E
  C D E
 B C D E
A B C D E
*/
class Main{
	public static void main(String args[])
	{
	int alpha = 69;
	
	for(int i = 1; i<=5; i++)
	{
		for(int j= 4; j>= i; j--)
			System.out.print(" ");
		for(int k = 1; k<= i; k++)
			System.out.print((char)(k+(alpha-i))+" ");
		System.out.println();
	}
	
	
	}
}