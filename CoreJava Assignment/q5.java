/*
Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.
*/

import java.io.Console;
class Main{
	public static void main(String[] args){
		//String userName = System.console().readLine();
		System.out.println("Welcome "+System.console().readLine());
	}
}