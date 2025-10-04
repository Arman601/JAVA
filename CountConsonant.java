import java.util.*;

public class CountConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String n = sc.nextLine();
        int consanant = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    consanant++;
                }
            }
        }
        System.out.println(consanant);
        sc.close();
    }
}
