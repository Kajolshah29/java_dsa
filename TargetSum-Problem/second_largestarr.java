import java.util.Scanner;
public class Main {
    static int largestarr(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
                   if(arr[i]>max){
                       max=arr[i];
                   }
        }
        return max;
    }
    static int second_largestarr(int[]arr){
        int max=largestarr(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
                
            }
        }
        int secondmax=largestarr(arr);
        return secondmax;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        System.out.println("enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        }
        System.out.println("Unique element :  " + second_largestarr(arr) );
    }
}
