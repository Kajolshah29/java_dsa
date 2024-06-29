public class Main {
    static int factorial(int n){
        if(n==1) return 1; // basecase
        return n*factorial(n-1); //sub problem
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
