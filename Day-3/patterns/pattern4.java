import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        // ques: Reverse Triangle print
        for(int i=1;i<=r;i++){
            for(int j=1; j<=(r+1-i);j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
