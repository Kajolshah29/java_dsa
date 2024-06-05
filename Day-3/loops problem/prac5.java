import java.util.Scanner;
public class prac5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // ques: find factorial for n number
        // if we want to find fact of 6 then directly we can multiply 5!*6 
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println("Factorial of " + i+ " = " + fact);

        }
    }
}
