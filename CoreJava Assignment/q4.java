/*Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .*/


class Main{
	public static void main(String[] args){
		
		byte b1=-128,b2=127;
		byte sum = (byte)(b1+b2);
		System.out.println(sum);
	
	}
}