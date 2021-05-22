import java.util.Scanner;
class Main{
	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=(n+1)/2;
		int b=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==(n+1)/2||j==a)
				{
					System.out.print(b);
				}
				else 
					System.out.print(" ");
				
			}
			if(i<(n+1)/2)
			{
				a++;
			    b++;
			}
			
			else{
				a--;
				b--;
			}
			
				
			
			
				
			System.out.println();
		}
	}
}