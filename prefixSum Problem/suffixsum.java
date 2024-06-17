import java.util.Scanner;

public class Main {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] suffixSumArray(int[] arr){
        int[] suff=new int[arr.length];
        int n=arr.length;
        suff[n-1]=arr[n-1];
        for(int i = n-2; i>=0; i--){
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        int[] suff = suffixSumArray(arr);
        printArray(suff);


    }
}
