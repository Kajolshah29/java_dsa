import java.util.Scanner;
public class SumOfTwoNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first Number");
            int a=sc.nextInt();
            System.out.println("Enter the second Number");
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("sum" + c);
        }
    }
}
