import java.util.*;

public class Swapp{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		System.out.println("num1: " +a);
		System.out.println("num2: " +b);
		temp = a; // a =10, b = 20; then temp = 10
		a = b; //a = 20
		b = temp; //b=10
		
		System.out.println("--------After Swapping------");
		System.out.println("num1: " +a);
		System.out.println("num2: " +b);
		
		
		//Another method
		
		System.out.println("--------Another method------");
		System.out.print("Enter two numbers: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("num1: " +i);
		System.out.println("num2: " +j);
		
		i = i + j; //i =10, j= 20; i= 30
		j = i -  j; //j = 30 - 20= 10
		i = i - j; // i = 30 - 10= 20
		
		System.out.println("--------After Swapping------");
		System.out.println("num1: " +i);
		System.out.println("num2: " +j);
		
		
		
	}
}