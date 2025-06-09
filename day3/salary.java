package day3;

public class salary {
	
	void salary(int salary) {
			int total=10000;
				System.out.println("your salary full salary"+" "+total);
				
				
	}
	void salary(int salary,int hour) {
	 int totalpart=salary*hour;
	 System.out.println("total parttime"+"  "+totalpart);
		
		
}
	void salary(int salary,int hour,int bonus) {
		int totalfree=(salary*hour)+bonus;
		System.out.println("total for freelancers"+"  "+totalfree);
	}

	public static void main(String[] args) {
		salary in=new salary();
		//in.salary(0);
		//in.salary(1000, 1, 100);
		//in.salary(1000, 1);
	}
