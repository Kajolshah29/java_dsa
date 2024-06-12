// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    static void swap(int a,int b){
        System.out.println("Original value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // using sum and difference
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Original value after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[]arr={1,2,3,4,5};
        swap(a,b);
    }
}
