// Program to calculate Simple Interest: SI = (P × T × R) / 100
import java.util.Scanner;

class SimpleInterestCalculator {
    float p;
    float t;
    float si;
    static float r;
    static {
        r = 15.2f;
    }
    Scanner sc = new Scanner(System.in);

    void acceptInput() {
        System.out.print("Enter the Amount: ");
        p = sc.nextFloat();
        System.out.print("Enter the Time (in years): ");
        t = sc.nextFloat();
        r = 15.2f;
    }

    void calculate() {
        si = p * t * r / 100;
    }

    void disp() {
        System.out.println("The Simple Interest = " + si);
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        SimpleInterestCalculator abc = new SimpleInterestCalculator();
        abc.acceptInput();
        abc.calculate();
        abc.disp();
    }
}
