package practice;


class Laptop{
	private String name;
	 private float price;
	 
	 public Laptop(String name , float price){  //constructor
		  this.name = name;
		  this.price = price;
	 }
	 public String getName() {
		 return name;
	 }
	 public float getPrice() {
		 return price;
	 }
	 
	 
	 
}
public class constructor {

	public static void main(String[] args) {
	
   Laptop abc = new Laptop("Lenovo",55.5f);
   System.out.println(abc.getName());
   System.out.println(abc.getPrice());
	}

}
