
//Print all pairs of numbers from the input array whose sum is greater than the sum value k.
import java.util.Scanner;

public class sum {
    public static void allPairsOfNumber(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] > k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        allPairsOfNumber(arr, k);
        sc.close();
    }
}
