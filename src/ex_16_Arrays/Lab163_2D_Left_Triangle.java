package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Left_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 3");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
