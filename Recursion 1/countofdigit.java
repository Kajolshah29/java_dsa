public class Main {
    static int COD(int n){
        if(n>=0 &&  n<=9) return n;
        return COD(n/10)+1 ;
    }
    public static void main(String[] args) {
            System.out.println(COD(12345));
    }
}
