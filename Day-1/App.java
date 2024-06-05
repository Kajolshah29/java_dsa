
import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
        try (Scanner n = new Scanner(System.in)) {
            System.out.println("enter the number");
                int num=n.nextInt();
                System.out.println(num);
                System.out.println("enter the name");
                //if we use next() it prints only 1 word for more than 1 work we can use NextLine()
                String a=n.next();
                System.out.println(a);
        }

    }
}
