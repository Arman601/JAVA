
//Find repeated largest element in sorted array
import java.util.Scanner;

public class LargestElement {
    public static void FindLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max && arr[i] == arr[i + 1]) {
                max = arr[i];
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("out");
        FindLargest(arr);
        sc.close();
    }
}
