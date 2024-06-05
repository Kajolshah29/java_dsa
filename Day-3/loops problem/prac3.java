import java.util.Scanner;

public class prac3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int input=n;
    int ans=0;
    //ques: reversing the digit of numbers
    // ans: ans*10+n%10, n=/10
    while(n>0){
 
        ans=ans*10+n%10;
        n=n/10;
        // ans++;
    }
    System.out.println("Number of digits in " + input + " = "+ ans);

   } 
}
