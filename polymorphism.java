class Parents {
    void age() {
        System.out.println("The parents age is...");
    }
}

class Child1 extends Parents {
    @Override
    void age() {
        super.age();// ye parents ke method ko call krne ke liye
        System.out.println("The first child is 16 years old: ");
    }
}

class Child2 extends Parents {
    void age() {
        System.out.println("The second child is 18 years old: ");
    }
}

class Child3 extends Parents {
    @Override
    void age() {
        System.out.println("The third child is 20 years old: ");
    }

}

public class Polymorphism01 {
    public static void main(String[] args) {
        Parents c1 = new Child1(); // the child reference is parents
        Parents c2 = new Child2();
        Parents c3 = new Child3();
        c1.age();
        c2.age();
        c3.age();

    }
}
