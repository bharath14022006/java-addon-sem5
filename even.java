import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the number you need");
        Scanner even=new Scanner(System.in);
        int a=even.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2 ==0)
        System.out.println("the even number is"+i);
            
        }
     
    }
}