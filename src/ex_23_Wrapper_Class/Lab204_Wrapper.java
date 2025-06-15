package ex_23_Wrapper_Class;

import java.util.ArrayList;

public class Lab204_Wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // Boxing - int -> Integer - AutoBoxing - JVM will do it.
        System.out.println(a);
        System.out.println(b.intValue());


        // UnBoxing
        Integer aa = 43;
        int a1 = aa; // UNBOXING
        System.out.println(a1);
        System.out.println();

        // Integer a11 = new Integer(10);
        Integer a11 = 10;

//        ArrayList<Integer>  numbers = new ArrayList<>();
//        numbers.add(100);

        Integer myint = 10;
        String stringValue = myint.toString();
        int p_int = myint.intValue();
        int p_int2 = myint;


    }
}
