//Has-A relationship
class Charger {
    private String name;
    private String model;

    Charger(String name, String model) {
        this.name = name;
        this.model = model;

    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}

class Os {
    private int price;
    private String version;

    Os(int price, String version) {
        this.price = price;
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public String getVersion() {
        return version;
    }
}

class Mobile {
    Os o = new Os(5505, "3.4A");

    void chargerDetails(Charger c) {
        c.getName();
        c.getModel();
    }
}

public class A {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger c = new Charger("Samsumg", "s20");

        System.out.println("Price: " + m.o.getPrice());
        System.out.println("version:" + m.o.getVersion());
        System.out.println("Name: " + c.getName());
        System.out.println("Model:" + c.getModel());
    }
}
