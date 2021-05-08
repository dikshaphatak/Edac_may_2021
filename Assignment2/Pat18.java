/*			i 		j
A B C D E	1		5-1
A B C D		2		5-2
A B C		3		5-3
A B			4		5-2
A			5		5
*/



class Main{
	public static void main(String args[])
	{
		int alpha = 70;
		
		for(int i= 1; i <= rows; i++)
		{
			for(int j = rows; j >= i; j--)
				System.out.print((char)(alpha-j)+" ");
			System.out.println();
		}
	}

}