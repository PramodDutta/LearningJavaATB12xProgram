package ex_24_Exceptions;

public class Lab207 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
