import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = (n+1)/2;
		int b = a;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==(n+1)/2||j==a||(i>1&&j==b))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			a--;
			b++;
			
			System.out.println();
		}
		
	
	}
	
}