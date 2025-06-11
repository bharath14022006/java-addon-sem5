package d5;
 import java.io.FileWriter;
 import java.io.IOException;
public class task3 {

	public static void main(String[] args) {
	try {
		FileWriter mywriter= new FileWriter("D:\\new1.txt");
		mywriter.write("bharath is here");
		mywriter.close();
		System.out.println("successfully wrote");
	
	}catch(IOException e) {
		System.out.println("file not exist");
		
	}

	}

}
