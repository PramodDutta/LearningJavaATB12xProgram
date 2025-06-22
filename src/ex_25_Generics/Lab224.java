package ex_25_Generics;

public class Lab224 {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum(2.3,4.5);
        temp_sum("Pramod","Dutta");
    }

    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
    static Double temp_sum(Double a, Double b){
        return a+b;
    }
     // T -> pramod, modi, deesha
    static <T> T temp_sum(T a, T b){
        return null;
    }

    static <MODI> MODI temp_sum1(MODI a, MODI b){
        return null;
    }

}
