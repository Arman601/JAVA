import java.util.Scanner;

// we can handle exception inside main  method and also inside andother class and another method 
class A {
    public void method1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Established");
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);

        System.out.println("Connection terminated");
    }
}

class B {
    public void method2() {
        try {
            A a = new A();
            a.method1();
        } catch (Exception e) {
            System.out.println("Enter valid input: ");
        }

    }
}

class C {

    public void method3() {
        B b = new B();
        b.method2();
    }
}

class ExecptionConcept {
    public static void main(String args[]) {
        C c = new C();
        c.method3();
    }
}
