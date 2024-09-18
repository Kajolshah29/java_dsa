
class BinarySearch {
    static int binarySearch(int[] a, int x){
        int n = a.length;
        int st = 0, end = n-1; 
        while(st <= end){
            int mid = (st + end)/2;
            if(x == a[mid]){
                return mid;
            } else if(x < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return st;
    }


	public static void main(String args[])
	{
int[] a = {2,4,6,8,10,11,25,26,30};
        int x= 20;
        System.out.println(binarySearch(a,x));
	}
}
