/*
Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]


*/

class Main{
	public static void main(String[] args){
		//A.
		int x=2, y=0;
		y = x*x+ 3*x -7;
		System.out.println(y); //3
		
		
		//B.
		int y1 = 0;
		y1 = x++ + ++x; //x= 2---> 2 + 4
		System.out.println(y1);
		
		//C.
		int z = 0;
		z = x++ - --y - --x + x++; // 4 - 2 - 4 + 4
						//inc/dec:    5   2	  4	   5
		System.out.println("x: "+x); //5
		System.out.println("y: "+y); //2
		System.out.println("z: "+z); //2
		
		//D.
		boolean z1;
		boolean a= true; 
		boolean b=false;
		//System.out.print(Boolean.parseBoolean(a));
		z1 = a && b || !(a || b); //true && false || !(true)--> false|| false --> false
		System.out.println("z1 "+z1);
		
		/*String answer = "Y";
   		System.out.print(answer.equals("Y"));
   		return answer.equals("Y");*/
		
		
	}

}