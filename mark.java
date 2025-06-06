package day2;
import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score (0-100): ");
        int a = scanner.nextInt();
        int category;
        if (a >= 80 && a <= 100)
            category = 1;
        else if (a >= 60 && a <= 79)
            category = 2;
        else if (a >= 40 && a <= 59)
            category = 3;
        else if (a >= 20 && a <= 39)
            category = 4;
        else if (a >= 0 && a <= 19)
            category = 5;
        else
            category = -1;

        switch (category) {
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Super");
                break;
            case 4:
                System.out.println("Bad");
                break;
            case 5:
                System.out.println("Very Bad");
                break;
            default:
                System.out.println("Invalid score!");
        }
	}

}

