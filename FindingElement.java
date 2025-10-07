
import java.util.Scanner;

public class FindElements {
    public static int sortedArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // order breaks here
                return arr[i + 1];
            }
        }
        return -1; // array fully sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sortedArray(arr);
        System.out.println("First element breaking order: " + result);
        sc.close();
    }
}
