import java.util.Scanner;

public class prac1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int numofdigits=0;
    int input=n;
    //ques: count the number of digits for a give number
    // ans: divide n by 10 until n>0 and count the number of division
    while(n>0){
        n=n/10;
        numofdigits++;
    }
    System.out.println("Number of digits in " + input + " = "+ numofdigits);

   } 
}
