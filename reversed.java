import java.util.Scanner;

class Reersed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        System.out.println("The reversed number = " + rev);
        sc.close();
    }
}
