package ex_20_OOPs_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.money();
    }
}


class Child1 implements Father1, Mother1{

    @Override
    public void money() {
        System.out.println("Money from Child");
    }

    @Override
    public void m1() {
        System.out.println("m1");

    }

    @Override
    public void f1() {
        System.out.println("f1");

    }

    @Override
    public void df() {
        Mother1.super.df();
        Father1.super.df();
    }

}

interface Father1{
    void money();
    void f1();

    default void df(){
        System.out.println("F1");
    }
}

interface Mother1{
    void money();
    void m1();

    default void df(){
        System.out.println("M1");
    }
}
