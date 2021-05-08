/*
*
** 
***
****
*****
****
***
** 
*

*/

class Main{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows for pattern: ");
		int rows = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print("*");
		
			System.out.println();
		}
	
		for(int i =1; i <= 4; i++)
		{
			for(int j = 4; j >= i; j--)
				System.out.print("*");
		
			System.out.println();
		}		
	}
}