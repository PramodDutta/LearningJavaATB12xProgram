package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_Checked {
    public static void main(String[] args) {
//        int a = 0;
//        try {
//            a = 10/0;
//        } catch (Exception e) {
//            System.out.println(" Going to be executed whenever there is a problem in try and catch, which means line number seven. ");
//            System.out.println(e.getMessage());
//        }
//        System.out.println(a);


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.


        try {
            FileInputStream fileInputStream = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
