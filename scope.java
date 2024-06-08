class Algebra{
//    int a = 10; //member variables
//    int b = 5;

    int add(){  // method level 
        int p = 100;
        int q = 20;
        return p + q;
    }

    int sub(){
        int p = 67;
        int q = 20;
        return p - q;
    }

    void demo(){

        {   // block level we can use same variable name after completing the loop or block
            int b = 5;
        }

        {
            int b = 100;
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }

        for(int i = 0; i < 2; i++)
        {
            System.out.println(i);
        }


    }
}

public class Main {

    static void changeValue(int a){
        a *= 100;   // pass by value

        System.out.println("Inside change value " + a);
    }

    public static void main(String[] args) {
//        Algebra obj = new Algebra();
//        obj.demo();

        int a = 10;  // pass by value
        System.out.println("Before changing value " + a);
        changeValue(a);
        System.out.println("After changing value " + a);
    }
}
