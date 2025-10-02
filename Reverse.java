import java.util.Scanner;

public class Reverse {
    public static String palindrom(String n) {
        int i = 0;
        int j = n.length() - 1;
        while (i < j) {
            if (n.charAt(i) == n.charAt(j)) {
                i++;
                j--;
            } else {
                return "Not palindrom";
            }
        }
        return "palindrom";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is palindrome: ");
        String n = sc.nextLine();
        String res = palindrom(n);
        System.out.println(res);
        sc.close();
    }
}
