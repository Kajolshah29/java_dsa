// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    static boolean isDivisionPossible(int[] a, int m, int mxchocolatesAllowed){
        int numOfStudents=1;
        int choc = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>mxchocolatesAllowed) return false;
            if(choc+a[i]<=mxchocolatesAllowed){
                choc+=a[i];
            }else{
                numOfStudents++;
                choc=a[i];
            }
        }
        return numOfStudents<=m;
        // if(numOfStudents>m) return false;
        // return true;
        
    }
    static int distributedchocolates(int[]a , int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisionPossible(a,m,mid)){ //check ans is possible or not
                ans =mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {12,34,67,90};
        int m= 2;
        System.out.println(distributedchocolates(a,m));
    }
}
