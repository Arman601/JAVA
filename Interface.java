interface Animal {
    void eat();

    void run();

    void bark();
}

class Dogs implements Animal {
    @Override
    public void eat() {
        System.out.println("Dogs are eating");
    }

    @Override
    public void run() {
        System.out.println("Dogs are running");
    }

    @Override
    public void walk() {
        System.out.println("Dogs are barking ");
    }
}

public class A {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat();
        d.run();
        d.walk();
    }
}
