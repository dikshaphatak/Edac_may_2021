/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/
import java.util.Scanner;
class Main{
	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the number of rows for pattern: ");
	int rows = sc.nextInt();
	sc.close();
	
	for(int i = 1; i<= rows; i++)
	{
		for(int j = rows-1; j>=i; j--)
			System.out.print(" ");
		for(int k= 1; k<= i; k++)
			System.out.print(i+" ");
		System.out.println();
	}
	
	}

}