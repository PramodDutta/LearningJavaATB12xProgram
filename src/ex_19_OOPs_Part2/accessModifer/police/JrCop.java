package ex_19_OOPs_Part2.accessModifer.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
