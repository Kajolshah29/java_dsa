import java.util.Scanner;

public class prac2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sumofdigits=0;
    int input=n;
    //ques: sum of  the number of digits for a give number
    // ans: anynum%10=last digit of num and then num/=10
      // num%10 = gives last digit of num as output
    while(n>0){
        sumofdigits+=n%10;
        n=n/10;

    }
    System.out.println("sum of digits in " + input + " = "+ sumofdigits);

   } 
}
