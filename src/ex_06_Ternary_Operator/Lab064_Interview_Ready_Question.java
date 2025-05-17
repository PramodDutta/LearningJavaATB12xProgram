package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {


        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 21;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }
}
