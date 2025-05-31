package ex_14_Strings;

public class LabStringExamples {
    public static void main(String[] args) {

        String s= "Java";
        char c = s.charAt(2);
        // Index = 0, ->
        System.out.println(c);

        System.out.println(s.codePointAt(0));

        // CompareToIgnore(Sting sr)
//        int result = "abc".compareTo("ABC");
//        int result2 = "abc".compareToIgnoreCase("ABC");
//        System.out.println(result);
//        System.out.println(result2);
//

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

    }
}
