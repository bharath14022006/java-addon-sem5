package day3;

public class singlelevel {
	
	void Message() {
		System.out.println("sending!!!");
	}
	
}

	class subclass extends  singlelevel {
		void View() {
			System.out.println("recevied!!!");
		}
		
	
	}
	class  main{

	public static void main(String[] args) {
		subclass r1=new subclass();
		r1.Message();
		r1.View();

	}


}