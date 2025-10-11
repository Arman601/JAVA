import java.util.Scanner;

class Pojo {
    private String name;
    private int roll;
    private String address;

    public Pojo() { // Zero parameter constructor
        System.out.println("Student Details: ");
    }

    public Pojo(String name, int roll, String address) { // parameter constructor
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public void setName(String name) {// setter
        this.name = name;
    }

    public String getName() {// getter
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the roll: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        Pojo p1 = new Pojo(name, roll, address); // object creation
        Pojo p2 = new Pojo(); // calling zero parameter constructor
        System.out.println("Name = " + p1.getName());
        System.out.println("Roll = " + p1.getRoll());
        System.out.println("Address = " + p1.getAddress());
        sc.close();
    }
}
