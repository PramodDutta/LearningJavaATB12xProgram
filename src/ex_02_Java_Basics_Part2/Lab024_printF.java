package ex_02_Java_Basics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(a);
//        System.out.printf("Your variable is %d", a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 20;
        //  A format string as described in Format string syntax
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("Your value : %d , b value is %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();
        System.out.println("a = " + a + ", b = " + b);


    }
}
