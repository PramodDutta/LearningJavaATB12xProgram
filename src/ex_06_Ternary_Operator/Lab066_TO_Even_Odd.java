package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {

        // Step 1 ->  Input, Output - data type
        int num = -13;
        // input -> int
        // output -> String -> even or odd

        // Step 2 ->
        // num%2 == 0 >  even else 1 odd.
        String result = (num%2==0) ? "even" : "odd";
        System.out.println(result);

        // Edge Cases
        //  -negative, float.,0




    }
}
