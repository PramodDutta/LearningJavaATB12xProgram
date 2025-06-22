package ex_25_Generics;

public class Lab_Generics_Class {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(10);
        GenericClass g2 = new GenericClass("PRAMOD");
        GenericClass g3 = new GenericClass(3.14);
        GenericClass g4 = new GenericClass(true);
    }
}


//class GenericClass{
//    private Integer data;
//
//    public GenericClass(Integer data) {
//        this.data = data;
//    }
//
//    public Integer getData() {
//        return data;
//    }
//}

class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}