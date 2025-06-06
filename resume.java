package day2;
import java.util.Scanner;
public class resume {

	public static void main(String[] args) {
	System.out.println("enter your name");
	Scanner name=new Scanner(System.in);
	String a= name.next();
	System.out.println("enter your contact number");
	Scanner num=new Scanner(System.in);
	long b=num.nextLong();
	System.out.println("enter your email ID");
	Scanner email=new Scanner(System.in);
	String c= email.next();
	System.out.println("enter your address");
	Scanner add=new Scanner(System.in);
	String d= add.next();
	System.out.println("enter your skill");
	Scanner skill=new Scanner(System.in);
	String e= skill.next();
	System.out.println("enter your project description");
	Scanner dis=new Scanner(System.in);
	String f= dis.next();
	System.out.println("name"+"  "+a+"   "+ "contact number"+b+"   "+ "email ID"+c+"   "+ "addressr"+d+"   "+ "skill"+e+"   "+ "project description"+f);
	}

}
