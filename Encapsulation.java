import java.util.*;

class Restaurant01 {
    private int id;
    private String name;
    private long phone;
    private String address;

    public Restaurant01(int id, String name, long phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // getter Method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Enter restaurant details in the format: id,name,phone,address");
        Scanner sc = new Scanner(System.in);
        String details = sc.nextLine();
        String arr[] = details.split(",");
        Restaurant01 abc = new Restaurant01(Integer.parseInt(arr[0]), arr[1], Long.parseLong(arr[2]), arr[3]);
        // Display restaurant details
        System.out.println(abc.getId());
        System.out.println(abc.getName());
        System.out.println(abc.getPhone());
        System.out.println(abc.getAddress());
        sc.close();
    }

}
