
//factor nikal kr phir check kr lena hai factor agr 2 rha kisi no ka to wo prime hai nhi to not prime; (factor nilkalte hai n%i se)  (one method)


import java.util.Scanner;

public class prime01 {
	public static String prime(int n ){
		int count = 0;
		for(int i= 1; i<=n; i++) {
			if( n%i == 0 ) {
			count++;
			}
		}
//		return  count;
		if(count == 2) {
			return  "Prime";
		}
		else {
			return "Not prime";
		}
		
	}
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	prime( n );
	String   primeNo = prime( n );
	System.out.println(primeNo);
	
	sc.close();
}
}
