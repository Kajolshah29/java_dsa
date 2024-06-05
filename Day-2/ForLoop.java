import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }


        //sum of first n numbers using for loop
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        //     sum=sum+i;
        // }
        // System.out.println("Sum of first n numbers: " + sum);

    }
}
