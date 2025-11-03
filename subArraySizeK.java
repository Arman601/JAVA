import java.util.Scanner;

public class array11 {
	public static void sum(int arr[], int k) {
		for(int i = 0; i<=arr.length - k;i++) {
			for(int j = i; j<i+k; j++) {
				System.out.println(arr[j]);
			}
			System.out.println();
		}
	}
	public  static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the array  elements");
		for(int i =  0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the k");
		int k = sc.nextInt();
		
		sum( arr, k);
			
		}
	

}
