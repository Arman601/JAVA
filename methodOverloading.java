package overLoading;


class cal{
	  void add(int a, int  b){
		System.out.println("this is the integer value");
	}
	 void add(int a, int  b ,int c ){
		System.out.println("this is the integer value");
	}
}
public class overloading01 {
	

	public static void main(String[] args) {
cal abc = new cal();
		abc.add(4,4);
		abc.add(4,4);
	}

}
