import java.sql.SQLOutput;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        int a = 6,b = 5;
        for(int i= 0; i <= 5; i++ ){
            System.out.println("a = " + a++);
        }

        int[] m = {3,2,4,1,5};

        Arrays.sort(m);

        System.out.println(m[0]);

        a = sum(1,2);
        b = sum(1,2,3);

        System.out.println(a);
        System.out.println(b);



    }

    private static int sum(int... x){
        int s =0, i;
//        for ( i = 0; i < x.length; i++){
//            s += x[i];
//
//
//        }




        return s;
    }

 /*   private static int sum(int a, int b) {
        return a+b;
    }

    private static int sum(int a, int b, int c) {
        return a+b+c;
    }*/


}
