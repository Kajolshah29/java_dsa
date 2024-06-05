import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Principle");
            float p=sc.nextFloat();

            System.out.println("Enter Interest");
            float r=sc.nextFloat();

            System.out.println("Enter time");
            float t=sc.nextFloat();

            float SI=(p*r*t)/100;

            System.out.println("Principle: " + p);
            System.out.println("rate: " + r);
            System.out.println("time: " + t);

            System.out.println("SImpleInterest: " + SI);
        }

    }
}
