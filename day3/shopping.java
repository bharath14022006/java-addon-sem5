package day3;

public class shopping {

	
		
		void add_to_cart(String category,int price) {
			System.out.println("your category:"+category);
			System.out.println("item price::"+price);
		}
		void add_to_cart(String category,int price,int quantity) {
			int total=price*quantity;
			System.out.println("total price:"+ total);
		}
		public static void main(String[] args) {
			shopping in=new shopping();
			in.add_to_cart("shirt", 1000);
			in.add_to_cart("shrits", 1000, 2);
	}

}
