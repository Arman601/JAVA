import java.util.Scanner;

//Custom Exception class(custom class obj programmer should create)
class InvalidPinException extends Exception {

}

class ATM {
    int pin = 7984;
    int enteredPin;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        enteredPin = sc.nextInt();

    }

    void virifyPin() throws Exception {
        if (enteredPin == pin) {
            System.out.println("Collect your money: ");
        } else {
            System.out.println("Inalid");
            InvalidPinException ipe = new InvalidPinException();
            throw ipe;

        }
    }
}

class Bank {
    void init() {
        ATM a = new ATM();
        // Here we used neseted try catch block
        try {
            a.acceptInput();
            a.virifyPin();
        } catch (Exception e1) {
            try {
                a.acceptInput();
                a.virifyPin();
            } catch (Exception e2) {
                try {
                    a.acceptInput();
                    a.virifyPin();
                } catch (Exception e3) {
                    System.out.println("Your card is blocked! ");
                }
            }
        }
    }
}

public class RBI {
    public static void main(String args[]) {
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        Bank sbi = new Bank();
        sbi.init();
    }
}
