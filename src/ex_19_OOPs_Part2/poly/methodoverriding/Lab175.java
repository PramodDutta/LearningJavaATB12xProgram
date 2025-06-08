package ex_19_OOPs_Part2.poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();
        p.p1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Pramod();
        f2.home();


    }
}
