import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int num=1;
            while (true) { 
                if((num%5==0) && (num%7==0)){
                    System.out.println("Found ans " + num);
                    break;
                }
                num++;
            }
        }



        //     int sum=0;
        //     //Stream of numbers
        //     while(n!=-1){
        //         sum+=n;
        //         n=sc.nextInt();

        //     }
        //     System.out.println(sum);
        // }


        // //sum of first n numbers
        // int sum=0;
        // int num=1;
        // while(num<=n){
        //     sum=sum+num;
        //     num++;

        // }
        // System.out.println(sum);


        // print n number 
        // int num=1;
        // while(num<=n){
        //     System.out.println(num);
        //     // num+=1;
        //     num++;
        // }
    }
}
