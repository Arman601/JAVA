import java.util.Scanner;

public class Subarray {
    public static void subArray(int arr[], int size) {
        for (int i = 0; i < arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                System.out.println(arr[j]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value ");
        int size = sc.nextInt();
        subArray(arr, size);
        sc.close();
    }
}
