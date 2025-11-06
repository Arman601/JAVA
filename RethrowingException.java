//Rethrowing exception :- this is the second way of handle exception in java
//yha humlog rethrow krte hai  exception ko jo method  call krega  whi  exception krega 

import java.util.Scanner;

class  Arman{
	public static void  division()  throws Exception  { 
		Scanner sc = new  Scanner(System.in);
try {
	System.out.print("Enter the first number:  ");
	int a = sc.nextInt();
	System.out.print("Enter the second number:  ");
	int b = sc.nextInt();
	int c = a / b;
	System.out.println("Result = " +c);
}
catch(Exception e ) {
	throw e; //throw ke bad koi line execue krna hai to finally  block ka use krna hoga 
	

}
finally {
	System.out.println("Pgm successfully executed: ");
}
		
	}
}


public class Calculation01 {
	

	public static void main(String[] args) {
		Arman a  = new Arman();
		
		
	try {
		a.division();
	}
	catch(Exception e) {
		System.out.print("A number cant div by zero: ");
	}

	}

}
