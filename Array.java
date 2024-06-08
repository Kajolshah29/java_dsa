class ArraysExample{

    void searchInArray(){
        //Linear Search7
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 3;

        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }

    void maxOfArray(){
        int[] arr = {10, 5, 3, 6, 2, 8, 4}; //ans  = 8

        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        System.out.println("Max " + ans);

    }
    void sumOfArray(){
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }

    void multiArrays(){
        int[][] arr = {{56, 43, 6}, {34, 7}};

        for(int  i = 0; i < arr.length; i++){
            //arr[0] and arr[1]
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    void demoArrays(){
        int[] ages = new int[3]; // ages[0], ages[1], ages[2]
        float[] weights = new float[3];
        String[] names = {"rahul", "raj", "aradhya", "vaishali"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

        for(int age : ages){
            System.out.println(age);
        }

        int i = 0;
        while(i < ages.length){
            System.out.println(ages[i]);
            ++i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
       obj.demoArrays();
       obj.multiArrays();
       obj.sumOfArray();
       obj.maxOfArray();
       obj.searchInArray();


    }




}
