/*
1234567890123456789012345678901234567890123
******  ***** *   *  *****  *     *  *****
 *    *   *	  *  *	*		*	  * *     *
 *    *   *   * *	*		*	  * *     *
 *    *   *   **	 *****  ******* *******
 *    *	  *	  * * 	      *	*     * *     *
 *    *	  *	  *  *		  * *     * *     *
******  ***** *   *	 *****  *     * *     *
1234567890123456789012345678901234567890123 
 */


import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//int n = scan.nextInt();
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=43; j++){
				
				if((i==1&&j<7)||(i==7&&j<7)||j==2||i!=1&&i!=7&&j==7)
				{
					System.out.print("*");//D
				} 
				else if((i==1&&j>8&&j<14)||(i==7&&j>8&&j<14)||j==11)
				{
					System.out.print("*");//I
				}
				else if(j==15||(i==4&&j==16)||((i==3||i==5)&&j==17)||((i==2||i==6)&&j==18)||((i==1||i==7)&&j==19))
				{
					System.out.print("*");//K
				}
				else if((i==1&&j>21&&j<27)||(i==7&&j>21&&j<27)||(i==4&&j>21&&j<27)||(j==21&&i>1&&i<4)||(j==27&&i>4&&i<7))	{
					System.out.print("*");//S
				}			
				else if(i==4&&j>28&&j<36||j==29||j==35){
					System.out.print("*");//H
				}
				else if((i==4&&j>36&&j<44)||(i==1&&j>37&&j<43)||i!=1&&j==37||i!=1&&j==43){
					System.out.print("*");//A
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	
		
	}
}
