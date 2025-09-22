
//Find pairs of numbers from the array whose product is equal to a given target value.
import java.util.Scanner;

public class pairsOfNumber01 {
    public static void productOfNo(int arr[], int k) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                product = arr[i] * arr[j];
                if (k == product) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target product: ");
        int k = sc.nextInt();
        System.out.println("The product");
        System.out.println("Pairs with product " + k + ":");
        productOfNo(arr, k);
        sc.close();
    }
}
