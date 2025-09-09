
//write a pgm to find the smallest  Element present in the array also find the index ?

import java.util.Scanner;
public class FindSmallElement {

	public static int smallElement(int arr[]) {
		int min = arr[0];
		int index = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				
				index = i;
			}
		}
		return min;
	}
//		return index;
		
		public static int findLargestElementIndex(int arr[]) {
			int min = arr[0];
			int index = 0;
			for(int i = 0 ; i<arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
					
					index = i;
				}
			}
			return index;
		

	}
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the array elements ");
for(int i = 0; i<arr.length; i++) {
	arr[i] = sc.nextInt();
}
int result = smallElement(arr);
System.out.println("The smallest  element = " +result);
int result2 = findLargestElementIndex( arr);
System.out.println("The index value = " +result2);

sc.close();
	}

}
