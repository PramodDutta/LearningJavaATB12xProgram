package ex_13_Functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {


        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        // 1.Without Argument / Parameters and Without Return Type.
        wp_wr_greet();

        //  2. Without Parameters but With Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);


        //  3. With Parameters and Without Return Type ( 90%)
        greet_with_details("Pramod", 65, 100);
        greet_with_details("Ankit", 100, 120);

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = scanner.next();
        System.out.println("ENTER AGE");
        int age = scanner.nextInt();
        System.out.println("ENTER SALARY");
        double salary = scanner.nextDouble();

        greet_with_details(name, age, salary);


        //  4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(190,900);
        int sum3 = sum_of_two_numbers(2345,5432);
        int sum4 = sum_of_three_numbers(2345,5432, 5432);


        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);




    }


    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wp_wr_greet(){
        System.out.println("Hi, How you are ?");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return "Hi, are you?";
    }

    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }


    //  4. With Parameters and With Return Type

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b,int c){
        return a+b+c;
    }

    static float sum_of_three_numbers_float(float a, float b,float c){
        return a+b+c;
    }




}
