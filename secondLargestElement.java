import java.util.Scanner;

public class SecondLargestElement {
    public static int largestElement(int arr[]) {
        int p = Integer.MIN_VALUE;
        int vp = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > p) {
                vp = p;
                p = arr[i];
            } else if (arr[i] == vp) {
                vp = arr[i];
            }
        }

        return vp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int result = largestElement(arr);
        System.out.println("The second largest element = " + result);
        sc.close();
    }
}
