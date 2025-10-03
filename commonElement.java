import java.util.Scanner;

public class RepeatedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        // Read second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // Print common elements (duplicates may appear if repeated in arrays)
        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
