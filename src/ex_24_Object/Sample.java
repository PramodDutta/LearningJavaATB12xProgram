package ex_24_Object;

public class Sample extends Object{


    @Override
    public String toString() {
        System.out.println("This is coming from Object? class");
        return null;

    }

    @Override
    public int hashCode() { // Ashkot, I will explain to you in the collection framework.
        System.out.println(" coming from the object. ");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(" This is also coming from the object class. ");
        return true;
    }
}
