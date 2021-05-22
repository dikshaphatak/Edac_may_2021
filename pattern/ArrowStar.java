/*
  123456789
1     *
2      *               
3       *  
4        *
5 *********
6        *
7       *
8      *
9     *


    *
   *
  *
 *
*********
 * 
  *
   *
    *


*/

import java.util.Scanner;

class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= (n+1)/2;			//9/2+1= 5
		for(int i=1; i<=n; i++)//9
		{
			for(int j=1; j<=n; j++)
			{
				if(i== (n+1)/2 || j==a)
				
					System.out.print("*");					//--
				else
					System.out.print(" ");
				
			}
			if(i<(n+1)/2)		//4
				a++;		//5,6,7
			else
				a--;
			
			System.out.println();
		}
		System.out.println();
		
		
		a = (n+1)/2;
		for(int i=1; i<=n; i++)//9
		{
			for(int j=1; j<=n; j++)
			{
				if(i==(n+1)/2 || j==a)
				
					System.out.print("*");					//--
				else
					System.out.print(" ");
				
			}
			if(i>=(n+1)/2)		//5
				a++;		//5,6,7
			else
				a--;
			
			System.out.println();
		}
		
		
	}

}


//-----------------------------------------

/* import java.util.Scanner;

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
 */
//------------------------------------