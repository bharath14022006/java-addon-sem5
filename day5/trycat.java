package d5;

public class Trycat {

	int[] mynumbers = {1,2,3};
	try {
	System.out.println(mynumbers[10]);
}
catch(Exception e){
 System.out.println("Error Checked");	
	
}
	finally {
	System.out.println("Try catch is finished");
	
	}
}
}
