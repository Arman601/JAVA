// Write a program that finds the maximum sum among all the pairs of elements in a given array of integers without sorting.
import java.util.Scanner;

public class sum {
    public static int secondLargestElement(int arr[]) {
        int p = Integer.MIN_VALUE;
        int vp = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > p) {
                vp = p;
                p = arr[i];

            } else if (arr[i] > vp ) {
                vp = arr[i];
            }
        }

        sum = p + vp;
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int res = secondLargestElement(arr);
        System.out.println("Max sum = " + res);
        sc.close();
    }
}
