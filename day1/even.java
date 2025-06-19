import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the number start no");
        Scanner even=new Scanner(System.in);
        int a=even.nextInt();
          System.out.println("enter the number end no");
        Scanner evenn=new Scanner(System.in);
        int b=evenn.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2 ==0)
        System.out.println("the even number is"+i);
            
        }
     
    }
}
