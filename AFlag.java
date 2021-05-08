class Main {

	public static void main(String args[])
	{
		for(int i = 1; i <= 9; i++)
		{
			if(i % 2 != 0)
			{
				for(int j = 1; j<= 6; j++)
					System.out.print("* ");
				for(int k= 1; k <= 15; k++)
					System.out.print("=");
				
			}
			else{
				for(int j = 1; j <= 5; j++)
						System.out.print(" *");
				
				System.out.print("  ");
				
				for(int k= 1; k <= 15; k++)
					System.out.print("=");	
			}
			System.out.println();
			
		}
		
		for(int i = 1; i <= 6; i++)
			{
				for(int j = 1; j <= 27; j++)
					System.out.print("=");
				System.out.println();
			}
		
	}
}