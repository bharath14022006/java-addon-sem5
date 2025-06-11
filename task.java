package day_3_task;

class cartitem{
	private String name;
	private int quantity;
	private double price;
	 double total;
	
	cartitem(String name,int quantity,double price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		
	}
	public String getname() {
		return name;
		
	}
	public int getquantity() {
		return quantity;
	}
	public double getprice() {
		return price;
	}

	
	
}
public class task {

	public static void main(String[] args) {
		cartitem a1=new cartitem("headphone",2,1000);
		System.out.println("name:"+a1.getname());
		System.out.println("quantity:"+a1.getquantity());
		System.out.println("price:"+a1.getprice());
		System.out.println("total:"+(a1.getquantity()*a1.getprice()));
		
	}

}
