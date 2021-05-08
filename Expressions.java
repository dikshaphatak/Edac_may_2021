/*Write a Java program to print the result of the following operations*/

/*
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
*/
/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889*/

public class Expressions{
	public static void main(String args[]){
	
	System.out.println("Expression1 :" +(-5 + (8 * 6)));
	System.out.println("Expression2 :" +((55 + 9) % 9));
	System.out.println("Expression3 :" +(20 + (-3 * 5)/8));
	System.out.println("Expression4 :" +(5 + 15/3 * 2 - 8 % 3));
	System.out.println("Expression5 :" +((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
	
	}
}