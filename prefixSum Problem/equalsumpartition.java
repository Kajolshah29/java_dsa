import java.util.Scanner;

public class  main {
    static int findarrSum(int[] arr){
      int totalsum=0;
        for(int i = 1; i < arr.length; i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    
    static boolean equalsumpartition(int []arr){
        int totalsum = findarrSum(arr);
        int prefsum=0;
        for(int i=0; i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum = totalsum - prefsum;
            if(suffixsum == prefsum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("equal partition possible : " + equalsumpartition(arr));
        // int[] prefSum = makePrefixSumArray(arr);
    }
}
