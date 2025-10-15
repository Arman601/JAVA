abstract class Animal {
    abstract void eat();

    abstract void run();
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dogs are eating: ");
    }

    @Override
    void run() {
        System.out.println("dogs are running ");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cats are eating: ");
    }

    @Override
    void run() {
        System.out.println("cats are running: ");
    }

}

public class A {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
        Cat c = new Cat();
        c.eat();
        c.run();
    }
}
