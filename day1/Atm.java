
package project;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   System.out.println("enter the pin ");
                   Scanner with=new Scanner(System.in);
                   int a=with.nextInt();
               
                   if(a==12) {
                	    System.out.println("enter the amount ");
                	      
                        int b=with.nextInt();
                	   if(b<=1000) {
                		   System.out.println("withdrawn successfully");
                	   }
                	   else {
                		   System.out.println("insufficient amount");
                	   }
                   }
                   else{
                	   System.out.println("inncorrect pin");
                   }
	}

}
