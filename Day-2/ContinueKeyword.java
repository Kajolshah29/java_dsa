public class ContinueKeyword {
    public static void main(String[] args) {
        int num=1;
        while(num<=50){
            if(num%3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }

        // this code don't print multiple of 3
                // for(int num=1;num<=50;num++){
        //     if(num%3==0){
        //         continue;
        //     }
        //     System.out.println(num);
        // }
    }
}
