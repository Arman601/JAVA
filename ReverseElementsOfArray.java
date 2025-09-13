//Write a program to print numbers present in each index in an array in reverse order.

import java.util.Scanner;

public class array11 {
	public static void reverseArrayElements(int arr[]){
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Array:");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i= 0; i<arr.length; i++) {
		arr[i]  = sc.nextInt();
		
	}
	 reverseArrayElements( arr);
}
}
