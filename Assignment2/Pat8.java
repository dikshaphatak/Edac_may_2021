/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

class Main{
	public static void main(String[] args){
		for(int i= 1; i<= 5; i++)
		{
			for(int j = 4; j >=i; j--)
				System.out.print(" ");
			for(int k = 1; k<=i; k++)
				System.out.print(k+(5-i)+" "); //what to print???
			System.out.println();
		}			
	}
}