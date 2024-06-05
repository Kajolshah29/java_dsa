import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF a");
        int a=sc.nextInt();
        System.out.println("ENTER THE VALUE OF b");
        int b=sc.nextInt();

        int ans=1;
        for(int i=1; i<=b;i++){
            ans=ans*a;
        }
        System.out.println("the answer of a raise to the power b is : " + ans);


        
    }
    
}
