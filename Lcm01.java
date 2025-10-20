import java.util.Scanner;

public class Lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a = sc.nextInt();
        System.out.print("Enter the second Number:");
        int b = sc.nextInt();
        for (int i = 3; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
