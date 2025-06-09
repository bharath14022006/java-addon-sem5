package day3;

public class salary {
	
	void sal(int amt) {
			int total=10000;
				System.out.println("your salary full salary"+" "+total);
				
				
	}
	void sal(int amt, int hour) {
	 int totalpart=amt*hour;
	 System.out.println("total parttime"+"  "+totalpart);
		
		
}
	void sal(int amt,int hour,int bonus) {
		int totalfree=(amt*hour)+bonus;
		System.out.println("total for freelancers"+"  "+totalfree);
	}

	public static void main(String[] args) {
		salary in=new salary();
		//in.salary(0);
		//in.salary(1000, 1, 100);
		//in.salary(1000, 1);
	}
