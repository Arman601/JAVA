//Find the first element in a sorted array that is not in sorting order.

import java.util.Scanner;

public class FindElement {
    public static void sortedElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("First unsorted element = " + arr[i + 1]);
                return;
            }
        }
        System.out.println("Array is completely sorted");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Output:");
        sortedElement(arr);
        sc.close();
    }
}
