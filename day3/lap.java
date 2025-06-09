package day3;

public class lap {
	String model;
	int size;
	

	 lap(String model,int size) {
		this.model=model;
		this.size=size;
	}
	lap(lap copy){
		this.model=copy.model;
		this.size=copy.size;
	}
	
	void Display(){
		System.out.println("this is"+" "+model+"  "+size+"gb");
		
	}

	public static void main(String[] args) {
		System.out.println("laptop type");
		lap ref=new lap("lenova",5);
		ref.Display();
		System.out.println("laptop type");
		lap ref1=new lap("itel",10);
		ref.Display();
		System.out.println("dublicate");
		lap ref2=new lap("itel",10);
		ref2.Display();

	}

}
