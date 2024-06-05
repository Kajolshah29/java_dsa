import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int num=sc.nextInt();
            //print value if it is even and divisible by 3  
            // if(num%2==0 &&  num%3==0){
            //     System.out.println("vaild");
            // }
            // else{
            //     System.out.println("not Vaild");
            // }

            // print value if it is divisible by 3 or 5
            if(num%3==0 || num%5==0){
                System.out.println("yes, it is divisible by 3 or 5 : " + num);
            }
        }


    }
}
