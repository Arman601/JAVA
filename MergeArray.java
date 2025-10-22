//Merge  three array in a single array 
package practice;

import java.util.Scanner;

public class array001 {
	
	public static void mergeThreeArray(int arr1[], int arr2[], int arr3[]){
		
		int len = arr1.length+arr2.length+arr3.length;
		int res[] = new int[len];
	 int k = 0;
		for(int i = 0; i<arr1.length; i++) {
			res[k++] = arr1[i]; 
		}
		for(int i = 0; i<arr2.length; i++) {
			res[k++] = arr2[i];
		}
		for(int i = 0; i<arr3.length; i++) {
			res[k++] = arr3[i];
		}
		//print res array
		for(int i = 0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size: ");
		int n = scan.nextInt();
		int arr1[] = new int[n];
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.print("Enter the second array size: ");
		int m = scan.nextInt();
		int arr2[] = new int[m];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		System.out.print("Enter the third array size: ");
		int o = scan.nextInt();
		int arr3[] = new int[o];
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = scan.nextInt();
		}
		mergeThreeArray(arr1, arr2, arr3);
 	}

}
